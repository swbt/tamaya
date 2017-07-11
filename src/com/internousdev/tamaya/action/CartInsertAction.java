/**
 *
 */
package com.internousdev.tamaya.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.CartInsertDAO;
import com.internousdev.tamaya.dto.PurchaseDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class CartInsertAction extends ActionSupport implements SessionAware {

	/**
	 * 生成されたシリアルナンバー
	 */
	private static final long serialVersionUID = -7416129671577221670L;

	/**
	 * ユーザーID
	 */
	private int userId = 3;

	/**
	 * アイテムID
	 */
	private int itemId;

	/**
	 * アイテムネーム
	 */
	private String itemName;

	/**
	 * イメージ１
	 */
	private String image1;

	/**
	 * オーダーカウント
	 */
	private int orderCount;

	/**
	 * プライス
	 */
	private float price;

	/**
	 * 購入番号
     */
	private int numberPurchased;

	/**
	 * 合計(数)
	 *
	 */
	private int totalAmount;

	/**
	 * カートリスト
	 */
	private ArrayList<PurchaseDTO> cartList=new ArrayList<PurchaseDTO>();

	/**
	 * カート検索
	 */
	private ArrayList<PurchaseDTO> searchCart=new ArrayList<PurchaseDTO>();

	/**
	 * ユーザー情報
	 */
	private Map<String, Object> session;


	/**
	 * 実行メソッド
	 * @author AYUMU SHINKAI
	 * @return result 成功ならSUCCESS　失敗ならERROR　ログイン状態でなければLOGIN
	 */
	public String execute(){
		System.out.println("アクションに来たよ");
		//基本的にresultにはERRORが入っている
	String result = ERROR;

/*
 * ユーザーIDが取得できなければログインさせる
 */
	if(session.get("userId") != null){
		int userId = (int) session.get("userId");
	    CartInsertDAO dao = new CartInsertDAO();

	    /*
	     * cartテーブルに同じ商品があればエラー
	     */
	 /*   searchCart = dao.search(userId,itemId);
	    	if(searchCart.size()!=0){
	    		return result;
	    	}*/

        /*
         * insertできていればSUCCESS
         */

			//resultがSUCCESSに置き換わる
			int count = 0;
			count = dao.insert(userId,itemId,orderCount) ;
			System.out.println(count + "無理");

/*		元	if(dao.insert(userId,itemId,orderCount) > 0){*/
			if(count>0){
			result = SUCCESS;
		/*	int listSize=cartList.size();
			float totalAmountFloat=0;

			for(int i=0;i<listSize;i++){
				numberPurchased += cartList.get(i).getOrderCount();
				totalAmountFloat += (cartList.get(i).getPrice()) * (float)(cartList.get(i).getOrderCount());
				totalAmount = (int)totalAmountFloat;
			}*/
		}
	}else{
		//resultがLOGINに置き換わる
		result = LOGIN;

	}
	System.out.println(result + "引き渡ししてくれ");
	return result;

    }


	/**
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}


	/**
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}


	/**
	 * @return itemId
	 */
	public int getItemId() {
		return itemId;
	}


	/**
	 * @param itemId セットする itemId
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	/**
	 * @return itemName
	 */
	public String getItemName() {
		return itemName;
	}


	/**
	 * @param itemName セットする itemName
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	/**
	 * @return image1
	 */
	public String getImage1() {
		return image1;
	}


	/**
	 * @param image1 セットする image1
	 */
	public void setImage1(String image1) {
		this.image1 = image1;
	}


	/**
	 * @return orderCount
	 */
	public int getOrderCount() {
		return orderCount;
	}


	/**
	 * @param orderCount セットする orderCount
	 */
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}


	/**
	 * @return price
	 */
	public float getPrice() {
		return price;
	}


	/**
	 * @param price セットする price
	 */
	public void setPrice(float price) {
		this.price = price;
	}


	/**
	 * @return numberPurchased
	 */
	public int getNumberPurchased() {
		return numberPurchased;
	}


	/**
	 * @param numberPurchased セットする numberPurchased
	 */
	public void setNumberPurchased(int numberPurchased) {
		this.numberPurchased = numberPurchased;
	}


	/**
	 * @return totalAmount
	 */
	public int getTotalAmount() {
		return totalAmount;
	}


	/**
	 * @param totalAmount セットする totalAmount
	 */
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}


	/**
	 * @return cartList
	 */
	public ArrayList<PurchaseDTO> getCartList() {
		return cartList;
	}


	/**
	 * @param cartList セットする cartList
	 */
	public void setCartList(ArrayList<PurchaseDTO> cartList) {
		this.cartList = cartList;
	}


	/**
	 * @return searchCart
	 */
	public ArrayList<PurchaseDTO> getSearchCart() {
		return searchCart;
	}


	/**
	 * @param searchCart セットする searchCart
	 */
	public void setSearchCart(ArrayList<PurchaseDTO> searchCart) {
		this.searchCart = searchCart;
	}


	/**
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}


	/**
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	/**
	 * @return serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
