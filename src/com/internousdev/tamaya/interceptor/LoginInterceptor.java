/**
 *
 */
package com.internousdev.tamaya.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * セッションに userId が含まれていない時に、Actionを実行せず result として "login" を返す
 *
 * @author TAKAHIRO ADACHI
 * @since 1.0
 */
public class LoginInterceptor extends AbstractInterceptor {
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// ▼▼セッションの取得
		Map<String, Object> session = ActionContext.getContext().getSession();
		if (session.containsKey("userId")) {
			if ((int) session.get("userId") != 0) {
				return invocation.invoke();
			}
		}
		return "login";
	}
}
