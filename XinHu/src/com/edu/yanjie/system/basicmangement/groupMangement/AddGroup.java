package com.edu.yanjie.system.basicmangement.groupMangement;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.xmlbeans.impl.xb.xsdschema.impl.PublicImpl;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class AddGroup extends BaseTest {
	public void InitDemo() {
		//����ϵͳģ��
		webtest.click("xpath=//span[@pmenuid='1']");
		//�����������
		webtest.click("id=menu_down_isons_num220");
		//��������
		webtest.click("id=menu_list_group");
	}
	@BeforeTest
	public void doBeforeTest() {	
		deleteRecord("xinhu_group", "yan");
	}
	@Test(description="������")
	public void addGroup1() throws InterruptedException {
		InitDemo();
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//��������
		webtest.type("class=form-control","yan");
		//˫��ȷ����ť
		webtest.doubleClick("xpath=//button[@class='btn btn-primary']");
		assertTrue(webtest.isTextPresent("yan"));
	}
	@Test(description="��������Ϊ�յ���")
	public void addGroup2() throws InterruptedException {
		InitDemo();
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�ж�ȷ����ť�Ƿ�Ϊ�һ�״̬
		assertFalse(webtest.isEnabled("class=btn btn-primary"));
	}

}
