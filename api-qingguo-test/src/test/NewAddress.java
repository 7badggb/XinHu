package test;

import java.io.IOException;

import org.testng.annotations.Test;
import core.HttpDriver;
import net.sf.json.JSONObject;
import utils.Checker;
import utils.Common;
//����
public class NewAddress {

	String newadd_url = "/fgadmin/address/new";
	@Test
	public void newaddress1() throws IOException, Exception{
		org.apache.http.client.CookieStore cookieStore = Common.getCookie("20000000000", "netease123");
		JSONObject user=new JSONObject();
		user.element("receiverName", "����");
		user.element("cellPhone", "12615813537");
		user.element("addressDetail","1��3��Ԫ");
		user.element("province", "�㽭ʡ");
		user.element("city", "������");
		user.element("area", "������");
		
		String  result=HttpDriver.doPost(newadd_url, user,cookieStore);
		Checker check=new Checker(result);
		try {
			check.assertXpath("message", "success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(description="�û�������ȷ")
	public void newaddress2() throws IOException, Exception {
		org.apache.http.client.CookieStore cookieStore = Common.getCookie("20000000000", "netease123");
		JSONObject user=new JSONObject();
		user.element("receiverName", 123);
		user.element("cellPhone", "12615813537");
		user.element("addressDetail","1��3��Ԫ");
		user.element("province", "�㽭ʡ");
		user.element("city", "������");
		user.element("area", "�� �� ��");		
		
		String  result=HttpDriver.doPost(newadd_url, user,cookieStore);
		Checker check=new Checker(result);
		try {
			check.assertXpath("message", "����ʧ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(description="��ַ����ȷ")
	public void newaddress3() throws IOException, Exception {
		org.apache.http.client.CookieStore cookieStore = Common.getCookie("20000000000", "netease123");
		JSONObject user=new JSONObject();
		user.element("receiverName", "����");
		user.element("cellPhone", "12615813537");
		user.element("addressDetail",123);
		user.element("province", "�㽭ʡ");
		user.element("city", "������");
		user.element("area", "�� �� ��");
		
		String  result=HttpDriver.doPost(newadd_url, user,cookieStore);
		Checker check=new Checker(result);
		try {
			check.assertXpath("message", "����ʧ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
