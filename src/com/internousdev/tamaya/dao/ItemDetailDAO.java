/**
 *
 */
package com.internousdev.tamaya.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.tamaya.dto.ItemDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class ItemDetailDAO {

	public ItemDTO select(int itemId){
		TaxDAO tdao = new TaxDAO();
		ItemDTO dto = new ItemDTO();
		try(Connection con = new MySqlConnector("tamaya").getConnection();) {
			BigDecimal taxRate = tdao.getTaxRate();

			String sql = "SELECT * FROM items where item_id = ?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, itemId);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				dto.setTaxRate(taxRate);
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setCategory(rs.getString("category"));
				dto.setPrice(rs.getBigDecimal("price"));
				dto.setStocks(rs.getInt("stocks"));
				dto.setSales(rs.getInt("sales"));
				dto.setItemDetail(rs.getString("item_detail"));
				dto.setImgPath(rs.getString("img_path"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}
}