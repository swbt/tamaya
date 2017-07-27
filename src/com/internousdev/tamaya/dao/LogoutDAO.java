/**
 *
 */
package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * ログアウトの前にデータベースのlogin_flgをfalseにする
 *
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class LogoutDAO {
	public boolean update(int userId) {
		try (Connection con = new MySqlConnector("openconnect", "root", "mysql").getConnection();) {
			String sql1 = "UPDATE users SET login_flg=FALSE WHERE user_id=?";
			String sql2 = "SELECT login_flg from users WHERE user_id=?";
			PreparedStatement ps = con.prepareStatement(sql1);
			ps.setInt(1, userId);
			ps.executeUpdate();

			ps = con.prepareStatement(sql2);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				// login_flg が false になっていたら成功
				if (!rs.getBoolean("login_flg")) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
