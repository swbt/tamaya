package com.internousdev.tamaya.action;

import com.internousdev.tamaya.dao.ContactDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
	 * ContactAction 問い合わせフォームからの情報をMongoDBにインサートするアクション
	 * @author Atsushi Kawai
	 * @since 2017/06/13
	 * @version 1.0
	 */
public class ContactAction extends ActionSupport {

	/**
	 * シリアルID
	 */
	private static final long serialversionUID = -5450844676239079386L;
	private String userName;		//問い合わせ者名
	private String email;			//メールアドレス
	private String comment;			//問い合わせ内容
	private String inquiryDate;		//問い合わせ日時
	private String phoneNumber;		//電話番号

	/**
	 * 実行メソッド 問い合わせ情報の送信処理をする*/

	public String execute() {
		String result = ERROR;

		ContactDAO dao = new ContactDAO();
		try{
			if(dao.insert(userName, email, comment, inquiryDate, phoneNumber)){

				comment = comment.replace("\r\n","<br>");
				result = SUCCESS;
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}return result;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getInquiryDate() {
		return inquiryDate;
	}
	public void setInquiryDate(String inquiryDate) {
		this.inquiryDate = inquiryDate;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}