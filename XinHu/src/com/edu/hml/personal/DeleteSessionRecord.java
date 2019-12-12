package com.edu.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class DeleteSessionRecord extends BaseTest{
	public void initDemo(){
		//个人办公
		webtest.click("xpath=//span[@pmenuid='38']");
		//个人中心
		webtest.click("id=menu_list_num39");
	}
	
	@Test(description="删除我的会话记录")
	//删除我的会话记录
	public void test1(){
		initDemo();
		//我的会话记录
		webtest.click("id=menu_list_reimrecord");
		//选中记录复选框
		webtest.click("xpath=//input[@type='checkbox']");
		//点击删除
		webtest.click("xpath=//button[@click='del']");
		//点击确定
		webtest.click("xpath=//button[@sattr='yes']");
	}
	
}