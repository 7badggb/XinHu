package com.edu.system;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class SearchApply2 extends BaseTest {
	
	public void initDemo() {
		//��������ģ��
		webtest.click("xpath=//span[@pmenuid='40']");
		//������Ҵ���	
		webtest.click("id=menu_list_num62");
	}
	
	@Test
	public void SearchApply201() throws InterruptedException {
		initDemo();
		//��������
		webtest.click("xpath=//button[text()='�����']");
		//����������
		webtest.type("xpath=//input[contains(@id,'key')]","�ź��ͷ�");
		//�������
		webtest.click("xpath=//button[@click='search']");
		//��������պ�����
		webtest.typeAndClear("xpath=//input[contains(@id,'key')]","�ŷ�");
		//�������
		webtest.click("xpath=//button[@click='search']");
	}
	
	@Test
	public void SearchApply202() throws InterruptedException {
		initDemo();
		//��������
		webtest.click("xpath=//button[text()='�����']");
		//����������
		webtest.type("xpath=//input[contains(@id,'key')]","�ŷ�");
		//�������
		webtest.click("xpath=//button[@click='search']");
		//�������
		webtest.click("xpath=//*[contains(@id,'tbody')]/tr[1]/td[10]/a");
		//�������
		webtest.click("xpath=//*[contains(@id,'rockmenuli')]/ul/li[3]");
		//��������
		webtest.type("id=confirm_input", "��");
		//���ȷ��
		webtest.click("id=confirm_btn1");
	}
	
	@Test
	public void SearchApply203() throws InterruptedException {
		//���ȫ��״̬
		webtest.click("xpath=//button[text()='ȫ��״̬']");
		//����������
		webtest.typeAndClear("xpath=//input[contains(@id,'key')]","HF-20191127-0002");
		//�������
		webtest.click("xpath=//button[@click='search']");
		//�������
		webtest.click("xpath=//*[contains(@id,'tbody')]/tr/td[10]/a");
		//�����������
		webtest.click("xpath=//*[contains(@id,'rockmenuli')]/ul/li[4]");
		//��������
		webtest.type("id=confirm_input", "����");
		//���ȷ��
		webtest.click("id=confirm_btn1");
	}
}
