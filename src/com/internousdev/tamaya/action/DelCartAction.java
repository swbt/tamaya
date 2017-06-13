/**
 *
 */
package com.internousdev.tamaya.action;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dto.CartDTO;

/**
 * @author seiya takahashi
 * since 2017/6/13
 *
 */
public class DelCartAction extends CartAssist implements SessionAware{

	private BigDecimal amountAll;	//合計金額//
	private int quantities;			//数量//
	private int cartId;				//カートID//
	private int userId;				//ユーザーID//

	private Map<String, Object> session;	//セッション情報//

	private ArrayList<CartDTO> cartList=new ArrayList<>(); //検索したカート内の商品情報を入れるリスト//
	public ArrayList<MYpageDTO> userList=new ArrayList<>(); //ユーザー情報を入れるリスト//
	private ArrayList<CreditDTO> creditList=new ArrayList<CreditDTO>(); //クレジット情報を入れるリスト//



	//カートの中の削除を実行するメソッド//
	public String execute()throws SQLException{
		String result=ERROR;


	//セッションの情報が有効かどうか確認//
		if(session.containKey("userId")){
			userId=(int)session.get("userId");

			CartDeleteDAO dao=new CartDeleteDAO();
			GoCartDAO dao2=new GoCartDAO();

			delcount =dao.delete(userId,cartId);
			if(delCount>0){
				cartList=dao2.selectedItem(userId);
				if(cartList.size()>0){
					for(int i=0; i<cartList.size();i++){
						amountAll+=(cartList.get(i).getPrice()*(cartList.get(i).getQuantities()));
					}
				MypageDAO dao3=new MypageDAO();
				CreditInsertDAO dao4=new CreditInsertDAO();
				usersList=dao3.select(userId);
				creditList=dao4.selectCredit(userId);
				result =SUCCESS;
				}
			}
			else{
				result=LOGIN;
			}
			return result;
		}


		//ユーザーIdを取得するためのメソッド//
		public int getUserId(){
			return userId;
		}
		//ユーザーIdを格納するためのメソッド//
		public void serUserId(int userId){
			this.userId=userId;
		}


		//セッションを取得するためのメソッド//
		public Map<String,Object> getSession(){
			return session;
		}
		//セッションを格納するためのメソッド//
		public void setSession(Map<String,Object>session){
			this.session=session;
		}


		//カート内の商品情報を取得するメソッド//
		public ArrayList<CartDTO> getCartList(){
			return cartList;
		}
		//カート内の情報を格納するためのメソッド//
		public void setCartList(List<CartDTO> cartList){
			this.cartList=cartList;
		}

		//合計金額を取得するメソッド//
		public BigDecimal getAmountAll() {
			return amountAll;
		}
		//合計金額を格納するメソッド//
		public void setAmountAll(BigDecimal amountAll) {
			this.amountAll = amountAll;
		}

		//数量を取得するメソッド//
		public int getQuantities() {
			return quantities;
		}

		//カート内の商品数を格納するメソッド//
		public void setQuantities(int quantities) {
			this.quantities = quantities;
		}

		//カートIDを取得するメソッド//
		public int getCartId() {
			return cartId;
		}

		//カート内商品IDを格納するメソッド//
		public void setCartId(int cartId) {
			this.cartId = cartId;
		}

		//ユーザー情報を入れるリスト（購入確認画面で必要）を取得するメソッド//
		public ArrayList<MypageDTO> getUsersList() {
			return usersList;
		}

		//ユーザー情報を入れるリストを格納するメソッド//
		 public void setUsersList(ArrayList<MypageDTO> usersList) {
			this.usersList = usersList;
		}


		//クレジット情報を入れるリスト（購入確認画面で必要）を取得するメソッド//
		public ArrayList<CreditDTO> getCreditList() {
			return creditList;
		}


		//クレジット情報を入れるリストを格納するメソッド//
		public void setCreditList(ArrayList<CreditDTO> creditList) {
			this.creditList = creditList;
		}

	}



	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}


}
