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
	 * 表示したい商品を、DBから取り出しDTOへ転送する為のクラス
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
	 * 表示メソッド  表示したい商品を、DBから取り出しDTOへ転送する為のメソッド
	 */
	public ArrayList<AdminItemDTO> select(String itemList) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "tamaya", "root","mysql");
		Connection con = null;
		con = db.getConnection();
		String sql = "select @num :=@num + 1 as no, items.* from (select @num := 0) as no, items where is_deleted!=1";

		try {

			PreparedStatement ps = null;
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				AdminItemDTO dto = new AdminItemDTO();
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));

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
	public int update(int item_id, String itemName) {

		int count = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "tamaya", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql = "UPDATE items SET itemName = ?, where item_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, item_id);
			ps.setString(2, itemName);
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
	 * 商品画面から受け取ったタイトルの追加情報を、DBへ転送し、反映する為のメソッド
	 */
	public int insert(int item_id, String itemName) {

		int count = 0 ;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","tamaya","root","mysql");
		Connection conn = db.getConnection();
		String sql = "INSERT INTO items(item_id, item_name)VALUES(?, ?, ?, ?, ?, ?)";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,item_id);
			ps.setString(2,itemName);

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
	    * 削除メソッド DBのitem_statusの情報を変更する為のメソッド
	    */
	public int delete(int itemId,String itemName){

		int count =0 ;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","tamaya","root","mysql");
		Connection conn = db.getConnection();

		String sql = "update items set is_deleted=1 where item_Id = ?";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, itemId);
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
