package com.internousdev.tamaya.action;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.GoCartDAO;
import com.internousdev.tamaya.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カートの情報を取得するアクションクラス
 * @author seiya takahashi
 * @since 2017/6/13
 * @version 1.0
 */

public class GoCartAction extends ActionSupport implements SessionAware{

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
	 * 単価
	 */
	private BigDecimal price;
	/**
	 *数量
	 */
	private int quantities;
	/**
	 *イメージパスファイル
	 */
	private String imgPath;
	/**
	 * 合計金額
	 */
	private BigDecimal amountAll;
	/**
	 * カート内の商品情報を入れるリスト
	 */
	private ArrayList<CartDTO> cartList=new ArrayList<>();
	/**
	 *セッション情報
	 */
	private Map<String,Object> session;

	/**
	 * 実行メソッド
	 * 処理内容と順番
	 * 1：セッション情報を持っているか判断
	 * 2：session内のuserIdを使用し、カートへ登録された情報を取得
	 * 3：カート内の情報を元に合計金額を算出
	 */
	public String execute() throws SQLException{
		String result=ERROR;

		if (session.containsKey("userId")) {
			userId = (int)session.get("userId");

			GoCartDAO dao = new GoCartDAO();
			cartList = dao.selectedItem(userId);
			for(int i = 0; i < cartList.size(); i++ ){
				total += (cartList.get(i).getPrice())multiply(cartList.get(i).getQuantity());
			}
			result = SUCCESS;
		}
		return result;
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
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * 商品IDを格納するメソッド
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * 商品名を取得するメソッド
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
	 * 単価を格取得するメソッド
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
	 * 数量を取得するメソッド
	 */
	public int getQuantities() {
		return quantities;
	}

	/**
	 * 数量を格納するメソッド
	 */
	public void setQuantities(int quantity) {
		this.quantity = quantity;
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
	 * 合計金額を取得するメソッド
	 */
	public BigDecimal getAmountAll() {
		return amountAll;
	}

	/**
	 * 合計金額を格納するメソッド

	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	/**
	 * カート内の商品情報を入れるリストを取得するメソッド
	 */
	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	/**
	 * カート内の商品情報を入れるリストを格納するメソッド
	 */
	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}

	/**
	 * セッション情報を取得するメソッド
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッションを格納するメソッド
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
