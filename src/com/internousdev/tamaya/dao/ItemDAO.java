/**
 *
 */
package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.tamaya.dto.ItemDTO;
import com.internousdev.tamaya.util.DBConnector;

/**
 * @author internousdev
 *商品一覧画面遷移に関するクラス
 */

public class ItemDAO {

	/**
	 * 野菜の種類を取得しリストに格納するメソッド
	 * @return Item アイテム情報
	 */
        public ArrayList<ItemDTO> select(){
        	DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "legmina", "root","mysql");
        	Connection con = db.getConnection();
        	ArrayList<ItemDTO> Item = new ArrayList<ItemDTO>();
        	String sql ="select * from sorts";


        	try{
        		PreparedStatement ps = con.prepareStatement(sql);
        		ResultSet rs = ps.executeQuery();
        		while(rs.next()){
        			ItemDTO dto = new ItemDTO();;
        			dto.setItemGenre(rs.getString("sorts")); //種類
        			dto.setSortId(rs.getInt("sort_id")); //種類ID
        			dto.setImgPath(rs.getString("sort_img")); //イメージパス
        			Item.add(dto);
        		}
        	}catch(SQLException e){
        		e.printStackTrace();
        	}finally{
        	try{
        		con.close();
        	}catch(SQLException e){
        		e.printStackTrace();
        	}
        	}
        	return Item;
        	}
}