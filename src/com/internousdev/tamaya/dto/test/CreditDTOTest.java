package com.internousdev.tamaya.dto.test;



/**
 * クレジット情報に関するDTOクラス
 * @author Atsushi Kawai
 * @since 6/13
 * @version 1.0
 */


public class CreditDTOTest {

	private String email;				//ログイン用メールアドレス

	private int creditId;				//クレジットの種類

	private String creditNumber;		//クレジット番号

	private String nameE;				//クレジット名義人

	private int securityCode;			//セキュリティコード

	private int expirationMonth;		//有効期限(月)

	private int expirationYear;			//有効期限(年）

	private String creditNumberDown;	//クレジット番号下4ケタ(変数名なし)

	private String createdAt;			//登録日時

	private String updatedAt;			//更新日時

	private String loginId;				//ログインID

	private String lastName;			//姓名

	private String firstName;			//名前




		private int paymentId;				//支払い回数

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getCreditId() {
			return creditId;
		}

		public void setCreditId(int creditId) {
			this.creditId = creditId;
		}

		public String getCreditNumber() {
			return creditNumber;
		}

		public void setCreditNumber(String creditNumber) {
			this.creditNumber = creditNumber;
		}

		public String getNameE() {
			return nameE;
		}

		public void setNameE(String nameE) {
			this.nameE = nameE;
		}

		public int getSecurityCode() {
			return securityCode;
		}

		public void setSecurityCode(int securityCode) {
			this.securityCode = securityCode;
		}

		public int getExpirationMonth() {
			return expirationMonth;
		}

		public void setExpirationMonth(int expirationMonth) {
			this.expirationMonth = expirationMonth;
		}

		public int getExpirationYear() {
			return expirationYear;
		}

		public void setExpirationYear(int expirationYear) {
			this.expirationYear = expirationYear;
		}

		public String getCreditNumberDown() {
			return creditNumberDown;
		}

		public void setCreditNumberDown(String creditNumberDown) {
			this.creditNumberDown = creditNumberDown;
		}

		public String getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public int getPaymentId() {
			return paymentId;
		}

		public void setPaymentId(int paymentId) {
			this.paymentId = paymentId;
		}

		public int ExpirationYear() {
			// TODO 自動生成されたメソッド・スタブ
			return 0;
		}

		public int ExpirationMonth() {
			// TODO 自動生成されたメソッド・スタブ
			return 0;
		}

		public void setCreditType(String brandName) {
			// TODO 自動生成されたメソッド・スタブ

		}

		public void setUserId(int int1) {
			// TODO 自動生成されたメソッド・スタブ

		}

		public void setLoginId(String string) {
			// TODO 自動生成されたメソッド・スタブ

		}

		public void setLastName(String string) {
			// TODO 自動生成されたメソッド・スタブ

		}

		public void setFirstName(String string) {
			// TODO 自動生成されたメソッド・スタブ

		}

		public String getLoginId() {
			// TODO 自動生成されたメソッド・スタブ
			return loginId;
		}

		public String getLastName() {
			return lastName;
		}

		public String getFirstName() {
			// TODO 自動生成されたメソッド・スタブ
			return firstName;
		}






}

