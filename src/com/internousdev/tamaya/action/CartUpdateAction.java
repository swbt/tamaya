/**
 *
 */
package com.internousdev.tamaya.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.CartUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class CartUpdateAction extends ActionSupport implements SessionAware{

    /**
	 * 生成されたシリアルバージョンUID
	 */
    private static final long serialVersionUID = -3805523587385383625L;


    private int userId; //ユーザーID

    private int itemId;//アイテムID

    private int orderCount;//注文数

    private String errorMsg;//Update失敗時のメッセージ

    private Map<String, Object> session;

	/**
	 * 実行メソッド
	 * オーダーカウントの変更
     * @author YUKO TSUJI
     * @since 2017.07.05
     * @version 1.0
     * @return 成功ならSUCCESS　失敗ならERROR
     */
    public String execute() {
        String result = ERROR;
        int count = 0;
        errorMsg = "";



        if(session.containsKey("userId")) {
            userId = (int)session.get("userId");
            System.out.println(userId + "こんにちは");
        }else{
            return ERROR;
        }

        CartUpdateDAO dao = new CartUpdateDAO();
        count = dao.update(orderCount, userId, itemId);

        if(count==0) {
            errorMsg = "注文個数を変更できませんでした";
            return ERROR;
        }else{
            result = SUCCESS;
        }

        return result;
    }

	/**
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return itemId
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * @param itemId セットする itemId
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * @return orderCount
	 */
	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	/**
	 * @return errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * @param errorMsg セットする errorMsg
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * @return serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
