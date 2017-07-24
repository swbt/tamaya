/**
 *
 */
package com.internousdev.tamaya.dto.test;

import java.math.BigDecimal;

/**
 * 商品に関する情報をここに入れて運ぶ
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class ItemDTO {
	private int itemId;
	private String itemName;
	private String category;
	private BigDecimal price;	//税抜き価格
	private BigDecimal taxRate;		//税
	private BigDecimal priceWithTax;	//税込価格
	private int stocks;
	private int sales;
	private String itemDetail;
	private String imgPath;

	public void calcPriceWithTax() {
		priceWithTax = price.multiply(taxRate.add(BigDecimal.ONE)).setScale(0, BigDecimal.ROUND_DOWN);
	}

	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
	public BigDecimal getPriceWithTax() {
		return priceWithTax;
	}
	public void setPriceWithTax(BigDecimal priceWithTax) {
		this.priceWithTax = priceWithTax;
	}
	public int getStocks() {
		return stocks;
	}
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public String getItemDetail() {
		return itemDetail;
	}
	public void setItemDetail(String itemDetail) {
		this.itemDetail = itemDetail;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
}
