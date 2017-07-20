package com.internousdev.tamaya.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.internousdev.util.oauth.facebook.FacebookOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 	* GoFacebookAction Facebookでログインする為のクラス
 	* @author Kaori Takahashi
	* @since 2017/07/20
	* @version 1.0
	*/
public class GoFacebookAction  extends ActionSupport implements ServletResponseAware,ServletRequestAware{

	/**
	 * シリアルID
	 * @author Kaori Takahashi
	 * @since 2017/07/20
	 * @version 1.0
	 */
	private static final long serialVersionUID = -564268116563098912L;

	/**
	 * リクエスト
	 * @author Kaori Takahashi
	 * @since 2017/07/20
	 * @version 1.0
	 */
	private HttpServletRequest request;

	/**
	 * レスポンス
	 * @author Kaori Takahashi
	 * @since 2017/07/20
	 * @version 1.0
	 */
	private HttpServletResponse response;



	/**
	 * FaceBookからTokenを取得メソッド
	 * @author Kaori Takahashi
	 * @since 2017/07/20
	 * @version 1.0
	 */
    public String execute() {
    	FacebookOauth oauth = new FacebookOauth();
		oauth.getRequestToken(request, response);
		return SUCCESS;
	}

	/**
	 * リクエスト格納メソッド
	 * @author Kaori Takahashi
	 * @since 2017/07/20
	 * @version 1.0
	 */
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	/**
	 * レスポンス格納メソッド
	 * @author Kaori Takahashi
	 * @since 2017/07/20
	 * @version 1.0
	 */
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}
}
