package com.internousdev.tamaya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * Oauthでのログインに関するクラス
 * @author KENICHI KABURAGI
 * @since 2017/06/14
 * @version 1.0
 */
public class LoginOauthDAO {

/**
 * 取得した情報を格納する
 */
private MypageDTO dto=new MypageDTO();

/**
 * ユニークIDが無かったらインサートするメソッド
 * @param uniqueId OAuthのサービス先のユニークID
 * @param userName OAuthのサービス先のユーザー名
 * @param oauthName OAuth名
 * @return result 成否を判断する変数
 * @author KENICHI KABURAGI
 * @since 2017/06/14
 * @version 1.0
 */
public boolean insert(String uniqueId, String userName, int oauthName) {
	Connection con = new MySqlConnector("openconnect","root","mysql").getConnection();
	boolean result = false;
	String sql = "INSERT INTO users"
			+ "(oauth_account, oauth_id, oauth_name, family_name, given_name, family_name_kanji, family_name_kana,given_name_kanji, given_name_kana, sex)"
			+ " values"
			+ " (?,?,?,?,?,?,?,?,?,?)";
	try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, userName);
		ps.setString(2, uniqueId);
		ps.setInt(3, oauthName);
		ps.setString(4, "");
		ps.setString(5, "");
		ps.setString(6, "");
		ps.setString(7, "");
		ps.setString(8, "");
		ps.setString(9, "");
		ps.setString(10, "");


		int insertCount = ps.executeUpdate();
		if (insertCount > 0) {
			result = true;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return result;
}

/**
 * 多重ログインを防ぐため、ログインフラグをtrueにUPDATEするメソッド
 * @param uniqueId OAuthのサービス先のユニークID
 * @return count 更新した件数
 * @author KENICHI KABURAGI
 * @since 2017/06/14
 * @version 1.0
 */
public int update(String uniqueId) {
	int count = 0;
	Connection con = new MySqlConnector("openconnect","root","mysql").getConnection();
	String sql = "UPDATE users SET login_flg = true WHERE oauth_id = ?";

	try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, uniqueId);
		count = ps.executeUpdate();
	} catch(SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	return count;
}


/**
 * usersテーブルからユーザー情報を取得するメソッド
 * @param userUniqueId OAuthのサービス先のユニークID
 * @param oauthName OAuth名
 * @return dto ユーザー情報
 */
public MypageDTO selectInList(String userUniqueId, int oauthName){

	Connection con = new MySqlConnector("openconnect","root","mysql").getConnection();
	MypageDTO dto = new MypageDTO();

	try{
		String sql = "SELECT * FROM users WHERE oauth_id = ? AND oauth_name = ?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1,userUniqueId);
		stmt.setInt(2,oauthName);
		ResultSet rs = stmt.executeQuery();

		if(rs.next()){
			dto.setLoginFlg(rs.getBoolean("login_flg"));
			dto.setEmail(rs.getString("phone_email"));
			dto.setPassword(rs.getString("password"));
			dto.setOauthId(rs.getString("oauthId"));
			dto.setOauthName(rs.getInt("oauthname"));
			dto.setOauthAccount(rs.getString("oauthaccount"));
		}
	}catch(SQLException e){
		e.printStackTrace();
	}try{
		con.close();
	}catch(SQLException e){
		e.printStackTrace();
	}
	return dto;
}



/**
 * DTOを取得するメソッド
 * @return dto
 */
public MypageDTO getLoginDTO() {
	return dto;
}


}