package com.webtest.demo;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class Front_Login1 extends BaseTest{


	@Test(dataProvider="txt",dataProviderClass=NSDataProvider.class)
	public void testLoginSuccess(String u_name,String u_pwd) throws Exception  {
		webtest.open("http://www.roqisoft.com/zhsx/");
		if(webtest.isTextPresent("�˳�")) {
			webtest.click("link=�˳�");
		}
		webtest.click("link=��¼");
		webtest.type("name=username",u_name );
		webtest.type("name=password", u_pwd);
		webtest.click("xpath=//input[@value='��¼']");
		assertTrue(webtest.isTextPresent("�˳�"));
	
		
	}

	private void assertTrue(boolean textPresent) {
		// TODO Auto-generated method stub
		
	}

}
