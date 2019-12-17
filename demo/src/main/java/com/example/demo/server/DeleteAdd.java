package com.example.demo.server;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONObject;

@RestController
public class DeleteAdd {
	public static Cookie cookie;
	@ResponseBody
	@RequestMapping(value="/fgadmin/address/delete",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	public JSONObject getByJSON(HttpServletResponse response,@RequestBody JSONObject body) {
		
		int idNum=body.getInt("id")
		JSONObject result=new JSONObject();
			
		if(idNum.equals(77243286) {
			cookie=new Cookie("delete","true");
//			cookie.setPath("/");
//			response.addCookie(cookie);
			result.element("message","success");
			result.element("code", 200);
		} else {
			result.element("message","请求失败");
			result.element("code",400);
		}
		return result;
	}

}
