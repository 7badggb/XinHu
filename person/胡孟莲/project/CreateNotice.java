package com.webtest.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CreateNotice extends BaseTest{
	public void initDemo(){
		//个人办公
		webtest.click("xpath=//span[@pmenuid='38']");
	}
	
	@Test(description="新增通知公告")
	public void test3(){
		initDemo();
		//点击通知公告
		webtest.click("id=menu_list_gong");
		//点击新增
		webtest.click("xpath=//button[@click='clickwin,0']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//输入标题
		webtest.type("xpath=//input[@name='title']", "通知公告");
		//点击保存
		webtest.click("xpath=//input[@onclick='return c.save()']");
		//webtest.click("xpath=//input[@value='保存(s)']")
		//选择类型名
		//webtest.click("xpath=//option[@value='通知公告']");
		webtest.selectByValue("xpath=//*[@id=\"div_typename\"]/select","通知公告");
		//点击保存
		webtest.click("xpath=//input[@onclick='return c.save()']");
		//离开iframe
		webtest.leaveFrame();
	}

}
