package com.internousdev.tamaya.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

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
		DBConnecter db = new DBConnecter("com.mysql.jdbc.Driver","jdbc:mysql:localhost/","root","mysql");
		Connection con = db.getConnection();
		String sql = "delete fromcart whrere user_id=?";	//user_id
		try{
			PreparedStatement ps =con.clientPrepareStatement(sql);
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
		return delete;
	}

}