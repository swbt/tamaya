package com.internousdev.tamaya.action;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.internousdev.tamaya.dto.UserDTO;
import com.internousdev.tamaya.util.CartAssist;

/**
 *  カートの中身を削除するクラス
 * @author KAORI TAKAHASHI
 * @version 1.0
 * @since 2017/6/12
 */

public class CartDeleteAction extends CartAssist implements SeesionAware{ //※クラス未作成

	private static final String ERROR = null;

	private static final String SUCCESS = null;

	private static final String LOGIN = null;

	//ユーザーID
	private int userId;

	//【IN】
	// ユーザー管理用
	private int itemId;

	// 商品名
	private String itemName;

	// 単価
	private BigDecimal price;

	// 数量
	private int quantity;

	// 小計
	private BigDecimal subTotal;

	// 合計
	private BigDecimal total;

	//【OUT】
	// 商品削除時使用
	private boolean delete;

	//【その他】
	//検索したカート内の商品の情報を入れるリスト
	private List<CartDTO> cartList = new ArrayList<>();		//DTO未作成

	//	ユーザー情報を入れるリスト（購入確認画面で必要）
	public ArrayList<UserDTO> usersList = new ArrayList<UserDTO>();

	//クレジット情報を入れるリスト（購入確認画面で必要）
	public ArrayList<CreditDTO> creditList = new ArrayList<CreditDTO>();	//DTO未作成

	//セッション情報
	private Map<String, Object> session;


	public String execute() throws SQLException{
		String result =ERROR;

			/**
			 *セッション情報切れになっていないかの確認
			 */
			if (session.containsKey("userId")){
				userId = (int)session.get("userId");

				CartDeleteDAO dao = new CartDeleteDAO();
				GoCartDAO dao2 = new GoCartDAO();

				delete = (boolean) dao.delete(userId);
				cartList;
				if(delete>0){
					//カートの情報をリスト化
					cartList = dao2.delete(userId);
					if(cartList.size() > 0){
						//合計金額算出
						for(int i = 0; i < cartList.size(); i++){
						total += (cartList.get(i).getPrice())*(cartList.get(i).getQuantity());
					}
					result = SUCCESS;
				}
			}

		} else {
			 result = LOGIN;
			}
		return result;
		}


	//ユーザーIDを取得するためのメソッド
	//@return userId ユーザーID
	public int getUserId(){
		return userId;
		}
	//ユーザーIDを格納するためのメソッド
	//@param userId セットする userId
	public void setUserId(int userId){
		this.userId =userId;
		}
	//セッションを取得するためのメソッド
	//@return session セッション情報
	public Map<String,Object> getSession(){
		return session;
		}

	//セッションを格納するためのメソッド
	//@param session セットする session
	public void setSession(Map<String,Object> session){
		this.session = session;
		}

	//カート内の商品情報を取得するためのメソッド
	//@return cartList カート内の商品情報
	public List<CartDTO> getCartList(){		//※DTO未作成
		return cartList;
		}

	//小計金額を取得するメソッド
	//@return subTotal
	public BigDecimal getSubTotal(){
		return subTotal;
		}

	//小計金額を格納するメソッド
	//@param subTotal
	public void setSubTotal(BigDecimal subTotal){
		this.subTotal = subTotal;
	}

	//合計金額を取得するメソッド
	//@return total
	public BigDecimal getTotal(){
		return total;
		}

	//合計金額を格納するメソッド
	//@param total
	public void setTotal(BigDecimal total){
		this.total = total;
		}

	//数量を取得するメソッド
	//@return quantity 数量
	public int getQuantities(){
		return quantity;
		}

	//カート内の商品数を格納するメソッド
	//@paramquantities セットする quantity
	public void setQuantity(int quantity){
		this.quantity = quantity;
		}
	}