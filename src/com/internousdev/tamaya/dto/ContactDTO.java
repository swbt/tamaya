/**
 *
 */
package com.internousdev.tamaya.dto;

public class ContactDTO {
	/** 問い合わせ者名 */
	private String userName;
	/** メールアドレス */
	private String email;
	/** 問い合わせ内容 */
	private String comment;
	/** 登録日 */
	private String inquireDate;

	/** 問い合わせ者名を取得するメソッド */
	public String getUserName() {
		return userName;
	}
	/** 問い合わせ者名を格納するメソッド */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/** メールアドレスを取得するメソッド */
	public String getEmail() {
		return email;
	}
	/** メールアドレスを格納するメソッド */
	public void setEmail(String email) {
		this.email = email;
	}
	/** 問い合わせ内容を取得するメソッド */
	public String getComment() {
		return comment;
	}
	/** 問い合わせ内容を格納するメソッド */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/** 登録日を取得するメソッド */
	public String getInquireDate() {
		return inquireDate;
	}
	/** 登録日を格納するメソッド */
	public void setInquireDate(String inquireDate) {
		this.inquireDate = inquireDate;
	}

}

