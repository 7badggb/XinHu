package com.webtest.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SalaryEdit extends BaseTest{
	public void initDemo(){
		//个人办公
		webtest.click("xpath=//span[@pmenuid='38']");
		//个人中心
		webtest.click("id=menu_list_num39");
	}
	@Test(description="编辑薪资情况")
	public void test(){
		initDemo();
		//点击我的薪资
		webtest.click("id=menu_list_num184");
		//点击月份按钮
		webtest.click("xpath=//button[@click='clickdt,2']");
		//本年本月
		webtest.click("xpath=//div[@class='rockdatepicker']/div[2]/a[2]");
		//搜索
		webtest.click("xpath=//button[@click='search']");
		//选中一条薪资记录
		webtest.click("xpath=//tr[@dataid='12']");
		//详情
		webtest.click("xpath=//button[@click='view']");
		//进入iframe
		webtest.enterFrame("openinputiframe");
		//操作V
		webtest.click("id=showmenu");
		//编辑
		webtest.click("xpath=//li[@lx='1']");
		//修改基本工资
		webtest.type("xpath=//input[@name='base']","2000");
		//点击保存
		webtest.click("id=AltS");
		//离开iframe
		webtest.leaveFrame();
	}

}
