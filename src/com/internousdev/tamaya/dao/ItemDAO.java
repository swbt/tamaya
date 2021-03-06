/**
 *
 */
package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.internousdev.tamaya.dto.ItemDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * MySQL にアクセスし、商品に関する情報を取得するためのクラス
 *
 * @author TAKAHIRO ADACHI
 * @since 1.0
 */
public class ItemDAO {
	/**
	 * 販売数が多い順に商品を指定した数だけ取得する
	 *
	 * @author TAKAHIRO ADACHI
	 * @param limit 取得する件数
	 * @return 商品リスト
	 * @since 1.0
	 */
	public ArrayList<ItemDTO> getRanking(int limit) throws SQLException {
		ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();

		try (Connection con = new MySqlConnector("tamaya").getConnection();) {
			String sql = ""
					+"SELECT i.*, tax_rate FROM ("
					+	"SELECT item_id, item_name, base_price, tax_type_id, stocks, sales, category, img_path "
					+	"FROM items "
					+") AS i "
					+"INNER JOIN ("
					+	"SELECT tax_type_id, tax_rate FROM taxs WHERE begin_on < NOW() AND NOW() < end_on "
					+") AS t "
					+"ON i.tax_type_id = t.tax_type_id "
					+"ORDER BY sales DESC LIMIT ?; ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, limit);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ItemDTO dto = new ItemDTO();
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setCategory(rs.getString("category"));
				dto.setBasePrice(rs.getBigDecimal("base_price"));
				dto.setTaxRate(rs.getBigDecimal("tax_rate"));
				dto.setStocks(rs.getInt("stocks"));
				dto.setSales(rs.getInt("sales"));
				dto.setImgPath(rs.getString("img_path"));
				dto.calc();
				itemList.add(dto);
			}
		}
		return itemList;
	}

	/**
	 * 販売数が多い順に商品を全て取得する
	 *
	 * @author TAKAHIRO ADACHI
	 * @return 商品リスト
	 * @since 1.0
	 */
	public ArrayList<ItemDTO> getAllItem() throws SQLException {
		ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();

		try (Connection con = new MySqlConnector("tamaya").getConnection();) {
			String sql = ""
					+"SELECT i.*, tax_rate FROM ("
					+	"SELECT item_id, item_name, base_price, tax_type_id, stocks, sales, category, img_path "
					+	"FROM items "
					+") AS i "
					+"INNER JOIN ("
					+	"SELECT tax_type_id, tax_rate FROM taxs WHERE begin_on < NOW() AND NOW() < end_on "
					+") AS t "
					+"ON i.tax_type_id = t.tax_type_id "
					+"ORDER BY sales DESC; ";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				ItemDTO dto = new ItemDTO();
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setCategory(rs.getString("category"));
				dto.setBasePrice(rs.getBigDecimal("base_price"));
				dto.setTaxRate(rs.getBigDecimal("tax_rate"));
				dto.setStocks(rs.getInt("stocks"));
				dto.setSales(rs.getInt("sales"));
				dto.setImgPath(rs.getString("img_path"));
				dto.calc();
				itemList.add(dto);
			}
		}
		return itemList;
	}

	/**
	 * 対象のカテゴリーの商品を販売数が多い順に全て取得する
	 *
	 * @author TAKAHIRO ADACHI
	 * @param category カテゴリー
	 * @return 商品リスト
	 * @since 1.0
	 */
	public ArrayList<ItemDTO> searchByCategory(String category) throws SQLException {
		ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();

		try (Connection con = new MySqlConnector("tamaya").getConnection();) {
			String sql = ""
					+"SELECT i.*, tax_rate FROM ("
					+	"SELECT item_id, item_name, base_price, tax_type_id, stocks, sales, category, img_path "
					+	"FROM items WHERE category = ? "
					+") AS i "
					+"INNER JOIN ("
					+	"SELECT tax_type_id, tax_rate FROM taxs WHERE begin_on < NOW() AND NOW() < end_on "
					+") AS t "
					+"ON i.tax_type_id = t.tax_type_id "
					+"ORDER BY sales DESC; ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, category);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ItemDTO dto = new ItemDTO();
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setCategory(rs.getString("category"));
				dto.setBasePrice(rs.getBigDecimal("base_price"));
				dto.setTaxRate(rs.getBigDecimal("tax_rate"));
				dto.setStocks(rs.getInt("stocks"));
				dto.setSales(rs.getInt("sales"));
				dto.setImgPath(rs.getString("img_path"));
				dto.calc();
				itemList.add(dto);
			}
		}
		return itemList;
	}

	/**
	 * 対象の価格帯の商品を販売数が多い順に全て取得する
	 *
	 * @author TAKAHIRO ADACHI
	 * @param category カテゴリー
	 * @return 商品リスト
	 * @since 1.0
	 */
	public ArrayList<ItemDTO> searchByPriceRange(int priceRange) throws SQLException {
		ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
		int minPrice, maxPrice;
		int priceRange1 = 500;
		int priceRange2 = 1000;
		int priceRange3 = 5000;
		switch (priceRange) {
		case 1:
			minPrice = 0;
			maxPrice = priceRange1;
			break;
		case 2:
			minPrice = priceRange1;
			maxPrice = priceRange2;
			break;
		case 3:
			minPrice = priceRange2;
			maxPrice = priceRange3;
			break;
		case 4:
			minPrice = priceRange3;
			maxPrice = 1000000;
			break;
		default:
			minPrice = 0;
			maxPrice = 0;
		}

		try (Connection con = new MySqlConnector("tamaya").getConnection();) {
			String sql = ""
					+"SELECT i.*, tax_rate FROM ("
					+	"SELECT item_id, item_name, base_price, tax_type_id, stocks, sales, category, img_path "
					+	"FROM items "
					+	"WHERE base_price >= ? / (1 + (SELECT max(tax_rate) FROM taxs)) AND base_price < ? "
					+") AS i "
					+"INNER JOIN ("
					+	"SELECT tax_type_id, tax_rate FROM taxs WHERE begin_on < NOW() AND NOW() < end_on "
					+") AS t "
					+"ON i.tax_type_id = t.tax_type_id "
					+"WHERE base_price >= ? / (1 + tax_rate) AND base_price < ? / (1 + tax_rate) "
					+"ORDER BY sales DESC ; ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, minPrice);
			ps.setInt(2, maxPrice);
			ps.setInt(3, minPrice);
			ps.setInt(4, maxPrice);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ItemDTO dto = new ItemDTO();
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setCategory(rs.getString("category"));
				dto.setBasePrice(rs.getBigDecimal("base_price"));
				dto.setTaxRate(rs.getBigDecimal("tax_rate"));
				dto.setStocks(rs.getInt("stocks"));
				dto.setSales(rs.getInt("sales"));
				dto.setImgPath(rs.getString("img_path"));
				dto.calc();
				itemList.add(dto);
			}
		}
		return itemList;
	}
	/**
	 * MySQLにアクセスし、対象の商品の詳細を取得する
	 * @author TAKAHIRO ADACHI
	 * @param itemId 商品ID
	 * @return 商品情報
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
