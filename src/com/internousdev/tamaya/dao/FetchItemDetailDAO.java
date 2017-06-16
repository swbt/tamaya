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
public class FetchItemDetailDAO {

	public ItemDTO select(int itemId){
		Connection con = new MySqlConnector("tamaya").getConnection();
		ItemDTO dto = new ItemDTO();
		String sql = "SELECT * FROM items where item_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, itemId);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setCategory(rs.getString("category"));
				dto.setPriceWithTax((rs.getBigDecimal("price").multiply(ItemDTO.getTax().add(BigDecimal.ONE))).setScale(0, BigDecimal.ROUND_DOWN));
				dto.setStocks(rs.getInt("stocks"));
				dto.setSales(rs.getInt("sales"));
				dto.setItemDetail(rs.getString("item_detail"));
				dto.setImgPath(rs.getString("img_path"));
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
}