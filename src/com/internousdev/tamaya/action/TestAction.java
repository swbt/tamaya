package com.internousdev.tamaya.action;

import java.util.HashMap;

import com.opensymphony.xwork2.ActionSupport;

/***
 * Ajaxテスト用アクション
 * @author Takahiro Adachi
 * @since 1.0
 */
public class TestAction extends ActionSupport {
	private HashMap<String,String> hash = new HashMap<>();
	private String msg = null;
	@Override
	public String execute(){
		if (msg == null) {
			hash.put("method", "GETだよ");
		} else {
			hash.put("method", msg);
		}
		System.out.println("HashMap<String,String> hash = " + hash);
		return SUCCESS;
	}

	/** HashMap を jsp に渡すためのメソッド（渡す過程のどこかでjsonに変換される） */
	public HashMap<String, String> getHash() {
		return hash;
	}
	/** ajax の POST 通信で受け取ったメッセージを格納するメソッド */
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
