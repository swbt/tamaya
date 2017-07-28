package com.internousdev.tamaya.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

/**
 * 注文1件の情報を格納・取得するクラス
 * @author TAKAHIRO ADACHI
 * @since 1.0
 */
public class OrderDTO {
	/** 注文ID */
	private int orderId;
	/** 商品リスト */
	private ArrayList<ItemDTO> itemList;
	/** 商品の総数 */
	private int totalQuantity;
	/** 小計 */
	private BigDecimal subtotal = BigDecimal.ZERO;
	/** 送料 */
	private BigDecimal shippingCost = BigDecimal.ZERO;
	/** 総計（支払った金額） */
	private BigDecimal grandTotal = BigDecimal.ZERO;
	/** 注文日時 */
	private Date orderedAt;

	/** 商品の総数と小計を計算するメソッド */
	private void calcTotal() {
		for (ItemDTO cartItem : itemList) {
			totalQuantity += cartItem.getQuantity();
			subtotal = subtotal.add(cartItem.getTotal());
		}
	}

	/** 注文IDを取得するメソッド */
	public int getOrderId() {
		return orderId;
	}
	/** 注文IDを格納するメソッド */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	/** 商品リストを取得するメソッド */
	public ArrayList<ItemDTO> getItemList() {
		return itemList;
	}
	/** 商品リストと、それに伴って求まる商品の総数と小計を格納するメソッド */
	public void setItemList(ArrayList<ItemDTO> itemList) {
		this.itemList = itemList;
		calcTotal();
	}
	/** 商品の総数を取得するメソッド */
	public int getTotalQuantity() {
		return totalQuantity;
	}
	/** 小計を取得するメソッド */
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
	}
	/** 総計（支払った金額）を取得するメソッド */
	public BigDecimal getGrandTotal() {
		return grandTotal;
	}
	/** 総計（支払った金額）を格納するメソッド */
	public void setGrandTotal(BigDecimal grandTotal) {
		this.grandTotal = grandTotal;
	}
	/** 注文日時を取得するメソッド */
	public Date getOrderedAt() {
		return orderedAt;
	}
	/** 注文日時を格納するメソッド */
	public void setOrderedAt(Date orderedAt) {
		this.orderedAt = orderedAt;
	}
}
