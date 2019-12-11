package com.edu.gaolu.system;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class SearchApply1 extends BaseTest {

	public void initDemo() {
		//��������ģ��
		webtest.click("xpath=//span[@pmenuid='40']");
		//����ҵ�����	
		webtest.click("id=menu_list_applymy");
	}
	
	@Test
	public void SearchApply101() throws InterruptedException {
		initDemo();
		//���ѡ��ģ��������
		webtest.click("xpath=//select[contains(@id,'mode')]");
		//ѡ����Ʒ����
		webtest.click("xpath=//select[contains(@id,'mode')]/optgroup[1]/option[1]");
		//��������
		webtest.click("xpath=//button[text()='�����']");
		//����������
		webtest.type("xpath=//input[contains(@id,'key')]","CD-20191202-0001");
		//�������
		webtest.click("xpath=//button[@click='search']");	
	}
	
	@Test
	public void SearchApply102() throws InterruptedException {
		initDemo();
		//���ѡ��ģ��������
		webtest.click("xpath=//select[contains(@id,'mode')]");
		//ѡ��ά�ޱ���
		webtest.click("xpath=//select[contains(@id,'mode')]/optgroup[1]/option[5]");
		//�����ֵ
		webtest.typeAndClear("xpath=//input[contains(@id,'key')]", "");
		//�������
		webtest.click("xpath=//button[@click='search']");
		//���������
		webtest.click("xpath=//button[text()='������']");
		//����������
		webtest.type("xpath=//input[contains(@id,'key')]","WX-20191204-0001");
		//�������
		webtest.click("xpath=//button[@click='search']");	
	}
	
	@Test
	public void SearchApply103() throws InterruptedException {
		initDemo();
		//���ѡ��ģ��������
		webtest.click("xpath=//select[contains(@id,'mode')]");
		//ѡ�������
		webtest.click("xpath=//select[contains(@id,'mode')]/optgroup[3]/option[1]");
		//�����ֵ
		webtest.typeAndClear("xpath=//input[contains(@id,'key')]", "");
		//�������
		webtest.click("xpath=//button[@click='search']");
		//��������
		webtest.click("xpath=//button[text()='�����']");
	}
	
}
