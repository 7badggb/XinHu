package com.edu.system;

import org.testng.annotations.Test;

public class SearchApply2 extends LoginDemo{

	public void initDemo() {
		//��������ģ��
		webtest.click("xpath=//span[@pmenuid='40']");
		//����ҵ���������	
		webtest.click("id=menu_list_num44");
	}
		
	@Test
	public void SearchApply1() throws InterruptedException {
		initDemo();
		//��������
		webtest.click("xpath=//button[text()='�����']");
		//��������
		webtest.click("xpath=//button[text()='�����']");
		//���δͨ��
		webtest.click("xpath=//button[text()='δͨ��']");
		//���������
		webtest.click("xpath=//button[text()='������']");
		//������ύ
		webtest.click("xpath=//button[text()='���ύ']");
		//���ȫ��״̬
		webtest.click("xpath=//button[text()='ȫ��״̬']");
		//����������
		webtest.type("xpath=//input[contains(@id,'key')]","KA-20160826-0001");
		//�������
		webtest.click("xpath=//button[@click='search']");
		//��������պ�����
		webtest.typeAndClear("xpath=//input[contains(@id,'key')]","�ŷ�");
		//�������
		webtest.click("xpath=//button[@click='search']");
		//��������պ�����
		webtest.typeAndClear("xpath=//input[contains(@id,'key')]","�ź��ͷ�");
		//�������
		webtest.click("xpath=//button[@click='search']");
		
//		WebElement element=webtest.FindElement("xpath=//button[@click='search']");
//		assertTrue(webtest.isTextPresent("OOK"));	
	}
}
