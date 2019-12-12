package com.edu.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class DeleteSessionRecord extends BaseTest{

	@Test(description="删除我的会话记录")
	//删除我的会话记录
	public void test1(){
		webtest.click("xpath=//span[@class='spanactive']");
		//个人中心
		webtest.click("xpath=//td[text()='个人中心']");
		//我的会话记录
		webtest.click("xpath=//td[text()='我的会话记录']");
		//选中记录
		webtest.click("xpath=/html/body/table/tbody/tr/td/div/div]");
		//点击删除
		webtest.click("xpath=//td[text()='删除']");
		//点击确定
		webtest.click("xpath=//td[text()='确定']");
	}
	
}