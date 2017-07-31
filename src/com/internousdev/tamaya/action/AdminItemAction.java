package com.internousdev.tamaya.action;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.internousdev.tamaya.dao.AdminItemDAO;
import com.internousdev.tamaya.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品一覧を表示するクラス
 * @author KAORI TAKAHASHI
 * @since 2017/07/21
 * @version 1.0
 *
 */
public class AdminItemAction extends ActionSupport{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -181035513965129116L;

	/**
	 * 商品名
	 *
	 */
	private String itemName = "";

	/**
	 * 商品リスト
	 */
	public ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();

	/**
	 * 表示リスト
	 */
	public ArrayList<ItemDTO> displayList = new ArrayList<ItemDTO>();

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
	 * 検索数
	 */
	public int number;

	/**	保留開始
	 *
	 * 最大ページ数
	private int maxPage;

	 **
	 * ページ番号
	 *
	private int pageNum=1;
	 *
	保留ここまで*/

	/**
	 * エラーメッセージ
	 */
	private String resultSelect;

	/**
	 *	ページネーションする全体のページ数
	 */
	private int pageCount;

	/**
	 *	ページネーションする全体のページ数の配列
	 */
	private int[] arrayPageCount;

	/**
	 *	ページネーションでの現在のページ
	 */
	private int currentPage;

	/**
	 *	1ページに表示する上限(初期値20コ分)
	 */
	private int pageLimit = 20;

	/**
	 *	ページネーションの左側のボタンの数
	 */
	private int leftPage;

	/**
	 *	ページネーションの右側のボタンの数
	 */
	private int rightPage;


	/**
	 * 商品リストを取得するメソッド
	 * @author KAORI TAKAHASHI
	 * 	@return SUCCESS
	 * @since 2017/7/21
	 */
	public String execute() {
		String result = ERROR;
		AdminItemDAO dao = new AdminItemDAO();

		if(itemName != null || itemName != null) {

			displayList = dao.select(itemName);



			pageCount = displayList.size()/pageLimit;
			if(displayList.size()%pageLimit != 0){
				pageCount++;
			}
			arrayPageCount =new int[pageCount];
			for(int i=0;i<pageCount;i++){
				arrayPageCount[i] = i+1;
			}
			int rowNumber = pageLimit * currentPage;
			for(int j=0 ; j < displayList.size() ; j++){
				if( j >= rowNumber){
					ItemDTO dto = displayList.get(j);
					itemList.add(dto);
				}
				if( itemList.size()==pageLimit){
					break;
				}
			}
			if(currentPage==pageCount-1){
				leftPage=4;
				rightPage=0;
			}else if(currentPage==pageCount-2){
				leftPage=3;
				rightPage=1;
			}else if(currentPage==0){
				leftPage=0;
				rightPage=4;
			}else if(currentPage==1){
				leftPage=1;
				rightPage=3;
			}else{
				leftPage=2;
				rightPage=2;
			}


			result = SUCCESS;
		} if (itemList.size() == 0) {
			resultSelect = "該当する商品は存在しません";
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
	 * 商品名を設定するメソッド
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
	 * 単価を設定するメソッド
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
	 * イメージファイルパスを設定するメソッド
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
	 * 商品詳細を設定するメソッド
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
	 * 在庫数を設定するメソッド
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
	 * 売上数を設定するメソッド
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
	 * 登録日を設定するメソッド
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
	 * 更新日を設定するメソッド
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
	 * 商品リストを設定するメソッド
	 * @param itemList セットする itemList
	 */
	public void setItemList(ArrayList<ItemDTO> itemList) {
		this.itemList = itemList;
	}

	/**
	 * エラーメッセージ取得メソッド
	 * @return resultSelect
	 */
	public String getResultSelect() {
		return resultSelect;
	}
	/**
	 * エラーメッセージ設定メソッド
	 * @param resultSelect
	 */
	public void setResultSelect(String resultSelect) {
		this.resultSelect = resultSelect;
	}


	/**
	 * ページネーションする全体のページ数取得メソッド
	 * @return pageCount　ページネーションする全体のページ数
	 */
	public int getPageCount() {
		return pageCount;
	}

	/**
	 * ページネーションする全体のページ数格納メソッド
	 * @param pageCount セットする pageCount
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	/**
	 * ページネーションする全体のページ数の配列取得メソッド
	 * @return arrayPageCount　ページネーションする全体のページ数の配列
	 */
	public int[] getArrayPageCount() {
		return arrayPageCount;
	}

	/**
	 * ページネーションする全体のページ数の配列格納メソッド
	 * @param arrayPageCount セットする arrayPageCount
	 */
	public void setArrayPageCount(int[] arrayPageCount) {
		this.arrayPageCount = arrayPageCount;
	}

	/**
	 * ページネーションでの現在のページ取得メソッド
	 * @return currentPage　ページネーションでの現在のページ
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/**
	 * ページネーションでの現在のページ格納メソッド
	 * @param currentPage セットする currentPage
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * 1ページに表示する上限取得メソッド
	 * @return pageLimit　1ページに表示する上限
	 */
	public int getPageLimit() {
		return pageLimit;
	}

	/**
	 * 1ページに表示する上限格納メソッド
	 * @param pageLimit セットする pageLimit
	 */
	public void setPageLimit(int pageLimit) {
		this.pageLimit = pageLimit;
	}

	/**
	 * ページネーションの左側のボタンの数取得メソッド
	 * @return leftPage　ページネーションの左側のボタンの数
	 */
	public int getLeftPage() {
		return leftPage;
	}

	/**
	 * ページネーションの左側のボタンの数格納メソッド
	 * @param leftPage セットする leftPage
	 */
	public void setLeftPage(int leftPage) {
		this.leftPage = leftPage;
	}

	/**
	 * ページネーションの右側のボタンの数取得メソッド
	 * @return rightPage　ページネーションの右側のボタンの数
	 */
	public int getRightPage() {
		return rightPage;
	}

	/**
	 * ページネーションの右側のボタンの数格納メソッド
	 * @param rightPage セットする rightPage
	 */
	public void setRightPage(int rightPage) {
		this.rightPage = rightPage;
	}

	}