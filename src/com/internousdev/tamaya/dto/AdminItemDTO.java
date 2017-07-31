package com.internousdev.tamaya.dto;

/**
 * 管理者ページの商品検索に関するDTOクラス
 * @author KAORI TAKAHASHI
 * @since 2017/07/24
 * @version 1.0
 */

public class AdminItemDTO {

	/**
	 * アイテムID
	 */
	private int itemId;

	/**
	 * 商品名
	 */
	private String itemName;

	/**
	 * 状態フラグ
	 */
	private String statusFlg;

	/**
	* アイテムID を取得
	* @return bookId
	*/
	public int getItemId() {
		return itemId;
	}

	/**
	* アイテムID を設定
	* @param bookId
	*/
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	* 商品名 を取得
	* @return itemName
	*/
	public String getItemName() {
		return itemName;
	}

	/**
	* 商品名 を設定
	* @param itemName
	*/
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	* 状態フラグ を取得
	* @return statusFlg
	*/
	public String getStatusFlg() {
		return statusFlg;
	}

	/**
	* 状態フラグ を設定
	* @param statusFlg
	*/
	public void setStatusFlg(String statusFlg) {
		this.statusFlg = statusFlg;
	}
}
