package com.edu.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CreateSchedule extends BaseTest{
	
	@Test(description="�����ճ�")
	//�����ճ�
	public void test2(){
		webtest.click("xpath=//span[@class='spanactive']");
		//�����������
		webtest.click("xpath=//td[text()='��������']");
		//���������������
		webtest.click("xpath=//td[text()='������������']");
		//ѡ��һ�������������ü�¼������Ҳ�Ĳ���
		webtest.click("xpath=//a[@oj='9']");
		//ѡ������
		webtest.click("xpath=//td[text()='����']");
		//��������
		webtest.type("xpath=//textarea[@class='input']", "�������۵�����");
		//���ȷ��
		webtest.click("xpath=//td[text()='ȷ��']");
	}
}
