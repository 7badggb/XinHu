package com.webtest.Personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SalaryEdit extends BaseTest{
	@Test//(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	public void login(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9090/?m=login");
		webtest.type("name=admin", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
	}
	@Test(description="�༭н�����")
	public void test(){
		webtest.click("xpath=//span[@class='spanactive']");//���˰칫
		webtest.click("id=menu_list_num39");//��������
		webtest.click("id=menu_list_num184");//�ҵ�н��
		webtest.click("xpath=//button[@class='btn btn-default']");//�·ݰ�ť
		webtest.click("xpath=//a[@class='a03']");//��ݣ��·�
		webtest.click("xpath=//td[text()='����']");//����
		webtest.click("xpath=//tr[@dataid='12']");//ѡ��һ��н�ʼ�¼
		webtest.click("xpath=//button[@id='xiang_157961699980_2435']");//����
		webtest.enterFrame("openinputiframe");
		webtest.click("id=showmenu");//����V
		webtest.click("xpath=//li[@lx='1']");//�༭
		webtest.type("xpath=//input[@name='base']","2000");
		webtest.click("id=AltS");//����
		webtest.leaveFrame();
	}

}
