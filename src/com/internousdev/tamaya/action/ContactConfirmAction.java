/**
 *
 */
package com.internousdev.tamaya.action;

/**
 * ContactAction 問い合わせフォームからの情報をmongoDBにインサートする際に確認するクラス
 * @author RYO SHIRAISHI
 * @since 2017/7/26
 * @version 1.0
 */

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ContactConfirmAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = -4802657361209963413L;


	/** 問い合わせ者名 */
	private String userName = "";
	/** メールアドレス */
	private String email = "";
	/** 問い合わせ内容 */
	private String comment = "";
	/** 電話番号 */
	private long phoneNumber;
	private Map<String, Object> session;

	/**
	 * 実行メソッド 問い合わせ情報の送信処理をする
	 */

	public String execute() {
		String result = ERROR;

		try {
			if (userName.equals("") == true) {

			}
			if (phoneNumber == 0) {
			}
			if (email.equals("") == true) {
			}
			if (comment.equals("") == true) {

			}

			if (userName.equals("") == false && phoneNumber != 0  && email.equals("") == false
					&& comment.equals("") == false) {

				session.put("userName", userName);
				session.put("phoneNumber", phoneNumber);
				session.put("email", email);
				session.put("comment", comment);

				result = SUCCESS;
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * お問い合わせ者名取得メゾット
	 *
	 * @return userName お問い合わせ者名
	 */

	public String getUserName() {
		return userName;
	}

	/**
	 * お問い合わせ者名格納メゾット
	 *
	 * @param userName
	 *            お問い合わせ者名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * お問い合わせ内容取得メゾット
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * お問い合わせ内容格納メゾット
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * メールアドレス取得メゾット
	 *
	 * @return email メールアドレス
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * メールアドレス格納メゾット
	 *
	 * @param email
	 *            メールアドレス
	 */

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 電話番号取得メゾット
	 *
	 * @param phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * 電話番号格納メゾット
	 *
	 * @param phoneNumber
	 */

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * セッション取得メゾット
	 *
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}