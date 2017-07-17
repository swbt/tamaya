/**
 *
 */
package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;


//カーとの中に同じ商品があれば注文数が増える処理
public class CartUpdateDAO {

    public int update(int orderCount, int userId, int itemId) {
        int count = 0;
        Connection con = new MySqlConnector("tamaya","root","mysql").getConnection();
        //UPDATE a SET b = c WHERE d = e→テーブル(a)に対して、d = eであればbにcをセットする
/*        String sql= "UPDATE carts SET quantity = ? WHERE user_id = ? && item_id = ?";*/
        String sql = "UPDATE carts SET quantity = ? WHERE user_id = ? && item_id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, orderCount);
            ps.setInt(2, userId);
            ps.setInt(3, itemId);

            count = ps.executeUpdate();
            System.out.println(count + "回！やりますよ");
            if(ps!=null) ps.close();
        }catch(SQLException e) {
        	e.printStackTrace();
        }finally{
            try{
                con.close();
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }

        return count;
    }
}

