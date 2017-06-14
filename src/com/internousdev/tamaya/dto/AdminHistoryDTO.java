package com.internousdev.tamaya.dto;

import java.math.BigDecimal;

/**
 * 管理者販売履歴に関するDTOクラス
 * @author Atsushi Kawai
 * @since 6/13
 * @version 1.0
 */

public class AdminHistoryDTO {

	private String itemName;		//商品名

	private BigDecimal price;		//単価

	private int itemId;				//商品ID

	private String createdAt;		//登録日

	private BigDecimal subtotal;			//小計

	private int sales;				//売り上げ数

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}
}