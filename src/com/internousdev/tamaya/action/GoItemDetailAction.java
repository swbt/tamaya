/**
 *
 */
package com.internousdev.tamaya.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.ItemDAO;
import com.internousdev.tamaya.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 対象の商品の詳細を取得し、item に格納する
 *
 * @author TAKAHIRO ADACHI
 * @since 1.0
 */
public class GoItemDetailAction extends ActionSupport implements SessionAware {
	/** 対象の商品ID */
	private int itemId;
	/** 対象の商品 */
	private ItemDTO item;
	/** セッション */
	private Map<String, Object> session;

	@Override
	public String execute(){
		item = new ItemDAO().getItemDetail(itemId);
		if(item == null){
			return ERROR;
		}
		return SUCCESS;
	}

	/** 対象の商品IDを取得するメソッド */
	public int getItemId() {
		return itemId;
	}
	/** 対象の商品IDを格納するメソッド */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	/** 対象の商品を取得するメソッド */
	public ItemDTO getItem() {
		return item;
	}
	/** 対象の商品を格納するメソッド */
	public void setItem(ItemDTO item) {
		this.item = item;
	}
	/** セッションを取得するメソッド */
	public Map<String, Object> getSession() {
		return session;
	}
	/** セッションを格納するメソッド */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
