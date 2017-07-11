package com.internousdev.tamaya.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.tamaya.dto.CartDTO;
import com.internousdev.util.db.mysql.MySqlConnector;


/**
 * カート遷移に関するクラス
 *@author YUKO　TSUJI
 * @since 2017/07/11
 * @version 1.0
 */
public class GoCartDAO{


	/**
	 * カート内の商品情報を取得しリストに格納するメソッド
	 * @param userId ユーザーID
	 * @return cartList カート内の商品情報
	 * @author YUKO　TSUJI
 * @since 2017/07/11
	 * @version 1.0
	 */
  public ArrayList<CartDTO> selectedItem(int userId){

	  Connection con = new MySqlConnector("openconnect").getConnection();
    ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();

    String sql = "select * from carts where user_id=?";
    String select2 = "SELECT * FROM items WHERE item_id = ?";

    try{
    	PreparedStatement ps = con.prepareStatement(sql);
    	ps.setInt(1,userId);
    	ResultSet rs = ps.executeQuery();
    	while(rs.next()){
    		CartDTO dto = new CartDTO();
    		dto.setUserId(rs.getInt("user_id"));//ユーザーID
    		//dto.setCartId(rs.getInt("cart_id"));//カートID
    		dto.setItemId(rs.getInt("item_id"));//商品ID
    		dto.setQuantity(rs.getInt("quantity"));//数量
    		cartList.add(dto);

    		PreparedStatement ps2 = con.prepareStatement(select2);
			ps2.setInt(1, dto.getItemId());
			ResultSet rs2 = ps2.executeQuery();

			while (rs2.next()) {

				dto.setItemName(rs2.getString("itemName"));//商品名
				dto.setPrice(rs2.getBigDecimal("price")); //価格
				dto.setSubtotal(dto.getPrice().multiply(BigDecimal.valueOf(dto.getQuantity()))); //小計分からず
				dto.setImgPath(rs2.getString("imgPath")); //イメージパス
			}
    	}
    }catch(SQLException e){
    	e.printStackTrace();
    }finally {
		try{
			con.close();
		}catch(Exception e){
			e.printStackTrace();
			}
	}
     return cartList;
  }
}

