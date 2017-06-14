package com.internousdev.tamaya.dto;
/**
 * 顧客情報に関するDTOクラス
 *
 * @author
 * @since
 * @version 1.0
 */
public class MypageDTO {
	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * 姓(英語)
	 */
	private String familyName;

	/**
	 * 名(英語)
	 */
	private String givenName;

	/**
	 * 姓(漢字)
	 */
	private String familyNameKanji;

	/**
	 * 姓(ひらがな)
	 */
	private String familyNameKana;

	/**
	 * 名(漢字)
	 */
	private String givenNameKanji;

	/**
	 * 名(ひらがな)
	 */
	private String givenNameKana;

	/**
	 * 郵便番号
	 */
	private String postal;

	/**
	 * 住所
	 */
	private String address;

	/**
	 * 電話番号
	 */
	private String phoneNumber;

	/**
	 * メールアドレス
	 */
	private String phoneEmail;

	/**
	 * 携帯電話番号
	 */
	private String mobileNumber;

	/**
	 * 携帯メールアドレス
	 */
	private String mobileEmail;

	/**
	 * 性別
	 */
	private String sex;

	/**
	 * 誕生日
	 */
	private String birthday;

	/**
	 * 退会フラグ
	 */
	private boolean userdelFlg;

	/**
	 * ログインフラグ
	 */
	private boolean loginFlg;

	/**
	 * ユーザーフラグ
	 */
	private int userFlg;
	/**
	 * 受講年
	 */
	private String year;
	/**
	 * 受講開始月
	 */
	private String month;
	/**
	 * OAuthID
	 */
	private String oauthId;
	/**
	 * OAuth名
	 */
	private int oauthName;
	/**
	 * OAuthアカウント
	 */
	private String oauthAccount;
	/**
	 * 登録日
	 */
	private String registerDay;
	/**
	 * 更新日
	 */
	private String updateDay;


	//以下アクセサリー


