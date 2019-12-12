package com.edu.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SearchSessionRecord extends BaseTest{
	
	public void initDemo(){
		//个人办公
		webtest.click("xpath=//span[@pmenuid='38']");
		//个人中心
		webtest.click("id=menu_list_num39");
		//我的会话记录
		webtest.click("id=menu_list_reimrecord");
	}
	
	@Test(description="搜索我的会话记录-搜索框")
	public void test(){
		initDemo();
		//在搜索框中输入要搜索的内容
		webtest.type("xpath=//input[@placeholder='消息内容']","信息");
		//点击搜索
		webtest.click("xpath=//button[@click='search']");
	}
	@Test(description="搜索我的会话记录-发送人/接收人")
	public void test2(){
		initDemo();
		//点击发送人/接收人后面的搜索图标
		webtest.click("xpath=//button[@click='getdists,1']");
		//选择管理层
		webtest.click("xpath=//td[@deptxu='1_1']");
		//选中磐石
		webtest.click("xpath=//input[@xname='磐石']");
		//点击确定
		webtest.click("xpath=//input[@value='确定']");
		//点击搜索
		webtest.click("xpath=//button[@click='search']");
	}

}
