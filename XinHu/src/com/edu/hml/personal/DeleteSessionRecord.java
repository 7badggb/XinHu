package com.edu.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class DeleteSessionRecord extends BaseTest{
	public void initDemo(){
		//���˰칫
		webtest.click("xpath=//span[@pmenuid='38']");
		//��������
		webtest.click("id=menu_list_num39");
	}
	
	@Test(description="ɾ���ҵĻỰ��¼")
	//ɾ���ҵĻỰ��¼
	public void test1(){
		initDemo();
		//�ҵĻỰ��¼
		webtest.click("id=menu_list_reimrecord");
		//ѡ�м�¼��ѡ��
		webtest.click("xpath=//input[@type='checkbox']");
		//���ɾ��
		webtest.click("xpath=//button[@click='del']");
		//���ȷ��
		webtest.click("xpath=//button[@sattr='yes']");
	}
	
}