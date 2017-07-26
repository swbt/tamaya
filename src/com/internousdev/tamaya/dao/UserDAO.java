package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.tamaya.dto.UserDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

public class UserDAO {
	public UserDTO getMyPage(int userId) {
		UserDTO user = new UserDTO();
		try (Connection con = new MySqlConnector("openconnect","root","mysql").getConnection();) {
			String sql = "SELECT * FROM users WHERE user_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				user.setUserId(rs.getInt("user_id"));

				user.setFamilyNameKanji(rs.getString("family_name_kanji"));

				user.setGivenNameKanji(rs.getString("given_name_kanji"));

				user.setPostal(rs.getString("postal"));

				user.setAddress(rs.getString("address"));

				user.setEmail(rs.getString("phone_email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}
