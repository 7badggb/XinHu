package test;

import java.io.IOException;

import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.testng.annotations.Test;

import utils.Common;

import core.HttpDriver;
import net.sf.json.JSONObject;
import utils.Checker;
//���
public class AddressDeleteTest {
		String deleteAdd_url="/fgadmin/address/delete";
		@Test(description="ɾ���ջ��ַ")
		public void testDeleteAdd1() throws IOException, Exception {
			org.apache.http.client.CookieStore cookieStore = Common.getCookie("20000000000", "netease123");
			JSONObject user=new JSONObject();
			user.element("id", 77243286);
			
			String  result=HttpDriver.doPost(deleteAdd_url, user,cookieStore);
			Checker check=new Checker(result);
			try {
				check.assertXpath("message", "success");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	@Test(description="ɾ�����ջ���ַ id ������ ")
	public void testDeleteAdd2() throws IOException, Exception {
		org.apache.http.client.CookieStore cookieStore = Common.getCookie("20000000000", "netease123");
		JSONObject user=new JSONObject();
		user.element("id", 111111);
		
		String  result=HttpDriver.doPost(deleteAdd_url, user,cookieStore);
		Checker check=new Checker(result);
		try {
			check.assertXpath("message", "����ʧ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
