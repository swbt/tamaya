package com.internousdev.tamaya.dto;



/**
 * クレジット情報に関するDTOクラス
 * @author Atsushi Kawai
 * @since 6/13
 * @version 1.0
 */


public class CreditDTO {

	private String email;				//ログイン用メールアドレス

	private int creditId;				//クレジットの種類

	private String creditNumber;		//クレジット番号

	private String nameE;				//クレジット名義人

	private int securityCode;			//セキュリティコード

	private int expirationMonth;		//有効期限(月)

	private int expirationYear;			//有効期限(年）

	private String creditNumberDown;	//クレジット番号下4ケタ(変数名なし)

	private String createdAt;			//登録日時

	private String updatedAt;			//更新日時

	private String loginId;				//ログインID

	private String lastName;			//姓名

	private String firstName;			//名前

	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email セットする email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return creditId
	 */
	public int getCreditId() {
		return creditId;
	}

	/**
	 * @param creditId セットする creditId
	 */
	public void setCreditId(int creditId) {
		this.creditId = creditId;
	}

	/**
	 * @return creditNumber
	 */
	public String getCreditNumber() {
		return creditNumber;
	}

	/**
	 * @param creditNumber セットする creditNumber
	 */
	public void setCreditNumber(String creditNumber) {
		this.creditNumber = creditNumber;
	}

	/**
	 * @return nameE
	 */
	public String getNameE() {
		return nameE;
	}

	/**
	 * @param nameE セットする nameE
	 */
	public void setNameE(String nameE) {
		this.nameE = nameE;
	}

	/**
	 * @return securityCode
	 */
	public int getSecurityCode() {
		return securityCode;
	}

	/**
	 * @param securityCode セットする securityCode
	 */
	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}

	/**
	 * @return expirationMonth
	 */
	public int getExpirationMonth() {
		return expirationMonth;
	}

	/**
	 * @param expirationMonth セットする expirationMonth
	 */
	public void setExpirationMonth(int expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	/**
	 * @return expirationYear
	 */
	public int getExpirationYear() {
		return expirationYear;
	}

	/**
	 * @param expirationYear セットする expirationYear
	 */
	public void setExpirationYear(int expirationYear) {
		this.expirationYear = expirationYear;
	}

	/**
	 * @return creditNumberDown
	 */
	public String getCreditNumberDown() {
		return creditNumberDown;
	}

	/**
	 * @param creditNumberDown セットする creditNumberDown
	 */
	public void setCreditNumberDown(String creditNumberDown) {
		this.creditNumberDown = creditNumberDown;
	}

	/**
	 * @return createdAt
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt セットする createdAt
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return updatedAt
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * @param updatedAt セットする updatedAt
	 */
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * @return loginId
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * @param loginId セットする loginId
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName セットする lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName セットする firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


}
