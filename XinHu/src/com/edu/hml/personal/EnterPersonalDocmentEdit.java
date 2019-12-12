package com.edu.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class EnterPersonalDocmentEdit extends BaseTest{
	public void initDemo(){
		//个人办公
		webtest.click("xpath=//span[@pmenuid='38']");
		//个人中心
		webtest.click("id=menu_list_num39");
	}
	
	@Test(description="进入个人资料编辑页面-详情")
	public void test(){
		initDemo();
		//点击个人资料
		webtest.click("id=menu_list_num101");
		//选中个人资料
		webtest.click("xpath=//table[@class='table table-striped table-bordered table-hover']/tbody");
		//点击详情
		webtest.click("xpath=//button[@click='view']");
		webtest.enterFrame("openinputiframe");
		//点击操作V
		webtest.click("id=showmenu");
		//点击编辑
		webtest.click("xpath=//li[@lx='1']");
		webtest.leaveFrame();
	}
	@Test(description="进入个人资料编辑页面-直接点击编辑")
	public void test2(){
		initDemo();
		//点击个人资料
		webtest.click("id=menu_list_num101");
		//选中个人资料
		webtest.click("xpath=//table[@class='table table-striped table-bordered table-hover']/tbody");
		//点击编辑
		webtest.click("xpath=//button[@click='edit']");
	}

}
