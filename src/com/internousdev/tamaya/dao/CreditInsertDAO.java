package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.tamaya.dto.CreditDTO;

/**クレジットカード情報の入力・削除に関するクラス@author ryusei tanaka いらないかも
@since 6/14@version 1.0*/
public class CreditInsertDAO {
	/**
	 * クレジットカード情報をデータベースにインサートするメソッド
	 * @param userId ユーザーID
	 * @param creditId クレジットの種類
	 * @param creditNumber クレジット番号
	 * @param nameE 姓名(ローマ字)
	 * @param securityCode セキュリティコード
	 * @param expirationMonth 有効期限（月）
	 * @param expirationYear 有効期限（年）
	 * @return ret 成否を格納する変数
	 * @author ryusei tanaka
	 *@since 2017/06/14
	 * @version 1.0
	 */
	public int insert(int userId,int creditId,String creditNumber,String nameE,String securityCode,
	int expirationMonth,int expirationYear){
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/","tamaya","root","mysql");
		com.mysql.jdbc.Connection con = db.getConnection();
		int ret=0;
		String query="INSERT IMTO credits(user_id,credit_id,credit_number,name_e,security_code,expiration_month, expiration_year)VALUES(?,?,?,?,?,?,?)";
		try{
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, userId);
			ps.setInt(2, creditId);
			ps.setString(3, creditNumber);
			ps.setString(4, nameE);
			ps.setString(5, securityCode);
			ps.setInt(6, expirationMonth);
			ps.setInt(7, expirationYear);
			ret=ps.executeUpdate();
		}catch(SQLExeption e){
			e.printStackTrace();

		}finally{
			if(con!=null){
				try{
					con.close();
				}catch(SQLExeption e){
					e.printStackTrace();
				}
			}
		}
		return ret;
	}
		/**
		 * クレジットカードテーブルの情報が重複していないかを確認するメソッド
		 * @param userId ユーザーＩＤ
		 * @return result 重複されていたらtrue、そうでなければfalse
		 * @author ryusei tanaka
		 *@since 2017/06/14
		 * @version 1.0
		 */
		public boolean search(int userId){
			DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "tamaya", "root", "mysql");
			java.sql.Connection con = db.getConnection();
			String sql="select * from credits where user_id=?";
			boolean result=false;
			try{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, userId);
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					if(rs.getInt("user_Id")==userId){
					result=true;
					break;
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return result;



}
	/**
	 * クレジットカードテーブルの情報を削除するメソッド
	 * @param userId ユーザーＩＤ
	 * @return ret 成否を格納する変数
	 * @author ryusei tanaka
	 *@since 2017/06/14
	 * @version 1.0
	 */
	public int cleanCredit(int userId){
		int ret=0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "tamaya", "root", "mysql");
		Connection con = db.getConnection();
		String cleanCreditCard = "delete from credits where user_id = ?";
		try {
			PreparedStatement ps1 = con.prepareStatement(cleanCreditCard);
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
	 * クレジットカード会社のDBに、ユーザーの利用情報をインサートするメソッド
	 * @param creditType クレジットタイプ
	 * @param creditNumber クレジット番号
	 * @param amountAll 合計金額
	 * @return ret 成否を格納する変数
	 * @author ryusei tanaka
	 *@since 2017/06/14
	 * @version 1.0
	 */
	public int selectInsert(String creditType, String creditNumber, int amountAll) {
		int ret = 0;;
		String insert = null;
		if(creditType.equals("visa")){
			insert = "INSERT INTO user_history(login_id, last_name, first_name, office_name, spend, payment) VALUES(?, ?, ?, ?, ?, ?)";
		}else{
			insert = "INSERT INTO user_history(login_id, name_e, corporation_name, spend, payment) VALUES(?, ?, ?, ?, ?)";
		}

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", creditType, "root", "mysql");
		Connection con = db.getConnection();
		CreditDTO dto = new CreditDTO();
		String sql = "select * from credit_card where credit_number = ?";

		// visaとamericanexpressおよびmastercardでカラム名が異なるため、ifを使用する
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, creditNumber);
			ResultSet rs = ps.executeQuery();
			PreparedStatement psInsert = con.prepareStatement(insert);
			while (rs.next()) {
				if (creditType.equals("visa")) {
					dto.setLoginId(rs.getString("login_id"));
					dto.setLastName(rs.getString("last_name"));
					dto.setFirstName(rs.getString("first_name"));
					dto.setCreditNumber(rs.getString("credit_number"));
					dto.setSecurityCode(rs.getInt("security_code"));
				} else {
					dto.setLoginId(rs.getString("login_id"));
					dto.setLastName(rs.getString("name_e"));
					dto.setCreditNumber(rs.getString("credit_number"));
					dto.setSecurityCode(rs.getInt("security_code"));
				}
				if (creditType.equals("visa")) {
					psInsert.setString(1, dto.getLoginId());
					psInsert.setString(2, dto.getLastName());
					psInsert.setString(3, dto.getFirstName());
					psInsert.setString(4, "legmina");
					psInsert.setInt(5, amountAll);
					psInsert.setInt(6, amountAll);
				} else {
					psInsert.setString(1, dto.getLoginId());
					psInsert.setString(2, dto.getLastName());
					psInsert.setString(3, "legmina");
					psInsert.setInt(4, amountAll);
					psInsert.setInt(5, amountAll);
				}
				ret = psInsert.executeUpdate();
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
	 * クレジットカード情報をリストに格納するメソッド
	 * @param userId ユーザーID
	 * @return creditList クレジットカード情報
	 * @author ryusei tanaka
	 *@since 2017/06/14
	 * @version 1.0
	 */
	public ArrayList<CreditDTO> selectCredit(int userId) {

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "tamaya", "root", "mysql");
		Connection con = db.getConnection();
		ArrayList<CreditDTO> creditList = new ArrayList<CreditDTO>();
		String sql = "select * from credits where user_id=?";
		String brandName = null;

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CreditDTO dto = new CreditDTO();
				dto.setCreditId(rs.getInt("credit_id"));
				dto.setUserId(rs.getInt("user_id"));
				dto.setCreditNumber(rs.getString("credit_number"));
				dto.setNameE(rs.getString("name_e"));
				dto.setSecurityCode(rs.getInt("security_code"));
				dto.setExpirationMonth(rs.getInt("expiration_month"));
				dto.setExpirationYear(rs.getInt("expiration_year"));
				//ブランド名とカード番号下4ケタ（amexは下3ケタ）を取得する
				if((dto.getCreditId())==1){
					brandName = "visa";
					dto.setCreditNumberDown((dto.getCreditNumber().substring(12,16)));
				}else if((dto.getCreditId())==2){
					brandName = "mastercard";
					dto.setCreditNumberDown((dto.getCreditNumber().substring(12,16)));
				}else{
					brandName = "jcb";
					dto.setCreditNumberDown((dto.getCreditNumber().substring(12,15)));
				}
				dto.setCreditType(brandName);
				creditList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return creditList;
	}













}












}
