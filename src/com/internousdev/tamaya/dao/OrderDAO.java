package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.tamaya.dto.CartDTO;
import com.internousdev.tamaya.dto.ItemDTO;
import com.internousdev.tamaya.dto.OrderDTO;
import com.internousdev.util.db.mysql.MySqlConnector;
/**
 * MySQL にアクセスし、注文に関する情報をやり取りする
 * @author TAKAHIRO ADACHI
 * @since 1.0
 */
public class OrderDAO {
	/**
	 * MySQL にアクセスし、注文情報を追加する
	 * @author TAKAHIRO ADACHI
	 * @param userId ユーザーID
	 * @param cart カート
	 * @return 成功したかどうか
	 * @throws SQLException
	 * @since 1.0
	 */
	public boolean order(int userId, CartDTO cart) throws SQLException {
		Connection con = new MySqlConnector("tamaya").getConnection();

		try {
			con.setAutoCommit(false);
			// 注文テーブルにカートの情報を insert する
			String sql1 = "INSERT INTO orders(user_id, shipping_cost, grand_total) VALUES(?, ?, ?); ";
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setInt(1, userId);
			ps1.setBigDecimal(2, cart.getShippingCost());
			ps1.setBigDecimal(3, cart.getGrandTotal());
			if (ps1.executeUpdate() <= 0) {
				con.rollback();
				return false;
			}

			// 注文詳細テーブルに各商品の情報を insert する
			String sql2 = "INSERT INTO order_details(order_id, item_id, price, quantity) VALUES(LAST_INSERT_ID(), ?, ?, ?); ";
			PreparedStatement ps2 = con.prepareStatement(sql2);
			for (int i = 0; i < cart.getItemList().size(); i++) {
				ps2.setInt(1, cart.getItemList().get(i).getItemId());
				ps2.setBigDecimal(2, cart.getItemList().get(i).getPrice());
				ps2.setInt(3, cart.getItemList().get(i).getQuantity());
				if (ps2.executeUpdate() <= 0) {
					con.rollback();
					return false;
				}
			}
			con.commit();
			return true;
		} catch(SQLException e) {
			con.rollback();
			throw e;
		} finally {
			con.close();
		}
	}

	/**
	 * MySQL にアクセスし、注文情報をキャンセルする（is_canceled を true にする）
	 * @author TAKAHIRO ADACHI
	 * @param userId ユーザーID
	 * @return 成功したかどうか
	 * @since 1.0
	 */
	public boolean unorder(int userId) {
		try (Connection con = new MySqlConnector("tamaya").getConnection();) {
			String sql = "UPDATE orders, (SELECT MAX(order_id) AS max FROM orders) o SET is_canceled = TRUE "
					+ "WHERE user_id = ? AND order_id = o.max; ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			if (ps.executeUpdate() <= 0) {
				return false;
			}
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * MySQL にアクセスし、対象のユーザーの注文一覧を取得する
	 * @author TAKAHIRO ADACHI
	 * @param userId ユーザーID
	 * @return 注文履歴
	 * @throws SQLException
	 * @since 1.0
	 */
	public ArrayList<OrderDTO> getOrderList(int userId) throws SQLException {
		ArrayList<OrderDTO> orderList = new ArrayList<>();
		try (Connection con = new MySqlConnector("tamaya").getConnection();) {
			String sql1 = "SELECT order_id, shipping_cost, grand_total, ordered_at FROM orders "
					+ "WHERE user_id = ? AND is_canceled = FALSE ";
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setInt(1, userId);
			ResultSet rs1 = ps1.executeQuery();

			while (rs1.next()) {
				OrderDTO dto = new OrderDTO();
				dto.setOrderId(rs1.getInt("order_id"));
				dto.setShippingCost(rs1.getBigDecimal("shipping_cost"));
				dto.setGrandTotal(rs1.getBigDecimal("grand_total"));
				dto.setOrderedAt(rs1.getTimestamp("ordered_at"));
				orderList.add(dto);
			}

			String sql2 = "SELECT item_id, price, quantity FROM order_details WHERE order_id = ?; ";
			PreparedStatement ps2 = con.prepareStatement(sql2);
			for (int i = 0; i < orderList.size(); i++) {
				ps2.setInt(1, orderList.get(i).getOrderId());
				ResultSet rs2 = ps2.executeQuery();

				ArrayList<ItemDTO> itemList = new ArrayList<>();
				while (rs2.next()) {
					ItemDTO dto = new ItemDTO();
					dto.setItemId(rs2.getInt("item_id"));
					dto.setPrice(rs2.getBigDecimal("price"));
					dto.setQuantity(rs2.getInt("quantity"));
					itemList.add(dto);
				}
				orderList.get(i).setItemList(itemList);
			}
			return orderList;
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
	}
}
