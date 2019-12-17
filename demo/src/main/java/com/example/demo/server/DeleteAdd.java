package com.example.demo.server;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONObject;

@RestController
public class DeleteAdd{
	@RequestMapping(value="/fgadmin/address/delete",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	public JSONObject getByJSON(HttpServletRequest request,@RequestBody JSONObject body) {
		
		JSONObject result=new JSONObject();
		int id=body.getInt("id");
		Cookie[]cookies =request.getCookies();
		if(Objects.isNull(cookies)) {
			result.element("message","请先登录");
			result.element("code",400);
			return result;
		}
		for(Cookie cookie:cookies) {
			if(cookie.getName().equals("login")&&cookie.getValue().equals("true")&&
					id==77243286) {
				result.element("message","success");
				result.element("code", 200);
			}else {
				result.element("message","请求失败");
				result.element("code",400);
			}
			return result;
		}
		return result;
	}
}
