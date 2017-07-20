/**
 *
 */
package com.internousdev.tamaya.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.util.creditcard.manager.CreditUtil;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 選択・入力されたクレジットカード情報が正しいか検証する
 * @author Takahiro Adachi
 * @since 1.0
 */
public class VerifyCreditCardAction extends ActionSupport implements SessionAware {
	/** クレジット種類 */
	private int creditId;
	/** クレジット番号 */
	private String creditNumber;
	/** クレジット名義 */
	private String nameE;
	/** セキュリティコード */
	private String securityCode;
	/** 有効期限（月） */
	private int expirationMonth;
	/** 有効期限（年） */
	private int expirationYear;
	/** セッション情報 */
	private Map<String, Object> session;

	/**
	 * クレジットカード情報の照合、格納を実行するメソッド
	 * @since 1.0
	 * @version 1.0
	 */
	public String execute() {
		if(!session.containsKey("userId")){
			return "login";
		}
		System.out.println("creditId:" + creditId + ", creditNumber:" + creditNumber);
		System.out.print("securityCode = " + securityCode + ", expirationYear = " + expirationYear);
		System.out.println(", expirationMonth = " + expirationMonth + ", nameE = " + nameE);
		CreditUtil util = new CreditUtil(creditId, creditNumber);
		// クレジットカード番号上6ケタの照合
		if (util.brandCheck()) {
			// クレジットカード番号16ケタ、セキュリティコード、有効期限、名義人の照合
			if (util.creditCheck(securityCode, expirationYear, expirationMonth, nameE)) {
				System.out.println("VerifyCreditCardAction : SUCCESS");
				return SUCCESS;
			} else {
				System.out.println("VerifyCreditCardAction : ERROR(creditCheck)");
				return ERROR;
			}
		} else {
			System.out.println("VerifyCreditCardAction : ERROR(brandCheck)");
			return ERROR;
		}
		//TODO カートの中身をDBから取ってくる処理
	}

	/** クレジット種類を取得するメソッド */
	public int getCreditId() {
		return creditId;
	}
	/** クレジット種類を格納するメソッド */
	public void setCreditId(int creditId) {
		this.creditId = creditId;
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
	/** 有効期限（月）を取得するメソッド */
	public int getExpirationMonth() {
		return expirationMonth;
	}
	/** 有効期限（月）を格納するメソッド */
	public void setExpirationMonth(int expirationMonth) {
		this.expirationMonth = expirationMonth;
	}
	/** 有効期限（年）を取得するメソッド */
	public int getExpirationYear() {
		return expirationYear;
	}
	/** 有効期限（年）を格納するメソッド */
	public void setExpirationYear(int expirationYear) {
		this.expirationYear = expirationYear;
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
