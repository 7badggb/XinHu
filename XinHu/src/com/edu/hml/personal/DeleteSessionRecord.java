package com.edu.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class DeleteSessionRecord extends BaseTest{

	@Test(description="ɾ���ҵĻỰ��¼")
	//ɾ���ҵĻỰ��¼
	public void test1(){
		webtest.click("xpath=//span[@class='spanactive']");
		//��������
		webtest.click("xpath=//td[text()='��������']");
		//�ҵĻỰ��¼
		webtest.click("xpath=//td[text()='�ҵĻỰ��¼']");
		//ѡ�м�¼
		webtest.click("xpath=/html/body/table/tbody/tr/td/div/div]");
		//���ɾ��
		webtest.click("xpath=//td[text()='ɾ��']");
		//���ȷ��
		webtest.click("xpath=//td[text()='ȷ��']");
	}
	
}