package com.webtest.demo;

import com.webtest.core.BaseTest;

public class Admin_Login  extends BaseTest{
	
	@Test
	public void testLogin() {
		//��ҳ��
		webtest.open("http://www.roqisoft.com/zhsx/");
		//�ı�������
		webtest.type("name=username", "humenglian");
		webtest.type("name=password", "123456");
		webtest.click("xpath=//input[@type='submit']");
		assertTrue(webtest.isTextPresent("�˳�"));
	}

	private void assertTrue(boolean textPresent) {
		// TODO Auto-generated method stub
		
	}

}
