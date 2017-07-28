/**
 *
 */
package com.internousdev.tamaya.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.UserDAO;
import com.internousdev.tamaya.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 入力された email と password を検証しログインする。ログイン前にセッションを破棄する
 * @author TAKAHIRO ADACHI
 * @since 1.0
 */
public class LoginAction extends ActionSupport implements SessionAware {
	/** メールアドレス */
	private String email;
	/** パスワード */
	private String password;
	/** セッション */
	private Map<String, Object> session;

	public String execute(){
		//入力した情報が登録されているか確認
		UserDTO dto;
		try {
			dto = new UserDAO().login(email, password);
		} catch (SQLException e) {
			e.printStackTrace();
			return ERROR;
		}
		if(dto == null){
			return ERROR;
		}

		// HttpSession を破棄する
		((SessionMap<String, Object>)session).invalidate();
		if(dto.getUserFlg() == 3){
			((SessionMap<String, Object>)session).invalidate();
			session.put("userFlg", dto.getUserFlg());
			return "admin";
		}

		((SessionMap<String, Object>)session).invalidate();
		session.put("userId", dto.getUserId());
		return SUCCESS;
	}

	/** メールアドレスを取得するメソッド */
	public String getEmail() {
		return email;
	}
	/** メールアドレスを格納するメソッド */
	public void setEmail(String email) {
		this.email = email;
	}
	/** パスワードを取得するメソッド */
	public String getPassword() {
		return password;
	}
	/** パスワードを格納するメソッド */
	public void setPassword(String password) {
		this.password = password;
	}
	/** セッションを取得するメソッド */
	public Map<String, Object> getSession() {
		return session;
	}
	/** セッションを格納するメソッド */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
