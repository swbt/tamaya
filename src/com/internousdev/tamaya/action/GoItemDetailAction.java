/**
 *
 */
package com.internousdev.tamaya.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.ItemDetailDAO;
import com.internousdev.tamaya.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class GoItemDetailAction extends ActionSupport implements SessionAware {
	private int itemId;
	private ItemDTO item = new ItemDTO();
	private Map<String, Object> session;

	@Override
	public String execute(){
		String ret = ERROR;
		System.out.println("GoItemDetailAction : itemId = " + itemId);
		ItemDetailDAO dao = new ItemDetailDAO();
		item = dao.getItemDetail(itemId);
		if(item != null){
			ret = SUCCESS;
		}
		System.out.println("GoItemDetailAction : result = " + ret);
		return ret;
	}

	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public ItemDTO getItem() {
		return item;
	}
	public void setItem(ItemDTO item) {
		this.item = item;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
