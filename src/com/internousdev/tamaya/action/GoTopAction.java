package com.internousdev.tamaya.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.ItemDAO;
import com.internousdev.tamaya.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/***
 * トップ画面に遷移する際、必要な情報を取得するクラス
 * @author TAKAHIRO ADACHI
 * @since 1.0
 */
public class GoTopAction extends ActionSupport implements SessionAware {
	/** 商品リスト（ランキング） */
	private ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
	/** セッション */
	private Map<String, Object> session;
	@Override
	public String execute(){
		try {
			itemList = new ItemDAO().getRanking(3);
		} catch (SQLException e) {
			e.printStackTrace();
			return ERROR;
		}

		if(itemList.size() <= 0){
			return ERROR;
		}
		return SUCCESS;
	}
	/** 商品リスト（ランキング）を取得するメソッド */
	public ArrayList<ItemDTO> getItemList() {
		return itemList;
	}
	/** 商品リスト（ランキング）を格納するメソッド */
	public void setItemList(ArrayList<ItemDTO> itemList) {
		this.itemList = itemList;
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
