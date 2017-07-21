package com.internousdev.tamaya.util;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.tamaya.dto.CartDTO;
import com.internousdev.tamaya.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * カート全般の処理と決済のときの処理を補助するクラス
 * @author KAORI TAKAHASHI
 * @since 2017/06/13
 * @version 1.0
 */
public class CartAssist extends ActionSupport{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -7813522335899663905L;

	/**
	 * 合計金額
	 */
	private float payment;
	/**
	 * 商品数合計
	 */
	private int totalOrder;
	/**
	 * 注文数と商品の在庫数を計算した値
	 */
	private int totalNumber;

	/**
	 * カートに入ってる商品の合計金額を計算して返すメソッド
	 *
	 * @param cartList カート内商品
	 * @return payment 合計金額
	 */
	public float payment(List<CartDTO> cartList) {
		cartList.forEach(cart -> payment += cart.getPrice() * cart.getQuantity());
		return payment;
	}

	/**
	 * カートに入ってる商品数を合計して返すメソッド
	 *
	 * @param cartList カート内商品
	 * @return totalOrder 商品数合計
	*/
	public int totalOrder(List<CartDTO> cartList) {
		cartList.forEach(cart -> totalOrder += cart.getQuantity());
		return totalOrder;
	}


	/**
	 * 注文数と商品在庫を比較して在庫より上回らないように計算してセットするメソッド
	 * なお在庫が99個以上あっても最大99個までしか買えないようにしてます。
	 * @param cartId カートID
	 * @param quantities 商品の注文数
	 * @param itemId 商品ID
	 * @return totalNumber 注文数と商品の在庫数を計算した値
	 * @throws SQLException 例外
	 */
	public int totalNumber(int cartId,int quantities, int itemId) throws SQLException {
		GoItemDetailDAO itemStock = new GoItemDetailDAO();
		List<ItemDTO> itemList = new ArrayList<>();
		itemList = itemStock.select(itemId);
		int stock = Math.min(itemList.get(0).getStocks(), 99);
		this.totalNumber = Math.min(cartId + quantities, stock);
		return this.totalNumber;
	}



}