package com.internousdev.tamaya.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.CartDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カート内の商品の注文数を更新するクラス
 * @author TAKAHIRO ADACHI
 * @since 1.0
 */

public class UpdateCartAction extends ActionSupport implements SessionAware{
	/** ユーザーID */
	private int userId;
	/** 対象の商品ID */
	private int itemId;
	/** 商品の注文数 */
	private int quantity;
	/** セッション */
	private Map<String, Object> session;

	@Override
	public String execute() {
		userId = (int) session.get("userId");

		if (quantity <= 0) {
			return "remove";
		}
		if (!new CartDAO().addItem(userId, itemId, quantity)) {
			return ERROR;
		}
		return SUCCESS;
	}

	/** ユーザーIDを取得するメソッド */
	public int getUserId() {
		return userId;
	}
	/** ユーザーIDを格納するメソッド */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/** 対象の商品IDを取得するメソッド */
	public int getItemId() {
		return itemId;
	}
	/** 対象の商品IDを格納するメソッド */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	/** 商品の注文数を取得するメソッド */
	public int getQuantity() {
		return quantity;
	}
	/** 商品の注文数を格納するメソッド */
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