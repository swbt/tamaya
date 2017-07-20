
package com.internousdev.tamaya.action;
import java.util.ArrayList;

import com.internousdev.tamaya.dao.AdminContactDAO;
import com.internousdev.tamaya.dto.ContactHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminContactAction extends ActionSupport{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 4111312065627471764L;



	/**
	 * 問い合わせ者名
	 */
	private String userName;

	/**
	 * メールアドレス
	 */
	private String email;

	/**
	 * 問い合わせ内容
	 */
	private String comment;

	/**
	 * 登録日
	 */
	private String dt;

	/**
	 *	問い合わせリスト
	 */
	private ArrayList<ContactHistoryDTO> selectList = new ArrayList<ContactHistoryDTO>();

	/**
	 *	表示する問い合わせリスト
	 */
	private ArrayList<ContactHistoryDTO> displayList = new ArrayList<ContactHistoryDTO>();


	/* * 実行メソッド DAOから指定した範囲の問い合わせ情報を取得する

	 * @return result 問い合わせ情報の取得に成功したらSUCCESS,失敗したらERROR
	 */
public String execute(){
		String result = ERROR;
		AdminContactDAO dao = new AdminContactDAO();

	if(searchName != null || searchTitle != null) {

		selectList = dao.selectMongo(searchTitle, searchName, searchSort);

		}
		result=SUCCESS;
	}
	return result;
}

	/**
	 * 問い合わせ項目検索の取得メソッド
	 * @return searchTitle　問い合わせ項目検索
	 */
	public String getSearchTitle() {
		return searchTitle;
	}

	/**
	 * 問い合わせ項目検索の格納メソッド
	 * @param searchTitle セットする searchTitle
	 */
	public void setSearchTitle(String searchTitle) {
		this.searchTitle = searchTitle;
	}

	/**
	 * 名前検索の取得メソッド
	 * @return searchName　名前検索
	 */
	public String getSearchName() {
		return searchName;
	}

	/**
	 * 名前検索の格納メソッド
	 * @param searchName セットする searchName
	 */
	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

	/**
	 * ソート検索の取得メソッド
	 * @return searchSort　ソート検索
	 */
	public int getSearchSort() {
		return searchSort;
	}

	/**
	 * ソート検索の格納メソッド
	 * @param searchSort セットする searchSort
	 */
	public void setSearchSort(int searchSort) {
		this.searchSort = searchSort;
	}

	/**
	 * 問い合わせ項目取得メソッド
	 * @return title　問い合わせ項目
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 問い合わせ項目格納メソッド
	 * @param title セットする title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 問い合わせ者名取得メソッド
	 * @return userName　問い合わせ者名
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 問い合わせ者名格納メソッド
	 * @param userName セットする userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * メールアドレス取得メソッド
	 * @return email　メールアドレス
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * メールアドレス格納メソッド
	 * @param email セットする email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 問い合わせ内容取得メソッド
	 * @return comment　問い合わせ内容
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * 問い合わせ内容格納メソッド
	 * @param comment セットする comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * 登録日取得メソッド
	 * @return dt　登録日
	 */
	public String getDt() {
		return dt;
	}

	/**
	 * 登録日格納メソッド
	 * @param dt セットする dt
	 */
	public void setDt(String dt) {
		this.dt = dt;
	}

	/**
	 * 問い合わせリスト取得メソッド
	 * @return selectList　問い合わせリスト
	 */
	public ArrayList<ContactHistoryDTO> getSelectList() {
		return selectList;
	}

	/**
	 * 問い合わせリスト格納メソッド
	 * @param selectList セットする selectList
	 */
	public void setSelectList(ArrayList<ContactHistoryDTO> selectList) {
		this.selectList = selectList;
	}

	/**
	 * 表示する問い合わせリスト取得メソッド
	 * @return displayList　表示する問い合わせリスト
	 */
	public ArrayList<ContactHistoryDTO> getDisplayList() {
		return displayList;
	}

	/**
	 * 表示する問い合わせリスト格納メソッド
	 * @param displayList セットする displayList
	 */
	public void setDisplayList(ArrayList<ContactHistoryDTO> displayList) {
		this.displayList = displayList;
	}





}


