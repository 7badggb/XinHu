package com.edu.yanjie.system.IM.conversationManagement;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class AddConversation extends BaseTest {
	public void initDemo() {
		//����ϵͳģ��
		webtest.click("xpath=//span[@pmenuid='1']");
		//�����ʱͨ�Ź���
		webtest.click("id=menu_list_num14");				
		//����Ự����
		webtest.click("id=menu_list_num16");
	}
	@Test(description="���һ���Ự��Ϊ1�ĻỰ")
	public void addConversation1() throws InterruptedException {
		initDemo();
		//���������ť
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//��������
		webtest.type("name=name", "1");
		//˫��ȷ����ť
		webtest.doubleClick("xpath=//button[@class='btn btn-primary']");
		assertTrue(webtest.isTextPresent("1"));
	}
	@Test(description="���һ���Ự��Ϊ�յĻỰ")
	public void addConversation2() throws InterruptedException {
		refreshPage();
		initDemo();
		//���������ť
		webtest.click("xpath=//button[@class='btn btn-primary']");		
		//�ж�ȷ����ť�Ƿ�Ϊ�û�״̬
		assertFalse(webtest.isEnabled("xpath=//button[@class='btn btn-primary']"));
	}
	@Test(description="���һ�����ŵĻỰ")
	public void addConversation3() throws InterruptedException {
		refreshPage();
		initDemo();
		//���������ť
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//ѡ��һ������
		webtest.click("xpath=//button[@changeuser='name']");
		webtest.click("xpath=//input[@xname='�����']");
		webtest.click("xpath=//input[@value='ȷ��']");
		//˫��ȷ����ť
		webtest.doubleClick("xpath=//button[@class='btn btn-primary']");
		assertTrue(webtest.isTextPresent("�����"));
	}

}
