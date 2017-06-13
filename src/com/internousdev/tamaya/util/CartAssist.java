package com.internousdev.tamaya.util;

import java.util.List;

import com.internousdev.tamaya.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * カート全般の処理と決済のときの処理を補助するクラス
 * @author KAORI TAKAHASHI
 * @since 2017/06/13
 * @version 1.0
 */
public class CartAssist extends ActionSupport{

	//合計金額
	private float total;

	// 商品数合計		※変数：totalOrder新規製作する必要あり？
	private int totalOrder;

	//カートに入ってる商品の合計金額を計算して返すメソッド		※変数：cartList新規製作する必要あり？
	// @param cartList カート内商品
	// @return total 合計金額
	public float payment(List<CartDTO> cartList) {
		cartList.forEach(cart -> payment += cart.getPrice() * cart.getQuantity());
		return total;
	}

	// カートに入ってる商品数を合計して返すメソッド
	// @param cartList カート内商品
	// @return totalOrder 商品数合計	※変数：totalOrder新規製作する必要あり？
	public int totalOrder(List<CartDTO> cartList) {
		cartList.forEach(cart -> totalOrder += cart.getQuantity());
		return totalOrder;
	}
}