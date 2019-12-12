package com.example.demo.server;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONObject;

@RestController

public class AddAddress {
	@RequestMapping(value="/fgadmin/address/new",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	public JSONObject addAddress(@RequestBody JSONObject body) {
//		String ReceiverName=body.getString("ReceiverName");
//		String cellPhone=body.getString("cellPhone");
//		String addressDetail=body.getString("addressDetail");
		Object id=body.get("id");
		JSONObject json=new JSONObject();
		if(id==null) {
			
			json.element("message", "success");
			json.element("code",200);
		}else {
			json.element("message","请求id必须为null");
			json.element("code", 400);
		}
		
		return json;
	}

}
