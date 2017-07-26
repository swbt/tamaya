/**
 *
 */
package com.internousdev.tamaya.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.CartDAO;
import com.internousdev.tamaya.dto.CartDTO;
import com.internousdev.util.creditcard.manager.CreditUtil;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 選択・入力されたクレジットカード情報が正しいか検証する
 * @author Takahiro Adachi
 * @since 1.0
 */
public class VerifyCreditCardAction extends ActionSupport implements SessionAware {
	/** ユーザーID */
	private int userId;
	/** クレジットの種類(1:visa, 2:mastercard, 3:americanexpress) */
	private int creditBrand;
	/** クレジット番号 */
	private String creditNumber;
	/** クレジット名義 */
	private String nameE;
	/** セキュリティコード */
	private String securityCode;
	/** 有効期限（年） */
	private int expirationYear;
	/** 有効期限（月） */
	private int expirationMonth;
	/** カート */
	private ArrayList<CartDTO> cart = new ArrayList<CartDTO>();
	/** セッション情報 */
	private Map<String, Object> session;

	/**
	 * クレジットカード情報の照合、格納を実行するメソッド
	 * @since 1.0
	 */
	public String execute() {
		if (!session.containsKey("userId")) {
			System.out.println("VerifyCreditCardAction : LOGIN");
			return LOGIN;
		}
		userId = (int) session.get("userId");
		if (userId == 0) {
			System.out.println("VerifyCreditCardAction : LOGIN");
			return LOGIN;
		}
		System.out.println("creditId:" + creditBrand + ", creditNumber:" + creditNumber);
		System.out.print("securityCode = " + securityCode + ", expirationYear = " + expirationYear);
		System.out.println(", expirationMonth = " + expirationMonth + ", nameE = " + nameE);
		CreditUtil util = new CreditUtil(creditBrand, creditNumber);
		// クレジットカード番号上6ケタの照合
		if (util.brandCheck()) {
			// クレジットカード番号16ケタ、セキュリティコード、有効期限、名義人の照合
			if (util.creditCheck(securityCode, expirationYear, expirationMonth, nameE)) {
				System.out.println("VerifyCreditCardAction : SUCCESS");
			} else {
				System.out.println("VerifyCreditCardAction : ERROR(creditCheck)");
				return ERROR;
			}
		} else {
			System.out.println("VerifyCreditCardAction : ERROR(brandCheck)");
			return ERROR;
		}

		try {
			cart = new CartDAO().getCart(userId);
		} catch (SQLException e) {
			e.printStackTrace();
			//何らかのリザルトを投げる
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
	/** クレジットの種類(1:visa, 2:mastercard, 3:americanexpress)を取得するメソッド */
	public int getCreditBrand() {
		return creditBrand;
	}
	/** クレジットの種類(1:visa, 2:mastercard, 3:americanexpress)を格納するメソッド */
	public void setCreditBrand(int creditBrand) {
		this.creditBrand = creditBrand;
	}
	/** クレジット番号を取得するメソッド */
	public String getCreditNumber() {
		return creditNumber;
	}
	/** クレジット番号を格納するメソッド */
	public void setCreditNumber(String creditNumber) {
		this.creditNumber = creditNumber;
	}
	/** クレジット名義を取得するメソッド */
	public String getNameE() {
		return nameE;
	}
	/** クレジット名義を格納するメソッド */
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
	public ArrayList<CartDTO> getCart() {
		return cart;
	}
	/** カートを格納するメソッド */
	public void setCart(ArrayList<CartDTO> cart) {
		this.cart = cart;
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
