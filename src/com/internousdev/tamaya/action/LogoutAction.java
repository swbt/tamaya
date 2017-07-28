/**
 *
 */
package com.internousdev.tamaya.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.UserDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * MySQL のログインフラグを false にし、セッションを破棄する
 * @author TAKAHIRO ADACHI
 * @since 1.0
 */
public class LogoutAction extends ActionSupport implements SessionAware {
	/** セッション */
	private Map<String, Object> session;

	public String execute(){
		if(!session.containsKey("userId")){
			((SessionMap<String, Object>)session).invalidate();
			return SUCCESS;
		}
		int userId = (int)session.get("userId");
		if(userId == 0){
			((SessionMap<String, Object>)session).invalidate();
			return SUCCESS;
		}

		// HttpSession を破棄する
		((SessionMap<String, Object>)session).invalidate();
		UserDAO dao = new UserDAO();
		if(dao.logout(userId)){
			return SUCCESS;
		}
		return ERROR;
	}

	/** セッションを取得する */
	public Map<String, Object> getSession() {
		return session;
	}
	/** セッションを格納する */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
