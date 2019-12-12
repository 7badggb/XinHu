package com.webtest.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class EmailSettings extends BaseTest{
	public void initDemo(){
		//个人办公
		webtest.click("xpath=//span[@pmenuid='38']");
	}
	
	@Test(description="邮箱设置")
	public void test(){
		initDemo();
		//点击邮件
		webtest.click("id=menu_list_email");
		//点击邮箱设置
		webtest.click("xpath=//a[@click='cogemail']");
		//输入我邮箱
		webtest.type("xpath=//input[@name='email']","2724702423@qq.com");
		//输入我邮箱密码
		webtest.type("xpath=//input[@value name='emailpass']", "123456");
		//点击确定
		webtest.click("xpath=//button[@class='btn btn-info']");
		
	}

}
