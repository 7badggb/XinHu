package test;

import java.io.IOException;

import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.testng.annotations.Test;

import utils.Common;

import core.HttpDriver;
import net.sf.json.JSONObject;
import utils.Checker;
//周铭俊
public class GetTransportfee {
	String gettransportfee_url="/common/getTransportFee";
	@Test(description="获取正确地址运费")
	public void testGetTransportfee() throws IOException, Exception {
		String result=HttpDriver.doGet(gettransportfee_url,"id=1");
		Checker check=new Checker(result);
		try {
			check.assertXpath("message", "success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(description="错误id")
	public void testGetTransportfee1() throws IOException, Exception {
		String result=HttpDriver.doGet(gettransportfee_url,"id=2");
		Checker check=new Checker(result);
		try {
			check.assertXpath("message", "请求失败");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}