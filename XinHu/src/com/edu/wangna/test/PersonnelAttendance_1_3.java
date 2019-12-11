package com.edu.wangna.test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;
import com.edu.dataprovider.NSDataProvider;
import com.webtest.dataprovider.ExcelDataProvider;
@Listeners(ApiListener.class)
public class PersonnelAttendance_1_3 extends BaseTest {
	
	public void InitDemo() {
		//�������¿���ģ��
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[6]");
		//������µ���
		webtest.click("xpath=//*[@id=\"menu_list_num84\"]");
	}
	
	@Test(description="���ղ�ְͬλ�鿴Ա��������")
	public void test1() throws InterruptedException {	
		InitDemo();
		//���Ա������
		webtest.click("xpath=//*[@id=\"menu_list_num149\"]");
		webtest.selectByValue("xpath=//select[starts-with(@id,'type')]", "ranking");
		webtest.click("xpath=//*[@id=\"content_num149\"]/div[1]/table/tbody/tr/td[4]/button");
		assertTrue(true);
	}
	
	@Test(description="���ղ��Ų鿴Ա��������")
	public void test2() throws InterruptedException {	
		InitDemo();
		//���Ա������
		webtest.click("xpath=//*[@id=\"menu_list_num149\"]");
		webtest.selectByValue("xpath=//select[starts-with(@id,'type')]", "deptname");
		webtest.click("xpath=//*[@id=\"content_num149\"]/div[1]/table/tbody/tr/td[4]/button");
		assertTrue(true);
	}
	
	@Test(description="�����Ա�鿴Ա��������")
	public void test3() throws InterruptedException {	
		InitDemo();
		//���Ա������
		webtest.click("xpath=//*[@id=\"menu_list_num149\"]");
		webtest.selectByValue("xpath=//select[starts-with(@id,'type')]", "sex");
		webtest.click("xpath=//*[@id=\"content_num149\"]/div[1]/table/tbody/tr/td[4]/button");
		assertTrue(true);
	}
	
	@Test(description="������ְ����鿴Ա��������")
	public void test4() throws InterruptedException {	
		InitDemo();
		//���Ա������
		webtest.click("xpath=//*[@id=\"menu_list_num149\"]");
		webtest.selectByValue("xpath=//select[starts-with(@id,'type')]", "nianxian");
		webtest.click("xpath=//*[@id=\"content_num149\"]/div[1]/table/tbody/tr/td[4]/button");
		assertTrue(true);
	}
	
	@Test(description="������Ա״̬�鿴Ա��������")
	public void test5() throws InterruptedException {	
		InitDemo();
		//���Ա������
		webtest.click("xpath=//*[@id=\"menu_list_num149\"]");
		webtest.selectByValue("xpath=//select[starts-with(@id,'type')]", "state");
		webtest.click("xpath=//*[@id=\"content_num149\"]/div[1]/table/tbody/tr/td[4]/button");
		assertTrue(true);
	}
}