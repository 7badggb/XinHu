package com.example.demo.server;

import java.util.Objects;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONObject;

@RestController
public class AddressList {
	@RequestMapping(value="/fgadmin/address/list",method=RequestMethod.GET)
	public JSONObject getAddressList(HttpServletResponse response,
			HttpServletRequest request,
			 @RequestParam (value="phoneNumber",required=true) String phoneNumber,
			 @RequestParam (value="password",required=true) String password) {
//		if(phoneNumber.equals("20000000000")&&password.equals("netease123")) {
//			Cookie cookie=new Cookie("login","true");
//			cookie.setPath("/");
//			response.addCookie(cookie);
//		}
		JSONObject json=new JSONObject();
		Cookie[] cookies=request.getCookies();
		if(Objects.isNull(cookies)) {
			json.element("message", "请先登录");
			json.element("code", 400);
			return json;	
		}
		for(Cookie cookie:cookies) {
			if(cookie.getName().contentEquals("login")&&
			cookie.getValue().equals("true")){
				json.element("message", "成功");
				json.element("code", 200);
				json.element("id", 77479641);
				json.element("receiverName", "张三");
				json.element("cellPhone", "20000000000");
				json.element("addressDetail","浙江大学");
				return json;
			}			
		}
		json.element("code",201);
		json.element("message", "收货地址为空");
		return json;
	}

}
