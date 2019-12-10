package com.webtest.project;

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
	
	@Test(description="�����ҵĻỰ��¼")
	public void test6(){
		webtest.click("xpath=//td[text()='��������']");
		webtest.click("xpath=//td[text()='�ҵĻỰ��¼']");
		webtest.type("xpath=//input[@placeholder='��Ϣ����']","��Ϣ");
		
	}

}
