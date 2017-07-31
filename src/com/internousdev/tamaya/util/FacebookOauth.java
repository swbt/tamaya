package com.internousdev.tamaya.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONValue;

import com.opensymphony.xwork2.ActionSupport;

import facebook4j.Facebook;
import facebook4j.FacebookFactory;
import facebook4j.auth.AccessToken;

/**
 * FACEBOOK OAuthでログインする為のクラス
 * @author KAORI TAKAHASHI
 * @since 2017/07/20
 * @version 1.0
 */
public class FacebookOauth extends ActionSupport{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -564268116563098912L;

	/**
	 * APP ID
	 */
	private static final String APP_ID = "139374836646819";

	/**
	 * レスポンスURL
	 */
	private static final String APP_SECRET = "0e06c6522a1b13af3ea6078fa50dbe9e";

	/**
	 * コールバックパス
	 */
	private static final String CALLBACK_PATH = "/LoginFacebookAction";

	/**
	 * ユーザー情報を取得するメソッド
	 * @param request リクエスト
	 * @param Kaori Takahashi
	 * @since 2017/07/20
	 * @version 1.0
	 */
	public void getRequestToken(HttpServletRequest request, HttpServletResponse response) {
        Facebook facebook = new FacebookFactory().getInstance();
        request.getSession().setAttribute("facebook", facebook);
        facebook.setOAuthAppId(APP_ID, APP_SECRET);
        String accessTokenString = APP_ID + "|" + APP_SECRET;
        AccessToken at = new AccessToken(accessTokenString);
        facebook.setOAuthAccessToken(at);
        StringBuffer callbackURL = request.getRequestURL();
        int index = callbackURL.lastIndexOf("/");
        callbackURL.replace(index, callbackURL.length(), "").append(CALLBACK_PATH);
        try {
			response.sendRedirect(facebook.getOAuthAuthorizationURL(callbackURL.toString()));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

	/**
	 * アクセストークンを取得するメソッド
	 * @param request リクエスト
	 * @param response レスポスト
	 * @return userMap ユーザー情報
	 * @author KAORI TAKAHASHI
	 * @since 2017/7/20
	 * @version 1.0
	 */
	public Map<String, String> getAccessToken(HttpServletRequest request, HttpServletResponse response){

		final String callbackURL = request.getRequestURL().toString();
		final String code = request.getParameter("code");

		if(code == null){
			try{
				response.sendRedirect(request.getContextPath()+ "/login.jsp");
			} catch (IOException e){
				e.printStackTrace();
			}
		}
		String accessTokenURL = null;
		try{
			accessTokenURL = "https://graph.facebook.com/oauth/access_token?client_id="
					+ APP_ID
					+ "&redirect_uri="
					+ URLEncoder.encode(callbackURL, "UTF-8")
					+ "&client_secret="
					+ APP_SECRET + "&code=" + URLEncoder.encode(code, "UTF-8");
		} catch (UnsupportedEncodingException e){
			e.printStackTrace();
		}
		String accessTokenResult = null;
		try {
			accessTokenResult = httpRequest(new URL(accessTokenURL));
		} catch (MalformedURLException e1){
			e1.printStackTrace();
		}

		String accessToken = null;


		String[] pairs = accessTokenResult.split("&");
		String[] kv = {};
		for (String pair : pairs){
			kv = pair.split(",");
		}
			if (kv.length != 3) {
				throw new RuntimeException("Unexpected auth response");
			}

			String[] kv2 = kv[0].split("\"");
			if(kv2.length != 4) {
				throw new RuntimeException("Unexpected auth response");
			}
			if(kv2[1].equals("access_token")){
				accessToken = kv2[3];
			}


		String apiURL = null;
		try {
			apiURL = "https://graph.facebook.com/me?access_token="
					+ URLEncoder.encode(accessToken, "UTF-8");
		} catch (UnsupportedEncodingException e){
			e.printStackTrace();
		}

		String apiResult = null;
		try {
			apiResult = httpRequest(new URL(apiURL));
		} catch (MalformedURLException e){
			e.printStackTrace();
		}

		@SuppressWarnings("unchecked")
		Map<String, String> userMap = (Map<String, String>) JSONValue.parse(apiResult);
		return userMap;
	}

	/**
	 * リクエスト用のメソッド
	 * @param url URL
	 * @return String
	 * @author KAORI TAKAHASHI
	 * @since 2017/07/20
	 * @version 1.0
	 */

	private String httpRequest(URL url) {
		HttpURLConnection conn = null;
		String response = "";
		try{
			conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setUseCaches(false);
			conn.setRequestMethod("GET");
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
			String line = null;

			while ((line = reader.readLine()) != null){
				response += line;
			}
			reader.close();
		} catch (IOException e){
			e.printStackTrace();
		} finally {
			conn.disconnect();
		}
		return response;
	}

}