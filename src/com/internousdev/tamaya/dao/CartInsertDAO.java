/**
 *
 */
package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.tamaya.dto.PurchaseDTO;
import com.internousdev.tamaya.util.DBConnector;

/**
 * @author WATARU AMEMIYA
 *
 */

//カートテーブルに商品を登録するメソッド
public class CartInsertDAO {

	/**
	 * @param userId		ユーザー番号
	 * @param itemId		商品番号
	 * @param orderCount	注文数
	 * @return ret			注文する商品の情報を返す
	 */

    public int insert(int userId,int itemId,int orderCount) {
        DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "tamaya", "root","mysql");
        Connection con = db.getConnection();
        int ret = 0;
        String sql = "insert into carts (user_id,item_id,quantity) values (?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            ps.setInt(2, itemId);
            ps.setInt(3, orderCount);
            ret = ps.executeUpdate();
            System.out.println(ret + "インサート入ってる");
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            if(con != null){
                try{
                    con.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

        return ret;
    }


    //カートテーブルの中を検索してもともとあった情報を結合して格納する
    /**
     * @param userId ユーザーID
     * @param itemId アイテムID
     * @return searchCart	更新されたリストを返す
     */
    public ArrayList<PurchaseDTO> search(int userId,int itemId){
        DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "tamaya", "root","mysql");
        Connection con = db.getConnection();
        ArrayList<PurchaseDTO> searchCart=new ArrayList<PurchaseDTO>();

        String sql="select * from carts where user_id = ? && item_id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            ps.setInt(2, itemId);

            System.out.println( "入ってます");
            ResultSet rs =ps.executeQuery();

            while(rs.next()){
                PurchaseDTO dto2 =new PurchaseDTO();
                dto2.setUserId(userId);
                dto2.setItemId(rs.getInt("item_id"));
                dto2.setOrderCount(rs.getInt("quantity"));
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
