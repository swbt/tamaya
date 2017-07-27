package com.internousdev.tamaya.dao;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

import com.internousdev.tamaya.util.ExchangeRate;
import com.internousdev.util.db.mysql.MySqlConnector;

public class ExchangeDAO {
	public BigDecimal getRateFromJPY(String currencyCode) throws SQLException {
		try (Connection con = new MySqlConnector("tamaya").getConnection();) {
			String sql = "SELECT rate FROM exchanges WHERE currency_code = ?; ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, currencyCode);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				return rs.getBigDecimal("rate");
			}
		}
		return null;
	}

	public String updateRateFromJPY() throws SQLException, IOException {
		Date now = new Date();
		Date modifiedAt;
		Map<String, String> exchangeRates;

		try (Connection con = new MySqlConnector("tamaya").getConnection();) {
			String sql1 = "SELECT MAX(modified_at) AS modified_at FROM exchanges; ";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql1);
			if (rs.next()) {
				modifiedAt = rs.getTimestamp("modified_at");
				if (modifiedAt == null || now.getTime() - modifiedAt.getTime() > 1000 * 60 * 60 * 24) {
					exchangeRates = ExchangeRate.download();

					String sql2 = "REPLACE INTO exchanges(currency_code, rate) VALUE(?, ?); ";
					PreparedStatement ps = con.prepareStatement(sql2);
					for (Entry<String, String> entry : exchangeRates.entrySet()) {
						if (entry.getKey().length() == 3) {
							String currencyCode = entry.getKey();
							BigDecimal rate = new BigDecimal(entry.getValue());
							ps.setString(1, currencyCode);
							ps.setBigDecimal(2, rate);
							ps.executeQuery();
						}
					}
				}
			}
		}
		return null;
	}
}
