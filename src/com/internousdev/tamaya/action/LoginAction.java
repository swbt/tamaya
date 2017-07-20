/**
 *
 */
package com.internousdev.tamaya.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.LoginDAO;
import com.internousdev.tamaya.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * emailとuserPassを入力してログインする
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class LoginAction extends ActionSupport implements SessionAware {
	private String email;
	private String userPass;
	private int userFlg;
	private Map<String, Object> session;

	public String execute(){
		System.out.println("LoginAction : email = " + email + ", userPass = " + userPass);
		String ret = ERROR;
		LoginDAO dao = new LoginDAO();
		UserDTO dto = new UserDTO();

		//入力した情報が登録されているか確認

		dto = dao.login(email, userPass);
		if(dto == null){
			System.out.println("LoginAction : result = " + ret);
			return ret;

		}

		if(dto.getUserFlg() == 3){
			ret = "admin";
			System.out.println("userId = " + dto.getUserId());
			return ret;
		}

		System.out.println("userId = " + dto.getUserId());
		session.put("userId", dto.getUserId());
		ret = SUCCESS;


		System.out.println("LoginAction : result = " + ret);
		return ret;
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
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
