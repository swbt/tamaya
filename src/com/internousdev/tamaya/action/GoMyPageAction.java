package com.internousdev.tamaya.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.OrderDAO;
import com.internousdev.tamaya.dao.UserDAO;
import com.internousdev.tamaya.dto.OrderDTO;
import com.internousdev.tamaya.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * マイページに遷移する際に必要な情報を取得する
 * @author TAKAHIRO ADACHI
 * @since 1.0
 */
public class GoMyPageAction extends ActionSupport implements SessionAware {
	/** ユーザーID */
	private int userId;
	/** ユーザー情報 */
	private UserDTO user = new UserDTO();
	/** 注文履歴 */
	private ArrayList<OrderDTO> orderList = new ArrayList<>();
	/** セッション */
	private Map<String, Object> session;

	public String execute() throws SQLException {
		userId = (int) session.get("userId");

		user = new UserDAO().getMyPage(userId);
		if (user == null) {
			return ERROR;
		}
		orderList = new OrderDAO().getOrderList(userId);
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
	/** ユーザー情報を取得するメソッド */
	public UserDTO getUser() {
		return user;
	}
	/** ユーザー情報を格納するメソッド */
	public void setUser(UserDTO user) {
		this.user = user;
	}
	/** 注文履歴を取得するメソッド */
	public ArrayList<OrderDTO> getOrderList() {
		return orderList;
	}
	/** 注文履歴を格納するメソッド */
	public void setOrderList(ArrayList<OrderDTO> orderList) {
		this.orderList = orderList;
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
