/**
 *
 */
package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.tamaya.dto.ItemDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * @author Takahiro Adachi
 * @since 1.0
 */
public class ItemDetailDAO {

	/**
	 * 商品詳細をデータベースから取得するメソッド
	 * @author Takahiro Adachi
	 * @since 1.0
	 */
	public ItemDTO getItemDetail(int itemId) {
		ItemDTO dto = new ItemDTO();
		try (Connection con = new MySqlConnector("tamaya").getConnection();) {
			String sql = ""
					+"SELECT item_id, item_name, category, base_price, tax_rate, stocks, item_detail, img_path FROM( "
					+	"SELECT item_id, item_name, category, base_price, tax_type_id, stocks, item_detail, img_path "
					+	"FROM items WHERE item_id = ? "
					+") AS i "
					+"INNER JOIN ( "
					+	"SELECT tax_type_id, tax_rate FROM taxs WHERE begin_on < NOW() AND NOW() < end_on "
					+") AS t "
					+"ON i.tax_type_id = t.tax_type_id; ";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, itemId);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setCategory(rs.getString("category"));
				dto.setBasePrice(rs.getBigDecimal("base_price"));
				dto.setTaxRate(rs.getBigDecimal("tax_rate"));
				dto.setStocks(rs.getInt("stocks"));
				dto.setItemDetail(rs.getString("item_detail"));
				dto.setImgPath(rs.getString("img_path"));
				dto.calc();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}
}