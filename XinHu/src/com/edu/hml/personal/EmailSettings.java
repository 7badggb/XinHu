package com.edu.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class EmailSettings extends BaseTest{
	
	@Test(description="��������")
	public void test7(){
		webtest.click("xpath=//span[@class='spanactive']");
		webtest.click("xpath=//td[text()='�ʼ�']");
		webtest.click("xpath=//td[text()='��������']");
		//����������
		webtest.type("xpath=/html/body/div/div[2]/form/table/tbody/tr/td[2]/input","2724702423@qq.com");
		//��������������
		webtest.type("xpath=/html/body/div/div[2]/form/table/tbody/tr[2]/td[2]/input", "123456");
		webtest.click("xpath=//td[text()='ȷ��']");
		
	}

}
