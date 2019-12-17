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
public class Submit {
	@RequestMapping(value="/fgadmin/orders/submit",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	public JSONObject getByJSON(HttpServletRequest request,@RequestBody JSONObject body) {
		
		JSONObject result=new JSONObject();
		
		String skuIds=body.getString("skuIds");
		String skuNumbers=body.getString("skuNumbers");
		String stockIds=body.getString("stockIds");
		String receiverName =body.getString("receiverName");
		String cellPhone=body.getString("cellPhone");
		String addressDetail=body.getString("addressDetail");
		String province=body.getString("province");
		String city=body.getString("city");
		String area=body.getString("area");
		String voiceStatus=body.getString("voiceStatus");
		String needInvoice=body.getString("needInvoice");
		String invoiceHead=body.getString("invoiceHead");
		String transportFee=body.getString("transportFee");
		String logisticsCompanyId=body.getString("logisticsCompanyId");
		String accessSource=body.getString("accessSource");
		String accessDevice=body.getString("accessDevice");
		
		Cookie[]cookies =request.getCookies();
		if(Objects.isNull(cookies)) {
			result.element("message","请先登录");
			result.element("code",400);
			return result;
		}
		for(Cookie cookie:cookies) {
		if(cookie.getName().equals("login")&&cookie.getValue().equals("true")&&skuIds.equals("2")&&skuNumbers.equals("1")
				&&stockIds.equals("Netease123")&&receiverName.equals("张三")&&cellPhone.equals("20000000000")&&addressDetail.equals("网商路599号")
				&&province.equals("浙江省")&&city.equals("杭州市")&&area.equals("滨江区")&&voiceStatus.equals("0:未开发票,1:已开发票")
				&&needInvoice.equals("1:需要发票,0:不需要发票")&&invoiceHead.equals("网易杭州研究院")&&transportFee.equals("0")&&logisticsCompanyId.equals("1")
				&&accessSource.equals("noSource")&&accessDevice.equals("0")) {
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
