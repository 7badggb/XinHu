package com.webtest.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ExportAddressList extends BaseTest{
	public void initDemo(){
		//���˰칫
		webtest.click("xpath=//span[@pmenuid='38']");
		//��������
		webtest.click("id=menu_list_num39");
	}
	
	@Test(description="�����ڲ�ͨѶ¼")
	public void test(){
		initDemo();
		//����ڲ�ͨѶ¼
		webtest.click("id=menu_list_reimtxl");
		//�������
		webtest.click("xpath=//button[@click='daochu,1']");
	}

}
