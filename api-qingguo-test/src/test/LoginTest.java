package test;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import core.HttpDriver;
import utils.Checker;
import utils.ReadPro;

import core.ApiListener;
import net.sf.json.JSONObject;
@Listeners(ApiListener.class)
public class LoginTest {
	String login_url="/common/fgadmin/login";
	@Test(description="��¼�ɹ�")
	public void testLogin1() {
		JSONObject user=new JSONObject();
		user.element("phoneArea", "86");
		user.element("phoneNumber", "200000000000");
		user.element("password", "netease123");
		
		String  result=HttpDriver.doPost(login_url, user);
		Checker check=new Checker(result);
		try {
			check.assertXpath("message", "success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(description="�û���Ϊ��")
	public void testLogin2() {
		JSONObject user=new JSONObject();
		user.element("phoneArea", "86");
		user.element("password", "netease123");		
		String  result=HttpDriver.doPost(login_url, user);
		Checker check=new Checker(result);
		try {
			check.assertXpath("message", "�û���Ϊ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(description="�û������������")
	public void testLogin3() {
		JSONObject user=new JSONObject();
		user.element("phoneArea", "86");
		user.element("phoneNumber", "21111111111");
		user.element("password", "netease123");
		
		String  result=HttpDriver.doPost(login_url, user);
		Checker check=new Checker(result);
		try {
			check.assertXpath("message", "�û������������");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
