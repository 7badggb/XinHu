package com.edu.system;

import org.testng.annotations.Test;

public class SearchApply1 extends LoginDemo {

	public void initDemo() {
		//��������ģ��
		webtest.click("xpath=//span[@pmenuid='40']");
		//����ҵ�����	
		webtest.click("id=menu_list_applymy");
	}
	
	@Test
	public void SearchApply() throws InterruptedException {
		initDemo();
		//���ѡ��ģ��������
		webtest.click("xpath=//select[contains(@id,'mode')]");
		//ѡ����Ʒ����
		webtest.click("xpath=//select[contains(@id,'mode')]/optgroup[1]/option[1]");
		//���ѡ��ģ��������
		webtest.click("xpath=//select[contains(@id,'mode')]");
		//ѡ����Ʒ�ɹ�
		webtest.click("xpath=//select[contains(@id,'mode')]/optgroup[1]/option[2]");
		//���ѡ��ģ��������
		webtest.click("xpath=//select[contains(@id,'mode')]");
		//ѡ�������
		webtest.click("xpath=//select[contains(@id,'mode')]/optgroup[3]/option[1]");
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
		webtest.type("xpath=//input[contains(@id,'key')]","KA-20160815-0001");
		//�������
		webtest.click("xpath=//button[@click='search']");
		
//		WebElement element=webtest.FindElement("xpath=//button[@click='search']");
//		assertTrue(webtest.isTextPresent("OOK"));	
	}
}
