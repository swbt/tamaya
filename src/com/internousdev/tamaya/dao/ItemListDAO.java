/**
 *
 */
package com.internousdev.tamaya.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.internousdev.tamaya.dto.ItemDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * 商品一覧を表示するために必要な情報をデータベースから取ってくる
 * 引数によって、値段別・カテゴリー別の検索をする
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class ItemListDAO {
	public ArrayList<ItemDTO> getRanking(int limit) {
		TaxDAO tdao = new TaxDAO();
		Connection con = new MySqlConnector("tamaya","root","mysql").getConnection();
		ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
		String sql = "SELECT * FROM items ORDER BY sales DESC LIMIT ?";

		try{
			BigDecimal taxRate = tdao.getTaxRate();
			System.out.println("ItemListDAO.getRanking : taxRate = " + taxRate);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, limit);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				//while内でItemDTOを宣言しないと、itemList内のdtoが全て同じ値になる（参照渡し？）
				ItemDTO dto = new ItemDTO();
				dto.setTaxRate(taxRate);
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setCategory(rs.getString("category"));
				dto.setPrice(rs.getBigDecimal("price"));
				dto.setStocks(rs.getInt("stocks"));
				dto.setSales(rs.getInt("sales"));
				dto.setImgPath(rs.getString("img_path"));
				itemList.add(dto);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		try{
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return itemList;
	}
	public ArrayList<ItemDTO> select(){
		TaxDAO tdao = new TaxDAO();
		ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();

		try(Connection con = new MySqlConnector("tamaya","root","mysql").getConnection();) {
			BigDecimal taxRate = tdao.getTaxRate();
			String sql = "SELECT * FROM items ORDER BY sales DESC";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while(rs.next()){
				//while内でItemDTOを宣言しないと、itemList内のdtoが全て同じ値になる（参照渡し？）
				ItemDTO dto = new ItemDTO();
				dto.setTaxRate(taxRate);
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setCategory(rs.getString("category"));
				dto.setPrice(rs.getBigDecimal("price"));
				dto.setStocks(rs.getInt("stocks"));
				dto.setSales(rs.getInt("sales"));
				dto.setImgPath(rs.getString("img_path"));
				itemList.add(dto);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return itemList;
	}

	public ArrayList<ItemDTO> select(String category){
		TaxDAO tdao = new TaxDAO();
		Connection con = new MySqlConnector("tamaya","root","mysql").getConnection();
		ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
		String sql = "SELECT * FROM items WHERE category = ?";
		try{
			BigDecimal taxRate = tdao.getTaxRate();
			System.out.println();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, category);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ItemDTO dto = new ItemDTO();
				dto.setTaxRate(taxRate);
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setCategory(rs.getString("category"));
				dto.setPrice(rs.getBigDecimal("price"));
				dto.setStocks(rs.getInt("stocks"));
				dto.setSales(rs.getInt("sales"));
				dto.setImgPath(rs.getString("img_path"));
				itemList.add(dto);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		try{
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return itemList;
	}

	public ArrayList<ItemDTO> select(int priceRange){
		TaxDAO tdao = new TaxDAO();
		Connection con = new MySqlConnector("tamaya","root","mysql").getConnection();
		ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
		String sql = "SELECT * FROM items WHERE price >= ? AND price < ?";
		int minPrice, maxPrice;
		int priceRange1 = (int)(500 / 1.08);
		int priceRange2 = (int)(1000 / 1.08);
		int priceRange3 = (int)(5000 / 1.08);
		switch(priceRange){
		case 1 :
			minPrice = 0; maxPrice = priceRange1;
			break;
		case 2 :
			minPrice = priceRange1; maxPrice = priceRange2;
			break;
		case 3 :
			minPrice = priceRange2; maxPrice = priceRange3;
			break;
		case 4 :
			minPrice = priceRange3; maxPrice = 1000000;
			break;
		default :
			minPrice = 0; maxPrice = 0;
		}

		try{
			BigDecimal taxRate = tdao.getTaxRate();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, minPrice);
			ps.setInt(2, maxPrice);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ItemDTO dto = new ItemDTO();
				dto.setTaxRate(taxRate);
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setCategory(rs.getString("category"));
				dto.setPrice(rs.getBigDecimal("price"));
				dto.setStocks(rs.getInt("stocks"));
				dto.setSales(rs.getInt("sales"));
				dto.setImgPath(rs.getString("img_path"));
				itemList.add(dto);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		try{
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return itemList;
	}
}
