/**
 *
 */
package com.internousdev.tamaya.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.CartDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カートに商品を追加する
 * @author Takahiro Adachi
 * @since 1.0
 */
public class AddToCartAction extends ActionSupport implements SessionAware {
	/** ユーザーID */
	private int userId;
	/** カートに入れる商品のID */
	private int itemId;
	/** カートに入れる数量 */
	private int quantity;
	/** カートに入れた後に遷移するページのカテゴリー */
	private String category = "";
	/** カートに入れた後に遷移するページの価格帯 */
	private int priceRange = 0;
	/** セッション */
	private Map<String, Object> session;

	@Override
	public String execute() {
		userId = (int)session.get("userId");

		CartDAO dao = new CartDAO();
		if (dao.addItem(userId, itemId, quantity)) {
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
	/** カートに入れる商品のIDを取得するメソッド */
	public int getItemId() {
		return itemId;
	}
	/** カートに入れる商品のIDを格納するメソッド */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	/** カートに入れる商品の数量を取得するメソッド */
	public int getQuantity() {
		return quantity;
	}
	/** カートに入れる数量を格納するメソッド */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/** カートに入れた後に遷移するページのカテゴリーを取得するメソッド */
	public String getCategory() {
		return category;
	}
	/** カートに入れた後に遷移するページのカテゴリーを格納するメソッド */
	public void setCategory(String category) {
		this.category = category;
	}
	/** カートに入れた後に遷移するページの価格帯を取得するメソッド */
	public int getPriceRange() {
		return priceRange;
	}
	/** カートに入れた後に遷移するページの価格帯を格納するメソッド */
	public void setPriceRange(int priceRange) {
		this.priceRange = priceRange;
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
