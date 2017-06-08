/**
 *
 */
package com.internousdev.tamaya.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.LogoutDAO;
import com.internousdev.tamaya.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * emailとpasswordを入力してログインする
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class LogoutAction extends ActionSupport implements SessionAware {
	private Boolean loginFlg;
	private Map<String, Object> session;

	public String execute(){
		String result = ERROR;
		LogoutDAO dao = new LogoutDAO();
		UserDTO dto = new UserDTO();
		Object flg = session.get("loginFlg");
		loginFlg = (boolean)flg;

		if(!loginFlg){
			session.clear();
			result = SUCCESS;
			return result;
		}

		dao.update(dto.getUserId());
		if(!dto.getLoginFlg()){
			session.clear();
			result = SUCCESS;
		}
		return result;
	}

	public Boolean getLoginFlg() {
		return loginFlg;
	}
	public void setLoginFlg(Boolean login_flg) {
		this.loginFlg = login_flg;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}