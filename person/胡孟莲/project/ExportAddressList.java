package com.webtest.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ExportAddressList extends BaseTest{
	public void initDemo(){
		//个人办公
		webtest.click("xpath=//span[@pmenuid='38']");
		//个人中心
		webtest.click("id=menu_list_num39");
	}
	
	@Test(description="导出内部通讯录")
	public void test(){
		initDemo();
		//点击内部通讯录
		webtest.click("id=menu_list_reimtxl");
		//点击导出
		webtest.click("xpath=//button[@click='daochu,1']");
	}

}
