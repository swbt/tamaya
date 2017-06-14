/**
 *
 */
package com.internousdev.tamaya.dto;

import java.math.BigDecimal;

/**
 * 商品に関する情報をここに入れて運ぶ
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class ItemDTO {
	private static BigDecimal tax = new BigDecimal("0.08");
	private int itemId;
	private String itemName;
	private String category;
	private BigDecimal priceWithTax;	//税込価格
	private int stocks;
	private int sales;
	private String itemDetail;
	private String imgPath;
    private int SortId;
    private String ItemGenre;

	public static BigDecimal getTax() {
		return tax;
	}
	public static void setTax(BigDecimal tax) {
		ItemDTO.tax = tax;
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

	public String getItemGenre() {
		return ItemGenre;
	}
	public void setItemGenre(String itemGenre) {
		ItemGenre = itemGenre;
	}
	public int getSortId() {
		return SortId;
	}
	public void setSortId(int sortId) {
		SortId = sortId;
	}

}
