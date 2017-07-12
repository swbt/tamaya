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
	 * @author YUKO TSUJI
	 * @since 2017/07/12
	 * @version 1.0
	 * @param userId ユーザーID
	 * @return delCount 削除する件数
	 */

	public int delete(int userId,int itemId){
		int delCount = 0;
		Connection con = new MySqlConnector("tamaya").getConnection();
		String sql1 = "delete from carts where user_id=?";
		if(itemId !=0){
			sql1 = "delete from carts where user_id=? &&item_id=?";
		}
		try{

			PreparedStatement ps = con.prepareStatement(sql1);
			ps.setInt(1, userId);
			ps.setInt(2, itemId );
			delCount = ps.executeUpdate();
			System.out.println(delCount + "やりましたよ");
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
