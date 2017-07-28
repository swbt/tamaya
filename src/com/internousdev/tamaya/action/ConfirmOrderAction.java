/**
 *
 */
package com.internousdev.tamaya.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.CartDAO;
import com.internousdev.tamaya.dao.CreditCardDAO;
import com.internousdev.tamaya.dao.OrderDAO;
import com.internousdev.tamaya.dto.CartDTO;
import com.internousdev.tamaya.dto.CreditCardDTO;
import com.internousdev.util.creditcard.manager.CreditUtil;
import com.opensymphony.xwork2.ActionSupport;

/**
 * クレジット決済をし、カートの中身を注文テーブルに移す
 *
 * @author Takahiro Adachi
 * @since 1.0
 */
public class ConfirmOrderAction extends ActionSupport implements SessionAware {
	/** ユーザーID */
	private int userId;
	/** プロジェクト名 */
	private String projectName = "tamaya";
	/** クレジットカードの種類(1:visa, 2:mastercard, 3:americanexpress) */
	private int creditBrand;
	/** クレジットカード番号 */
	private String creditNumber;
	/** 合計金額 */
	private int amountAll;
	/** セッション情報 */
	private Map<String, Object> session;

	@Override
	public String execute() {
		userId = (int) session.get("userId");

		CartDTO cart = new CartDTO();
		try {
			cart = new CartDAO().getCart(userId);
		} catch (SQLException e) {
			e.printStackTrace();
			return ERROR;
		}
		if (cart == null) {
			return ERROR;
		}

		CreditCardDTO dto = new CreditCardDAO().getCreditCard(userId);
		if (dto == null) {
			return ERROR;
		}
		creditBrand = dto.getCreditBrand();
		creditNumber = dto.getCreditNumber();
		amountAll = cart.getGrandTotal().intValue();

		try {
			// tamaya の 注文テーブルにカートの情報を入れる
			if (!new OrderDAO().order(userId, cart)) {
				return ERROR;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return ERROR;
		}
		CreditUtil util = new CreditUtil(creditBrand, creditNumber);
		// クレジットカードの利用情報を、カード会社のDBに格納する
		if (util.selectInsert(projectName, amountAll) != 0) {
			// 成功した場合、カートを削除する
			new CartDAO().deleteCart(userId);
			return SUCCESS;
		} else {
			// 失敗した場合、注文をキャンセルする
			new OrderDAO().unorder(userId);
			return ERROR;
		}
	}

	/** プロジェクト名を取得するメソッド */
	public String getProjectName() {
		return projectName;
	}
	/** プロジェクト名を格納するメソッド */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/** クレジットカードの種類(1:visa, 2:mastercard, 3:americanexpress)を取得するメソッド */
	public int getCreditBrand() {
		return creditBrand;
	}
	/** クレジットカードの種類(1:visa, 2:mastercard, 3:americanexpress)を格納するメソッド */
	public void setCreditBrand(int creditBrand) {
		this.creditBrand = creditBrand;
	}
	/** クレジットカード番号を取得するメソッド */
	public String getCreditNumber() {
		return creditNumber;
	}
	/** クレジットカード番号を格納するメソッド */
	public void setCreditNumber(String creditNumber) {
		this.creditNumber = creditNumber;
	}
	/** 合計金額を取得するメソッド */
	public int getAmountAll() {
		return amountAll;
	}
	/** 合計金額を格納するメソッド */
	public void setAmountAll(int amountAll) {
		this.amountAll = amountAll;
	}
	/** セッション情報を取得するメソッド */
	public Map<String, Object> getSession() {
		return session;
	}
	/** セッション情報を格納するメソッド */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
