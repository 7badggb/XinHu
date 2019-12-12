package com.example.demo.server;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONObject;

@RestController
public class Submit {
	@RequestMapping(value="/fgadmin/orders/submit",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	public JSONObject Submit(@RequestBody JSONObject body) {
		JSONObject json=new JSONObject();
		String skuIds=body.getString("skuIds");
		String skuNumbers=body.getString("skuNumbers");
		String stockIds=body.getString("stockIds");
		if(skuIds.equals("2,3")&&skuNumbers.equals("1,1")&&stockIds.equals("74966312,74966313")) {
			json.element("message","success");
			json.element("code",200);
			
			
			JSONObject person=new JSONObject();
			person.element("id", 77479641);
			person.element("receiverName", "张三");
			person.element("cellPhone", "20000000000");
			person.element("addressDetail","浙江大学");
			JSONObject[] result={person};
			
			json.element("result", result);
			return json;
		}
		else {
			json.element("message","请求失败");
			json.element("code", 400);
			return json;
			
		}
		
		
	}

}
