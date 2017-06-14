/**
 *
 */
package com.internousdev.tamaya.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.tamaya.dto.CartDTO;
import com.internousdev.tamaya.dto.ItemDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

public class AddToCartDAO {

		/**
		 * カートテーブルに追加する商品の情報を取得するメソッド
		 * @author MISA KIKUCHI
		 * @since 2017/05/24
		 * @version 1.0
		 * @param itemId 商品ID
		 * @return itemStatus 商品情報
		 */

		public ArrayList<ItemDTO> itemStatus(int itemId){

			Connection con = new MySqlConnector("tamaya","root","mysql").getConnection();
			ArrayList<ItemDTO> itemStatus = new ArrayList<ItemDTO>();

			String sql = "select * from items where item_id = ?";

			try{
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, itemId);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					ItemDTO dto = new ItemDTO();
					dto.setItemName(rs.getString("item_name"));
					dto.setPriceWithTax(rs.getBigDecimal("price").multiply(ItemDTO.getTax().add(BigDecimal.ONE)).setScale(0, BigDecimal.ROUND_DOWN));
					dto.setStocks(rs.getInt("stocks"));
					dto.setSales(rs.getInt("sales"));
					dto.setItemDetail(rs.getString("items_detail"));
					dto.setImgPath(rs.getString("img_path"));
					itemStatus.add(dto);
				}
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				try{
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			return itemStatus;
		}


			/**
			 * カートテーブルへ情報をインサートするメソッド
			 * @author MISA KIKUCHI
			 * @since 2017/05/24
			 * @version 1.0
			 * @param userId ユーザーID
			 * @param itemId 商品ID
			 * @return addCount 成否を格納する変数
			 */


			public int addToCart(int userId,int itemId){
				int addCount = 0;

				MySqlConnector db = new MySqlConnector();
				Connection con =db.getConnection("tamaya");
				String sql = "insert into carts (user_id,item_id) values(?,?)" ;

				try{
		            PreparedStatement ps = con.prepareStatement(sql);
		            ps.setInt(1, userId);//ユーザーID
		            ps.setInt(2, itemId);//商品ID
		            addCount = ps.executeUpdate();
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
				return addCount;
			}

			/**
			 * カート内の商品情報を取得しリストに格納するメソッド
			 * @author MISA KIKUCHI
			 * @since 2017/05/24
			 * @version 1.0
			 * @param userId ユーザーID
			 * @return cartList カート情報
			 */
		  public ArrayList<CartDTO> selected(int userId){

		    MySqlConnector db = new MySqlConnector();
		    Connection con = db.getConnection("tamaya");
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
		    		dto.setItemId(rs.getInt("item_id"));//商品ID
		    		dto.setQuantity(rs.getInt("quantity"));//数量
		    		cartList.add(dto);

		    		PreparedStatement ps2 = con.prepareStatement(select2);
					ps2.setInt(1, dto.getItemId());
					ResultSet rs2 = ps2.executeQuery();

					while (rs2.next()) {

						dto.setItemName(rs2.getString("item_name"));//商品名
						dto.setPrice(rs2.getBigDecimal("price")); //価格
						dto.setImgPath(rs2.getString("img_path")); //イメージパス
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


