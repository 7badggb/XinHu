package com.edu.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CreateSchedule extends BaseTest{
	public void initDemo(){
		//个人办公
		webtest.click("xpath=//span[@pmenuid='38']");
	}
	@Test(description="新增日程")
	//新增日程
	public void test(){
		initDemo();
		//点击日程
		webtest.click("id=menu_list_schedule");
		//点击新增
		webtest.click("xpath=//button[@click='clickwin,0']");
		//输入标题
		webtest.type("xpath=//input[@name='title']","日程500");
		//提醒时间
		webtest.click("xpath=//input[@readonly name='startdt']");
		//本月1号
		webtest.click("xpath=//td[@xu='1']");
		//点击确定
		webtest.click("xpath=//div[@class='rockdatepicker']/div[4]/a[3]");
		//截止时间
		webtest.click("xpath=//input[@readonly name='enddt']");
		//本月30号
		webtest.click("xpath=//td[@xu='30']");
		//点击确定
		webtest.click("xpath=//div[@class='rockdatepicker']/div[4]/a[3]");
		//点击保存
		webtest.click("id=AltS");
	}
}
