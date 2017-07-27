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
 * email と password を入力してログインする
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class LoginAction extends ActionSupport implements SessionAware {
	private String email;
	private String password;
	private int userFlg;
	private Map<String, Object> session;

	public String execute(){
		System.out.println("LoginAction : email = " + email + ", password = " + password);
		String ret = ERROR;
		LoginDAO dao = new LoginDAO();
		UserDTO dto = new UserDTO();

		//入力した情報が登録されているか確認

		dto = dao.login(email, password);
		if(dto == null){
			System.out.println("LoginAction : result = " + ret);
			return ret;

		}

		if(dto.getUserFlg() == 3){
			ret = "admin";
			System.out.println("userFlg = " + dto.getUserFlg());
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
