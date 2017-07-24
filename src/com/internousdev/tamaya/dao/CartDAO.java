package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.tamaya.dto.CartDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

public class CartDAO {
	public ArrayList<CartDTO> getCart(int userId) {
		ArrayList<CartDTO> cart = new ArrayList<CartDTO>();
		
		try (Connection con = new MySqlConnector("tamaya").getConnection();) {
			String sql = ""
					+"SELECT i.*, quantity FROM ( "
					+	"SELECT item_id, quantity FROM carts WHERE user_id = ? "
					+") AS c "
					+"INNER JOIN ( "
					+	"SELECT item_id, item_name, price, stocks, img_path FROM items "
					+") AS i "
					+"ON c.item_id = i.item_id; ";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				CartDTO dto = new CartDTO();
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setPrice(rs.getBigDecimal("price"));
				dto.setImgPath(rs.getString("img_path"));
				dto.setQuantity(rs.getInt("quantity"));
				cart.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cart;
	}
}
