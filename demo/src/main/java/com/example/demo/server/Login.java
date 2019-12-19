package com.example.demo.server;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONObject;
//罗永素
@RestController
public class Login {
	public static Cookie cookie;
	@ResponseBody
	@RequestMapping(value="/common/fgadmin/login",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	public JSONObject getByJSON(HttpServletResponse response,@RequestBody JSONObject body) {
		String phoneArea=body.getString("phoneArea");
		Object phoneNumber=body.get("phoneNumber");
		String password=body.getString("password");
		JSONObject result=new JSONObject();
		if(phoneNumber==null) {
			result.element("message","用户名为空");
			result.element("code", 401);	
		}else if(phoneArea.equals("86")&&phoneNumber.equals("20000000000")&&password.equals("netease123")) {
			cookie=new Cookie("login","true");
			cookie.setPath("/");
			response.addCookie(cookie);
			result.element("message","success");
			result.element("code", 200);
		} else {
			result.element("message","用户名或密码错误");
			result.element("code",400);
		}
		return result;
	}

}
