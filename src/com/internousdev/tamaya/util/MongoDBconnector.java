package com.internousdev.tamaya.util;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 * @author RYO SHIRAISHI
 * @since 2017/07/27
 *
 */
public class MongoDBconnector {
	private MongoClient client = null;

	public DB getConnection() {
		try {
			client = new MongoClient("localhost", 27017);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		// 接続するデータベース名
		DB db = client.getDB("tamaya");

		return db;
	}

	public void closeConnection() {
		client.close();
	}

}
