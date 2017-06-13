/**
 *
 */
package com.internousdev.tamaya.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *問い合わせ情報を表示するアクションクラス
 */
public class AdminContactAction extends ActionSupport{


	/**
	 * 問い合わせ項目検索
	 */
	private String searchTitle = "";

	/**
	 * 名前検索
	 */
	private String searchName = "";

	/**
	 * 問い合わせ項目
	 */
	private String  title;

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


	/**
	 *	1ページに表示する上限(初期値10コ分)
	 */
	private int pageLimit =10;

	/**
	 *	ページネーションの左側のボタンの数
	 */
	//private int leftPage;

	/**
	 *	ページネーションの右側のボタンの数
	 */
	//private int rightPage;




	/**
	 * 実行メソッド DAOから指定した範囲の問い合わせ情報を取得する
	 * @author Soshi Azuma
	 * @since 2017/05/22
	 * @return result 問い合わせ情報の取得に成功したらSUCCESS,失敗したらERROR

public String execute(){
		String result = ERROR;
		AdminContactDAO dao = new AdminContactDAO();

	if(searchName != null || searchTitle != null) {

		selectList = dao.selectMongo(searchTitle, searchName, searchSort);



		pageCount = selectList.size()/pageLimit;
		if(selectList.size()%pageLimit != 0){
			pageCount++;
		}
		arrayPageCount =new int[pageCount];
		for(int i=0;i<pageCount;i++){
			arrayPageCount[i] = i+1;
		}
		int rowNumber = pageLimit * currentPage;
		for(int j=0 ; j < selectList.size() ; j++){
			if( j >= rowNumber){
				ContactHistoryDTO dto = selectList.get(j);
				displayList.add(dto);
			}
			if( displayList.size()==pageLimit){
				break;
			}
		}
		if(currentPage==pageCount-1){
			leftPage=4;
			rightPage=0;
		}else if(currentPage==pageCount-2){
			leftPage=3;
			rightPage=1;
		}else if(currentPage==0){
			leftPage=0;
			rightPage=4;
		}else if(currentPage==1){
			leftPage=1;
			rightPage=3;
		}else{
			leftPage=2;
			rightPage=2;
		}
		result=SUCCESS;
	}
	return result;
}
*/
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



	/**
	 * 1ページに表示する上限取得メソッド
	 * @return pageLimit　1ページに表示する上限
	 */
	public int getPageLimit() {
		return pageLimit;
	}

	/**
	 * 1ページに表示する上限格納メソッド
	 * @param pageLimit セットする pageLimit
	 */
	public void setPageLimit(int pageLimit) {
		this.pageLimit = pageLimit;
	}


}

