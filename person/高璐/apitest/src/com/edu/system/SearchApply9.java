package com.edu.system;

import org.testng.annotations.Test;

public class SearchApply9 extends LoginDemo{

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
		//ѡ������
		webtest.click("xpath=//select[contains(@id,'mode')]/optgroup[2]/option[1]");
		//��������
		webtest.click("xpath=//button[text()='�����']");
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
	
/*	@Test
	public void SearchApply1() throws InterruptedException {
		SearchApply();
		//ѡ��
		webtest.click("xpath=//tbody[contains(@id,'tbody')]/tr");
		//ѡ������
		webtest.click("xpath=//button[contains(@id,'xiang')]");
		//����˵��
		webtest.type("id=other_explain","ok");
		//����ύ
		webtest.click("id=spage_btn");
	}*/
}
