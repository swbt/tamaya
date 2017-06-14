package com.internousdev.tamaya.dto;


public class LoginDTO {

	private String phoneEmail;			//メールアドレス

	private String password;			//パスワード

	private boolean loginFlg;			//ログインフラグ

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


	public String getPhoneEmail() {
		return phoneEmail;
	}

	public void setPhoneEmail(String phoneEmail) {
		this.phoneEmail = phoneEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isLoginFlg() {
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}

	/**
	 * OAuthIDを収納するメソッド
	 * @return oauthId
	 */
	public String getOauthId() {
		return oauthId;
	}
	/**
	 * OAuthIDを格納するメソッド
	 * @param oauthId セットする oauthId
	 */
	public void setOauthId(String oauthId) {
		this.oauthId = oauthId;
	}
	/**
	 * Oauth名を収納するメソッド
	 * @return oauthName
	 */
	public int getOauthName() {
		return oauthName;
	}
	/**
	 * OAuth名を格納するメソッド
	 * @param oauthName セットする oauthName
	 */
	public void setOauthName(int oauthName) {
		this.oauthName = oauthName;
	}
	/**
	 * OAuthアカウント名を収納するメソッド
	 * @return oauthAccount
	 */
	public String getOauthAccount() {
		return oauthAccount;
	}
	/**
	 * OAuthアカウント名を格納するメソッド
	 * @param oauthAccount セットする oauthAccount
	 */
	public void setOauthAccount(String oauthAccount) {
		this.oauthAccount = oauthAccount;
	}
}