package com.internousdev.tamaya.action;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.AdminHistoryDAO;
import com.internousdev.tamaya.dto.AdminHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理者販売履歴のためのクラス
 * @author seiya takahashi
 * @since 2017/6/13
 * @version 1.0
 */

public class AdminHistoryAction extends ActionSupport implements SessionAware{


	/**
	 * 商品ID
     */
	private int itemId;


	/**
	 * 商品名
     */
	private String itemName;


	/**
	 * 購入ID
     */
	private int purchaseId;


	/**
	 * 単価
     */
	private BigDecimal price;


	/**
	 * 登録日
     */
	private String createdAt;


	/**
	 * 数量
     */
	private int quantity;


	/**
	 * 合計金額
     */
	private BigDecimal subtotal;


	    //adminhistoryList コレクションクラスのオブジェクト宣言//

	/**
	 * 購入履歴リスト
	 */
     private ArrayList<AdminHistoryDTO> adminhistoryList;
     /**
      * セッション情報
      */
     private Map<String,Object> session;


       /**
        * 購入履歴を取得するメソッド
        */
		public String execute() {

			String result = ERROR;


			AdminHistoryDAO dao = new AdminHistoryDAO();
			adminhistoryList = dao.select(itemId);
			if(adminhistoryList.size() > 0){
				result=SUCCESS;
			}
		return result;
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
	public String getItemName() {
		return itemName;
	}

	/**
	 * 商品名をを格納するメソッド
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * 購入IDを取得するメソッド
	 */
	public int getPurchaseId() {
		return purchaseId;
	}

	/**
	 * 購入IDを格納するメソッド
	 */
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
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
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * 登録日を格納するメソッド
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
	 * 数量を取得するメソッド
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * 数量を格納するメソッド
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * 合計金額を取得するメソッド
	 */
	public BigDecimal getSubtotal() {
		return subtotal;
	}

	/**
	 * 合計金額を格納するメソッド
	 */
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * 購入履歴リストを取得するメソッド
	 */
	public ArrayList<AdminHistoryDTO> getAdminhistoryList() {
		return adminhistoryList;
	}

	/**
	 * 購入履歴リストを格納するメソッド
	 */
	public void setAdminhistoryList(ArrayList<AdminHistoryDTO> adminhistoryList) {
		this.adminhistoryList = adminhistoryList;
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


}