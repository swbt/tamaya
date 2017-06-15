/**
 *
 */
package com.internousdev.tamaya.action;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.ItemDAO;
import com.internousdev.tamaya.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * 商品一覧から商品の詳細情報を取得するクラス
 *
 * @author seiya takahashiI
 * @since 2017/6/13
 * @version 1.0
 **/



public class ItemAction extends ActionSupport implements SessionAware{



 /** 商品名
 */
  private String itemName;
  /**
  * 商品ID
  */
  private int itemId;
  /**
   * 単価
   */
  private BigDecimal price;
  /**
   * イメージファイルパス
   */
  private String imgPath;
  /**
   * 在庫数
   */
  private int stocks;
  /**
   * 商品詳細
   */
  private String itemDetail;
  /**
   * 売上数
   */
  private int sales;
  /**
   * カテゴリー
   */
  private int category;




  /**
   * 商品リスト
   */
  public ArrayList<ItemDTO> Item = new ArrayList<ItemDTO>();
 /**
  * セッション情報
  */
  private Map<String,Object> session;



  /**
   * 商品情報を取得するメソッド
   */
  public String execute()throws SQLException{

	     String result=ERROR;
	     ItemDAO dao= new ItemDAO();
	     Item = dao.select();
	     if (Item.size()>0){

	    	 result = SUCCESS;
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
 * @param itemName セットする itemsName
 */
public void setItemName(String itemName) {
	this.itemName = itemName;
}


/**
 * 商品IDを取得するメソッド
 * @return itemID
 */
public int getItemId() {
	return itemId;
}


/**
 * 商品IDを格納するメソッド
 * @param itemID セットする itemID
 */
public void setItemID(int itemID) {
	this.itemId = itemId;
}


/**
 * 単価を取得するメソッド
 * @return price　単価
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
 * イメージファイルパスを取得するメソッド
 * @return imgPath　イメージファイルパス
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
 * 在庫数を取得するメソッド
 * @return stocks　在庫数
 */
public int getStocks() {
	return stocks;
}


/**
 * 在庫数を格納するメソッド
 * @param stocks セットする stocks
 */
public void setStocks(int stocks) {
	this.stocks = stocks;
}


/**
 * 商品詳細を取得するメソッド
 * @return itemDetail　商品詳細
 */
public String getItemDetail() {
	return itemDetail;
}


/**
 * 商品詳細を格納するメソッド
 * @param itemDetail セットする itemDetail
 */
public void setItemDetail(String itemDetail) {
	this.itemDetail = itemDetail;
}


/**
 * 売上数を取得するメソッド
 * @return sales　売上数
 */
public int getSales() {
	return sales;
}


/**
 * 売上数を格納するメソッド
 * @param sales セットする sales
 */
public void setSales(int sales) {
	this.sales = sales;
}


/**
 *カテゴリーを取得するメソッド
 */
public int getCategory() {
	return category;
}


/**
 * カテゴリーを格納する
 */
public void setCategory(int category) {
	this.category = category;
}


/**
 * 商品リストを取得するメソッド
 * @return item　商品リスト
 */
public ArrayList<ItemDTO> getItem() {
	return Item;
}


/**
 * 商品リストを格納するメソッド
 * @param item セットする item
 */
public void setItem(ArrayList<ItemDTO> item) {
	Item = item;
}


/**
 * セッション情報を取得するメソッド
 * @return session　セッション
 */
public Map<String, Object> getSession() {
	return session;
}


/**
 * セッション情報を格納するメソッド
 * @param session セットする session
 */
public void setSession(Map<String, Object> session) {
	this.session = session;
}





}
