package com.edu.yanjie.demo;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class TestRefresh extends BaseTest  {
	@Test
	public void doTest() throws InterruptedException {
		 //����ҳ
			webtest.open("http://localhost:8888/xinhu_utf8_v1.5.9");
			//��¼
			webtest.type("name=adminuser", "admin");
			webtest.type("xpath=//input[@type='password']", "123456");
			webtest.click("name=button");
			//����ϵͳģ��
			webtest.click("xpath=//span[@pmenuid='1']");
			//�����������
			webtest.click("id=menu_down_isons_num220");
			//�����˾��λ
			webtest.click("id=menu_list_company");
			refreshPage();
		
	}
	

}
