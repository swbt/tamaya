package com.internousdev.tamaya.util;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 * @author internousdev
 *
 */
public class MongoDBconnector {
	private MongoClient client = null;
	public DB getConnection() throws UnknownHostException {
	DB db = null;
	client = new MongoClient("localhost", 27017);
	db = client.getDB("tamaya");
	return db;
}

public void closeConnection() {
	client.close();
}




}

