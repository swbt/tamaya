/**
 *
 */
package com.internousdev.tamaya.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.AddToCartDAO;
import com.internousdev.tamaya.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class AddToCartAction extends ActionSupport implements SessionAware {

	/** 生成されたシリアルナンバー */
	private static final long serialVersionUID = -7416129671577221670L;
	private String category = "";
	private int priceRange = 0;
	/** ユーザーID */
	private int userId = 3;
	/** アイテムID */
	private int itemId;
	/** アイテムネーム */
	private String itemName;
	/** イメージ１ */
	private String image1;
	/** オーダーカウント */
	private int orderCount;
	/** プライス */
	private float price;
	/** 購入番号 */
	private int numberPurchased;
	/** 合計(数) */
	private int totalAmount;
	/** カートリスト */
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
	/** カート検索 */
	private ArrayList<CartDTO> searchCart = new ArrayList<CartDTO>();
	/** ユーザー情報 */
	private Map<String, Object> session;

	/**
	 * 実行メソッド
	 *
	 * @author AYUMU SHINKAI
	 * @return result 成功ならSUCCESS 失敗ならERROR ログイン状態でなければLOGIN
	 */
	public String execute() {
		String result = ERROR;

		if (session.get("userId") != null) {
			int userId = (int) session.get("userId");
			System.out.println("AddToCartAction : userId = " + userId + ", itemId = " + itemId + ", orderCount = " + orderCount);
			AddToCartDAO dao = new AddToCartDAO();
			if (dao.insert(userId, itemId, orderCount)) {
				result = SUCCESS;
			}
		} else {
			result = LOGIN;
		}
		return result;
	}

	/**
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return itemId
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * @param itemId
	 *            セットする itemId
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * @return itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName
	 *            セットする itemName
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return image1
	 */
	public String getImage1() {
		return image1;
	}

	/**
	 * @param image1
	 *            セットする image1
	 */
	public void setImage1(String image1) {
		this.image1 = image1;
	}

	/**
	 * @return orderCount
	 */
	public int getOrderCount() {
		return orderCount;
	}

	/**
	 * @param orderCount
	 *            セットする orderCount
	 */
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	/**
	 * @return price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            セットする price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return numberPurchased
	 */
	public int getNumberPurchased() {
		return numberPurchased;
	}

	/**
	 * @param numberPurchased
	 *            セットする numberPurchased
	 */
	public void setNumberPurchased(int numberPurchased) {
		this.numberPurchased = numberPurchased;
	}

	/**
	 * @return totalAmount
	 */
	public int getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount
	 *            セットする totalAmount
	 */
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * @return cartList
	 */
	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	/**
	 * @param cartList
	 *            セットする cartList
	 */
	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}

	/**
	 * @return searchCart
	 */
	public ArrayList<CartDTO> getSearchCart() {
		return searchCart;
	}

	/**
	 * @param searchCart
	 *            セットする searchCart
	 */
	public void setSearchCart(ArrayList<CartDTO> searchCart) {
		this.searchCart = searchCart;
	}

	/**
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * @param session
	 *            セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * @return serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(int priceRange) {
		this.priceRange = priceRange;

	}

}
