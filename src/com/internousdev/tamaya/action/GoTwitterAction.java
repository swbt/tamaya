package com.internousdev.tamaya.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.internousdev.tamaya.util.TwitterOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 * TwitterIDでログインする為のクラス
 * @author Kaori Takahashi
 * @since 2017/07/20
 * @version 1.0
 */
public class GoTwitterAction extends ActionSupport implements ServletResponseAware, ServletRequestAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 4914474156093366712L;

	/**
	 * セッション情報
	 */
	private Map<String, Object> session;

	/**
	 * レスポンス
	 */
	private HttpServletResponse response;

	/**
	 * リクエスト
	 */
	private HttpServletRequest request;

	/**
	 * TwitterリクエストToken取得メソッド
	 * @return  SUCCESS or ERROR
	 */
	public String execute() {
		String result = ERROR;
		TwitterOauth twitterOauth = new TwitterOauth();
		if (twitterOauth.getRequestToken(request, response)) {
			result = SUCCESS;
		}
		return result;
	}

	/**
	 * セッション情報を格納するためのメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * セッション情報を取得するためのメソッド
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * レスポンスを格納するためのメソッド
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
