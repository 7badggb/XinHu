package com.webtest.xinhu.reim;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ProcessTerm extends BaseTest{
	public void InitDemo() {
		webtest.click("xpath=//span[@pmenuid='7']");
		webtest.click("id=menu_list_num91");
		webtest.selectByValue("xpath=//select[@class='form-control']", "1");
	}
	@Test(description="ɸѡ����������")
	public void termAdd() {
		InitDemo();
		webtest.click("xpath=//i[@class='icon-plus']");
		webtest.type("name=name","���й���1");
		webtest.type("name=num","all1");
		webtest.type("name=pnum","all1");
		webtest.click("name=sort");
		webtest.click("class=icon-save");
		webtest.click("id=tabs_num91");
		assertTrue(webtest.isTextPresent("���й���1"));
	}
	@Test(description="ɸѡ������ɾ��")
	public void termDelete() {
		webtest.click("xpath=//td[@row='0']");
		webtest.click("xpath=//i[@class='icon-trash']");
		webtest.click("xpath=//i[@class='icon-ok']");
		assertTrue(webtest.isTextPresent("���й���"));
	}
}
