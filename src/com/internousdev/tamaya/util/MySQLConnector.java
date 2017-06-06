/**
 *
 */
package com.internousdev.tamaya.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * データベース名を指定し、接続する
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class MySQLConnector {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/";
	private static String user = "root";
	private static String password = "mysql";
	//private String database;

	public Connection getConnection(String database){
		//this.database = database;
		Connection con = null;
		try{
			Class.forName(driverName);
			con = (Connection)DriverManager.getConnection(url + database, user, password);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
