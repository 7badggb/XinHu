package com.example.demo.server;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONObject;

@RestController
public class DeleteAddress {
	@RequestMapping(value="/fgadmin/address/delete",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	public JSONObject deleteAddress(@RequestBody JSONObject body) {
		int id=body.getInt("id");
		JSONObject json=new JSONObject();
		if(id==77243286) {
			json.element("message","请求失败");
			json.element("code", 400);
		}
		return json;
		
	}

}
