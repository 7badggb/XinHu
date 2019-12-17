package com.example.demo.server;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONObject;

@RestController
public class GetTransportfee {
	@RequestMapping(value="/common/getTransportFee",method=RequestMethod.GET)
	public JSONObject getTransportfee(@RequestParam int id) {
		JSONObject json=new JSONObject();
		json.element("message","success");
		
		JSONObject json2=new JSONObject();
		json2.element("id",1);
		json2.element("addressDetail","浙江省_杭州市_滨江区");
		
		JSONObject json3=new JSONObject();
		json3.element("transportfee",6);
		if(id==1) {
			JSONObject result[]= {json3};
			json.element("message","success");
			json.element("result", result);
			json.element("code", 200);		
		    return json;
	    }else{
		    json.element("code","400");
		    json.element("message","请求失败");
		    return json;
	}
	}
}
