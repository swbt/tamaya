package com.internousdev.legmina.action;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品一覧から商品の一覧を取得するクラス
 *
 * @author seiya takahashi
 * @since 2017/6/13
 * @version 1.0
 */
public class UserPurchaseHistoryAction extends ActionSupport implements SessionAware{




	private int userId;		//ユーザーId//
	private int itemId;		//商品Id//
	private String itemsName="";	//商品名//
	private BigDecimal price;	//価格//
	private int quantities;		//数量//
	public float subtotal;		//小計金額//
	private String createdAt;	//登録日//

	private Map<String,Object> session;	//セッション情報//
	private ArrayList<HistoryDTO> UserPurchaseHistoryList = new ArrayList<HistoryDTO>();	//ユーザー購入履歴//


	/**
	 *ユーザーの購入履歴リストの生成メソッド
	 */
	public String execute() {
		String result = SUCCESS;
		userId = 0;


//		if (session.containsKey("userId")) {
//			userId = (int) session.get("userId");s
//		}
		if (session.containsKey("userId")) {
			userId = (int) session.get("userId");
		}



		ArrayList<HistoryDTO> allList = new ArrayList<HistoryDTO>();
		UserPurchaseHistoryDAO dao=new UserPurchaseHistoryDAO();
		allList=dao.UserPurchaseHistoryList(userId,"");
		int all=allList.size();
		for(int i=0;i<all;i++){
			HistoryDTO dto = new HistoryDTO();
			dto= allList.get(i);
			String str=dto.getItemsName();
			if(str.startsWith(itemsName)){
				UserPurchaseHistoryList.add(dto);
			}

		}

		if(UserPurchaseHistoryList.size() == 0){
			result=ERROR;
		}
		return result;
	}




	public int getUserId() {	 /* ユーザーIDを取得するメソッド*/
		return userId;
	}

	public void setUserId(int userId) {		 /* ユーザーIDを格納するメソッド*/
		this.userId = userId;
	}

	/**
	 * 商品IDを取得するメソッド
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * 商品IDを格納するメソッド
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * 商品名を取得するメソッド
	 */
	public String getItemsName() {
		return itemsName;
	}

	/**
	 * 商品IDを格納するメソッド
	 */
	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}

	/**
	 * 単価を取得するメソッド
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * 単価を格納するメソッド
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * 数量を取得するメソッド
	 */
	public int getQuantities() {
		return quantities;
	}

	/**
	 * 数量を格納するメソッド
	 */
	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}

	/**
	 * 合計金額を取得するメソッド
	 */
	public float getSubtotal() {
		return subtotal;
	}

	/**
	 * 合計金額を格納するメソッド
	 */
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * 登録日を取得するメソッド
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * 登録日を格納するメソッド
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * セッション情報を取得するメソッド
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション情報を格納するメソッド
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * ユーザーの購入履歴リストを格納するメソッド
	 */
	public ArrayList<HistoryDTO> getUserPurchaseHistoryList() {
		return UserPurchaseHistoryList;
	}

	/**
	 * ユーザーの購入履歴リストを格納するメソッド
	 */
	public void setUserPurchaseHistoryList(ArrayList<HistoryDTO> userPurchaseHistoryList) {
		UserPurchaseHistoryList = userPurchaseHistoryList;
	}
}