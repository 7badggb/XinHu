package com.edu.system;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class SearchApply3 extends BaseTest{

	public void initDemo() {
		//��������ģ��
		webtest.click("xpath=//span[@pmenuid='40']");
		//����ҵ�����	
		webtest.click("id=menu_list_applymy");
	}
	
	@Test
	public void SearchApply301() throws InterruptedException {
		initDemo();
		//����������
		webtest.type("xpath=//input[contains(@id,'key')]","XW-20170406-0001");
		//�������
		webtest.click("xpath=//button[@click='search']");
		//�������
		webtest.click("xpath=//*[contains(@id,'tbody')]/tr/td[10]/a");
		//�������
		webtest.click("xpath=//*[contains(@id,'rockmenuli')]/ul/li[3]");
		//��������
		webtest.type("id=confirm_input", "��");
		//���ȷ��
		webtest.click("id=confirm_btn1");
	}
	
	@Test
	public void SearchApply302() throws InterruptedException {
//		//���ȫ��״̬
//		webtest.click("xpath=//button[text()='ȫ��״̬']");
		//����������
		webtest.typeAndClear("xpath=//input[contains(@id,'key')]","KD-20191210-0001");
		//�������
		webtest.click("xpath=//button[@click='search']");
		//�������
		webtest.click("xpath=//*[contains(@id,'tbody')]/tr[3]/td[10]/a");
		//�����������
		webtest.click("xpath=//*[contains(@id,'rockmenuli')]/ul/li[4]");
		//��������
		webtest.type("id=confirm_input", "����");
		//���ȷ��
		webtest.click("id=confirm_btn1");
	}
	
	@Test
	public void SearchApply303() throws InterruptedException {
		//���ѡ��ģ��������
		webtest.click("xpath=//select[contains(@id,'mode')]");
		//ѡ������
		webtest.click("xpath=//select[contains(@id,'mode')]/optgroup[2]/option[1]");
		//��������
		webtest.click("xpath=//button[text()='�����']");
		//����������
		webtest.type("xpath=//input[contains(@id,'key')]","XW-20170406-0001");
		//�������
		webtest.click("xpath=//button[@click='search']");
	}
}
