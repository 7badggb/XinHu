package com.edu.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Communication extends BaseTest{
	@Test(description="�ڲ�ͨѶ")
	public void test8(){
		webtest.click("xpath=//span[@class='spanactive']");
		webtest.click("xpath=//td[text()='��������']");
		webtest.click("xpath=//td[text()='�ڲ�ͨѶ¼']");
		webtest.click("xpath=button[@onclick='openchat(3,0,'upload/face/3.jpg')']");
		webtest.type("xpath=//textarea[@class='content']","������Ϣ��С��");
		webtest.click("xpath=//td[text()='����']");
	}

}
