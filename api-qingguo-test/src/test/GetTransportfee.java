package test;

import java.io.IOException;

import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.testng.annotations.Test;

import utils.Common;

import core.HttpDriver;
import net.sf.json.JSONObject;
import utils.Checker;
//������
public class GetTransportfee {
	String gettransportfee_url="/common/getTransportFee";
	@Test(description="��ȡ��ȷ��ַ�˷�")
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
	@Test(description="����id")
	public void testGetTransportfee1() throws IOException, Exception {
		String result=HttpDriver.doGet(gettransportfee_url,"id=2");
		Checker check=new Checker(result);
		try {
			check.assertXpath("message", "����ʧ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}