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
	private Integer postalCode;
	private Map<String, Object> session;

	/**
	 * 実行メソッド 問い合わせ情報の送信処理をする
	 */

	public String execute() {
		String result = ERROR;

		try {
			if (userName.equals("") == true) {

			}
			if (postalCode.equals("") == true) {
			}
			if (email.equals("") == true) {
			}
			if (comment.equals("") == true) {

			}

			if (userName.equals("") == false && postalCode.equals("") == false && email.equals("") == false
					&& comment.equals("") == false) {

				session.put("userName", userName);
				session.put("postalCode", postalCode);
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
	 * @param postalCode
	 */
	public Integer getPostalCode() {
		return postalCode;
	}

	/**
	 * 電話番号格納メゾット
	 *
	 * @param postalCode
	 */

	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO 自動生成されたメソッド・スタブ
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

	/**
	 * シリアルID取得メゾット
	 *
	 * @return serialversionuid シリアルID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}