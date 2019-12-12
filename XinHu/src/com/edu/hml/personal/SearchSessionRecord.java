package com.webtest.Personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SearchSessionRecord extends BaseTest{
	
	@Test//(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	public void login(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9090/?m=login");
		webtest.type("name=admin", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
	}
	
	@Test(description="搜索我的会话记录")
	public void test6(){
		webtest.click("id=menu_list_num39");//个人中心
		webtest.click("id=menu_list_reimrecord");//我的会话记录
		webtest.type("xpath=//input[@placeholder='消息内容']","信息");
		webtest.click("xpath=//input[@id='dt1_1576046004788_877']");
		webtest.click("xpath=//td[xu='31']");//本月31号
		webtest.click("xpath=//a[text()='确定']");
		webtest.click("xpath=//input[@id='dt2_1576046004788_877']");
		webtest.click("xpath=//td[xu='1']");//本月1号
		webtest.click("xpath=//a[text()='确定']");
		webtest.click("xpath=//button[text()='搜索']");
	}

}
