package com.internousdev.tamaya.action;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.internousdev.util.oauth.facebook.FacebookOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 	* GoFacebookAction Facebookでログインする為のクラス
 	* @author Kaito Fukutani
	* @since 2017/5/18
	* @version 1.0
	*/
public class GoFacebookAction  extends ActionSupport implements ServletResponseAware,ServletRequestAware{

	/**
	 * シリアルID
	 * @author Kaito Fukutani
	 * @since 2017/5/18
	 * @version 1.0
	 */
	private static final long serialVersionUID = -564268116563098912L;

	/**
	 * リクエスト
	 * @author Kaito Fukutani
	 * @since 2017/5/18
	 * @version 1.0
	 */
	private HttpServletRequest request;

	/**
	 * レスポンス
	 * @author Kaito Fukutani
	 * @since 2017/5/18
	 * @version 1.0
	 */
	private HttpServletResponse response;



	/**
	 * FaceBookからTokenを取得メソッド
	 * @author Kaito Fukutani
	 * @since 2017/5/18
	 * @version 1.0
	 */
    public String execute() {
    	FacebookOauth oauth = new FacebookOauth();
		oauth.getRequestToken(request, response);
		return SUCCESS;
	}

	/**
	 * リクエスト格納メソッド
	 * @author Kaito Fukutani
	 * @since 2017/5/18
	 * @version 1.0
	 */
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	/**
	 * レスポンス格納メソッド
	 * @author Kaito Fukutani
	 * @since 2017/5/18
	 * @version 1.0
	 */
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}
}
