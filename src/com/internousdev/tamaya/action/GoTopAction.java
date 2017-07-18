package com.internousdev.tamaya.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.ItemListDAO;
import com.internousdev.tamaya.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/***
 * トップ画面に行くアクション
 * @author Takahiro Adachi
 * @since 1.0
 */
public class GoTopAction extends ActionSupport implements SessionAware {
	private ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
	private Map<String, Object> session;
	@Override
	public String execute(){
		String ret = ERROR;
		ItemListDAO dao = new ItemListDAO();
		itemList = dao.getRanking(3);

		if(itemList.size() <= 0){
			return ret;
		}
		ret = SUCCESS;
		return ret;
	}

	public ArrayList<ItemDTO> getItemList() {
		return itemList;
	}
	public void setItemList(ArrayList<ItemDTO> itemList) {
		this.itemList = itemList;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
