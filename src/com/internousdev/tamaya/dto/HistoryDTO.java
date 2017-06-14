package com.internousdev.tamaya.dto;

import java.math.BigDecimal;

/**
 * 購入情報に関するDTOクラス
 * @author Takuya Kishimoto
 * @since 2017/05/19
 * @version 1.0
 */

public class HistoryDTO {

	private int userId;				//ﾕｰｻﾞｰID

	private int itemId;				//アイテムID

	private BigDecimal price;		//単価

	private int quantity;			//数量

	private BigDecimal subTotal;		//小計

	private String createdAt;		//登録日

	private String itemName;		//商品名

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getQuantities() {
		return quantity;
	}

	public void setQuantities(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemsName(String itemName) {
		this.itemName = itemName;
	}
}