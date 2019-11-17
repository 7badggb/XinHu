package com.webtest.demo;

import static org.testng.Assert.assertTrue;
import com.webtest.core.ApiListener;
import com.webtest.core.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ApiListener.class)
public class LoginTest extends BaseTest {
	@Test	
	public void loginSuccess() {
		webtest.open("http://localhost/xinhu");
		//�ı�������
		webtest.type("name=adminuser", "admin");
		webtest.type("xpath=//input[@type='password']", "123456");
		webtest.click("name=button");
		assertTrue(webtest.isTextPresent("����Ա"));
		
	}
	@Test
	public void loginFail() {
		webtest.open("http://localhost/xinhu");
		//�ı�������
		webtest.type("name=adminuser", "admin");
		webtest.type("xpath=//input[@type='password']", "abcdef");
		webtest.click("name=button");
		assertTrue(webtest.isTextPresent("����Ա"));
		
	}

}
