package com.internousdev.tamaya.dto;

/**
 * クレジット情報に関するDTOクラス
 * @author ATSUSHI KAWAI
 * @since 1.0
 */
public class CreditCardDTO {
	/** クレジットカードの種類(1:visa, 2:mastercard, 3:americanexpress) */
	private int creditBrand;
	/** クレジットカード番号 */
	private String creditNumber;
	/** クレジットカード名義 */
	private String nameE;
	/** セキュリティコード */
	private String securityCode;
	/** 有効期限（年） */
	private int expirationYear;
	/** 有効期限（月） */
	private int expirationMonth;

	/** creditBrandを取得するメソッド */
	public int getCreditBrand() {
		return creditBrand;
	}
	/** creditBrandを格納するメソッド */
	public void setCreditBrand(int creditBrand) {
		this.creditBrand = creditBrand;
	}
	/** creditNumberを取得するメソッド */
	public String getCreditNumber() {
		return creditNumber;
	}
	/** creditNumberを格納するメソッド */
	public void setCreditNumber(String creditNumber) {
		this.creditNumber = creditNumber;
	}
	/** nameEを取得するメソッド */
	public String getNameE() {
		return nameE;
	}
	/** nameEを格納するメソッド */
	public void setNameE(String nameE) {
		this.nameE = nameE;
	}
	/** securityCodeを取得するメソッド */
	public String getSecurityCode() {
		return securityCode;
	}
	/** securityCodeを格納するメソッド */
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	/** expirationYearを取得するメソッド */
	public int getExpirationYear() {
		return expirationYear;
	}
	/** expirationYearを格納するメソッド */
	public void setExpirationYear(int expirationYear) {
		this.expirationYear = expirationYear;
	}
	/** expirationMonthを取得するメソッド */
	public int getExpirationMonth() {
		return expirationMonth;
	}
	/** expirationMonthを格納するメソッド */
	public void setExpirationMonth(int expirationMonth) {
		this.expirationMonth = expirationMonth;
	}
}
