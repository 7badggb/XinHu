package com.edu.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ExportAddressList extends BaseTest{

	
	@Test(description="�����ڲ�ͨѶ¼")
	public void test5(){
		webtest.click("xpath=//span[@class='spanactive']");
		webtest.click("xpath=//div[text()='��������']");
		webtest.click("xpath=//div[text()='�ڲ�ͨѶ¼']");
		webtest.click("xpath=//button[text()='����']");
	}

}
