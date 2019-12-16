package com.example.demo.server;

import java.util.Objects;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONObject;

@RestController
public class ListLJQ {
	@RequestMapping(value="/getCookie",method=RequestMethod.GET)
	public String testCookie(HttpServletResponse response) {
		Cookie cookie = new Cookie("login","true");
		response.addCookie(cookie);
		return "获得cookie成功";
	}
	@RequestMapping(value="/fgadmin/address/list",method=RequestMethod.GET)
	public JSONObject getwithCookies(HttpServletRequest request) {
		Cookie[]cookies =request.getCookies();
		if(Objects.isNull(cookies)) {
			return getListFail();
		}
		for(Cookie cookie:cookies) {
			if(cookie.getName().equals("login")&&cookie.getValue().equals("true")) {
				return getListSuccess();
			}
		}
		return getListFail();
	}
	public JSONObject getListSuccess() {
		JSONObject json=new JSONObject();
		json.element("message","success");
		
		JSONObject json2=new JSONObject();
		json2.element("id",77479641);
		json2.element("sort", 99);
		json2.element("province","浙江省");
		json2.element("city","杭州市");
		json2.element("area","滨江区");
		json2.element("receiverName","张三");
		json2.element("cellPhone","12345678901");
		json2.element("addressDetail","浙江大学");
		json2.element("fgUserId",74966314);
	
		JSONObject json3=new JSONObject();
		json3.element("id",77479640);
		json3.element("sort", 99);
		json3.element("province","123");
		json3.element("city","杭州市");
		json3.element("area","滨江区");
		json3.element("receiverName","张三");
		json3.element("cellPhone","12345678901");
		json3.element("addressDetail","浙江大学");
		json3.element("fgUserId",74966314);
		
		JSONObject result[]= {json2,json3};
		json.element("result", result);
		json.element("code", 200);

		return json;
	}
	public JSONObject getListFail() {
		JSONObject json4=new JSONObject();
		json4.element("message","需要登录");
		return json4;
	}
}
