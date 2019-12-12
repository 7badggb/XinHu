package com.edu.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Communication extends BaseTest{
	@Test(description="内部通讯")
	public void test8(){
		webtest.click("xpath=//span[@class='spanactive']");
		webtest.click("xpath=//td[text()='个人中心']");
		webtest.click("xpath=//td[text()='内部通讯录']");
		webtest.click("xpath=button[@onclick='openchat(3,0,'upload/face/3.jpg')']");
		webtest.type("xpath=//textarea[@class='content']","发送消息给小乔");
		webtest.click("xpath=//td[text()='发送']");
	}

}
