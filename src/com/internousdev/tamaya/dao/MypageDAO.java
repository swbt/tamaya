/**
 *
 */
package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.tamaya.dto.MypageDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * Mypageに関するクラス
 * @author Kaburagi Kenichi
 * @since 2017/06/14
 * @version 1.0
 */
public class MypageDAO {
	/**
	 * UserIDでMypageに必要な情報を取得しリストに格納するメソッド
	 * @param userId ユーザーID
	 * @return UserList ユーザー情報
	 * @author Kenichi Kaburagi
	 * @since 2017/06/14
	 * @version 1.0
	 */
	public ArrayList<MypageDTO> select(int userId) {
		Connection con = new MySqlConnector("openconnect","root","mysql").getConnection();

		MypageDTO dto = new MypageDTO();
		ArrayList<MypageDTO> userList = new ArrayList<MypageDTO>();

		String sql = "select * from users where user_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				dto.setUserName(rs.getString("user_name"));

				dto.setPostalCode(rs.getString("postalcode"));

				dto.setUserAddress(rs.getString("userAddress"));

				dto.setEmail(rs.getString("email"));

				dto.setHistoryId(rs.getInt("historyid"));

				dto.setPhoneNumber(rs.getString("phone_number"));



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
