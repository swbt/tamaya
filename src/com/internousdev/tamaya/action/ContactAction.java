package com.internousdev.tamaya.action;

import java.net.UnknownHostException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.ContactDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ContactAction 問い合わせフォームからの情報をmongoDBにインサートするアクション
 *
 * @author RYO SHIRAISHI
 * @since 2017/07/28
 * @version 1.0
 */

public class ContactAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = -6348828671699876978L;

	/**
	 * 問い合わせ者名
	 */
	private String userName;
	/**
	 * メールアドレス
	 */
	private String email;

	/**
	 * 問い合わせ内容
	 */
	private String comment;
	/**
	 * 電話番号
	 */
	private long phoneNumber;

	private Map<String, Object> session;

	/**
	 * 実行メソッド 問い合わせ情報の送信処理をする * @author RYO SHIRAISHI
	 *
	 * @since 2017/07/28
	 * @version 1.0
	 */

	public String execute() {
		String result = ERROR;

		ContactDAO dao = new ContactDAO();
		try {
			userName = (String) session.get("userName");
			comment = (String) session.get("comment");
			email = (String) session.get("email");

			phoneNumber = (long) session.get("phoneNumber");

			if (dao.mongoInsert(userName, email, comment, phoneNumber)) {

				session.remove("userName");
				session.remove("email");
				session.remove("comment");
				session.remove("phoneNumber");
				result = SUCCESS;
				return result;
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 問い合わせ者名取得メソッド
	 *
	 * @return userName 問い合わせ者名
	 */

	public String getUserName() {
		return userName;
	}

	/**
	 * 問い合わせ者名格納メソッド
	 *
	 * @param userName
	 *            問い合わせ者名セットする
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * メールアドレス取得メソッド
	 *
	 * @return email メールアドレス
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * メールアドレス格納メソッド
	 *
	 * @param email
	 *            メールアドレス セットする
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 問い合わせ内容取得メソッド
	 *
	 * @return comment 問い合わせ内容
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * 問い合わせ内容格納メソッド
	 *
	 * @param comment
	 *            問い合わせ内容セットする
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * 電話番号取得メソッド
	 *
	 * @return phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * 電話番号格納メソッド
	 *
	 * @param phoneNumber
	 *            電話番号セットする
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

	/**
	 * シリアルID取得メゾット
	 *
	 * @author RYO SHIRAISHI
	 * @return serialversionuid シリアルID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}