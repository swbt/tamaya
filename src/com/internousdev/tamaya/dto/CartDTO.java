package com.internousdev.tamaya.dto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 * カート情報を格納・取得するクラス
 * @author Takahiro Adachi
 *
 */
public class CartDTO {
	/** カート内の商品のリスト */
	private ArrayList<CartItemDTO> cartItemList;
	/** カート内の商品の総数 */
	private int totalQuantity;
	/** カート内の商品の小計 */
	private BigDecimal subtotal = BigDecimal.ZERO;
	/** 送料 */
	private BigDecimal shippingCost = BigDecimal.ZERO;
	/** 総計（支払う金額） */
	private BigDecimal grandTotal = BigDecimal.ZERO;

	private void calcTotal() {
		for (CartItemDTO cartItem : cartItemList) {
			totalQuantity += cartItem.getQuantity();
			subtotal = subtotal.add(cartItem.getTotal());
			grandTotal = BigDecimal.ZERO;
		}
	}
	private void calcGrandTotal() {
		grandTotal = subtotal.add(shippingCost).setScale(0, RoundingMode.HALF_EVEN);
	}

	/** カート内の商品のリストを取得するメソッド */
	public ArrayList<CartItemDTO> getCartItemList() {
		return cartItemList;
	}
	/** カート内の商品のリストを格納するメソッド */
	public void setCartItemList(ArrayList<CartItemDTO> cartItemList) {
		this.cartItemList = cartItemList;
		calcTotal();
	}
	/** カート内の商品の総数を取得するメソッド */
	public int getTotalQuantity() {
		return totalQuantity;
	}
	/** カート内の商品の小計を取得するメソッド */
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	/** 送料を取得するメソッド */
	public BigDecimal getShippingCost() {
		return shippingCost;
	}
	/** 送料を格納するメソッド */
	public void setShippingCost(BigDecimal shippingCost) {
		this.shippingCost = shippingCost;
		calcGrandTotal();
	}
	/** 総計（支払う金額）を取得するメソッド */
	public BigDecimal getGrandTotal() {
		return grandTotal;
	}
}