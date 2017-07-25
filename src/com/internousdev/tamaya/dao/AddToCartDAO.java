/**
 *
 */
package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.tamaya.dto.CartDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * @author WATARU AMEMIYA
 *
 */

//カートテーブルに商品を登録するメソッド
public class AddToCartDAO {

	/**
	 * @param userId		ユーザー番号
	 * @param itemId		商品番号
	 * @param orderCount	注文数
	 * @return ret			注文する商品の情報を返す
	 */

    public boolean insert(int userId, int itemId, int orderCount) {
        String sql = "INSERT INTO carts (user_id, item_id, quantity) VALUES (?, ?, ?) ON DUPLICATE KEY UPDATE quantity = ?";
        try(Connection con = new MySqlConnector("tamaya").getConnection();) {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            ps.setInt(2, itemId);
            ps.setInt(3, orderCount);
            ps.setInt(4, orderCount);
            if(ps.executeUpdate() >= 0) {
            	return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    //カートテーブルの中を検索してもともとあった情報を結合して格納する
    /**
     * @param userId ユーザーID
     * @param itemId アイテムID
     * @return searchCart	更新されたリストを返す
     */
    public ArrayList<CartDTO> search(int userId,int itemId){
		Connection con = new MySqlConnector("tamaya").getConnection();
        ArrayList<CartDTO> searchCart=new ArrayList<CartDTO>();

        String sql="select * from carts where user_id = ? && item_id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            ps.setInt(2, itemId);

            System.out.println( "入ってます");
            ResultSet rs =ps.executeQuery();

            while(rs.next()){
                CartDTO dto2 =new CartDTO();
                dto2.setItemId(rs.getInt("item_id"));
                dto2.setQuantity(rs.getInt("quantity"));
                //ここで情報を結合する(addは追加して格納するという意味)
                searchCart.add(dto2);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }finally{
                if(con!=null){
                    try{
                        con.close();
                    }catch(SQLException e){
                        e.printStackTrace();
                    }
                }
            }
        return searchCart;
    }
}
