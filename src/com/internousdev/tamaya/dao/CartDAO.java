package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.tamaya.dto.CartDTO;
import com.internousdev.tamaya.dto.ItemDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * MySQL にアクセスし、カートに関する情報をやり取りする
 * @author TAKAHIRO ADACHI
 * @since 1.0
 */
public class CartDAO {
	/**
	 * MySQL にアクセスし、対象のユーザーのカートを取得する
	 * @author TAKAHIRO ADACHI
	 * @param userId ユーザーID
	 * @return カート
	 * @throws SQLException
	 * @since 1.0
	 */
	public CartDTO getCart(int userId) throws SQLException {
		CartDTO cart = new CartDTO();
		ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();

		try (Connection con = new MySqlConnector("tamaya").getConnection();) {
			String sql1 = ""
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

			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setInt(1, userId);
			ResultSet rs1 = ps1.executeQuery();

			while (rs1.next()) {
				ItemDTO item = new ItemDTO();
				item.setItemId(rs1.getInt("item_id"));
				item.setItemName(rs1.getString("item_name"));
				item.setBasePrice(rs1.getBigDecimal("base_price"));
				item.setTaxRate(rs1.getBigDecimal("tax_rate"));
				item.setStocks(rs1.getInt("stocks"));
				item.setImgPath(rs1.getString("img_path"));
				item.setQuantity(rs1.getInt("quantity"));
				item.calc();
				itemList.add(item);
			}
			cart.setItemList(itemList);

			String sql2 = "SELECT MIN(shipping_cost) AS shipping_cost FROM shipping_costs WHERE min_subtotal <= ?";
			PreparedStatement ps2 = con.prepareStatement(sql2);
			ps2.setBigDecimal(1, cart.getSubtotal());
			ResultSet rs2 = ps2.executeQuery();
			if (rs2.next()) {
				cart.setShippingCost(rs2.getBigDecimal("shipping_cost"));
			}
		}

		return cart;
	}

	/**
	 * MySQL にアクセスし、対象のユーザーのカートに商品と数量を追加する
	 * @author TAKAHIRO ADACHI
	 * @param userId ユーザーID
	 * @param itemId 商品ID
	 * @param quantity 数量
	 * @return 成功したかどうか
	 * @since 1.0
	 */
	public boolean addItem(int userId, int itemId, int quantity) {
		try (Connection con = new MySqlConnector("tamaya").getConnection();) {
			String sql = "INSERT INTO carts (user_id, item_id, quantity) VALUES (?, ?, ?) "
					+ "ON DUPLICATE KEY UPDATE quantity = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setInt(2, itemId);
			ps.setInt(3, quantity);
			ps.setInt(4, quantity);
			if (ps.executeUpdate() >= 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * MySQL にアクセスし、対象の商品をカートから取り除く
	 * @author TAKAHIRO ADACHI
	 * @param userId ユーザーID
	 * @param itemId 商品ID
	 * @return 成功したかどうか
	 * @throws SQLException
	 * @since 1.0
	 */
	public boolean removeItem(int userId, int itemId) throws SQLException {
		try (Connection con = new MySqlConnector("tamaya").getConnection();) {
			String sql = "DELETE FROM carts WHERE user_id = ? && item_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setInt(2, itemId);
			if (ps.executeUpdate() >= 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
		return false;
	}

	/**
	 * 対象のユーザーのカートの中身を全て削除する
	 * @author TAKAHIRO ADACHI
	 * @param userId ユーザーID
	 * @return 成功したかどうか
	 * @since 1.0
	 */
	public boolean deleteCart(int userId) {
		// 該当のユーザーのカートを空にする
		try (Connection con = new MySqlConnector("tamaya").getConnection();) {
			String sql = "DELETE FROM carts WHERE user_id = ?; ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			if (ps.executeUpdate() <= 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
