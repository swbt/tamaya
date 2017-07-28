/**
 *
 */
package com.internousdev.tamaya.interceptor;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;

import com.internousdev.tamaya.dao.ExchangeDAO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * HTTP ヘッダの Accept-Language を参照し、表示する言語や通貨の情報を session に格納する
 * @author TAKAHIRO ADACHI
 * @since 1.0
 */
public class LocaleInterceptor extends AbstractInterceptor {
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//▼▼セッションの取得
		Map<String, Object> session = ActionContext.getContext().getSession();
		if(!session.containsKey("locale")){
			Locale locale = ActionContext.getContext().getLocale();
			Currency currency;
			try {
				currency = Currency.getInstance(locale);
			} catch(IllegalArgumentException e) {
				//▼▼locale が不明な場合は ja_JP で表示する
				locale = Locale.JAPAN;
				currency = Currency.getInstance(locale);
			}
			int scale = currency.getDefaultFractionDigits();
			String currencyCode = currency.getCurrencyCode();
			String symbol = currency.getSymbol();

			if (!currencyCode.equals("JPY")) {
				ExchangeDAO dao = new ExchangeDAO();
				dao.updateRateFromJPY();
				BigDecimal rate = dao.getRateFromJPY(currencyCode);
				session.put("rate", rate);
			}

			session.put("locale", locale);
			session.put("scale", scale);
			session.put("currencyCode", currencyCode);
			session.put("symbol", symbol);
			ActionContext.getContext().setSession(session);
		}
		//▼▼struts2では、まずActionProxy によって invoke() メソッドが呼び出された後、
		//▼▼インターセプタによって invoke() メソッドが再起呼び出しされる。
		//▼▼全てのインタセプタの呼び出しが完了した後、アクションが呼び出される。
		return invocation.invoke();
	}
}
