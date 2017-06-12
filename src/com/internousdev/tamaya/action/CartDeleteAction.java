package com.internousdev.tamaya.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.internousdev.tamaya.dto.UserDTO;

/**
 *  カートの中身を削除するクラス
 * @author KAORI TAKAHASHI
 * @version 1.0
 * @since 2017/6/12
 */

public class CartDeleteAction  extends CartAssist implements SeesionAware{ //※クラス未作成

	private static final String ERROR = null;

	//ユーザーID
	private int userId;

	//【IN】
	// 商品追加時使用
	private int itemId;

	// 表示用
	private String itemName;

	// 単価
	private float price;

	// 数
	private int quantity;

	// 小計
	private float subTotal;

	// 合計
	private float total;

	//【OUT】
	// 商品削除時使用
	private boolean delete;

	//【その他】
	//検索したカート内の商品の情報を入れるリスト
	private List<○○DTO> cartList = new ArrayList<>();		//DTO未作成
	//	ユーザー情報を入れるリスト（購入確認画面で必要）
	public ArrayList<UserDTO> usersList = new ArrayList<UserDTO>();
	//クレジット情報を入れるリスト（購入確認画面で必要）
	public ArrayList<○○DTO> creditList = new ArrayList<○○DTO>();	//DTO未作成
	/**
	 * カートの中身の削除を実行するメソッド
	 * @author KAORI TAKANASHI
	 * @version 1.0
	 * @since 2017/6/12
	 */
	public String execute() throws SQLException{
		String result =ERROR;

			/**
			 *セッション情報切れになっていないかの確認
			 */
			if (session.containKey("userId")){
				userId = (int)session.get("userId");

				CartDeleteDAO dao = new CartDeleteDAO();
				GoCartDAO dao2 = new GoCartDAO();

				delCount = dao.delete(userId,cartId);
				if(delCount>0)
					cartList = dao2.delete(userId);
					if(cartList.size() > 0){
						for(int i = 0;i < cartList.size(); i++){
						amountAll += (cartList.get(i).getPrice())*(cartList.get(i).getQuantities());
					}
					MypageDTO dao3 = new MypageDAO();
					○○DAO dao4 = new ○○DAO();	//DAO未作成
					userList = dao3.select(userId);
					creditList = dao4.selectCredit(userId);
					result = SUCCESS;
				}
			}

		}else{
			result = LOGIN;
			}
		return result;
		}
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
	public float getSubTotal(){
		return subTotal;
		}

	//小計金額を格納するメソッド
	//@param subTotal
	public void setSubTotal(float subTotal){
		this.subTotal = subTotal;
	}

	//合計金額を取得するメソッド
	//@return total
	public float getTotal(){
		return total;
		}

	//合計金額を格納するメソッド
	//@param total
	public void setTotal(float total){
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

	//ユーザー情報を入れるリスト（購入確認画面で必要）を取得するメソッド	※Tamayaで必要か否か不明
	//@param userList ユーザー情報を入れるリスト
	public ArrayList<UserDTO> getUsersList(){
		return userList;
		}

	//クレジット情報を入れるリスト（購入確認画面で必要）を格納するメソッド		※Tamayaで必要か否か不明
	//@return creditList クレジット情報を入れるリスト
	public void setCreditList(ArrayList<CreditDTO>creditList){
		this.setCreditList = creditList;
		}
	}