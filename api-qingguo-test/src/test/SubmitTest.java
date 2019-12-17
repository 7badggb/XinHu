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
		submitbody.element("receiverName","����");
		submitbody.element("cellPhone","20000000000");
		submitbody.element("addressDetail","����·599��");
		submitbody.element("province","�㽭ʡ");
		submitbody.element("city","������");
		submitbody.element("area","������");
		submitbody.element("voiceStatus","0:δ����Ʊ,1:�ѿ���Ʊ");
		submitbody.element("needInvoice","1:��Ҫ��Ʊ,0:����Ҫ��Ʊ");
		submitbody.element("invoiceHead","���׺����о�Ժ");
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
	@Test(description="�������Ϊ��(�ռ�������Ϊ��)")
	public void testSubmit2() throws IOException,Exception{
		org.apache.http.client.CookieStore cookieStore = Common.getCookie("20000000000", "netease123");
		JSONObject submitbody = new JSONObject();
		submitbody.element("skuIds","2");
		submitbody.element("skuNumbers","1");
		submitbody.element("stockIds","Netease123");
		submitbody.element("receiverName","");
		submitbody.element("cellPhone","20000000000");
		submitbody.element("addressDetail","����·599��");
		submitbody.element("province","�㽭ʡ");
		submitbody.element("city","������");
		submitbody.element("area","������");
		submitbody.element("voiceStatus","0:δ����Ʊ,1:�ѿ���Ʊ");
		submitbody.element("needInvoice","1:��Ҫ��Ʊ,0:����Ҫ��Ʊ");
		submitbody.element("invoiceHead","���׺����о�Ժ");
		submitbody.element("transportFee","0");
		submitbody.element("logisticsCompanyId","1");
		submitbody.element("accessSource","noSource");
		submitbody.element("accessDevice","0");
		String result=HttpDriver.doPost(submit_url,submitbody,cookieStore);
		Checker check = new Checker(result);
		try {
			check.assertXpath("message", "����ʧ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
