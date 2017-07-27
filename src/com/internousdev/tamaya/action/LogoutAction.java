/**
 *
 */
package com.internousdev.tamaya.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.LogoutDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * emailとpasswordを入力してログインする
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class LogoutAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;

	public String execute(){
		String result = ERROR;
		LogoutDAO dao = new LogoutDAO();

		if(!session.containsKey("userId")){
			session.clear();
			result = SUCCESS;
			return result;
		}
		int userId = (int)session.get("userId");


		if(dao.update(userId)){
			session.clear();
			result = SUCCESS;
		}
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
