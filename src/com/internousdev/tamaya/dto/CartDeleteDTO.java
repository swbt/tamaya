package com.internousdev.tamaya.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * カートテーブル内情報の削除に関するクラス
 * @author KAORI TAKAHASHI
 * @since 2017/06/12
 * @version 1.0
 */
public class CartDeleteDTO {

	/**
	 * カート内の商品を削除するメソッド
	 * @author KAORI TAKAHASHI
	 * @since 2017/06/12
	 * @version 1.0
	 * @param userId ユーザーID
	 * @return delete 商品削除
	 */

	public int delete(int userId,int cartId) {
		int delCount = 0;
		Connection con = new MySqlConnector("tamaya","root","mysql").getConnection();
//		Connection con = new MySQLConnector().getConnection("tamaya");
		String sql = "delete fromcart whrere user_id=?";	//user_id
		try{
			PreparedStatement ps =con.prepareStatement(sql);
			ps.setInt(1,userId);
			delCount = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return delCount;
	}

}