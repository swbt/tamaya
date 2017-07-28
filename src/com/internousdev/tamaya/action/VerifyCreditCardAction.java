/**
 *
 */
package com.internousdev.tamaya.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.CartDAO;
import com.internousdev.tamaya.dao.CreditCardDAO;
import com.internousdev.tamaya.dto.CartDTO;
import com.internousdev.util.creditcard.manager.CreditUtil;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 選択・入力されたクレジットカード情報が正しいか検証する
 *
 * @author TAKAHIRO ADACHI
 * @since 1.0
 */
public class VerifyCreditCardAction extends ActionSupport implements SessionAware {
	/** ユーザーID */
	private int userId;
	/** クレジットカードの種類(1:visa, 2:mastercard, 3:americanexpress) */
	private int creditBrand;
	/** クレジットカード番号 */
	private String creditNumber;
	/** クレジットカード名義 */
	private String nameE;
	/** セキュリティコード */
	private String securityCode;
	/** 有効期限（年） */
	private int expirationYear;
	/** 有効期限（月） */
	private int expirationMonth;
	/** カート */
	private CartDTO cart = new CartDTO();
	/** セッション */
	private Map<String, Object> session;

	/**
	 * クレジットカード情報の照合、格納を実行するメソッド
	 * @author TAKAHIRO ADACHI
	 * @since 1.0
	 */
	@Override
	public String execute() {
		userId = (int) session.get("userId");

		CreditUtil util = new CreditUtil(creditBrand, creditNumber);
		// クレジットカード番号上6ケタの照合
		if (util.brandCheck()) {
			// クレジットカード番号16ケタ、セキュリティコード、有効期限、名義人の照合
			if (util.creditCheck(securityCode, expirationYear, expirationMonth, nameE)) {
			} else {
				return ERROR;
			}
		} else {
			return ERROR;
		}
		try {
			new CreditCardDAO().register(userId, creditBrand, creditNumber, nameE, securityCode, expirationYear, expirationMonth);
		} catch (SQLException e) {
			e.printStackTrace();
			return ERROR;
		}
		try {
			cart = new CartDAO().getCart(userId);
		} catch (SQLException e) {
			e.printStackTrace();
			return SUCCESS;
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
	/** クレジットカード名義を取得するメソッド */
	public String getNameE() {
		return nameE;
	}
	/** クレジットカード名義を格納するメソッド */
	public void setNameE(String nameE) {
		this.nameE = nameE;
	}
	/** セキュリティコードを取得するメソッド */
	public String getSecurityCode() {
		return securityCode;
	}
	/** セキュリティコードを格納するメソッド */
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	/** 有効期限（年）を取得するメソッド */
	public int getExpirationYear() {
		return expirationYear;
	}
	/** 有効期限（年）を格納するメソッド */
	public void setExpirationYear(int expirationYear) {
		this.expirationYear = expirationYear;
	}
	/** 有効期限（月）を取得するメソッド */
	public int getExpirationMonth() {
		return expirationMonth;
	}
	/** 有効期限（月）を格納するメソッド */
	public void setExpirationMonth(int expirationMonth) {
		this.expirationMonth = expirationMonth;
	}
	/** カートを取得するメソッド */
	public CartDTO getCart() {
		return cart;
	}
	/** カートを格納するメソッド */
	public void setCart(CartDTO cart) {
		this.cart = cart;
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
