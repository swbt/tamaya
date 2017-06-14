package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.tamaya.dto.ItemDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

	public class AdminItemDAO {
	/**
	 * 商品情報を取得しリストに格納するメソッド
	 * @param itemsName 商品名
	 * @return itemList 商品情報
	 * @author Ryo Maeda
	 * @since 2017/05/18
	 * @version 1.0
	 */
	public ArrayList<ItemDTO> select(String itemName){
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

				dto.setPrice(rs.getBigDecimal("price"));

				dto.setStocks(rs.getInt("stocks"));

				dto.setSales(rs.getInt("sales"));

				dto.setItemDetail(rs.getString("item_detail"));

				dto.setImgPath(rs.getString("img_path"));

				dto.setSortId(rs.getInt("sort_id"));

				dto.setCreatedAt(rs.getString("created_at"));

				dto.setUpdatedAt(rs.getString("updated_at"));

				dto.setDelKey(rs.getBoolean("del_key"));

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

}
