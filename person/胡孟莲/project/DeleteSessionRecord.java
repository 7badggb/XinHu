package com.webtest.project;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class DeleteSessionRecord extends BaseTest{
	@Test//(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	public void login(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9090/?m=login");
		webtest.type("name=admin", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
	}
	
	@Test(description="ɾ���ҵĻỰ��¼")
	//ɾ���ҵĻỰ��¼
	public void test1(){
		webtest.click("xpath=//span[@class='spanactive']");
		//��������
		webtest.click("xpath=//td[text()='��������']");
		//�ҵĻỰ��¼
		webtest.click("xpath=//td[text()='�ҵĻỰ��¼']");
		//ѡ�м�¼
		webtest.click("xpath=/html/body/table/tbody/tr/td/div/div]");
		//���ɾ��
		webtest.click("xpath=//td[text()='ɾ��']");
		//���ȷ��
		webtest.click("xpath=//td[text()='ȷ��']");
	}
	
}