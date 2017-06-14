package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;


/**
 * カートテーブル内情報の削除に関するクラス
 * @author KAORI TAKAHASHI
 * @since 2017/06/14
 * @version 1.0
 */
public class CartDeleteDAO {

	/**
	 * カート内の商品を削除するメソッド
	 * @author KAORI TAKAHASHI
	 * @since 2017/06/14
	 * @version 1.0
	 * @param userId ユーザーID
	 * @return delCount 削除する件数
	 */

	public int delete(int userId){
		int delCount = 0;
		Connection con = new MySqlConnector("openconnect").getConnection();
		String sql1 = "delete from carts where user_id=? and cart_id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql1);
			ps.setInt(1, userId);
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
