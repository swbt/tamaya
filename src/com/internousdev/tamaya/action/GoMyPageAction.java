package com.internousdev.tamaya.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.UserDAO;
import com.internousdev.tamaya.dto.OrderDTO;
import com.internousdev.tamaya.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * マイページに遷移する際に必要な情報を取得する
 *
 * @author YUKO TSUJI
 * @since 2017/07/18
 * @version 1.0
 */
public class GoMyPageAction extends ActionSupport implements SessionAware {
	/** ユーザーID */
	private int userId;
	/** ユーザー情報 */
	private UserDTO user = new UserDTO();
	/** 注文履歴 */
	private ArrayList<OrderDTO> orderList = new ArrayList<>();

	public String execute() throws SQLException {
		userId = (int) session.get("userId");

		user = new UserDAO().getMyPage(userId);
		if (user == null) {
			return ERROR;
		}
		//TODO 注文履歴を取得する
		return SUCCESS;
	}

	/** userIdを取得するメソッド */
	public int getUserId() {
		return userId;
	}
	/** userIdを格納するメソッド */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/** userを取得するメソッド */
	public UserDTO getUser() {
		return user;
	}
	/** userを格納するメソッド */
	public void setUser(UserDTO user) {
		this.user = user;
	}
	/** orderListを取得するメソッド */
	public ArrayList<OrderDTO> getOrderList() {
		return orderList;
	}
	/** orderListを格納するメソッド */
	public void setOrderList(ArrayList<OrderDTO> orderList) {
		this.orderList = orderList;
	}
	/** sessionを取得するメソッド */
	public Map<String, Object> getSession() {
		return session;
	}
	/** sessionを格納するメソッド */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	/** セッション情報 */
	private Map<String, Object> session;
}
