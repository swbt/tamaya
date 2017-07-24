/**
 *
 */
package com.internousdev.tamaya.dto;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * カート情報を格納・取得するクラス
 * @author Takahiro Adachi
 * @since 1.0
 */
public class CartDTO {
	/** 商品ID */
	private int itemId;
	/** 商品名 */
	private String itemName;
	/** 税抜価格 */
	private BigDecimal basePrice;
	/** 税率 */
	private BigDecimal taxRate;
	/** 税込価格 */
	private BigDecimal price;
	/** 数量 */
	private int quantity;
	/** 在庫 */
	private int stocks;
	/** 画像のパス */
	private String imgPath;
	/** 小計 */
	private BigDecimal subtotal;

	/** 税込価格と小計を計算するメソッド */
	public void calc() {
		price = basePrice.multiply(BigDecimal.ONE.add(taxRate)).setScale(0, RoundingMode.HALF_EVEN);
		subtotal = price.multiply(BigDecimal.valueOf(quantity));
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
	/** 税抜価格を取得するメソッド */
	public BigDecimal getBasePrice() {
		return basePrice;
	}
	/** 税抜価格を格納するメソッド */
	public void setBasePrice(BigDecimal baseprice) {
		this.basePrice = baseprice.setScale(0, RoundingMode.HALF_EVEN);
	}
	/** 税率を取得するメソッド */
	public BigDecimal getTaxRate() {
		return taxRate;
	}
	/** 税率を格納するメソッド */
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
	/** 税込価格を取得するメソッド */
	public BigDecimal getPrice() {
		return price;
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
	/** 画像のパスを取得するメソッド */
	public String getImgPath() {
		return imgPath;
	}
	/** 画像のパスを格納するメソッド */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	/** 小計を取得するメソッド */
	public BigDecimal getSubtotal() {
		return subtotal;
	}
}
