package com.internousdev.tamaya.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.Definition;
import com.internousdev.tamaya.dao.LoginOauthDAO;
import com.internousdev.tamaya.dto.MypageDTO;
import com.internousdev.tamaya.util.TwitterOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Twitterでログインする為のクラス
 * @author Kaori Takahashi
 * @since 2017/07/20
 * @version 1.0
 */
public class LoginTwitterAction extends ActionSupport implements ServletResponseAware,ServletRequestAware,SessionAware{


	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -1195044262532528381L;

	/**
	 * ネットワークネーム
	 */
	static final int NETWORK_NAME = Definition.NETWORK_NAME_TWITTER; //twitter

	/**
	 * セッション情報
	 */
	public Map<String, Object> session;

	/**
	 * レスポンス
	 */
	private HttpServletResponse response;

	/**
	 * リクエスト
	 */
	private HttpServletRequest request;

	/**
	 * エラーメッセージ
	 */
	private String errorMsg;

	/**
	 * Twitter認証の実行メソッド
	 * @return SUCCESS or ERROR
	 */
	public String execute() {

		String rtn = ERROR;
		TwitterOauth twitterOauth = new TwitterOauth();
		String[] userData = new String[2];
		userData = twitterOauth.getAccessToken(request, response);

		if (userData == null) {
			return rtn;
		}

		String uniqueId = userData[0];
		String userName = userData[1];
		LoginOauthDAO dao = new LoginOauthDAO();
		MypageDTO dto = new MypageDTO();

		//DBにtwitterユーザーの情報が登録されていた場合
		dto = dao.selectInList(uniqueId, NETWORK_NAME);
		if (dto.getOauthAccount() != null) {

			dao.update(uniqueId);//ログインフラグ変更

			dto = dao.selectInList(uniqueId, NETWORK_NAME);//dto情報の取得

			session.put("userId", dto.getUserId());
			session.put("loginFlg", dto.isLoginFlg());
			rtn = SUCCESS;
			return rtn;
		}

		//ユーザー情報を新しくDBに登録する
		boolean result = dao.insert(uniqueId, userName, NETWORK_NAME);
		if (!result) {
			return rtn;
		}
		dao.update(uniqueId);//ログインフラグ変更
		dto = dao.selectInList(uniqueId, NETWORK_NAME);
		session.put("userId", dto.getUserId());
		session.put("loginFlg", dto.isLoginFlg());
		rtn = SUCCESS;

		return rtn;
	}

	/**
	 * レスポンス格納メソッド
	 * @param response レスポンス
	 */
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	/**
	 * リクエスト格納メソッド
	 * @param request リクエスト
	 */
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	/**
	 * セッション情報格納メソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * セッション情報取得メソッド
	 * @return Session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * エラーメッセージ取得メソッド
	 * @return errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * エラーメッセージ格納メソッド
	 * @param errorMsg セットする errorMsg
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}


}