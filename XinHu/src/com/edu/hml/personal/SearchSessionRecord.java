package com.edu.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SearchSessionRecord extends BaseTest{

	
	@Test(description="�����ҵĻỰ��¼")
	public void test6(){
		webtest.click("id=menu_list_num39");//��������
		webtest.click("id=menu_list_reimrecord");//�ҵĻỰ��¼
		webtest.type("xpath=//input[@placeholder='��Ϣ����']","��Ϣ");
		webtest.click("xpath=//input[@id='dt1_1576046004788_877']");
		webtest.click("xpath=//td[xu='31']");//����31��
		webtest.click("xpath=//a[text()='ȷ��']");
		webtest.click("xpath=//input[@id='dt2_1576046004788_877']");
		webtest.click("xpath=//td[xu='1']");//����1��
		webtest.click("xpath=//a[text()='ȷ��']");
		webtest.click("xpath=//button[text()='����']");
	}

}
