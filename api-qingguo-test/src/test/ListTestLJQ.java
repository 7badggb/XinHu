package test;


import org.testng.annotations.Test;

import core.HttpDriver;
import utils.Checker;
import utils.Common;
//李嘉琪
public class ListTestLJQ {
	String List_url="/fgadmin/address/list";
	@Test(description="不登录获取list")
	public void getListFail() throws Exception {
		String result=HttpDriver.doGet(List_url);
		Checker check=new Checker(result);
		check.assertXpath("message", "需要登录");
	}
	@Test(description="登录获取list")
	public void getListSuccess() throws Exception {
		org.apache.http.client.CookieStore cookieStore = Common.getCookie("20000000000", "netease123");
		String result = HttpDriver.doGet(List_url,cookieStore);
		Checker check=new Checker(result);
		check.assertXpath("message", "success");
	}
}
