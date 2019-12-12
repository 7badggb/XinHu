package com.example.demo.server;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONObject;

@RestController
public class SkuList {
	@RequestMapping(value="/common/skulist",method=RequestMethod.GET)
	public JSONObject getSkuList() {
		JSONObject json=new JSONObject();
		json.element("message","success");
		
		JSONObject json2=new JSONObject();
		json2.element("id",2);
		json2.element("goodsId", 1);
		JSONObject json3=new JSONObject();
		json3.element("id",3);
		json3.element("goodsId", 1);
		JSONObject json4=new JSONObject();
		json4.element("id",4);
		json4.element("goodsId", 2);
		JSONObject json5=new JSONObject();
		json5.element("id",5);
		json5.element("goodsId", 2);
		
		JSONObject result[]= {json2,json3,json4,json5};
		json.element("result", result);
		json.element("code", 200);
		return json;
	}
	@RequestMapping(value="/common/skulistbyid",method=RequestMethod.GET)
	public JSONObject getSkuListById(@RequestParam int goodsId){
		JSONObject json=new JSONObject();
		if(goodsId==1) {
			JSONObject json2=new JSONObject();			
			json2.element("id",2);
			json2.element("goodsId", 1);
			JSONObject json3=new JSONObject();
			json3.element("id",3);
			json3.element("goodsId", 1);
			JSONObject result[]= {json2,json3};
			json.element("message","success");
			json.element("result", result);
			json.element("code", 200);		
		return json;
	}else{
		json.element("code","201");
		json.element("message","商品ID不存在");
		return json;
	}
	}
}
