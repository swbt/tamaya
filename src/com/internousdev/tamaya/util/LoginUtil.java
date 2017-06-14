/**
 *
 */
package com.internousdev.tamaya.util;

import java.util.Map;

import com.internousdev.tamaya.dto.MypageDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author seiya takahahashi
 * @since　2017/6/14
 * ログイン時に必要な処理を提供するクラス
 */
public class LoginUtil extends ActionSupport {

	private static final long serialVersionUID = -564268116563098912L;


	public String validate(MypageDTO dto,Map<String, Object> session){

		String errorMsg=null;
		if(session.containsKey("email")){
			if((String) (session.get("phoneEmail")) ==(dto.getPhoneEmail())){
				errorMsg=getText("lang.login.notDouble");
			}else{
				errorMsg=getText("lang.login.notSameTime");
			}
			return errorMsg;
	}
			if(dto.isLoginFlg()==true){
				errorMsg=getText("lang.login.notDouble");
			}
			return errorMsg;
	}



	public String validate(String email,String password,MypageDTO dto,Map<String, Object> session){
		String errorMsg=null;

		if(!email.equals(dto.getPhoneEmail())  || !password.equals(dto.getPassword())){
			errorMsg=getText("lang.login.notCorrect");
			return errorMsg;
		}
		errorMsg=this.validate(dto, session);
		return errorMsg;
}
}
