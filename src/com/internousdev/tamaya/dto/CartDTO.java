/**
 *
 */
package com.internousdev.tamaya.dto;

import java.math.BigDecimal;

/**
 * @author internousdev
 *
 */
public class CartDTO {

	private int userId;			//ユーザーID

	private int itemId;			//商品ID

	private String itemName;		//商品名

	private BigDecimal price;		//単価

	private int quantity;			//数量

	private String imgPath;			//イメージパス

	private BigDecimal subtotal;		//小計


	//以下アクセサリー




	/**
	 * ユーザーIDを取得するメソッド
	 * @return userId ユーザーID
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * ユーザーIDを格納するメソッド
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * 商品IDを取得するメソッド
	 * @return itemId 商品ID
	 */
	public int getItemId() {
		return itemId;
	}
	/**
	 * 商品IDを格納するメソッド
	 * @param itemId セットする itemId
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	/**
	 * 商品名を取得するメソッド
	 * @return itemsName 商品名
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * 商品名を格納するメソッド
	 * @param itemsName セットする itemsName
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * 単価を取得するメソッド
	 * @return price 単価
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * 単価を格納するメソッド
	 * @param price セットする price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * 数量を取得するメソッド
	 * @return quantities 数量
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * 数量を格納するメソッド
	 * @param quantities セットする quantities
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * イメージファイルパスを取得するメソッド
	 * @return imgPath イメージファイルパス
	 */
	public String getImgPath() {
		return imgPath;
	}
	/**
	 * イメージファイルパスを格納するメソッド
	 * @param imgPath セットする imgPath
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	/**
	 * 小計を取得するメソッド
	 * @return subtotal
	 */
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	/**
	 * 小計を格納するメソッド
	 * @param subtotal セットする subtotal
	 */
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

}


