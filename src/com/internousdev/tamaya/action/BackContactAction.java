package com.internousdev.tamaya.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class BackContactAction extends ActionSupport{

	private String userName="";		//問い合わせ者名
	private String email="";			//メールアドレス
	private String comment="";			//問い合わせ内容

	private String postalCode="";		//電話番号


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

			if(userName.equals("") ==false &&  comment.equals("") ==false && email.equals("")== false && postalCode.equals("")== false ){
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
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}



}
