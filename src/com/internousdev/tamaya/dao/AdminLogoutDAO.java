package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.tamaya.dto.LoginDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

public class AdminLogoutDAO {
	public void update(String email){
		Connection con = new MySqlConnector("openconnect","root","mysql").getConnection();

		LoginDTO dto = new LoginDTO();
		String sql1 = "UPDATE users SET login_flg=FALSE WHERE phone_email=?";
		String sql2 = "SELECT login_flg from users WHERE phone_email=?";

		try{
			PreparedStatement ps=con.prepareStatement(sql1);
			ps.setString(1,email);
			ps.executeQuery();


			ps = con.prepareStatement(sql2);
			ps.setString(1, email);
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