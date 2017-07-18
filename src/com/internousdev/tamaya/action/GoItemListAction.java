/**
 *
 */
package com.internousdev.tamaya.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.ItemListDAO;
import com.internousdev.tamaya.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品を検索し、条件にあったものを全てitemList<ItemDTO>に格納する
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class GoItemListAction extends ActionSupport implements SessionAware {
	private String transition = "";
	private String category = "";
	private int priceRange = 0;
	private ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
	private Map<String, Object> session;

	@Override
	public String execute(){
		String ret = ERROR;
		ItemListDAO dao = new ItemListDAO();

		if(!category.isEmpty()){
			itemList = dao.select(category);
		} else if(priceRange != 0){
			itemList = dao.select(priceRange);
		} else {
			itemList = dao.select();
		}

		if(itemList.size() <= 0){
			return ret;
		}
		if(transition.equals("top")){
			ret = "top";
			return ret;
		}
		ret = "item_list";
		return ret;
	}

	public String getTransition() {
		return transition;
	}
	public void setTransition(String transition) {
		this.transition = transition;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPriceRange() {
		return priceRange;
	}
	public void setPriceRange(int priceRange) {
		this.priceRange = priceRange;
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
