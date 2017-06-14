package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;

	/**
	* カートインサート＆アップデートに関するクラス
	* @author KAORI TAKAHASHI
	* @since 2017/06/14
	*@version 1.0
	*/

public class CartUpdateDAO {

	/**
	*カート商品の数量を更新するメソッド
	* @author KAORI TAKAHASHI
	* @since 2017/06/14
	*@param userId ユーザーID
	*@param quantity 数量
	*@return int 成否を判断する変数
	*/

	public int updateCart(int userId,int quantity){		//※変数：updatecartは必要？
		int updateCount = 0;

		MySqlConnector db = new MySqlConnector("openconnect");
		Connection con = (Connection) db.getConnection();
		//UPDATE a SET b = c WHERE d = e→テーブル(a)に対して、d = eであればbにcをセットする
		String sql ="update carts set quantity=? where user_id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, quantity);
			ps.setInt(2, userId);
			updateCount = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(con!=null){
				try{
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	return updateCount;
	}



}
