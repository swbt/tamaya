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
	public UserDTO login(String email, String userPass){
		UserDTO dto = new UserDTO();
		try (Connection con = new MySqlConnector("openconnect").getConnection();) {
			String sql1 = "SELECT * FROM users WHERE phone_email = ? AND password = ?";

			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setString(1, email);
			ps1.setString(2, userPass);
			ResultSet rs1 = ps1.executeQuery();

			if(rs1.next()){
				dto.setUserId(rs1.getInt("user_id"));
				dto.setLoginFlg(rs1.getBoolean("login_flg"));
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

	public void update(int userId){
		Connection con = new MySqlConnector("openconnect","root","mysql").getConnection();
		UserDTO dto = new UserDTO();
		String sql1 = "UPDATE users SET login_flg=TRUE WHERE user_id=?";
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
