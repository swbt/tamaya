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
	private Map<String, Object> session;

	public String execute(){
		String ret = ERROR;
		LoginDAO dao = new LoginDAO();
		UserDTO dto = new UserDTO();

		//入力した情報が登録されているか確認
		dto = dao.select(email, userPass);
		if(!email.equals(dto.getEmail()) || !userPass.equals(dto.getUserPass())){
			return ret;
		}
		//データベースのloginFlgがfalseだったらtrueに更新
		if(!dto.getLoginFlg()){
			dao.update(dto.getUserId());
			if(!dto.getLoginFlg()){
				return ret;
			}
		}
		session.put("loginFlg", dto.getLoginFlg());
		session.put("userId", dto.getUserId());
		ret = SUCCESS;
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
