package test;

import java.io.IOException;
import org.testng.annotations.Test;

import core.HttpDriver;
import net.sf.json.JSONObject;
import utils.Checker;
import utils.Common;

public class SubmitTest {
	String submit_url="/fgadmin/orders/submit";
	@Test(description="submit")
	public void testSubmit1() throws IOException, Exception {
		org.apache.http.client.CookieStore cookieStore = Common.getCookie("20000000000", "netease123");
		JSONObject submitbody = new JSONObject();
		submitbody.element("skuIds","2");
		submitbody.element("skuNumbers","1");
		submitbody.element("stockIds","Netease123");
		submitbody.element("receiverName","张三");
		submitbody.element("cellPhone","20000000000");
		submitbody.element("addressDetail","网商路599号");
		submitbody.element("province","浙江省");
		submitbody.element("city","杭州市");
		submitbody.element("area","滨江区");
		submitbody.element("voiceStatus","0:未开发票,1:已开发票");
		submitbody.element("needInvoice","1:需要发票,0:不需要发票");
		submitbody.element("invoiceHead","网易杭州研究院");
		submitbody.element("transportFee","0");
		submitbody.element("logisticsCompanyId","1");
		submitbody.element("accessSource","noSource");
		submitbody.element("accessDevice","0");
		
		String result=HttpDriver.doPost(submit_url,submitbody,cookieStore);
		Checker check = new Checker(result);
		try {
			check.assertXpath("message", "success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(description="请求参数为空(收件人姓名为空)")
	public void testSubmit2() throws IOException,Exception{
		org.apache.http.client.CookieStore cookieStore = Common.getCookie("20000000000", "netease123");
		JSONObject submitbody = new JSONObject();
		submitbody.element("skuIds","2");
		submitbody.element("skuNumbers","1");
		submitbody.element("stockIds","Netease123");
		submitbody.element("receiverName","");
		submitbody.element("cellPhone","20000000000");
		submitbody.element("addressDetail","网商路599号");
		submitbody.element("province","浙江省");
		submitbody.element("city","杭州市");
		submitbody.element("area","滨江区");
		submitbody.element("voiceStatus","0:未开发票,1:已开发票");
		submitbody.element("needInvoice","1:需要发票,0:不需要发票");
		submitbody.element("invoiceHead","网易杭州研究院");
		submitbody.element("transportFee","0");
		submitbody.element("logisticsCompanyId","1");
		submitbody.element("accessSource","noSource");
		submitbody.element("accessDevice","0");
		String result=HttpDriver.doPost(submit_url,submitbody,cookieStore);
		Checker check = new Checker(result);
		try {
			check.assertXpath("message", "请求失败");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
