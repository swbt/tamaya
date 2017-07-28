/**
 *
 */
package com.internousdev.tamaya.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.ItemListDAO;
import com.internousdev.tamaya.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品を検索し、条件にあったものを全てitemList<ItemDTOTest>に格納する
 *
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class GoItemListAction extends ActionSupport implements SessionAware {
	/** ユーザーID */
	private int userId;
	/** 検索するカテゴリー */
	private String category = "";
	/** 検索する価格帯 */
	private int priceRange;
	/** 検索結果の商品のリスト */
	private ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
	/** セッション */
	private Map<String, Object> session;

	@Override
	public String execute() {
		if (session.containsKey("userId")) {
			session.get("userId");
		}
		System.out.println("GoItemListAction : category = " + category + ", priceRange = " + priceRange);
		ItemListDAO dao = new ItemListDAO();

		try {
			if (!category.isEmpty()) {
				itemList = dao.searchByCategory(category);
			} else if (priceRange != 0) {
				itemList = dao.searchByPriceRange(priceRange);
			} else {
				itemList = dao.select();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return ERROR;
		}

		if (itemList.size() <= 0) {
			return ERROR;
		}
		return SUCCESS;
	}

	/** ユーザーIDを取得するメソッド */
	public int getUserId() {
		return userId;
	}
	/** ユーザーIDを格納するメソッド */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/** 検索するカテゴリーを取得するメソッド */
	public String getCategory() {
		return category;
	}
	/** 検索するカテゴリーを格納するメソッド */
	public void setCategory(String category) {
		this.category = category;
	}
	/** 検索する価格帯を取得するメソッド */
	public int getPriceRange() {
		return priceRange;
	}
	/** 検索する価格帯を格納するメソッド */
	public void setPriceRange(int priceRange) {
		this.priceRange = priceRange;
	}
	/** 検索結果の商品のリストを取得するメソッド */
	public ArrayList<ItemDTO> getItemList() {
		return itemList;
	}
	/** 検索結果の商品のリストを格納するメソッド */
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
