package com.webtest.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class EmailSettings extends BaseTest{
	public void initDemo(){
		//���˰칫
		webtest.click("xpath=//span[@pmenuid='38']");
	}
	
	@Test(description="��������")
	public void test(){
		initDemo();
		//����ʼ�
		webtest.click("id=menu_list_email");
		//�����������
		webtest.click("xpath=//a[@click='cogemail']");
		//����������
		webtest.type("xpath=//input[@name='email']","2724702423@qq.com");
		//��������������
		webtest.type("xpath=//input[@value name='emailpass']", "123456");
		//���ȷ��
		webtest.click("xpath=//button[@class='btn btn-info']");
		
	}

}
