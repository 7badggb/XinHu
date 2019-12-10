package com.edu.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;

@Listeners(ApiListener.class)
public class LoginTest extends BaseTest {
	@Test	
	public void loginSuccess() {
		webtest.open("http://localhost:8016/?m=login");
		//�ı�������
		webtest.type("name=adminuser", "admin");
		webtest.type("xpath=//input[@type='password']", "123456");
		webtest.click("name=button");
		assertTrue(webtest.isTextPresent("����Ա"));
		
	}
	@Test
	public void loginFail() {
		webtest.open("http://localhost:8016/?m=login");
		//�ı�������
		webtest.type("name=adminuser", "admin");
		webtest.type("xpath=//input[@type='password']", "abcdef");
		webtest.click("name=button");
		assertTrue(webtest.isTextPresent("����Ա"));
		
	}
	

}
