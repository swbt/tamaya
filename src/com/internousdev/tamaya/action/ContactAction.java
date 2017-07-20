package com.internousdev.tamaya.action;



import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.ContactDAO;
import com.opensymphony.xwork2.ActionSupport;



/**
	 * ContactAction 問い合わせフォームからの情報をMongoDBにインサートするアクション
	 * @author Atsushi Kawai
	 * @since 2017/06/13
	 * @version 1.0
	 */
public class ContactAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;

	private String userName;		//問い合わせ者名
	private String email;			//メールアドレス
	private String comment;			//問い合わせ内容

	private String postalCode;		//電話番号

	private Map<String,Object> session;
	/**
	 * 実行メソッド 問い合わせ情報の送信処理をする*/

	public String execute() {
		String result = ERROR;

		ContactDAO dao = new ContactDAO();
		try{
			userName = (String)session.get("userName");
			comment = (String)session.get("comment");
			email =(String)session.get("email");

			postalCode = (String)session.get("postalCode");

			if(dao.mongoInsert(userName, email, comment,  postalCode)){

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

	public String getPostalCode() {
		return postalCode;
	}
	public void setPhoneNumber(String postalCode) {
		this.postalCode = postalCode;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO 自動生成されたメソッド・スタブ
			this.session = session;
	}

	public Map<String,Object> getSession(){
		return session;
	}
}