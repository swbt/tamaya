package com.internousdev.tamaya.action;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.CartDeleteDAO;
import com.internousdev.tamaya.dao.CreditInsertDAO;
import com.internousdev.tamaya.dao.GoCartDAO;
import com.internousdev.tamaya.dao.MypageDAO;
import com.internousdev.tamaya.dto.CartDTO;
import com.internousdev.tamaya.dto.CreditDTO;
import com.internousdev.tamaya.dto.MypageDTO;
import com.internousdev.tamaya.util.CartAssist;


/**
 *  カートの中身を削除するクラス
 * @author YUKO TSUJI
 * @version 1.0
 * @since 2017/07/12
 */

public class CartDeleteAction extends CartAssist implements SessionAware{


	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -1599187507724872727L;

	/**
	 * 合計金額
	 */
	private BigDecimal total = new BigDecimal("0"); /*←初期化*/

	/**
	 * 　数量
	 */
	private int quantity;

	/**
	 * 　ユーザーID
	 */
	private int userId;


	private int itemId;	/* 商品ID*/

	/**
	 * 削除処理をした件数
	 */
	private int delCount;

	/**
	 * 　セッション情報
	 */
	private Map<String, Object> session;

	/**
	 * 　検索したカート内の商品の情報を入れるリスト
	 */
	private List<CartDTO> cartList = new ArrayList<>();
	/**
	 *  ユーザー情報を入れるリスト（購入確認画面で必要）
	 */
	public ArrayList<MypageDTO> usersList = new ArrayList<MypageDTO>();
	/**
	 * クレジット情報を入れるリスト（購入確認画面で必要）
	 */
	private ArrayList<CreditDTO> creditList = new ArrayList<CreditDTO>();


	/**
	 * カートの中身の削除を実行するメソッド
	 * @author YUKO TSUJI
	 * @version 1.0
	 * @since 2017/5/10
	 */
	public String execute() throws SQLException{
		String result = ERROR;


		/**
		 *セッション情報切れになっていないかの確認
		 */
		if (session.containsKey("userId")) {
			userId = (int)session.get("userId");

			CartDeleteDAO dao = new CartDeleteDAO();
			GoCartDAO dao2 = new GoCartDAO();

			delCount = dao.delete(userId,itemId);

			System.out.println(itemId + "やりましたよ2");

			System.out.println(delCount + "やりましたよ2");

			if(delCount>0){
				cartList = dao2.selectedItem(userId);
				if (cartList.size() > 0) {
					for(int i = 0; i < cartList.size(); i++ ){
						total = (cartList.get(i).getPrice()).multiply(BigDecimal.valueOf(cartList.get(i).getQuantity()));
					}
					MypageDAO dao3 = new MypageDAO();
					CreditInsertDAO dao4 = new CreditInsertDAO();
					usersList = dao3.select(userId);
					creditList = dao4.selectCredit(userId);
					result = SUCCESS;
				}
			}

		}else{
			result = LOGIN;
			}
		return result;
	}


	/**
	 * ユーザーIDを取得するためのメソッド
	 * @return userId ユーザーID
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを格納するためのメソッド
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public void setTotal(BigDecimal total) {
		this.total = total;
	}


	/**
	 * セッションを取得するためのメソッド
	 * @return session セッション情報
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッションを格納するためのメソッド
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * カート内の商品情報を取得するためのメソッド
	 * @return cartList カート内の商品情報
	 */
	public List<CartDTO> getCartList() {
		return cartList;
	}

	/**
	 * カート内の商品情報を格納するためのメソッド
	 * @param cartList セットする cartList
	 */
	public void setCartList(List<CartDTO> cartList) {
		this.cartList = cartList;
	}

	/**
	 * シリアルIDを取得するメソッド
	 * @return serialversionuid シリアルID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	/**
	 * 合計金額を取得するメソッド
	 * @return amountAll 合計金額
	 */
	public BigDecimal getTotal() {
		return total;
	}


	/**
	 * 合計金額を格納するメソッド
	 * @param amountAll セットする amountAll
	 */
	public void setAmountAll(BigDecimal total) {
		this.total = total;
	}


	/**
	 * 数量を取得するメソッド
	 * @return quantities 数量
	 */
	public int getQuantity() {
		return quantity;
	}


	/**
	 * カート内の商品数を格納するメソッド
	 * @param quantities セットする quantities
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	/**
	 * 削除処理をした件数を取得するメソッド
	 * @return delCount 削除処理をした件数
	 */
	public int getDelCount() {
		return delCount;
	}


	/**
	 * 削除処理をした件数を格納するメソッド
	 * @param delCount セットする delCount
	 */
	public void setDelCount(int delCount) {
		this.delCount = delCount;
	}


	/**
	 * ユーザー情報を入れるリスト（購入確認画面で必要）を取得するメソッド
	 * @return usersList ユーザー情報を入れるリスト
	 */
	public ArrayList<MypageDTO> getUsersList() {
		return usersList;
	}


	/**
	 * ユーザー情報を入れるリスト（購入確認画面で必要）を格納するメソッド
	 * @param usersList セットする usersList
	 */
	public void setUsersList(ArrayList<MypageDTO> usersList) {
		this.usersList = usersList;
	}


	/**
	 * クレジット情報を入れるリスト（購入確認画面で必要）を取得するメソッド
	 * @return creditList クレジット情報を入れるリスト
	 */
	public ArrayList<CreditDTO> getCreditList() {
		return creditList;
	}


	/**
	 * クレジット情報を入れるリスト（購入確認画面で必要）を格納するメソッド
	 * @param creditList セットする creditList
	 */
	public void setCreditList(ArrayList<CreditDTO> creditList) {
		this.creditList = creditList;
	}

}
