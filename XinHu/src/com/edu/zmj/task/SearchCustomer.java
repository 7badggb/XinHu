package com.edu.zmj.task;

import static org.testng.Assert.assertTrue;

import static org.testng.Assert.assertFalse;
import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class SearchCustomer extends BaseTest {
	
	public void initDemo() {
		//进入客户模块
		webtest.click("xpath=//span[@pmenuid='63']");
		//点击客户
		webtest.click("id=menu_list_num64");
		//点击我的客户
		webtest.click("id=menu_list_num112");
	}
	
	@Test(description="搜索已有的关键字")
	public void SearchCustomer1() {
		initDemo();
		webtest.type("xpath=//input[@class='form-control']","百度");
		webtest.click("xpath=//button[@click='searchbtn']");
		//判断是否有结果		
		assertTrue(webtest.isDisplayed("xpath=//tr[@oi='0']"));	
	}
	@Test(description="搜索不存在的关键字")
	public void SearchCustomer2() throws InterruptedException {
		refreshPage();
		initDemo();
		webtest.type("xpath=//input[@class='form-control']","0");
		webtest.click("xpath=//button[@click='searchbtn']");
		//判断是否有结果		
		assertFalse(webtest.isDisplayed("xpath=//tr[@oi='0']"));	
	}

}