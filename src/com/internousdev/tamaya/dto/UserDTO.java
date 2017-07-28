/**
 *
 */
package com.internousdev.tamaya.dto;

/**
 * ユーザーの情報を格納・取得するクラス
 * @author TAKAHIRO ADACHI
 * @since 1.0
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
	/** Eメールアドレス */
	private String email;
	/** ユーザーの権限（1:一般, 2:リーダー, 3:管理者） */
	private int userFlg;


	/** ユーザーIDを取得するメソッド */
	public int getUserId() {
		return userId;
	}
	/** ユーザーIDを格納するメソッド */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/** パスワードを取得するメソッド */
	public String getPassword() {
		return password;
	}
	/** パスワードを格納するメソッド */
	public void setPassword(String password) {
		this.password = password;
	}
	/** 姓(英語)を取得するメソッド */
	public String getFamilyName() {
		return familyName;
	}
	/** 姓(英語)を格納するメソッド */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	/** 名(英語)を取得するメソッド */
	public String getGivenName() {
		return givenName;
	}
	/** 名(英語)を格納するメソッド */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	/** 姓(漢字)を取得するメソッド */
	public String getFamilyNameKanji() {
		return familyNameKanji;
	}
	/** 姓(漢字)を格納するメソッド */
	public void setFamilyNameKanji(String familyNameKanji) {
		this.familyNameKanji = familyNameKanji;
	}
	/** 姓(ひらがな)を取得するメソッド */
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	/** 姓(ひらがな)を格納するメソッド */
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}
	/** 名(漢字)を取得するメソッド */
	public String getGivenNameKanji() {
		return givenNameKanji;
	}
	/** 名(漢字)を格納するメソッド */
	public void setGivenNameKanji(String givenNameKanji) {
		this.givenNameKanji = givenNameKanji;
	}
	/** 名(ひらがな)を取得するメソッド */
	public String getGivenNameKana() {
		return givenNameKana;
	}
	/** 名(ひらがな)を格納するメソッド */
	public void setGivenNameKana(String givenNameKana) {
		this.givenNameKana = givenNameKana;
	}
	/** 郵便番号を取得するメソッド */
	public String getPostal() {
		return postal;
	}
	/** 郵便番号を格納するメソッド */
	public void setPostal(String postal) {
		this.postal = postal;
	}
	/** 住所を取得するメソッド */
	public String getAddress() {
		return address;
	}
	/** 住所を格納するメソッド */
	public void setAddress(String address) {
		this.address = address;
	}
	/** Eメールアドレスを取得するメソッド */
	public String getEmail() {
		return email;
	}
	/** Eメールアドレスを格納するメソッド */
	public void setEmail(String email) {
		this.email = email;
	}
	/** ユーザーの権限（1:一般, 2:リーダー, 3:管理者）を取得する */
	public int getUserFlg() {
		return userFlg;
	}
	/** ユーザーの権限（1:一般, 2:リーダー, 3:管理者）を格納する */
	public void setUserFlg(int userFlg) {
		this.userFlg = userFlg;
	}
}
