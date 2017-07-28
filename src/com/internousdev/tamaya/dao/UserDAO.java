package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.tamaya.dto.UserDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * MySQL にアクセスし、ユーザー情報をやり取りする
 *
 * @author TAKAHIRO ADACHI
 * @since 1.0
 */
public class UserDAO {
	/**
	 * MySQL にアクセスし、メールアドレス, password でユーザーを認証。該当するユーザーの情報を取得し、login_flg を true にする
	 *
	 * @author TAKAHIRO ADACHI
	 * @param email メールアドレス
	 * @param password パスワード
	 * @return ユーザー情報
	 * @throws SQLException
	 * @since 1.0
	 */
	public UserDTO login(String email, String password) throws SQLException {
		UserDTO dto = new UserDTO();
		try (Connection con = new MySqlConnector("openconnect").getConnection();) {
			String sql1 = "SELECT user_id, user_flg FROM users WHERE phone_email = ? AND password = ?";

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
			throw e;
		}
		return dto;
	}
	/**
	 * MySQL にアクセスし、該当のユーザーの login_flg を false にする
	 *
	 * @author Takahiro Adachi
	 * @param userId ユーザーID
	 * @return 成功したかどうか
	 * @since 1.0
	 */
	public boolean logout(int userId) {
		try (Connection con = new MySqlConnector("openconnect").getConnection();) {
			String sql1 = "UPDATE users SET login_flg = FALSE WHERE user_id=?";
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

	/**
	 * MySQL にアクセスし、マイページに表示するユーザー情報を取得する
	 *
	 * @param userId ユーザーID
	 * @return ユーザー情報
	 * @since 1.0
	 */
	public UserDTO getMyPage(int userId) {
		UserDTO user = new UserDTO();
		try (Connection con = new MySqlConnector("openconnect").getConnection();) {
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
			return null;
		}
		return user;
	}

}
