package com.webtest.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Communication extends BaseTest{
	public void initDemo(){
		//���˰칫
		webtest.click("xpath=//span[@pmenuid='38']");
		//��������
		webtest.click("id=menu_list_num39");
	}
	@Test(description="�ڲ�ͨѶ")
	public void test(){
		initDemo();
		//����ڲ�ͨѶ¼
		webtest.click("id=menu_list_reimtxl");
		webtest.click("xpath=button[@onclick='openchat(3,0,'upload/face/3.jpg')']");
		webtest.type("xpath=//textarea[@onpaste='im.readclip(event)']","������Ϣ��С��");
		webtest.click("xpath=//a[@tools=send']");//����
	}

}
