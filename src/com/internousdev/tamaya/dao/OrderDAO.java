package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.tamaya.dto.CartDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

public class OrderDAO {
	/**
	 * MySQL にアクセスし、注文情報を追加する
	 * @return
	 * @throws SQLException
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
	 * @return 成功したかどうか
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
}
