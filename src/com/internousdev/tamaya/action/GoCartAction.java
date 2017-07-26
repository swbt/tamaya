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
 * @author Takahiro Adachi
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
		if (!session.containsKey("userId")) {
			System.out.println("GoCartAction : LOGIN");
			return LOGIN;
		}
		userId = (int) session.get("userId");
		if (userId == 0) {
			System.out.println("GoCartAction : LOGIN");
			return LOGIN;
		}
		System.out.println("GoCartAction : userId = " + userId);

		try {
			cart = new CartDAO().getCart(userId);
		} catch (SQLException e) {
			e.printStackTrace();
			addActionError("カートの読み込み中にエラーが発生しました");
			return ERROR;
		}
		System.out.println("GoCartAction : totalQuantity = " + cart.getTotalQuantity() + ", totalFee = " + cart.getGrandTotal());
		System.out.println("GoCartAction : SUCCESS");
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
