package com.internousdev.tamaya.action;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.CartDeleteDAO;
import com.internousdev.tamaya.dao.CartUpdateDAO;
import com.internousdev.tamaya.dao.GoCartDAO;
import com.internousdev.tamaya.dao.PurchaseCompleteDAO;
import com.internousdev.tamaya.dto.CartDTO;
import com.internousdev.tamaya.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カート内の個数を増減するクラス
 * @author Misa Kikuchi
 * @since 2017/05/20
 * @version 1.0
 */

public class UpdateCartAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -869165581865322731L;
	/**
	 * カートID
	 */
	private int cartId;
	/**
	 *ユーザーID
	 */
	private int userId;
	/**
	 *商品ID
	 */
	private int itemId;
	/**
	 *商品名
	 */
	private String itemName;
	/**
	 * 価格
	 */
	private BigDecimal price;
	/**
	 *購入数
	 */
	private int quantity;
	/**
	 *イメージファイルパス
	 */
	private String imgPath;
	/**
	 *購入商品の合計価格
	 */
	private BigDecimal total = new BigDecimal(0);
	/**
	 * 更新処理をした件数
	 */
	private int updateCount;
	/**
	 *カート情報
	 */
	private ArrayList<CartDTO> cartList;
	/**
	 *商品情報
	 */
	private ArrayList<ItemDTO> itemStatus;
	/**
	 *セッション情報
	 */
	private Map<String,Object> session;



	/**
	 * カートの上限処理を実行するメソッド
	 * @author Misa Kikuchi
	 * @since 2017/05/20
	 * @version 1.0
	 */
	public String execute() throws SQLException {

		String result = LOGIN;
		//セッション情報の確認
		if (session.containsKey("userId")) {

			userId = (int) session.get("userId");
			CartUpdateDAO cartUpDao = new CartUpdateDAO();
			//GoItemDetailDAO goItemDao = new GoItemDetailDAO();
			GoCartDAO goCartDao = new GoCartDAO();
			PurchaseCompleteDAO purchaseDao = new PurchaseCompleteDAO();
			//itemStatus = goItemDao.selectbyItem(itemId);//商品情報収集

			//商品情報をカートに追加
			updateCount = cartUpDao.updateCart(cartId, userId);

			//数量に0以下が指定された場合の処理
			if(quantity <= 0){
				CartDeleteDAO DelDao = new CartDeleteDAO();
				DelDao.delete(userId);
			}

			//アレイリストに追加
			cartList = goCartDao.selectedItem(userId);

			if (purchaseDao.stockCheck(cartList)=="OK") { //在庫切れでないか？ＯＫなら次へ進む
				if (cartList.size() > 0) {
					for (int i = 0; i < cartList.size(); i++) {
						total = (cartList.get(i).getPrice()) .multiply(BigDecimal.valueOf (cartList.get(i).getQuantity()));
					}
					result = SUCCESS;
				}
				}else if(purchaseDao.stockCheck(cartList)=="NG"){
				}else{
					//在庫切れだったら、どの商品が在庫切れかをチェックする
					itemName = purchaseDao.stockCheck(cartList);
				result = ERROR;
			}
		}
		return result;
	}



	/**
	 * カートIDを取得するメソッド
	 * @return cartId　カートID
	 */
	public int getCartId() {
		return cartId;
	}

	/**
	 * カートIDを格納するメソッド
	 * @param cartId セットする cartId
	 */
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	/**
	 * ユーザーIDを取得するメソッド
	 * @return userId　ユーザーID
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを格納するメソッド
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * 商品IDを取得するメソッド
	 * @return itemId　商品ID
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * 商品IDを格納するメソッド
	 * @param itemId セットする itemId
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
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
	 * 価格を取得するメソッド
	 * @return price　価格
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * 価格を格納するメソッド
	 * @param price セットする price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * 購入数を取得するメソッド
	 * @return quantities　購入数
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * 購入数を格納するメソッド
	 * @param quantities セットする quantities
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
	 * 合計金額を取得するメソッド
	 * @return amountAll　合計金額
	 */
	public BigDecimal getTotal() {
		return total;
	}

	/**
	 * 合計金額を格納するメソッド
	 * @param amountAll セットする amountAll
	 */
	public void settotal(BigDecimal total) {
		this.total = total;
	}

	/**
	 * 更新処理をした件数を取得するメソッド
	 * @return updateCount　更新処理をした件数
	 */
	public int getUpdateCount() {
		return updateCount;
	}

	/**
	 * 更新処理をした件数を格納するメソッド
	 * @param updateCount セットする updateCount
	 */
	public void setUpdateCount(int updateCount) {
		this.updateCount = updateCount;
	}

	/**
	 * カート情報を取得するメソッド
	 * @return cartList　カート情報
	 */
	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	/**
	 * カート情報を格納するメソッド
	 * @param cartList セットする cartList
	 */
	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}

	/**
	 * 商品情報を取得するメソッド
	 * @return itemStatus　商品情報
	 */
	public ArrayList<ItemDTO> getItemStatus() {
		return itemStatus;
	}

	/**
	 * 商品情報を格納するメソッド
	 * @param itemStatus セットする itemStatus
	 */
	public void setItemStatus(ArrayList<ItemDTO> itemStatus) {
		this.itemStatus = itemStatus;
	}

	/**
	 * セッション情報を取得するメソッド
	 * @return session
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