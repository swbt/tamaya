/**
 *
 */
package com.internousdev.tamaya.action;

/**
 * @author internousdev
 *
 */


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class ContactConfirmAction extends ActionSupport implements SessionAware{



	private static final long serialVersionUID = 1L;




	private String userName="";		//問い合わせ者名
	private String email="";			//メールアドレス
	private String comment="";			//問い合わせ内容
	private Integer postalCode;		//電話番号
	private Map<String,Object> session;


	public String execute() {
		String result = ERROR;


		try {
			if (userName.equals("")== true) {

			}
			if(postalCode.equals("")== true){
			}
			if(email.equals("")== true){
			}
			if(comment.equals("")== true){

			}

			if(userName.equals("") ==false &&  postalCode.equals("")==false && email.equals("")== false && comment.equals("")== false){

				session.put("userName", userName);
				session.put("postalCode",postalCode );
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



	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(Integer postalCode) {
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