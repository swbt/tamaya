package com.internousdev.tamaya.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.CartDAO;
import com.internousdev.tamaya.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カート画面に遷移する際、必要な情報を取得するクラス
 *
 * @author TAKAHIRO ADACHI
 * @since 1.0
 */
public class GoCartAction extends ActionSupport implements SessionAware {
	/** ユーザーID */
	private int userId;
	/** カート */
	private CartDTO cart = new CartDTO();
	/** セッション */
	private Map<String, Object> session;

	@Override
	public String execute() throws SQLException {
		userId = (int) session.get("userId");

		try {
			cart = new CartDAO().getCart(userId);
		} catch (SQLException e) {
			e.printStackTrace();
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
	/** カートを取得するメソッド */
	public CartDTO getCart() {
		return cart;
	}
	/** カートを格納するメソッド */
	public void setCart(CartDTO cart) {
		this.cart = cart;
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
