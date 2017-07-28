package com.internousdev.tamaya.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ContactAction　問い合わせフォームからの情報をmongoDBにインサートするクラス
 *
 * @author RYO SHIRAISHI
 * @since 2017/7/26
 * @version 1.0
 */
public class BackContactAction extends ActionSupport{


	/**
	 *
	 */
	private static final long serialVersionUID = 376107014399198994L;
	/**
	 * 問い合わせ者名
	 */
	private String userName=" ";
	/**
	 * 電話番号
	 */
	private String postalCode=" ";
	/**
	 * メールアドレス
	 */
	private String email=" ";

	/**
	 * 問い合わせ内容
	 */
	private String comment=" ";

	/**
	 * 実行メソッド　 問い合わせ情報の送信処理をする
	 */
	public String execute() {
		String result = ERROR;


		try {
			if (userName.equals(" ")== true) {

			}
			if(postalCode.equals(" ")== true){
			}

			if(email.equals(" ")== true){

			}
			if(comment.equals(" ")== true){

			}

				result = SUCCESS;
					return result;
			//}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * 問い合わせ者名取得メソッド
	 * @return userName 問い合わせ者名
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 問い合わせ者名格納メソッド
	 * @param userName 問い合わせ者名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * メールアドレス取得メソッド
	 * @return email メールアドレス
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * メールアドレス格納メソッド
	 * @param email メールアドレス
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 問い合わせ内容取得メソッド
	 * @return comment 問い合わせ内容
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * 問い合わせ内容格納メソッド
	 * @param comment 問い合わせ内容
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 *電話番号取得メソッド
	 * @return postalCode 電話番号
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * 電話番号格納メソッド
	 *
	 * @return postalCode 電話番号
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * シリアルID取得メソッド
	 * @param serialversionuid シリアルID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
