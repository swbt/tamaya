/**
 *
 */
package com.internousdev.tamaya.dto;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 商品情報を格納・取得するクラス, price と total は自動計算される
 * @author TAKAHIRO ADACHI
 * @since 1.0
 */
public class ItemDTO {
	/** 商品ID */
	private int itemId;
	/** 商品名 */
	private String itemName;
	/** カテゴリー */
	private String category;
	/** 税抜価格 */
	private BigDecimal basePrice = BigDecimal.ZERO;
	/** 税率 */
	private BigDecimal taxRate = BigDecimal.ZERO;
	/** 税込価格 */
	private BigDecimal price = BigDecimal.ZERO;
	/** 在庫 */
	private int stocks;
	/** 販売数 */
	private int sales;
	/** 商品詳細 */
	private String itemDetail;
	/** 画像のパス */
	private String imgPath;
	/** カート内の個数 */
	private int quantity = 0;
	/** 合計価格（税込価格×個数） */
	private BigDecimal total = BigDecimal.ZERO;

	/** 税込価格と小計を計算するメソッド */
	public void calc() {
		price = basePrice.multiply(BigDecimal.ONE.add(taxRate)).setScale(0, RoundingMode.HALF_EVEN);
		total = price.multiply(BigDecimal.valueOf(quantity));
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
	/** カテゴリーを取得するメソッド */
	public String getCategory() {
		return category;
	}
	/** カテゴリーを格納するメソッド */
	public void setCategory(String category) {
		this.category = category;
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
	/** 税込価格を格納するメソッド */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/** 在庫を取得するメソッド */
	public int getStocks() {
		return stocks;
	}
	/** 在庫を格納するメソッド */
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}
	/** 販売数を取得するメソッド */
	public int getSales() {
		return sales;
	}
	/** 販売数を格納するメソッド */
	public void setSales(int sales) {
		this.sales = sales;
	}
	/** 商品詳細を取得するメソッド */
	public String getItemDetail() {
		return itemDetail;
	}
	/** 商品詳細を格納するメソッド */
	public void setItemDetail(String itemDetail) {
		this.itemDetail = itemDetail;
	}
	/** 画像のパスを取得するメソッド */
	public String getImgPath() {
		return imgPath;
	}
	/** 画像のパスを格納するメソッド */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	/** カート内の個数を取得するメソッド */
	public int getQuantity() {
		return quantity;
	}
	/** カート内の個数を格納するメソッド */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/** 合計価格（税込価格×個数）を取得するメソッド */
	public BigDecimal getTotal() {
		return total;
	}
}
