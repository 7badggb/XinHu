package com.webtest.Personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Communication extends BaseTest{
	@Test
	public void login(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9090/?m=login");
		webtest.type("name=admin", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
	}
	
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
