/**
 *
 */
package com.internousdev.tamaya.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.ShowItemDetailDAO;
import com.internousdev.tamaya.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class ShowItemDetailAction extends ActionSupport implements SessionAware {
	private int itemId;
	private ItemDTO dto = new ItemDTO();
	private Map<String, Object> session;

	@Override
	public String execute(){
		String ret = ERROR;
		ShowItemDetailDAO dao = new ShowItemDetailDAO();

		dto = dao.select(itemId);

		if(dto != null){
			ret = SUCCESS;
		}
		return ret;
	}

	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public ItemDTO getDto() {
		return dto;
	}
	public void setDto(ItemDTO dto) {
		this.dto = dto;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