	/**
	 * ユーザーIDを収納するメソッド
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * ユーザーIDを格納するメソッド
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * パスワードを収納するメソッド
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * パスワードを格納するメソッド
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 姓(英語)を収納するメソッド
	 * @return familyName
	 */
	public String getFamilyName() {
		return familyName;
	}
	/**
	 * 姓(英語)を格納するメソッド
	 * @param familyName セットする familyName
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	/**
	 * 名(英語)を収納するメソッド
	 * @return givenName
	 */
	public String getGivenName() {
		return givenName;
	}
	/**
	 * 名(英語)を格納するメソッド
	 * @param givenName セットする givenName
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	/**
	 * 姓(漢字)を収納するメソッド
	 * @return familyNameKanji
	 */
	public String getFamilyNameKanji() {
		return familyNameKanji;
	}
	/**
	 * 姓(漢字)を格納するメソッド
	 * @param familyNameKanji セットする familyNameKanji
	 */
	public void setFamilyNameKanji(String familyNameKanji) {
		this.familyNameKanji = familyNameKanji;
	}
	/**
	 * 姓(ひらがな)を収納するメソッド
	 * @return familyNameKana
	 */
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	/**
	 * 姓(ひらがな)を格納するメソッド
	 * @param familyNameKana セットする familyNameKana
	 */
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}
	/**
	 * 名(漢字)を収納するメソッド
	 * @return givenNameKanji
	 */
	public String getGivenNameKanji() {
		return givenNameKanji;
	}
	/**
	 * 名(漢字)を格納するメソッド
	 * @param givenNameKanji セットする givenNameKanji
	 */
	public void setGivenNameKanji(String givenNameKanji) {
		this.givenNameKanji = givenNameKanji;
	}
	/**
	 * 名(ひらがな)を収納するメソッド
	 * @return givenNameKana
	 */
	public String getGivenNameKana() {
		return givenNameKana;
	}
	/**
	 * 名(ひらがな)を格納するメソッド
	 * @param givenNameKana セットする givenNameKana
	 */
	public void setGivenNameKana(String givenNameKana) {
		this.givenNameKana = givenNameKana;
	}
	/**
	 * 郵便番号を収納するメソッド
	 * @return postal
	 */
	public String getPostal() {
		return postal;
	}
	/**
	 * 郵便番号を格納するメソッド
	 * @param postal セットする postal
	 */
	public void setPostal(String postal) {
		this.postal = postal;
	}
	/**
	 * 住所を収納するメソッド
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 住所を格納するメソッド
	 * @param address セットする address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 電話番号を収納するメソッド
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * 電話番号を格納するメソッド
	 * @param phoneNumber セットする phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * メールアドレスを収納するメソッド
	 * @return phoneEmail
	 */
	public String getPhoneEmail() {
		return phoneEmail;
	}
	/**
	 * メールアドレスを格納するメソッド
	 * @param phoneEmail セットする phoneEmail
	 */
	public void setPhoneEmail(String phoneEmail) {
		this.phoneEmail = phoneEmail;
	}
	/**
	 * 携帯電話番号を収納するメソッド
	 * @return mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * 携帯電話番号を格納するメソッド
	 * @param mobileNumber セットする mobileNumber
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * 携帯メールアドレスを収納するメソッド
	 * @return mobileEmail
	 */
	public String getMobileEmail() {
		return mobileEmail;
	}
	/**
	 * 携帯メールアドレスを格納するメソッド
	 * @param mobileEmail セットする mobileEmail
	 */
	public void setMobileEmail(String mobileEmail) {
		this.mobileEmail = mobileEmail;
	}
	/**
	 * 性別を収納するメソッド
	 * @return sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * 性別を格納するメソッド
	 * @param sex セットする sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 誕生日を収納するメソッド
	 * @return birthday
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * 誕生日を格納するメソッド
	 * @param birthday セットする birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * 退会フラグを収納するメソッド
	 * @return userdelFlg
	 */
	public boolean isUserdelFlg() {
		return userdelFlg;
	}
	/**
	 * 退会フラグを格納するメソッド
	 * @param userdelFlg セットする userdelFlg
	 */
	public void setUserdelFlg(boolean userdelFlg) {
		this.userdelFlg = userdelFlg;
	}
	/**
	 * ログインフラグを収納するメソッド
	 * @return loginFlg
	 */
	public boolean isLoginFlg() {
		return loginFlg;
	}
	/**
	 * ログインフラグを格納するメソッド
	 * @param loginFlg セットする loginFlg
	 */
	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}
	/**
	 * ユーザーフラグを収納するメソッド
	 * @return userFlg
	 */
	public int getUserFlg() {
		return userFlg;
	}
	/**
	 * ユーザーフラグを格納するメソッド
	 * @param userFlg セットする userFlg
	 */
	public void setUserFlg(int userFlg) {
		this.userFlg = userFlg;
	}
	/**
	 * 受講年を収納するメソッド
	 * @return year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * 受講年を格納するメソッド
	 * @param year セットする year
	 */
	public void setYear(String year) {
		this.year = year;
	}
	/**
	 * 受講開始月を収納するメソッド
	 * @return month
	 */
	public String getMonth() {
		return month;
	}
	/**
	 * 受講開始月を格納するメソッド
	 * @param month セットする month
	 */
	public void setMonth(String month) {
		this.month = month;
	}
	/**
	 * oauthIDを収納するメソッド
	 * @return oauthId
	 */
	public String getOauthId() {
		return oauthId;
	}
	/**oauthIDを格納するメソッド
	 * @param oauthId セットする oauthId
	 */
	public void setOauthId(String oauthId) {
		this.oauthId = oauthId;
	}
	/**
	 * oauth名を収納するメソッド
	 * @return oauthName
	 */
	public int getOauthName() {
		return oauthName;
	}
	/**
	 * oauth名を格納するメソッド
	 * @param oauthName セットする oauthName
	 */
	public void setOauthName(int oauthName) {
		this.oauthName = oauthName;
	}
	/**
	 * oauthアカウント名を収納するメソッド
	 * @return oauthAccount
	 */
	public String getOauthAccount() {
		return oauthAccount;
	}
	/**
	 * oauthアカウント名を格納するメソッド
	 * @param oauthAccount セットする oauthAccount
	 */
	public void setOauthAccount(String oauthAccount) {
		this.oauthAccount = oauthAccount;
	}
	/**
	 * 登録日を収納するメソッド
	 * @return registerDay
	 */
	public String getRegisterDay() {
		return registerDay;
	}
	/**
	 * 登録日を格納するメソッド
	 * @param registerDay セットする registerDay
	 */
	public void setRegisterDay(String registerDay) {
		this.registerDay = registerDay;
	}
	/**
	 * 更新日を収納するメソッド
	 * @return updateDay
	 */
	public String getUpdateDay() {
		return updateDay;
	}
	/**
	 * 更新日を格納するメソッド
	 * @param updateDay セットする updateDay
	 */
	public void setUpdateDay(String updateDay) {
		this.updateDay = updateDay;
	}

}