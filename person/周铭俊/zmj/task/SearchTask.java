package com.edu.zmj.task;

import static org.testng.Assert.assertTrue;

import static org.testng.Assert.assertFalse;
import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class SearchTask extends BaseTest {
	
	public void initDemo() {
		//进入任务模块
		webtest.click("xpath=//span[@pmenuid='66']");
		//点击我的任务
		webtest.click("id=menu_list_num68");
	}
	
	@Test(description="搜索已有的关键字")
	public void SearchTask1() {
		initDemo();
		webtest.type("xpath=//input[@class='form-control']","信呼功能开发");
		webtest.click("xpath=//button[@click='searchbtn']");
		//判断是否有结果		
		assertTrue(webtest.isDisplayed("xpath=//tr[@oi='0']"));	
	}
	@Test(description="搜索不存在的关键字")
	public void SearchTask2() throws InterruptedException {
		refreshPage();
		initDemo();
		webtest.type("xpath=//input[@class='form-control']","0");
		webtest.click("xpath=//button[@click='searchbtn']");
		//判断是否有结果		
		assertFalse(webtest.isDisplayed("xpath=//tr[@oi='0']"));	
	}
	@Test(description="通过状态搜索")
	public void SearchTask3() throws InterruptedException{
		refreshPage();
		initDemo();
		webtest.click("xpath=//select[@class='form-control']");
		webtest.click("xpath=//option[@value='0']");
		webtest.click("xpath=//button[@click='searchbtn']");
		//判断是否有结果		
		assertTrue(webtest.isDisplayed("xpath=//tr[@oi='0']"));	
	}
}