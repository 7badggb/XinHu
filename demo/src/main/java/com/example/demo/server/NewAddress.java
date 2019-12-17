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
public class NewAddress {
	@RequestMapping(value="/fgadmin/address/new",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	public JSONObject getByJSON(HttpServletRequest request,@RequestBody JSONObject body) {
		
		JSONObject result=new JSONObject();
		
		String receiverName=body.getString("receiverName");
		Object cellPhone=body.get("cellPhone");
		String addressDetail=body.getString("addressDetail");
		String province=body.getString("province");
		String city=body.getString("city");
		String area=body.getString("area");
		
		Cookie[]cookies =request.getCookies();
		if(Objects.isNull(cookies)) {
			result.element("message","请先登录");
			result.element("code",400);
			return result;
		}
		for(Cookie cookie:cookies) {
		if(cookie.getName().equals("login")&&cookie.getValue().equals("true")&&receiverName==null) {
			result.element("message","receiverName参数类型不正确");
			result.element("code", 400);	
		}else if(cookie.getName().equals("login")&&cookie.getValue().equals("true")&&receiverName.equals("张三")&&cellPhone.equals("12615813537")&&addressDetail.equals("1栋3单元")
				&&province.equals("浙江省")&&city.equals("杭州市")&&area.equals("滨江区")) {
			result.element("message","success");
			result.element("code", 200);
		} else {
			result.element("message","请求失败");
			result.element("code",400);
		}
		return result;
		}
		return result;
	}
}
