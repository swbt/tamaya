/**
 *
 */
package com.internousdev.tamaya.dto;

/**
 * ユーザーの情報をここに入れてやり取りする
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class UserDTO {
	/** ユーザーID */
	private int userId;
	/** パスワード */
	private String password;
	/** 姓(英語) */
	private String familyName;
	/** 名(英語) */
	private String givenName;
	/** 姓(漢字) */
	private String familyNameKanji;
	/** 姓(ひらがな) */
	private String familyNameKana;
	/** 名(漢字) */
	private String givenNameKanji;
	/** 名(ひらがな) */
	private String givenNameKana;
	/** 郵便番号 */
	private String postal;
	/** 住所 */
	private String address;
	/** Eメール */
	private String email;
	private int userFlg;


	/** userIdを取得するメソッド */
	public int getUserId() {
		return userId;
	}
	/** userIdを格納するメソッド */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/** passwordを取得するメソッド */
	public String getPassword() {
		return password;
	}
	/** passwordを格納するメソッド */
	public void setPassword(String password) {
		this.password = password;
	}
	/** familyNameを取得するメソッド */
	public String getFamilyName() {
		return familyName;
	}
	/** familyNameを格納するメソッド */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	/** givenNameを取得するメソッド */
	public String getGivenName() {
		return givenName;
	}
	/** givenNameを格納するメソッド */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	/** familyNameKanjiを取得するメソッド */
	public String getFamilyNameKanji() {
		return familyNameKanji;
	}
	/** familyNameKanjiを格納するメソッド */
	public void setFamilyNameKanji(String familyNameKanji) {
		this.familyNameKanji = familyNameKanji;
	}
	/** familyNameKanaを取得するメソッド */
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	/** familyNameKanaを格納するメソッド */
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}
	/** givenNameKanjiを取得するメソッド */
	public String getGivenNameKanji() {
		return givenNameKanji;
	}
	/** givenNameKanjiを格納するメソッド */
	public void setGivenNameKanji(String givenNameKanji) {
		this.givenNameKanji = givenNameKanji;
	}
	/** givenNameKanaを取得するメソッド */
	public String getGivenNameKana() {
		return givenNameKana;
	}
	/** givenNameKanaを格納するメソッド */
	public void setGivenNameKana(String givenNameKana) {
		this.givenNameKana = givenNameKana;
	}
	/** postalを取得するメソッド */
	public String getPostal() {
		return postal;
	}
	/** postalを格納するメソッド */
	public void setPostal(String postal) {
		this.postal = postal;
	}
	/** addressを取得するメソッド */
	public String getAddress() {
		return address;
	}
	/** addressを格納するメソッド */
	public void setAddress(String address) {
		this.address = address;
	}
	/** emailを取得するメソッド */
	public String getEmail() {
		return email;
	}
	/** emailを格納するメソッド */
	public void setEmail(String email) {
		this.email = email;
	}
	/** userFlgを取得するメソッド */
	public int getUserFlg() {
		return userFlg;
	}
	/** userFlgを格納するメソッド */
	public void setUserFlg(int userFlg) {
		this.userFlg = userFlg;
	}
}
