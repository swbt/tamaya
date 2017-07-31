package com.internousdev.tamaya.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.util.GoogleOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Googleでログインする為のクラス
 * @author KAORI TAKAHASHI
 * @since 2017/07/20
 * @version 1.0
 */
public class GoGoogleAction extends ActionSupport implements ServletResponseAware,ServletRequestAware,SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 1524555947613444860L;

	/**
	 * セッション
	 */
	private Map<String,Object> session;

	/**
	 * レスポンス
	 */
	private HttpServletResponse response;

	/**
	 * リクエスト
	 */
	private HttpServletRequest request;
	/**
	 * GoogleからリクエストTokenを取得メソッド
	 * @return token取得できたらSUCCESSできなかったらERROR
	 */
	public String execute() {
		GoogleOauth googleOauth = new GoogleOauth();
		if(!googleOauth.getRequestToken(request,response)) {
			return ERROR;
		}
		session.put("login_flg",true);
		return SUCCESS;
	}
	/**
	 * セッションを格納するためのメソッド
     * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	/**
	 * セッションを取得するためのメソッド
	 * @return sessionを取得
	 */
	public Map<String, Object> getSession() {
		return session;
	}
	/**
	 * レスポンス格納メソッド
	 * @param response レスポンス
	 */
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}
	/**
	 * リクエストを格納するためのメソッド
	 * @param request リクエスト
	 */
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
}