package com.internousdev.tamaya.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.AddToCartDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カート内の個数を増減するクラス
 * @author Misa Kikuchi
 * @since 2017/05/20
 * @version 1.0
 */

public class UpdateCartAction extends ActionSupport implements SessionAware{
	/** ユーザーID */
	private int userId;
	/** （変更したい）商品のID */
	private int itemId;
	/** （変更したい）商品の注文数 */
	private int quantity;
	/** セッション */
	private Map<String, Object> session;

	@Override
	public String execute() {
		if (!session.containsKey("userId")) {
			System.out.println("GoCartAction : LOGIN");
			return LOGIN;
		}
		userId = (int) session.get("userId");
		if (userId == 0) {
			System.out.println("GoCartAction : LOGIN");
			return LOGIN;
		}
		System.out.println("UpdateCartAction : userId = " + userId);

		if (quantity <= 0) {
			return "remove";
		}
		AddToCartDAO dao = new AddToCartDAO();
		if (dao.insert(userId, itemId, quantity)) {
			return SUCCESS;
		}
		return ERROR;
	}

	/** ユーザーIDを取得するメソッド */
	public int getUserId() {
		return userId;
	}
	/** ユーザーIDを格納するメソッド */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/** （変更したい）商品のIDを取得するメソッド */
	public int getItemId() {
		return itemId;
	}
	/** （変更したい）商品のIDを格納するメソッド */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	/** （変更したい）商品の注文数を取得するメソッド */
	public int getQuantity() {
		return quantity;
	}
	/** （変更したい）商品の注文数を格納するメソッド */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/** セッションを取得するメソッド */
	public Map<String, Object> getSession() {
		return session;
	}
	/** セッションを格納するメソッド */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}