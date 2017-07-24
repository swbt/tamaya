package com.internousdev.tamaya.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.tamaya.dto.AdminHistoryDTO;
import com.internousdev.tamaya.dto.HistoryDTO;
import com.internousdev.util.db.mysql.MySqlConnector;



/**
 * 管理者販売履歴の表示に関するメソッド
 *
 * @author seiya takahashi
 * @since 2017/6/14
 * @version 1.0
 */
public class AdminHistoryDAO {




	/**
	 * 購入履歴を格納する
	 */
	public ArrayList<HistoryDTO> AdminHistoryList = new ArrayList<HistoryDTO>();

	/**
	 * 商品IDで販売履歴を取得しリストに格納するメソッド
	 * @param itemId 商品ID
	 * @return adminhistorylist 販売履歴
	 * @version 1.0
	 */
	public ArrayList<AdminHistoryDTO> select(int itemId) {
		MySqlConnector db = new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "tamaya", "root", "mysql");
		Connection con = db.getConnection();

		ArrayList<AdminHistoryDTO> adminhistoryList = new ArrayList<AdminHistoryDTO>();

		int k = 0;
		String sql;


		if(itemId == 0){


			sql= "select * from purchases left join items on purchases.item_id = items.item_id";




		}else{
		 sql = "select * from purchases left join items on purchases.item_id = items.item_id where purchases.item_id=?";
		k=1;

		}

		try {
			PreparedStatement ps = con.prepareStatement(sql);




			if(k == 1){

				ps.setInt(1, itemId);
			}
			ResultSet rs = ps.executeQuery();


			while (rs.next()) {
				AdminHistoryDTO dto = new AdminHistoryDTO();

				dto.setItemId(rs.getInt("itemId")); //商品ID

				dto.setPurchaseId(rs.getInt("purchaseId")); //購入ID

				dto.setQuantities(rs.getInt("quantities")); //数量

				dto.setCreatedAt(rs.getString("created_at")); //登録日

				dto.setItemName(rs.getString("itemName")); //商品名

				dto.setBasePrice(rs.getBigDecimal("price")); //単価

				dto.setSubtotal(dto.getBasePrice().multiply(BigDecimal.valueOf(dto.getQuantities())));//合計金額


				adminhistoryList.add(dto);



			}



			rs.close();
			ps.close();


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return adminhistoryList;
	}

	}



