package com.webtest.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Communication extends BaseTest{
	public void initDemo(){
		//个人办公
		webtest.click("xpath=//span[@pmenuid='38']");
		//个人中心
		webtest.click("id=menu_list_num39");
	}
	@Test(description="内部通讯")
	public void test(){
		initDemo();
		//点击内部通讯录
		webtest.click("id=menu_list_reimtxl");
		webtest.click("xpath=button[@onclick='openchat(3,0,'upload/face/3.jpg')']");
		webtest.type("xpath=//textarea[@onpaste='im.readclip(event)']","发送消息给小乔");
		webtest.click("xpath=//a[@tools=send']");//发送
	}

}
