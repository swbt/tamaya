package com.internousdev.tamaya.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.CartDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カート内のアイテムを削除する
 *
 * @author Takahiro Adachi
 * @since 1.0
 */
public class RemoveFromCartAction extends ActionSupport implements SessionAware {
	/** ユーザーID */
	private int userId;
	/** 商品ID */
	private int itemId;
	/** セッション */
	private Map<String, Object> session;

	/**
	 * カート内のアイテムを削除する
	 *
	 * @author Takahiro Adachi
	 * @since 1.0
	 */
	public String execute() throws SQLException {
		userId = (int) session.get("userId");

		CartDAO dao = new CartDAO();
		if (!dao.removeItem(userId, itemId)) {
			addActionError("商品の削除に失敗しました");
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
	/** 商品IDを取得するメソッド */
	public int getItemId() {
		return itemId;
	}
	/** 商品IDを格納するメソッド */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	/** セッションを取得するメソッド */
	public Map<String, Object> getSession() {
		return session;
	}
	/** セッションを格納するメソッド */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}