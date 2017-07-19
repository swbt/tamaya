package com.internousdev.tamaya.dto.test;

public class AdminLoginDTOTest {

	private int userId;				//ユーザーID

	private String email;			//メールアドレス

	private String userPass;			//パスワード

	private boolean loginFlg;			//ログインフラグ


	public int getUserId () {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId=userId;
	}


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email=email;
	}

	public String getUserPass() {
		return this.userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public boolean getLoginFlg() {
		return this.loginFlg;
	}

	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}
}