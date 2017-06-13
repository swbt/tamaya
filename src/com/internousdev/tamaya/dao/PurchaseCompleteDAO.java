package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.tamaya.dto.CartDTO;
import com.internousdev.tamaya.dto.ItemDTO;

/**
 * 決済に関するクラス
 * @author Atsushi Kawai
 * @since 6/13
 * @version 1.0s
 */
public class purchaseCompleteDAO {

	/**
	 * カートリストの商品に在庫切れのものがないかを確認するメソッド
	 * @param cartList カートリスト
	 * @return check 在庫があればOK、なければNGを返す
	 * @author MISA KIKUCHI
	 * @since 6/13
	 * @version 1.0
	 */
	public String stockCheck(ArrayList<CartDTO> cartList) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "legmina", "root", "mysql");
		Connection con = db.getConnection();
		ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
		String sql = "select * from items where item_id=?";
		String check = "NG";
		for (int i = 0; i < cartList.size(); i++) {
			check= "NG";
			int add = 0;
			for (int a = 0; a < cartList.size(); a++) {
				if (cartList.get(i).getItemId() == cartList.get(a).getItemId()) {
					add += cartList.get(a).getQuantities();
				}
			}
			ItemDTO dto = new ItemDTO();

			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, cartList.get(i).getItemId());
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {

					//在庫切れのものがある場合は商品名をリストに格納する
					dto.setStocks(rs.getInt("stocks"));// 在庫数
					dto.setItemsName(rs.getString("items_name"));//商品名
					itemList.add(dto);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			if (dto.getStocks() < add) {
				check = dto.getItemsName();
				break;

			}
			check = "OK";
		}
		return check;

	}

	/**
	 * カートテーブルの情報を、購入情報テーブルにインサートするメソッド
	 * @param userId ユーザーＩＤ
	 * @return ret 成否を格納する変数
	 * @author MISA KIKUCHI
	 * @since 5/19
	 * @version 1.0
	 */
	public int purchase(int userId) {
		int ret = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "legmina", "root", "mysql");
		Connection con = null;
		con = db.getConnection();
		CartDTO dto = new CartDTO();
		String select = "select * from carts where user_id = ?";
		String insert = "insert into purchases(user_id, item_id, quantities) values(?, ?, ?)";
		try {
			PreparedStatement ps1 = con.prepareStatement(select);
			ps1.setInt(1, userId);
			ResultSet rs = ps1.executeQuery();

			while (rs.next()) {
				dto.setUserId(rs.getInt("user_id"));
				dto.setItemId(rs.getInt("item_id"));
				dto.setQuantities(rs.getInt("quantities"));

				PreparedStatement ps2 = con.prepareStatement(insert);
				ps2.setInt(1, userId);
				ps2.setInt(2, dto.getItemId());
				ps2.setInt(3, dto.getQuantities());

				ret += ps2.executeUpdate();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}

	/**
	 * カート情報を削除するメソッド
	 * @param userId ユーザーＩＤ
	 * @return ret 成否を格納する変数
	 * @author MISA KIKUCHI
	 * @since 5/19
	 * @version 1.0
	 */
	public int clean(int userId) {
		int ret = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "legmina", "root", "mysql");
		Connection con = db.getConnection();
		String cleanCart = "delete from carts where user_id = ?";
		try {
			PreparedStatement ps1 = con.prepareStatement(cleanCart);
			ps1.setInt(1, userId);
			ret = ps1.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}

	/**
	 * 商品情報の在庫数を販売数だけ減らすメソッド
	 * @param userId ユーザーID
	 * @return ret 成否を格納する変数
	 * @author MISA KIKUCHI
	 * @since 5/19
	 * @version 1.0
	 */
	public int stockUpdate(int userId) {
		int ret = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "legmina", "root", "mysql");
		Connection con = db.getConnection();
		String stockUpdate = "UPDATE items SET stocks = ? WHERE item_id = ?";
		ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
		ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
		String sql = "select * from carts where user_id=?";
		String itemSql = "select * from items where item_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CartDTO dto = new CartDTO();
				dto.setItemId(rs.getInt("item_id"));// 商品ID
				dto.setQuantities(rs.getInt("quantities"));// 数量
				cartList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			for (int i = 0; i < cartList.size(); i++) {
				ItemDTO dto = new ItemDTO();
				PreparedStatement ps = con.prepareStatement(itemSql);
				int itemId = cartList.get(i).getItemId();
				ps.setInt(1, itemId);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					dto.setStocks(rs.getInt("stocks"));
					itemList.add(dto);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {

			for (int i = 0; i < cartList.size(); i++) {
				PreparedStatement ps1 = con.prepareStatement(stockUpdate);
				int stocks = itemList.get(i).getStocks();

				int add = 0;
				for (int a = 0; a < cartList.size(); a++) {
					if (cartList.get(i).getItemId() == cartList.get(a).getItemId()) {
						add += cartList.get(a).getQuantities();
					}
				}

				ps1.setInt(1, stocks - add);
				int itemId = cartList.get(i).getItemId();
				ps1.setInt(2, itemId);
				ret += ps1.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}

	/**
	 * 商品情報の売上数を販売数だけ増やすメソッド
	 * @param userId ユーザーID
	 * @return ret 成否を格納する変数
	 * @author MISA KIKUCHI
	 * @since 5/19
	 * @version 1.0
	 */
	public int salesUpdate(int userId) {
		int ret = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "legmina", "root", "mysql");
		Connection con = db.getConnection();
		String stockUpdate = "UPDATE items SET sales = ? WHERE item_id = ?";
		ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
		ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
		String sql = "select * from carts where user_id=?";
		String itemSql = "select * from items where item_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CartDTO dto = new CartDTO();
				dto.setItemId(rs.getInt("item_id"));// 商品ID
				dto.setQuantities(rs.getInt("quantities"));// 数量
				cartList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			for (int i = 0; i < cartList.size(); i++) {
				ItemDTO dto = new ItemDTO();
				PreparedStatement ps = con.prepareStatement(itemSql);
				int itemId = cartList.get(i).getItemId();
				ps.setInt(1, itemId);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					dto.setSales(rs.getInt("sales"));
					itemList.add(dto);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {

			for (int i = 0; i < cartList.size(); i++) {
				PreparedStatement ps1 = con.prepareStatement(stockUpdate);
				int sales = itemList.get(i).getSales();

				int add = 0;
				for (int a = 0; a < cartList.size(); a++) {
					if (cartList.get(i).getItemId() == cartList.get(a).getItemId()) {
						add += cartList.get(a).getQuantities();
					}
				}

				ps1.setInt(1, sales + add);
				int itemId = cartList.get(i).getItemId();
				ps1.setInt(2, itemId);
				ret += ps1.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
}