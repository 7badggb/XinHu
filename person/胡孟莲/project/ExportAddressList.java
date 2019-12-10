package com.webtest.project;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ExportAddressList extends BaseTest{
	@Test//(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	public void login(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9090/?m=login");
		webtest.type("name=admin", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
	}
	
	@Test(description="�����ڲ�ͨѶ¼")
	public void test5(){
		webtest.click("xpath=//span[@class='spanactive']");
		webtest.click("xpath=//td[text()='��������']");
		webtest.click("xpath=//td[text()='�ڲ�ͨѶ¼']");
		webtest.click("xpath=//td[text()='����']");
	}

}
