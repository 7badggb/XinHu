package com.webtest.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CreateNotice extends BaseTest{
	public void initDemo(){
		//���˰칫
		webtest.click("xpath=//span[@pmenuid='38']");
	}
	
	@Test(description="����֪ͨ����")
	public void test3(){
		initDemo();
		//���֪ͨ����
		webtest.click("id=menu_list_gong");
		//�������
		webtest.click("xpath=//button[@click='clickwin,0']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//�������
		webtest.type("xpath=//input[@name='title']", "֪ͨ����");
		//�������
		webtest.click("xpath=//input[@onclick='return c.save()']");
		//webtest.click("xpath=//input[@value='����(s)']")
		//ѡ��������
		//webtest.click("xpath=//option[@value='֪ͨ����']");
		webtest.selectByValue("xpath=//*[@id=\"div_typename\"]/select","֪ͨ����");
		//�������
		webtest.click("xpath=//input[@onclick='return c.save()']");
		//�뿪iframe
		webtest.leaveFrame();
	}

}
