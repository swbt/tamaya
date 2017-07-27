/**
 *
 */
package com.internousdev.tamaya.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Takahiro Adachi
 *
 */
public class ExchangeRate {
	@SuppressWarnings("unchecked")
	public static Map<String, String> download() throws IOException {
		HttpURLConnection connection = null;
		try {
			// XMLの取得元URL設定
			URL url = new URL("http://api.aoikujira.com/kawase/json/JPY");

			// コネクションをオープン
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			// レスポンスが来た場合は処理続行
			if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
				// InputStream から jsonString を読み取り、
				try (InputStreamReader isr = new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8);
						BufferedReader reader = new BufferedReader(isr)) {
					String jsonString;
					jsonString = reader.readLine();
					Map<String, String> exchangeRates = new ObjectMapper().readValue(jsonString,LinkedHashMap.class);
					return exchangeRates;
				}
			}
		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
		return null;
	}
}
