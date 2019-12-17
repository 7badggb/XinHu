package com.edu.yanjie.system.basicmangement.organization;


import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.remote.server.handler.RefreshPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.edu.core.BaseTest;


public class AddJunior extends BaseTest {
	
	public void initDemo() {
		//����ϵͳģ��
		webtest.click("xpath=//span[@pmenuid='1']");
		//�����������
		webtest.click("id=menu_down_isons_num220");
		//�����֯�ṹ
		webtest.click("id=menu_list_num6");		
	}
	@BeforeTest
	public void doBeforeTest() {	
		deleteRecord("xinhu_dept", "�Ǻ���");	
	}
	@Test(description="ֱ�ӵ�������¼�")
	public void addJunior1() {	
		initDemo();
		//�ж������¼���ť�Ƿ�һ�
		assertFalse(webtest.isEnabled("xpath=//button[@class='btn btn-success']"));		
	}
	@Test(description="ѡ��һ����֯�������¼�")
	public void addJunior2() throws InterruptedException {
		refreshPage();
		initDemo();
		webtest.click("xpath=//td[@row='4']");
		//��������¼�
		webtest.click("xpath=//button[@class='btn btn-success']");
		//��������Ϊ�Ǻ���
	    webtest.type("name=name","�Ǻ���");
		//˫������
	    webtest.doubleClick("xpath=//button[@class='btn btn-primary']");
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("�Ǻ���"));		
	}
	@Test(description="ѡ�������¼�����д����")
	public void addJunior3() throws InterruptedException {
		refreshPage();
		initDemo();
		webtest.click("xpath=//td[@row='4']");
		//��������¼�
		webtest.click("xpath=//button[@class='btn btn-success']");
		//�ж�ȷ����ť�Ƿ�һ�
		assertFalse(webtest.isEnabled("xpath=//button[@class='btn btn-success']"));		
	}




}
