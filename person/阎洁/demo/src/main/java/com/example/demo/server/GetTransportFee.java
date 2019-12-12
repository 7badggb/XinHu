package com.example.demo.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONObject;

@RestController
public class GetTransportFee {
	@RequestMapping(value="/common/getTransportFee",method=RequestMethod.GET)
	public JSONObject getTransportFee(@RequestParam int id,
			@RequestParam String addressDetail) {
		JSONObject json=new JSONObject();
		if(id==1&&addressDetail.equals("浙江省_杭州市_滨江区")) {
			json.element("message","success");
			json.element("result", 6);
			json.element("code",200);

		}
		else {
			json.element("message","请求失败");
			json.element("code",400);			
			
		}
		return json;
		
	}

}
