/**
 *
 */
package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.tamaya.dto.UserDTO;
import com.internousdev.tamaya.util.MySQLConnector;

/**
 * ログアウトの前にデータベースのlogin_flgをfalseにする
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class LogoutDAO {
	public void update(int userId){
		Connection con = new MySQLConnector().getConnection("openconnect");
		UserDTO dto = new UserDTO();
		String sql1 = "UPDATE users SET login_flg=FALSE WHERE user_id=?";
		String sql2 = "SELECT login_flg from users WHERE user_id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql1);
			ps.setInt(1, userId);
			//excuteUpdate：SQL文を実行し、更新した行数が帰ってくる
			ps.executeUpdate();

			ps = con.prepareStatement(sql2);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				dto.setLoginFlg(rs.getBoolean("login_flg"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		try{
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
