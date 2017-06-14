/**
 *
 */
package com.internousdev.tamaya.action;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.internousdev.tamaya.dao.AdminItemDAO;
import com.internousdev.tamaya.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *商品一覧を表示するクラス
 */
public class AdminItemAction extends ActionSupport{

	/**
	 * 商品名
	 *
	 */
	private String itemName="";

	/**
	 * 単価
	 */
	private BigDecimal price;

	/**
	 * イメージファイルパス
	 */
	private String imgPath;

	/**
	 * 商品詳細
	 */
	private String itemDetail;

	/**
	 * 在庫数
	 */
	private int stocks;

	/**
	 * 売上数
	 */
	private int sales;

	/**
	 * 登録日
	 */
	private String createdAt;

	/**
	 * 更新日
	 */
	private String updatedAt;


	/**
	 * 商品リスト
	 */
	public ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();



	/**
	 * 商品リストを取得するメソッド
	 * @author Ryo Maeda
	 * 	@return SUCCESS
	 * @since 2017/5/16
	 */
	public String execute(){
		String result =SUCCESS;

		int all=0;
		ArrayList<ItemDTO> allList = new ArrayList<ItemDTO>();
		AdminItemDAO dao=new AdminItemDAO();
		allList=dao.select("");
		all=allList.size();
		for(int i=0;i<all;i++){
			ItemDTO dto = new ItemDTO();
			dto= allList.get(i);
			String str=dto.getItemName();
			if(str.startsWith(itemName)){
				itemList.add(dto);
			}

		}
		number=itemList.size();

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
	 * @param itemsName セットする itemsName
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
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
	 * 在庫数を取得するメソッド
	 * @return stock　在庫数
	 */
	public int getStocks() {
		return stocks;
	}



	/**
	 * 在庫数を格納するメソッド
	 * @param stock セットする stock
	 */
	public void setStocks(int stock) {
		this.stocks = stock;
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
	 * 登録日を取得するメソッド
	 * @return createdAt　登録日
	 */
	public String getCreatedAt() {
		return createdAt;
	}



	/**
	 * 登録日を格納するメソッド
	 * @param createdAt セットする createdAt
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}



	/**
	 * 更新日を取得するメソッド
	 * @return updatedAt　更新日
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}



	/**
	 * 更新日を格納するメソッド
	 * @param updatedAt セットする updatedAt
	 */
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}


	/**
	 * 商品リストを取得するメソッド
	 * @return itemList　商品リスト
	 */
	public ArrayList<ItemDTO> getItemList() {
		return itemList;
	}



	/**
	 * 商品リストを格納するメソッド
	 * @param itemList セットする itemList
	 */
	public void setItemList(ArrayList<ItemDTO> itemList) {
		this.itemList = itemList;
	}
}
