/**
 *
 */
package com.internousdev.tamaya.action;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.AddToCartDAO;
import com.internousdev.tamaya.dto.CartDTO;
import com.internousdev.tamaya.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author seiya takahashi
 * @since 2017/6/13
 *
 */
public class AddToCartAction extends ActionSupport implements SessionAware {

	private int userId;				//ユーザーID
	private int itemId;				// 商品ID
	private String itemName;		// 商品名
	private BigDecimal price;			//単価

	private int quantity;			//数量
	private String imgPath;			//イメージファイルパス
	private BigDecimal total;				//合計金額
	private int addCount;			//カートへ商品追加処理をした件数

	private ArrayList<CartDTO> cartList;			//カート情報
	private ArrayList<ItemDTO> itemStatus;			//商品情報
	private Map<String, Object> session;			//セッション情報

	/**
	 1：セッション情報を持っているか判断
	 2：購入数が在庫数を超えていないか判断
	 3：遷移元のitemId,itemName,price,quantity,imgPathとsession内のuserIdを使用し、カートへ指定商品を登録
	 4：カートへ登録された情報を取得
	 5：カート内の情報を元に購入商品の合計金額金額を算出
	 * @author seiya takahashi
	 * @since 2017/6/13

	 */

	public String execute() throws SQLException {

		String result = ERROR;

		if (session.containsKey("userId")) {

			userId = (int) session.get("userId");
			AddToCartDAO dao = new AddToCartDAO();
			itemStatus = dao.itemStatus(itemId);
			addCount = dao.addToCart(userId, itemId);
			cartList = dao.selected(userId);

		if (cartList.size() > 0) {
					for (int i = 0; i < cartList.size(); i++) {
						total = total.add(cartList.get(i).getPrice()) .multiply (BigDecimal.valueOf(cartList.get(i).getQuantity()));
					}
					result = SUCCESS;
				}
		}
		return result;
	}




	/**ユーザーID取得メソッド*/
	public int getUserId() {
		return userId;
	}
	/**ユーザーID格納メソッド */
	public void setUserId(int userId) {
		this.userId = userId;
	}


	/**商品ID取得メソッド*/
	public int getItemId() {
		return itemId;
	}
	/**商品ID格納メソッド*/
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	/**商品名取得メソッド */
	public String getItemName() {
		return itemName;
	}
	/**商品名格納メソッド*/
	public void setItemsName(String itemName) {
		this.itemName = itemName;
	}


	/**単価取得メソッド*/
	public BigDecimal getPrice() {
		return price;
	}
	/** 単価格納メソッド*/
	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	/**数量取得メソッド*/
	public int getQuantity() {
		return quantity;
	}
	/**数量格納メソッド*/
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	/**イメージファイルパス取得メソッド*/
	public String getImgPath() {
		return imgPath;
	}
	/**イメージファイルパス格納メソッド*/
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}


	/**合計金額取得メソッド*/
	public BigDecimal getTotal() {
		return total;
	}
	/**合計金額格納メソッド*/
	public void setTotal(BigDecimal total) {
		this.total = total;
	}


    /**カートへ商品追加処理をした件数を取得する*/
	public int getAddCount() {
		return addCount;
	}
	/**カートへ商品追加処理をした件数を格納する*/
	public void setAddcount(int addCount) {
		this.addCount = addCount;
	}


	/**カート情報を取得するメソッド*/
	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}
	/**カート情報を格納するメソッド*/
	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}


	/**商品情報を取得するメソッド*/
	public ArrayList<ItemDTO> getItemStatus() {
		return itemStatus;
	}
	/**商品情報を格納するメソッド*/
	public void setItemStatus(ArrayList<ItemDTO> itemStatus) {
		this.itemStatus = itemStatus;
	}


	/**セッション操作用情報を取得するメソッド*/
	public Map<String, Object> getSession() {
		return session;
	}
	/**セッション情報を格納するメソッド*/
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}




