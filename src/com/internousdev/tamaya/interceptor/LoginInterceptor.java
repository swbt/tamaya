/**
 *
 */
package com.internousdev.tamaya.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * セッションに userId が含まれていない時にリザルトで "login" を返す
 *
 * @author Takahiro Adachi
 * @since 1.0
 */
public class LoginInterceptor extends AbstractInterceptor {
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// ▼▼セッションの取得
		Map<String, Object> session = ActionContext.getContext().getSession();
		System.out.println(ActionContext.getContext().getName());
		if (session.containsKey("userId")) {
			if ((int) session.get("userId") != 0) {
				System.out.println("LoginInterceptor : userId = " + (int) session.get("userId"));
				return invocation.invoke();
			}
		}
		System.out.println("LoginInterceptor : result = login");
		return "login";
	}
}
