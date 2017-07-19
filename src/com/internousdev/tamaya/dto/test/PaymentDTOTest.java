package com.internousdev.tamaya.dto.test;
/**
 * 商品購入に関するDTOクラス
 * @author seiya takahashi
 * @since 2017/6/14
 * @version 1.0
 */
public class PaymentDTOTest {

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * クレジットの種類
	 */
	private int creditId;

	/**
	 * クレジット番号
	 */
	private String creditNumber;

	/**
	 * 姓名(ローマ字)
	 */
	private String nameE;

	/**
	 * セキュリティコード
	 */
	private String securityCode;

	/**
	 * 有効期限（月）
	 */
	private int expirationMonth;

	/**
	 * 有効期限（年）
	 */
	private int expirationYear;



	//以下アクセサリー

	/**
	 * ユーザーIDを収納するメソッド
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを収納するメソッド
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * クレジットの種類を収納するメソッド
	 * @return creditId
	 */
	public int getCreditId() {
		return creditId;
	}

	/**
	 * クレジットの種類を収納するメソッド
	 * @param creditId セットする creditId
	 */
	public void setCreditId(int creditId) {
		this.creditId = creditId;
	}

	/**
	 * クレジット番号を収納するメソッド
	 * @return creditNumber
	 */
	public String getCreditNumber() {
		return creditNumber;
	}

	/**
	 * クレジット番号を収納するメソッド
	 * @param creditNumber セットする creditNumber
	 */
	public void setCreditNumber(String creditNumber) {
		this.creditNumber = creditNumber;
	}

	/**
	 * 姓名(ローマ字)を収納するメソッド
	 * @return nameE
	 */
	public String getNameE() {
		return nameE;
	}

	/**
	 * 姓名(ローマ字)を収納するメソッド
	 * @param nameE セットする nameE
	 */
	public void setNameE(String nameE) {
		this.nameE = nameE;
	}

	/**
	 * セキュリティコードを収納するメソッド
	 * @return securityCode
	 */
	public String getSecurityCode() {
		return securityCode;
	}

	/**
	 * セキュリティコードを収納するメソッド
	 * @param securityCode セットする securityCode
	 */
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	/**
	 * 有効期限（月）を収納するメソッド
	 * @return expirationMonth
	 */
	public int getExpirationMonth() {
		return expirationMonth;
	}

	/**
	 * 有効期限（月）を収納するメソッド
	 * @param expirationMonth セットする expirationMonth
	 */
	public void setExpirationMonth(int expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	/**
	 * 有効期限（年）を収納するメソッド
	 * @return expirationYear
	 */
	public int getExpirationYear() {
		return expirationYear;
	}

	/**
	 * 有効期限（年）を収納するメソッド
	 * @param expirationYear セットする expirationYear
	 */
	public void setExpirationYear(int expirationYear) {
		this.expirationYear = expirationYear;
	}

}