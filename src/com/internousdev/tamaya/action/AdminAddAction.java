/**
 *
 */
package com.internousdev.tamaya.action;

import java.math.BigDecimal;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author SEIYA TAKAHASHI
 * @since 2017/6/13
 *
 * 商品を追加するアクションクラス
 */
public class AdminAddAction extends ActionSupport{


	private String itemName="";		//商品名//
	private int itemId;				//商品Id//
	private int category;		//商品カテゴリー//
	private BigDecimal price;       //価格//

	private String imgPath;         //商品写真//
	private String itemDetail;      //商品詳細//
	private int stocks=0;           //在庫数//
	private int sales;              //売り上げ数//

	private String createdAt;	    //登録日//
	private String updateAt;		//更新日//
	private String doubling;		//商品名重複時のエラー文//



	//商品重複確認して、条件一致なら商品情報の追加//
	public String execute(){
		String result =ERROR;
		int inserted=0;

		AdminAddDAO dao=new AdminAddDAO();
		if(dao.doubling(itemName)){
			setDoubling("＊すでにある商品です");
	}else{
		inserted=dao.insert(itemName,price,stocks,itemDetail,imgPath,category);

		if(inserted>0){
			result=SUCCESS;
		}
		return result;
	}
	}



	public String getItemName(){    //商品名の取得//
		return itemName;
	}
	public void setItemName(String itemName){ //商品名を格納//
		this.itemName=itemName;
	}



	public int getItemId(){			//商品Idを取得//
		return itemId;
	}
	public void setItemId(){		//商品Idを格納//
		this.itemId=itemId;
	}


	//ジャンルを取得する//
	public int getCategory(){
		return category;
	}
	//ジャンルを格納する/
	public void setCategory(int category){
		this.category=category;
	}


	//価格を取得するメソッド//
	public BigDecimal getPrice(){
		return price;
	}
	//価格を格納するメソッド
	public void setPrice(BigDecimal price){
		this.price=price;
	}


	//画像を取得//
	public string getImgPath(){
		return imgPath;
	}
	//画像を格納//
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}


	//商品詳細を取得//
	public String getItemDetail() {
		return itemDetail;
	}
	//商品詳細を格納//
	public void setItemDetail(String itemDetail) {
		this.itemDetail = itemDetail;
	}


	//在庫数を取得//
	public int getStock() {
		return stocks;
	}
	//在庫数を格納//
	public void setStock(int stock) {
		this.stocks = stocks;
	}


	//売り上げを取得//
	public int getSales() {
		return sales;
	}
	//売り上げを格納//
	public void setSales(int sales) {
		this.sales = sales;
	}


	//登録日を取得//
	public String getCreatedAt() {
		return createdAt;
	}
	//登録日を格納//
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}


	//更新日を取得//
	public String getUpdatedAt() {
		return updatedAt;
	}
	//更新日を格納//
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}


	//商品画像を取得//
	public String getImagePath() {
		return itemImg;
	}
	//商品画像を格納//
	public void setImgPath(String imgPath) {
		this.itemImg = itemImg;
	}


	//商品名の重複時のエラー文を取得//
	public String getDoubling() {
		return doubling;
	}
	//商品名の重複時のエラー文を格納//
	public void setDoubling(String doubling) {
		this.doubling = doubling;
	}










}


