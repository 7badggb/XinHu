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
	
	@Test(description="�����ҵĻỰ��¼")
	public void test6(){
		webtest.click("id=menu_list_num39");//��������
		webtest.click("id=menu_list_reimrecord");//�ҵĻỰ��¼
		webtest.type("xpath=//input[@placeholder='��Ϣ����']","��Ϣ");
		webtest.click("xpath=//input[@id='dt1_1576046004788_877']");
		webtest.click("xpath=//td[xu='31']");//����31��
		webtest.click("xpath=//a[text()='ȷ��']");
		webtest.click("xpath=//input[@id='dt2_1576046004788_877']");
		webtest.click("xpath=//td[xu='1']");//����1��
		webtest.click("xpath=//a[text()='ȷ��']");
		webtest.click("xpath=//button[text()='����']");
	}

}
