package com.webtest.project;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CreateSchedule extends BaseTest{
	@Test//(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	public void login(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9090/?m=login");
		webtest.type("name=admin", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
	}
	@Test(description="�����ճ�")
	//�����ճ�
	public void test2(){
		webtest.click("xpath=//span[@class='spanactive']");
		//�����������
		webtest.click("xpath=//td[text()='��������']");
		//���������������
		webtest.click("xpath=//td[text()='������������']");
		//ѡ��һ�������������ü�¼������Ҳ�Ĳ���
		webtest.click("xpath=//td[text()='']");
		//ѡ������
		webtest.click("xpath=//td[text()='����']");
		//��������
		webtest.type("xpath=//textarea[@class='input']", "�������۵�����");
		//���ȷ��
		webtest.click("xpath=//td[text()='ȷ��']");
	}
}
