/**
 * 
 */
package com.internousdev.tamaya.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * クレジット決済をし、注文を確定します
 * @author Takahiro Adachi
 * @since 1.0
 */
public class ConfirmOrderAction extends ActionSupport implements SessionAware {
	/** プロジェクト名 */
	private String projectName = "tamaya";
	/** カード番号 */
	private String creditNumber;
	/** カードの種類 */
	private int creditId;
	/** 合計金額 */
	private float amountAll;
	/** セッション情報 */
	private Map<String, Object> session;
	
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getCreditNumber() {
		return creditNumber;
	}
	public void setCreditNumber(String creditNumber) {
		this.creditNumber = creditNumber;
	}
	public int getCreditId() {
		return creditId;
	}
	public void setCreditId(int creditId) {
		this.creditId = creditId;
	}
	public float getAmountAll() {
		return amountAll;
	}
	public void setAmountAll(float amountAll) {
		this.amountAll = amountAll;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
