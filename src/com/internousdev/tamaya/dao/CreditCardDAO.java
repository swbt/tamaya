package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.tamaya.dto.CreditCardDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * MySQLにアクセスし、クレジットカードに関するデータをやり取りする
 *
 * @author Takahiro Adachi
 * @since 1.0
 */
public class CreditCardDAO {
	/**
	 * MySQLにアクセスし、検証済みのクレジットカード情報を tamaya.credit_cards テーブルに登録する
	 */
	public void register(int userId, int creditBrand, String creditNumber, String nameE, String securityCode,
			int expirationYear, int expirationMonth) throws SQLException {
		try (Connection con = new MySqlConnector("tamaya").getConnection();) {
			String sql = "REPLACE INTO credit_cards VALUES (?, ?, ?, ?, ?, ?, ?); ";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setInt(2, creditBrand);
			ps.setString(3, creditNumber);
			ps.setString(4, nameE);
			ps.setString(5, securityCode);
			ps.setInt(6, expirationYear);
			ps.setInt(7, expirationMonth);
			ps.executeUpdate();
		}
	}

	/**
	 * MySQLにアクセスし、該当するユーザーのクレジットカード情報を tamaya.credit_cards テーブルから取得する
	 */
	public CreditCardDTO getCreditCard(int userId) {
		CreditCardDTO dto = new CreditCardDTO();
		try (Connection con = new MySqlConnector("tamaya").getConnection();) {
			String sql = "SELECT * FROM credit_cards WHERE user_id = ?; ";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				dto.setCreditBrand(rs.getInt("credit_brand"));
				dto.setCreditNumber(rs.getString("credit_number"));
				dto.setNameE(rs.getString("name_e"));
				dto.setSecurityCode(rs.getString("security_code"));
				dto.setExpirationYear(rs.getInt("expiration_year"));
				dto.setExpirationMonth(rs.getInt("expiration_month"));
			}
			return dto;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
