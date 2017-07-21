/**
 *
 */
package com.internousdev.tamaya.dto.test;

/**
 * ユーザーの情報をここに入れてやり取りする
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class UserDTO {
	private int userId;
	private String email;
	private String userPass;
	private boolean loginFlg;
	private int userFlg;



	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public boolean getLoginFlg() {
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}

	public int getUserFlg() {
		return userFlg;
	}

	public void setUserFlg(int userFlg) {
		this.userFlg = userFlg;
	}
}
