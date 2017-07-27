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
	private String category = "";
	private int priceRange = 0;
	/** ユーザーID */
	private int userId;
	/** 商品ID */
	private int itemId;
	/** カートに入れる数量 */
	private int quantity;
	/** セッション */
	private Map<String, Object> session;

	@Override
	public String execute() {
		userId = (int)session.get("userId");
		System.out.println("AddToCartAction : userId = " + userId + ", itemId = " + itemId + ", quantity = " + quantity);
		CartDAO dao = new CartDAO();
		if (dao.addItem(userId, itemId, quantity)) {
			return SUCCESS;
		}
		return ERROR;
	}


	/** categoryを取得するメソッド */
	public String getCategory() {
		return category;
	}

	/** categoryを格納するメソッド */
	public void setCategory(String category) {
		this.category = category;
	}

	/** priceRangeを取得するメソッド */
	public int getPriceRange() {
		return priceRange;
	}

	/** priceRangeを格納するメソッド */
	public void setPriceRange(int priceRange) {
		this.priceRange = priceRange;
	}

	/** userIdを取得するメソッド */
	public int getUserId() {
		return userId;
	}

	/** userIdを格納するメソッド */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/** itemIdを取得するメソッド */
	public int getItemId() {
		return itemId;
	}

	/** itemIdを格納するメソッド */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/** quantityを取得するメソッド */
	public int getQuantity() {
		return quantity;
	}

	/** quantityを格納するメソッド */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/** sessionを取得するメソッド */
	public Map<String, Object> getSession() {
		return session;
	}

	/** sessionを格納するメソッド */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
