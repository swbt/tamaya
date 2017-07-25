package com.internousdev.tamaya.action;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
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
	private ArrayList<CartDTO> cart = new ArrayList<>();
	/** 注文する商品の総数 */
	private int totalQuantity = 0;
	/** 注文の合計金額 */
	private BigDecimal totalFee = BigDecimal.ZERO;
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
			addActionError("読み込み中にエラーが発生しました");
			return ERROR;
		}
		for (int i = 0; i < cart.size(); i++) {
			totalQuantity += cart.get(i).getQuantity();
			totalFee = totalFee.add(cart.get(i).getSubtotal());
		}
		System.out.println("GoCartAction : totalQuantity = " + totalQuantity + ", totalFee = " + totalFee);
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
	public ArrayList<CartDTO> getCart() {
		return cart;
	}
	/** カートを格納するメソッド */
	public void setCart(ArrayList<CartDTO> cart) {
		this.cart = cart;
	}
	/** 注文する商品の総数を取得するメソッド */
	public int getTotalQuantity() {
		return totalQuantity;
	}
	/** 注文する商品の総数を格納するメソッド */
	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	/** 注文の合計金額を取得するメソッド */
	public BigDecimal getTotalFee() {
		return totalFee;
	}
	/** 注文の合計金額を格納するメソッド */
	public void setTotalFee(BigDecimal totalFee) {
		this.totalFee = totalFee;
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
