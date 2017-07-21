package com.internousdev.tamaya.action;


import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

/*＜カート情報を召喚するクラス＞*/
import com.internousdev.tamaya.dao.GoCartDAO;
import com.internousdev.tamaya.dao.MypageDAO;
import com.internousdev.tamaya.dto.CartDTO;
import com.internousdev.tamaya.dto.MypageDTO;
import com.opensymphony.xwork2.ActionSupport;



/**
 * ユーザーの情報を取得するアクションクラス
 * @author YUKO TSUJI
 * @since 2017/07/18
 * @version 1.0
 */


public class GoMyPageAction extends ActionSupport implements SessionAware{


	private static final long serialVersionUID = 1L;


	/*＜ユーザー情報＞*/

	private int userId;

	private String email;
	private String userPass;
	private String postal; /*郵便番号*/

	private String familyName;
	private String givenName;


	private String familyNameKanji;		/* 姓(漢字)*/
	private String familyNameKana;		/*姓(ひらがな)*/
	private String givenNameKanji;		/*名(漢字)*/
	private String givenNameKana;		/* 名(ひらがな)*/
	private String address;
	private ArrayList<MypageDTO> userList = new ArrayList<>();
	private boolean loginFlg;



	/*＜カート情報情報＞*/

	private int itemId;

	private String itemName;

	private BigDecimal price;

	private int quantity;

	private String imgPath;

	private BigDecimal subtotal = new BigDecimal("0"); /*小計*/
	private BigDecimal total = new BigDecimal("0");/*合計*/

	private BigDecimal quantity2 = new BigDecimal("0");
	private BigDecimal kosu = new BigDecimal("0"); /*個数合計*/
	/**
	 * カート内の商品情報を入れるリスト
	 */
	private ArrayList<CartDTO> cartList=new ArrayList<>();
	/**
	 *セッション情報
	 */
	private Map<String,Object> session;







	public String execute() throws SQLException{

		String result=ERROR;

		if(session.containsKey("userId")){
			userId= (int)session.get("userId");

			System.out.println("入ってます");
			GoCartDAO dao = new GoCartDAO();
			cartList = dao.selectedItem(userId);

			MypageDAO mpdao = new MypageDAO();
			userList = mpdao.select(userId);

			result = SUCCESS;

		}

		return result;

	}







	/**
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}







	/**
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}







	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}







	/**
	 * @param email セットする email
	 */
	public void setEmail(String email) {
		this.email = email;
	}







	/**
	 * @return userPass
	 */
	public String getUserPass() {
		return userPass;
	}







	/**
	 * @param userPass セットする userPass
	 */
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}







	/**
	 * @return postal
	 */
	public String getPostal() {
		return postal;
	}







	/**
	 * @param postal セットする postal
	 */
	public void setPostal(String postal) {
		this.postal = postal;
	}







	/**
	 * @return familyName
	 */
	public String getFamilyName() {
		return familyName;
	}







	/**
	 * @param familyName セットする familyName
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}







	/**
	 * @return givenName
	 */
	public String getGivenName() {
		return givenName;
	}







	/**
	 * @param givenName セットする givenName
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}







	/**
	 * @return familyNameKanji
	 */
	public String getFamilyNameKanji() {
		return familyNameKanji;
	}







	/**
	 * @param familyNameKanji セットする familyNameKanji
	 */
	public void setFamilyNameKanji(String familyNameKanji) {
		this.familyNameKanji = familyNameKanji;
	}







	/**
	 * @return familyNameKana
	 */
	public String getFamilyNameKana() {
		return familyNameKana;
	}







	/**
	 * @param familyNameKana セットする familyNameKana
	 */
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}







	/**
	 * @return givenNameKanji
	 */
	public String getGivenNameKanji() {
		return givenNameKanji;
	}







	/**
	 * @param givenNameKanji セットする givenNameKanji
	 */
	public void setGivenNameKanji(String givenNameKanji) {
		this.givenNameKanji = givenNameKanji;
	}







	/**
	 * @return givenNameKana
	 */
	public String getGivenNameKana() {
		return givenNameKana;
	}







	/**
	 * @param givenNameKana セットする givenNameKana
	 */
	public void setGivenNameKana(String givenNameKana) {
		this.givenNameKana = givenNameKana;
	}







	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}







	/**
	 * @param address セットする address
	 */
	public void setAddress(String address) {
		this.address = address;
	}







	/**
	 * @return userList
	 */
	public ArrayList<MypageDTO> getUserList() {
		return userList;
	}







	/**
	 * @param userList セットする userList
	 */
	public void setUserList(ArrayList<MypageDTO> userList) {
		this.userList = userList;
	}







	/**
	 * @return loginFlg
	 */
	public boolean isLoginFlg() {
		return loginFlg;
	}







	/**
	 * @param loginFlg セットする loginFlg
	 */
	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}







	/**
	 * @return itemId
	 */
	public int getItemId() {
		return itemId;
	}







	/**
	 * @param itemId セットする itemId
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}







	/**
	 * @return itemName
	 */
	public String getItemName() {
		return itemName;
	}







	/**
	 * @param itemName セットする itemName
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}







	/**
	 * @return price
	 */
	public BigDecimal getPrice() {
		return price;
	}







	/**
	 * @param price セットする price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}







	/**
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}







	/**
	 * @param quantity セットする quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}







	/**
	 * @return imgPath
	 */
	public String getImgPath() {
		return imgPath;
	}







	/**
	 * @param imgPath セットする imgPath
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}







	/**
	 * @return subtotal
	 */
	public BigDecimal getSubtotal() {
		return subtotal;
	}







	/**
	 * @param subtotal セットする subtotal
	 */
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}







	/**
	 * @return total
	 */
	public BigDecimal getTotal() {
		return total;
	}







	/**
	 * @param total セットする total
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
	}







	/**
	 * @return quantity2
	 */
	public BigDecimal getQuantity2() {
		return quantity2;
	}







	/**
	 * @param quantity2 セットする quantity2
	 */
	public void setQuantity2(BigDecimal quantity2) {
		this.quantity2 = quantity2;
	}







	/**
	 * @return kosu
	 */
	public BigDecimal getKosu() {
		return kosu;
	}







	/**
	 * @param kosu セットする kosu
	 */
	public void setKosu(BigDecimal kosu) {
		this.kosu = kosu;
	}







	/**
	 * @return cartList
	 */
	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}







	/**
	 * @param cartList セットする cartList
	 */
	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}







	/**
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}







	/**
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}







	/**
	 * @return serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}





}
