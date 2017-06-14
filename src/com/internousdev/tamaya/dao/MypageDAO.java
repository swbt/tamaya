package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.tamaya.dto.MypageDTO;
import com.internousdev.tamaya.util.DBConnector;

/**
 * Mypageに関するクラス
 * @author
 * @since
 * @version 1.0
 */
public class MypageDAO {
	/**
	 * UserIDでMypageに必要な情報を取得しリストに格納するメソッド
	 * @param userId ユーザーID
	 * @return UserList ユーザー情報
	 * @author Miyauchi Akitomo
	 * @since 2017/05/15
	 * @version 1.0
	 */
	public ArrayList<MypageDTO> select(int userId) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		MypageDTO dto = new MypageDTO();
		ArrayList<MypageDTO> userList = new ArrayList<MypageDTO>();

		String sql = "select * from users where user_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				dto.setUserId(rs.getInt("user_id"));

				dto.setFamilyNameKanji(rs.getString("family_name_kanji"));

				dto.setGivenNameKanji(rs.getString("given_name_kanji"));

				dto.setSex(rs.getString("sex"));

				dto.setBirthday(rs.getString("birthday"));

				dto.setPhoneNumber(rs.getString("phone_number"));

				dto.setPhoneEmail(rs.getString("phone_email"));

				dto.setPostal(rs.getString("postal"));

				dto.setAddress(rs.getString("address"));

				dto.setPassword(rs.getString("password"));

				userList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return userList;

	}

}
