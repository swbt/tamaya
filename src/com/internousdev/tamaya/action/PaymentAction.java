 package com.internousdev.tamaya.action;


	import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dto.CartDTO;
import com.internousdev.tamaya.dto.CreditDTO;
import com.opensymphony.xwork2.ActionSupport;

	/**
	* クレジットの情報を照合し、情報を格納するクラス
	* @author ryusei tanaka
	* @since 6/13
	* @version 1.0
	*/
	public class PaymentAction extends ActionSupport implements SessionAware{

	/**
	* シリアルID
	*/
	private static final long serialVersionUID = 1L;
	private static final String SUCCESS = null;
	/**
	* ユーザーID
	*/
	private int userId;
	/**
	* クレジット種類
	*/
	private int creditId;
	/**
	* クレジット種類
	*/
	private String creditNumber;
	/**
	* クレジット名義
	*/
	private String nameE;
	/**
	* セキュリティコード
	*/
	private int securityCode;
	/**
	* 有効期限（月）
	*/
	private int expirationMonth;
	/**
	* 有効期限（年）
	*/
	private int expirationYear;
	/**
	* セッション情報
	*/
	private Map<String,Object>session;
	/**
	* カード番号上6ケタ
	*/
	private  int checkNumber;
	/**
	* 合計金額
	*/
	private BigDecimal total;
	/**
	* 上からユーザー情報、クレジット情報、カート情報を入れるアレイリストたち
	*/
	public ArrayList<MypageDTO> usersList=new ArrayList<MypageDTO>();
	private ArrayList<CreditDTO> creditList=new ArrayList<CreditDTO>();
	private ArrayList<CartDTO> cartList=new ArrayList<CartDTO>();
	/**
	* クレジットカード情報の照合、格納を実行するメソッド
	*/
	public String execute(){

	String result=ERROR;
	Boolean loginflg=false;
	Boolean creditflg=false;
	CreditDTO userinfoDto=null;
	MypageDAO MyDao=new MypageDAO();
	GoCartDAO goCartDao=new GoCartDAO();
	CregitCheckDAO daoC=new CregitCheckDAO();
	/***
	* ログアウトしてないかの確認。すべてＯＫだったらloginFlgをtrue
	***/
	if(session.get("userId")!=null){
	userId=session.get("userId");
	loginflg=true;
	}
	/***
	入力されたカード情報の確認。すべてＯＫだったらcreditFlgをtrue
	***/
	//カード番号上6ケタがm_creditcard_typeのテーブル内にあるか
	checkNumber=getCreditNumber().subString(0,6);
	if(daoC.select(creditId,checkNumber)){
	//カード番号16ケタとセキュリティコードに間違いがないか
	userinfoDto=daoC.selectUserInfo(creditId,creditNumber);
	if(creditNumber.equals(userinfoDto.getCreditNumber())){
	if(Integer.parseInt(securityCode) == userinfoDto.getSecurityCode()){
	//有効期限に間違えがないか
	//visaのDBに有効期限が見当たらないので、visaは問答無用でtrue
	if(creditId==1){
	creditflg=true;
	}
	}
	else{
	if(expirationYear==userinfoDto.ExpirationYear()){
	if(expirationMonth==userinfoDto.ExpirationMonth()){
	creditflg=true;
	}
	}
	}
	}
	}


	/*** フラグの確認 ***/
	if(loginflg==true){
	if(creditflg==true){

	/*** すべてのフラグがＯＮだったので、諸々の処理をする ***/
	CreditInsertDAO creInsertDao=new CreditInsertDAO();
	//クレジットテーブルに情報を入れる
	if(creInsertDao.serch(userId)==false){
	creInsertDao.insert(userId,creditId,creditNumber, nameE, securityCode, expirationMonth,expirationYear);
	result=SUCCESS;
	}else {
	//すでに同じユーザーＩＤでクレジット情報が入っていたら、古いのを消して新しいのを入れる
	creInsertDao.cleanCredit(userId);
	creInsertDao.insert(userId, creditId, creditNumber, nameE, securityCode, expirationMonth,expirationYear);
	result = SUCCESS;
	}
	//アレイリストに情報を入れる
	usersList=MyDao.select(userId);
	cartList=goCartDao.selectedItem(userId);
	creditList=creInsertDao.selectCredit(userId);
	//合計金額の計算
	for(BigDecimal i=0;i<cartList.size();i++){
	total+=(cartList.get(i).getPrice()) * (cartList.get(i).getQuantity());
	}
	}
	else {
	/*** セッション切れだった場合の処理 ***/
	result=LOGIN;
	}
	return result;
	}
	}
	/**
	* ユーザIDを取得するメソッド
	* @return userId　ユーザーID
	*/
	public int getUserId() {
	return userId;
	}

	/**
	* ユーザーIDを格納するメソッド
	* @param userId セットする userId
	*/
	public void setUserId(int userId) {
	this.userId = userId;
	}

	/**
	* クレジットIDを取得するメソッド
	* @return creditId　クレジットID
	*/
	public int getCreditId() {
	return creditId;
	}

	/**
	* クレジットIDを格納するメソッド
	* @param creditId セットする creditId
	*/
	public void setCreditId(int creditId) {
	this.creditId = creditId;
	}

	/**
	* クレジット番号を取得するメソッド
	* @return creditNumber　クレジット番号
	*/
	public String getCreditNumber() {
	return creditNumber;
	}

	/**
	* クレジット番号を格納するメソッド
	* @param creditNumber セットする creditNumber
	*/
	public void setCreditNumber(String creditNumber) {
	this.creditNumber = creditNumber;
	}

	/**
	* クレジット名義を取得するメソッド
	* @return nameE　クレジット名義
	*/
	public String getNameE() {
	return nameE;
	}

	/**
	* クレジット名義を格納するメソッド
	* @param nameE セットする nameE
	*/
	public void setNameE(String nameE) {
	this.nameE = nameE;
	}

	/**
	* セキュリティコードを取得するメソッド
	* @return securityCode　セキュリティコード
	*/
	public int getSecurityCode() {
	return securityCode;
	}

	/**
	* セキュリティコードを格納するメソッド
	* @param securityCode セットする securityCode
	*/
	public void setSecurityCode(int securityCode) {
	this.securityCode = securityCode;
	}

	/**
	* 有効期限（月）を取得するメソッド
	* @return expirationMonth　有効期限（月）
	*/
	public int getExpirationMonth() {
	return expirationMonth;
	}

	/**
	* 有効期限（月）を格納するメソッド
	* @param expirationMonth セットする expirationMonth
	*/
	public void setExpirationMonth(int expirationMonth) {
	this.expirationMonth = expirationMonth;
	}

	/**
	* 有効期限（年）を取得するメソッド
	* @return expirationYear　有効期限（年）
	*/
	public int getExpirationYear() {
	return expirationYear;
	}

	/**
	* 有効期限（年）を格納するメソッド
	* @param expirationYear セットする expirationYear
	*/
	public void setExpirationYear(int expirationYear) {
	this.expirationYear = expirationYear;
	}

	/**
	* セッション情報を取得するメソッド
	* @return session　セッション情報
	*/
	public Map<String, Object> getSession() {
	return session;
	}

	/**
	* セッション情報を格納するメソッド
	* @param session セットする session
	*/
	public void setSession(Map<String, Object> session) {
	this.session = session;
	}

	/**
	* カード番号上6桁を取得するメソッド
	* @return checkNumber　カード番号上6桁
	*/
	public int getCheckNumber() {
	return checkNumber;
	}

	/**
	* カード番号上6桁を格納するメソッド
	* @param checkNumber セットする checkNumber
	*/
	public void setCheckNumber(int checkNumber) {
	this.checkNumber = checkNumber;
	}

	/**
	* 合計金額を取得するメソッド
	* @return amountAll　合計金額
	*/
	public BigDecimal getTotal() {
	return total;
	}

	/**
	* 合計金額を格納するメソッド
	* @param amountAll セットする amountAll
	*/
	public void setTotal(BigDecimal total) {
	this.total = total;
	}

	/**
	* ユーザー情報リストを取得するメソッド
	* @return usersList　ユーザー情報リスト
	*/
	public ArrayList<MypageDTO> getUsersList() {
	return usersList;
	}

	/**
	* ユーザー情報リストを格納するメソッド
	* @param usersList セットする usersList
	*/
	public void setUsersList(ArrayList<MypageDTO> usersList) {
	this.usersList = usersList;
	}

	/**
	* クレジット情報リストを取得するメソッド
	* @return creditList　クレジット情報リスト
	*/
	public ArrayList<CreditDTO> getCreditList() {
	return creditList;
	}

	/**
	* クレジット情報リストを格納するメソッド
	* @param creditList セットする creditList
	*/
	public void setCreditList(ArrayList<CreditDTO> creditList) {
	this.creditList = creditList;
	}

	/**
	* カード情報リストを取得するメソッド
	* @return cartList　カード情報リスト
	*/
	public ArrayList<CartDTO> getCartList() {
	return cartList;
	}

	/**
	* カード情報リストを格納するメソッド
	* @param cartList セットする cartList
	*/
	public void setCartList(ArrayList<CartDTO> cartList) {
	this.cartList = cartList;
	}
	}


