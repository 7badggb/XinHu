package com.webtest.project;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CreateNotice extends BaseTest{
	@Test//(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	public void login(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9090/?m=login");
		webtest.type("name=admin", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
	}
	
	@Test(description="����֪ͨ����")
	public void test3(){
		webtest.click("xpath=//span[@class='spanactive']");
		//���֪ͨ����
		webtest.click("xpath=//td[text()='֪ͨ����']");
		//�������
		webtest.click("xpath=//td[text()='����']");
		//�������
		webtest.type("xpath=//textarea[@class='ys2']", "֪ͨ����");
		//�������
		webtest.click("xpath=//td[text()='����']");
		//ѡ��������
		webtest.click("xpath=/html/body/div/div[2]/div/iframe/html/body/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/span/select/option[2]");
		//�������
		webtest.click("xpath=//td[text()='����']");
	}

}
