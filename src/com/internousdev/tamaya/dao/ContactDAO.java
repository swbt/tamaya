package com.internousdev.tamaya.dao;

import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import com.internousdev.util.db.mongodb.MongoDBConnector;

/**
	 * 問い合わせフォームに関するクラス
	 * @author Atsushi Kawai
	 * @since 2017/06/13
	 * @version 1.0
	 */
public class ContactDAO {

	/**
	 * mongoDBにデータをインサートするメソッド
	 * @author Soshi Azuma
	 * @since 2017/05/16
	 * @version 1.0
	 * @param userName 問い合わせ者名
	 * @param email メールアドレス
	 * @param comment 問い合わせ内容
	 * @return INSERT真偽値 true / false
	 * @throws UnknownHostException ホストの IP アドレスが判定できなかった場合にスローされる(呼び出し元で例外処理を行う)
	 */
	public boolean mongoInsert(String title, String userName, String email, String comment) throws UnknownHostException {
		boolean result = false;

		/* 管理者が日本人であることを想定しているため、
		   日本のタイムゾーンで現在の日付を取得 */
		Calendar cal = Calendar.getInstance();
		TimeZone tz = TimeZone.getTimeZone("Asia/Tokyo");
		cal.setTimeZone(tz);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		String dt = sdf.format(cal.getTime());

		/*MongoDBサーバに接続*/
		MongoDBConnector con = new MongoDBConnector();
		/*利用するDB(コレクション)を取得*/
		DB db = con.getConnection();
		DBCollection coll = db.getCollection("inquiry_histories");

		BasicDBObject input = new BasicDBObject();

			input.put("user_name", userName);
			input.put("email", email);
			input.put("comment", comment);
			input.put("inquiried_at", dt);
			input.put("phoneNumber", phoneNumber);
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
	/*close()はMongoDBconnectorで行う*/
}
