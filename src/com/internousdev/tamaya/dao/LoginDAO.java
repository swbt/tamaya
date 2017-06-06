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
 * ユーザーの情報をデータベースから取ってくる
 * データベースのlogin_flgをtrueにする
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class LoginDAO {
	public UserDTO select(String email, String userPass){
		MySQLConnector my = new MySQLConnector();
		Connection con = my.getConnection("openconnect");
		UserDTO dto = new UserDTO();
		String sql = "SELECT * FROM users WHERE phone_email=? AND password=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, userPass);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				dto.setUserId(rs.getInt("user_id"));
				dto.setEmail(rs.getString("phone_email"));
				dto.setUserPass(rs.getString("password"));
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
		return dto;
	}

	public void update(int userId){
		MySQLConnector db = new MySQLConnector();
		Connection con = db.getConnection("openconnect");
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
