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
	/** 商品ID */
	private int itemId;
	/** 商品名 */
	private String itemName;
	/** 単価 */
	private BigDecimal price;
	/** 数量 */
	private int quantity;
	/** 在庫 */
	private int stocks;
	/** イメージファイルパス */
	private String imgPath;
	/** 小計 */
	private BigDecimal subtotal;

	public void calcSubtotal() {

	}

	/** 商品IDを取得するメソッド */
	public int getItemId() {
		return itemId;
	}
	/** 商品IDを格納するメソッド */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	/** 商品名を取得するメソッド */
	public String getItemName() {
		return itemName;
	}
	/** 商品名を格納するメソッド */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/** 単価を取得するメソッド */
	public BigDecimal getPrice() {
		return price;
	}
	/** 単価を格納するメソッド */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/** 数量を取得するメソッド */
	public int getQuantity() {
		return quantity;
	}
	/** 数量を格納するメソッド */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/** 在庫を取得するメソッド */
	public int getStocks() {
		return stocks;
	}
	/** 在庫を格納するメソッド */
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}
	/** イメージファイルパスを取得するメソッド */
	public String getImgPath() {
		return imgPath;
	}
	/** イメージファイルパスを格納するメソッド */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	/** 小計を取得するメソッド */
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	/** 小計を格納するメソッド */
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

}


