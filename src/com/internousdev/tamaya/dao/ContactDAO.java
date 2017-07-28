package com.internousdev.tamaya.dao;

import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import com.internousdev.tamaya.util.MongoDBconnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;

/**
 * お問い合わせフォームのDAO
 *
 * @author RYO SHIRAISHI
 * @since 2017/07/27
 * @version 1.0
 */
public class ContactDAO {
	/**
	 * mongoDBにデータをインサートするメソッド
	 *
	 * @author RYO SHIRAISHI
	 * @param postalCode
	 *            電話番号
	 * @param userName
	 *            問い合わせ者名
	 * @param email
	 *            メールアドレス
	 * @param comment
	 *            問い合わせ内容
	 * @return result INSERT真偽値 true / false
	 * @throws UnknownHostException
	 *             ホストの IP アドレスが判定できなかった場合にスローされる(呼び出し元で例外処理を行う)
	 */

	public boolean mongoInsert(String userName, String email, String comment, Integer postalCode)
			throws UnknownHostException {
		boolean result = false;

		/*
		 * 管理者が日本人であることを想定しているため、 日本のタイムゾーンで現在の日付を取得
		 */
		Calendar cal = Calendar.getInstance();
		TimeZone tz = TimeZone.getTimeZone("Asia/Tokyo");
		cal.setTimeZone(tz);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		String dt = sdf.format(cal.getTime());

		/* MongoDBサーバに接続 */
		MongoDBconnector con = new MongoDBconnector();
		/* 利用するDB(コレクション)を取得 */
		DB db = con.getConnection();
		DBCollection coll = db.getCollection("inquiry_histories");

		BasicDBObject input = new BasicDBObject();

		input.put("inquireDate", dt);
		input.put("userName", userName);
		input.put("email", email);
		input.put("postalCode", postalCode);
		input.put("comment", comment);

		coll.insert(input);

		/*
		 * MongoDB内の件数が100件以上の場合、最初の行の問い合わせを削除
		 */
		long count = coll.getCount();
		if (count == 101) {
			DBObject doc = coll.findOne();
			coll.remove(doc);
		}
		count = coll.getCount();
		result = true;

		return result;
	}
	/* close()はMongoDBconnectorで行う */
}
