package test;

import org.testng.annotations.Test;
import core.HttpDriver;
import net.sf.json.JSONObject;
import utils.Checker;

public class NewAddress {

	String newadd_url = "/fgadmin/address/new";
	@Test
	public void newaddress1(){
		JSONObject user=new JSONObject();
		user.element("receiverName", "张三");
		user.element("cellPhone", "12615813537");
		user.element("addressDetail","1 栋  3  单 元");
		user.element("province", " 浙江省");
		user.element("city", " 杭州市");
		user.element("area", " 滨 江 区");
		
		String  result=HttpDriver.doPost(newadd_url, user);
		Checker check=new Checker(result);
		try {
			check.assertXpath("message", "success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(description="用户名不正确")
	public void newaddress2() {
		JSONObject user=new JSONObject();
		user.element("receiverName", 123);
		user.element("cellPhone", "12615813537");
		user.element("addressDetail","1 栋  3  单 元");
		user.element("province", " 浙江省");
		user.element("city", " 杭州市");
		user.element("area", " 滨 江 区");		
		
		String  result=HttpDriver.doPost(newadd_url, user);
		Checker check=new Checker(result);
		try {
			check.assertXpath("message", "用户名不正确");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(description="地址不正确")
	public void newaddress3() {
		JSONObject user=new JSONObject();
		user.element("receiverName", "张三");
		user.element("cellPhone", "12615813537");
		user.element("addressDetail",123);
		user.element("province", " 浙江省");
		user.element("city", " 杭州市");
		user.element("area", " 滨 江 区");
		
		String  result=HttpDriver.doPost(newadd_url, user);
		Checker check=new Checker(result);
		try {
			check.assertXpath("message", "地址不正确");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
