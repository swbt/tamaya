/**
 *
 */
package com.internousdev.tamaya.dto.test;

/**PurchaseDTOTest 購入履歴情報を格納するためのクラス
* @author　SayakaFukuda
* @since 2017/05/02
* @version 1.0
*/
public class PurchaseDTOTest {


	//購入ID
	private int purchaseId;

	//商品ID
	private int itemId;

	//ユーザーID
	private int userId;

	//商品名
	private String itemName;

	//注文個数
	private int orderCount;

	//単価
	private float unitPrice;

	//小計
	private float totalPrice;

	//登録日
	private  String registrationDate;

	//更新日
	private String updatedDate;







	/**
	 * @return purchaseId
	 */
	public int getPurchaseId() {
		return purchaseId;
	}

	/**
	 * @param purchaseId セットする purchaseId
	 */
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	/**
	 * @return itemId
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * @param itemId セットする itemID
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName セットする itemName
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return orderCount
	 */
	public int getOrderCount() {
		return orderCount;
	}

	/**
	 * @param orderCount セットする orderCount
	 */
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	/**
	 * @return unitPrice
	 */
	public float getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice セットする unitPrice
	 */
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return totalPrice
	 */
	public float getTotalPrice() {
		return totalPrice;
	}

	/**
	 * @param totalPrice セットする totalPrice
	 */
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * @return registrationDate
	 */
	public String getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * @param registrationDate セットする registrationDate
	 */
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	/**
	 * @return updatedDate
	 */
	public String getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * @param updatedDate セットする updatedDate
	 */
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

}
