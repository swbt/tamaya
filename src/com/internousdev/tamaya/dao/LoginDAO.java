/**
 *
 */
package com.internousdev.tamaya.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.tamaya.dto.UserDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * ユーザーの情報をデータベースから取ってくる
 * データベースのlogin_flgをtrueにする
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class LoginDAO {
	public UserDTO login(String email, String password){
		UserDTO dto = new UserDTO();
		try (Connection con = new MySqlConnector("openconnect").getConnection();) {
			String sql1 = "SELECT * FROM users WHERE phone_email = ? AND password = ?";

			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setString(1, email);
			ps1.setString(2, password);
			ResultSet rs1 = ps1.executeQuery();

			if(rs1.next()){
				dto.setUserId(rs1.getInt("user_id"));
				dto.setUserFlg(rs1.getInt("user_flg"));

			}
			String sql2 = "UPDATE users SET login_flg = TRUE WHERE user_id = ?";
			PreparedStatement ps2 = con.prepareStatement(sql2);
			ps2.setInt(1, dto.getUserId());
			ps2.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return dto;
	}
}
