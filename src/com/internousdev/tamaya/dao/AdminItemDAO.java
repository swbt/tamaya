package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.tamaya.dto.AdminItemDTO;
import com.internousdev.util.DBConnector;

	public class AdminItemDAO {
	/**
	 * 商品情報を取得しリストに格納するメソッド
	 * @param itemsName 商品名
	 * @return itemList 商品情報
	 * @author Kaori Takahashi
	 * @since 2017/07/18
	 * @version 1.0
	 */

	ArrayList<AdminItemDTO> displayList = new ArrayList<AdminItemDTO>();

	/**
	 * 検索結果情報をリスト化して抽出し、DTOに格納する
	 */
	ArrayList<AdminItemDTO> itemList = new ArrayList<AdminItemDTO>();



	/**
	 * 表示メソッド  表示したい内容を、DBから取り出しDTOへ転送する為のメソッド
	 */
	public ArrayList<AdminItemDTO> select(String itemList) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "tamaya", "root","mysql");
		Connection con = null;
		con = db.getConnection();
		String sql = "select @num :=@num + 1 as no, items.* from (select @num := 0) as no, items where status_flg!=1";
		if (!itemList.equals("")) {
			sql = sql + " " + "and title like \"%" + itemList + "%\"";
		}
		sql = sql + " " + "order by title";

		try {

			PreparedStatement ps = null;
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();


			while (rs.next()) {
				AdminItemDTO dto = new AdminItemDTO();
				dto.setBookId(rs.getInt("book_id"));
				dto.setTitle(rs.getString("title"));
				dto.setSubTitle(rs.getString("sub_title"));
				dto.setAuthor(rs.getString("author"));
				dto.setPublisher(rs.getString("publisher"));
				dto.setPubDay(rs.getString("publish_day"));
				dto.setInitial(rs.getString("initial"));
				dto.setStatusFlg(rs.getString("status_flg"));
				dto.setRegDay(rs.getString("regist_day"));
				dto.setUpdDay(rs.getString("updated_day"));
				dto.setNo(rs.getInt("no"));


				displayList.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return displayList;
	}



		/**
	    * 更新情報を、DBへ転送し、更新する為のメソッド
	    */
	public int update(String title, String subTitle, String author, String publisher, String pubDay, String statusFlg, int book_id) {

		int count = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "tamaya", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql = "UPDATE items SET title = ?, sub_title = ?, author = ?, publisher = ?, publish_day = ?, status_flg =? where book_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, subTitle);
			ps.setString(3, author);
			ps.setString(4, publisher);
			ps.setString(5, pubDay);
			ps.setString(6, statusFlg);
			ps.setInt(7, book_id);
			count =ps.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}

		return count;
	}

	/**
	 * 書籍画面から受け取ったタイトルの追加情報を、DBへ転送し、反映する為のメソッド
	 */
	public int insert(String title, String subTitle, String author, String publisher, String pubDay, String initial) {

		int count = 0 ;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","tamaya","root","mysql");
		Connection conn = db.getConnection();
		String sql = "INSERT INTO items(title, sub_title, author, publisher, publish_day, initial)VALUES(?, ?, ?, ?, ?, ?)";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,title);
			ps.setString(2,subTitle);
			ps.setString(3,author);
			ps.setString(4,publisher);
			ps.setString(5,pubDay);
			ps.setString(6,initial);

			count = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;

	}



		/**
	    * 削除メソッド DBのbook_statusの情報を変更する為のメソッド
	    */
	public int delete(int bookId){

		int count =0 ;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","tamaya","root","mysql");
		Connection conn = db.getConnection();

		String sql = "update items set status_flg=1 where book_Id = ?";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, bookId);
			count = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		return count;
	}





/**	public ArrayList<ItemDTO> select(String itemName){
		MySqlConnector db=new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "tamaya", "root","mysql");
		Connection con=db.getConnection();

		ArrayList<ItemDTO> itemList=new ArrayList<ItemDTO>();
		int k=0;
		String sql;

		if(itemName.equals("") || itemName==null){
			sql="select * from item where del_key = false";
		}else{
			sql="select * from item where item_name= ? and del_key= false";
			k=1;
		}




		try{
			PreparedStatement ps= con.prepareStatement(sql);
			if(k==1){
				ps.setString(1,itemName);
			}
			ResultSet rs=ps.executeQuery();

			while (rs.next()) {
				ItemDTO dto= new ItemDTO();

				dto.setItemId(rs.getInt("item_id"));

				dto.setItemName(rs.getString("item_name"));

				dto.setPriceWithTax(rs.getBigDecimal("price"));

				dto.setStocks(rs.getInt("stocks"));

				dto.setSales(rs.getInt("sales"));

				dto.setItemDetail(rs.getString("item_detail"));

				dto.setImgPath(rs.getString("img_path"));

				dto.setSortId(rs.getInt("sort_id"));

				//dto.setCreatedAt(rs.getString("created_at"));

				//dto.setUpdatedAt(rs.getString("updated_at"));

				//dto.setDelKey(rs.getBoolean("del_key"));

				switch(dto.getSortId()){
				case 1:dto.setItemGenre("temoti"); break;
				case 2:dto.setItemGenre("hunsyutu"); break;
				case 3:dto.setItemGenre("utiage"); break;
				case 4:dto.setItemGenre("sonota"); break;
				case 5:dto.setItemGenre("tokusyu"); break;
				}

				itemList.add(dto);
			}

			rs.close();
			ps.close();
			con.close();


		}catch (SQLException e){
			e.printStackTrace();
		}



		return itemList;
	}
**/

}
