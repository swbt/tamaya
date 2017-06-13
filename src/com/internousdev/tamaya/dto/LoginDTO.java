package com.internousdev.tamaya.dto;


public class LoginDTO {

	private String phoneEmail;			//メールアドレス

	private String password;			//パスワード

	private boolean loginFlg;			//ログインフラグ

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
}