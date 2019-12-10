package com.webtest.xinhu.reim;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ProcessData extends BaseTest{
	public void InitDemo() {
		webtest.click("xpath=//span[@pmenuid='7']");
		webtest.click("id=menu_list_num24");
	}
	@Test(description="��������")
	public void dataAdd1() throws InterruptedException {
		InitDemo();
		webtest.doubleClick("xpath=//td[@row='0']");
		webtest.click("xpath=//i[@class='icon-plus']");
		webtest.type("xpath=//input[@name='name']", "����");
		webtest.type("xpath=//input[@name='num']", "�ٺ�");
		webtest.click("xpath=//input[@name='sort']");
		webtest.click("xpath=//i[@class='icon-save']");
		assertTrue(webtest.isTextPresent("����"));
	}
	@Test(description="��������ֻ������")
	public void dataAdd2() throws InterruptedException {
		webtest.doubleClick("xpath=//td[@row='0']");
		webtest.click("xpath=//i[@class='icon-plus']");
		webtest.type("xpath=//input[@name='name']", "������");
		webtest.click("xpath=//input[@name='sort']");
		webtest.click("xpath=//i[@class='icon-save']");
		assertTrue(webtest.isTextPresent("������"));
	}
	@Test(description="����ɾ��")
	public void dataDelete() throws InterruptedException {
		webtest.doubleClick("xpath=//td[@row='12']");
		webtest.click("xpath=//i[@class='icon-trash']");
		webtest.click("xpath=//i[@class='icon-ok']");
		assertTrue(webtest.isTextPresent("����ѡ��"));
	}
}
