package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.tamaya.dto.CartDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

public class CartDAO {
	public ArrayList<CartDTO> getCart(int userId) throws SQLException {
		ArrayList<CartDTO> cart = new ArrayList<CartDTO>();

		try (Connection con = new MySqlConnector("tamaya").getConnection();) {
			String sql = ""
					+"SELECT i.*, quantity, tax_rate FROM ( "
					+	"SELECT item_id, quantity FROM carts WHERE user_id = ? "
					+") AS c "
					+"INNER JOIN ( "
					+	"SELECT item_id, item_name, base_price, tax_type_id, stocks, img_path FROM items "
					+") AS i "
					+"ON c.item_id = i.item_id "
					+"INNER JOIN ("
					+	"SELECT tax_type_id, tax_rate FROM taxs WHERE begin_on < NOW() AND NOW() < end_on "
					+") AS t "
					+"ON i.tax_type_id = t.tax_type_id; ";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				CartDTO dto = new CartDTO();
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setBasePrice(rs.getBigDecimal("base_price"));
				dto.setTaxRate(rs.getBigDecimal("tax_rate"));
				dto.setStocks(rs.getInt("stocks"));
				dto.setImgPath(rs.getString("img_path"));
				dto.setQuantity(rs.getInt("quantity"));
				dto.calc();
				cart.add(dto);
			}
		}
		return cart;
	}
}
