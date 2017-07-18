/**
 *
 */
package com.internousdev.tamaya.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class TaxDAO {

	public BigDecimal getTaxRate() throws SQLException{
		try(Connection con = new MySqlConnector("tamaya").getConnection();) {
			String sql = "SELECT * FROM taxs WHERE begin_on < NOW() AND NOW() < end_on";

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()){
				return rs.getBigDecimal("tax_rate");
			}
		}
		return null;
	}
}