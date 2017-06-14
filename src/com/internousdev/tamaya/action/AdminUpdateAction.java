package com.internousdev.tamaya.action;

import java.math.BigDecimal;

import com.internousdev.tamaya.dao.AdminUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品情報を更新するためのクラス
 * @author seiya takahashi
 * @since 2017/6/13
 * @version 1.0
 */
public class AdminUpdateAction extends ActionSupport{

	/**
	 * 商品名
	 */
	private String itemName="";

	/**
	 * 商品ID
	 */
	private int itemId;

	/**
	 * 、カテゴリー
	 */
	private String category;

	/**
	 * 単価
	 */
	private BigDecimal price;

	/**
	 * イメージファイルパス
	 */
	private String imgPath="";

	/**
	 * 商品詳細
	 */
	private String itemDetail="";

	/**
	 * 在庫数
	 */
	private int stocks=0;

	/**
	 * 売上数
	 */
	private int sales;


	 /** 登録日
	 */
	private String createdAt;

	/**
	 * 更新日
	 */
	private String updatedAt;

	/**
	 * 商品名重複時のエラー文
	 */
	private String doubling;

	/**
	 * 商品画像削除フラグ
	 */
	public int imgDel=1;


	/**
	 *商品情報を更新するメソッド
	 *商品名を確認しDBで重複していなければ商品情報を更新する
	 */
	public String execute() {
		String result =ERROR;
		int updated=0;

		AdminUpdateDAO dao= new AdminUpdateDAO();

		if(dao.doubling(itemId,itemName)){setDoubling("※同名の商品が既に存在します。");}
		else{
			updated=dao.insert(itemId,itemName, price, stocks,sales, itemDetail,imgDel,imgPath);

			if(updated>0){
				result = SUCCESS;
			}
		}

		return result;
	}


	/**
	 * 商品名を取得するメソッド
	 * @return itemsName　商品名
	 */
	public String getItemName() {
		return itemName;
	}


	/**
	 * 商品名を格納するメソッド
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	/**
	 * 商品IDを取得するメソッド
	 */
	public int getItemId() {
		return itemId;
	}


	/**
	 * 商品IDを取得するメソッド
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	/**
	 * カテゴリーを取得するメソッド
	 */
	public String category() {
		return category;
	}


	/**
	 * カテゴリーを格納するメソッド
	 */
	public void setCategory(String category) {
		this.category = category;
	}


	/**
	 * 単価を取得するメソッド
	 */
	public BigDecimal getPrice() {
		return price;
	}


	/**
	 * 単価を格納するメソッド
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	/**
	 * イメージパスファイルを取得するメソッド
	 */
	public String getImgPath() {
		return imgPath;
	}


	/**
	 * イメージパスファイルを格納するメソッド
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}


	/**
	 * 商品詳細を取得するメソッド
	 */
	public String getItemDetail() {
		return itemDetail;
	}


	/**
	 * 商品詳細を格納するメソッド
	 */
	public void setItemDetail(String itemDetail) {
		this.itemDetail = itemDetail;
	}


	/**
	 * 在庫数を取得するメソッド
	 */
	public int getStocks() {
		return stocks;
	}


	/**
	 * 在庫数を格納するメソッド
	 */
	public void setStocks(int stock) {
		this.stocks = stocks;
	}


	/**
	 * 売上数を取得するメソッド
	 */
	public int getSales() {
		return sales;
	}


	/**
	 * 売上数を格納するメソッド
	 */
	public void setSales(int sales) {
		this.sales = sales;
	}


	/**
	 * 登録日を取得するメソッド
	 */
	public String getCreatedAt() {
		return createdAt;
	}


	/**
	 * 登録日を格納するメソッド
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}


	/**
	 * 更新日を取得するメソッド
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}


	/**
	 * 更新日を格納するメソッド
	 */
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}


	/**
	 * 商品名重複時のエラー文を取得するメソッド
	 */
	public String getDoubling() {
		return doubling;
	}


	/**
	 * 商品名重複時のエラー文を格納するメソッド
	 */
	public void setDoubling(String doubling) {
		this.doubling = doubling;
	}


	/**
	 *商品画像削除フラグを取得するメソッド
	 */
	public int getImgDel() {
		return imgDel;
	}


	/**
	 * 商品画像削除フラグを格納するメソッド
	 */
	public void setImgDel(int imgDel) {
		this.imgDel = imgDel;
	}

}
