package com.edu.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ExportAddressList extends BaseTest{

	
	@Test(description="导出内部通讯录")
	public void test5(){
		webtest.click("xpath=//span[@class='spanactive']");
		webtest.click("xpath=//div[text()='个人中心']");
		webtest.click("xpath=//div[text()='内部通讯录']");
		webtest.click("xpath=//button[text()='导出']");
	}

}
