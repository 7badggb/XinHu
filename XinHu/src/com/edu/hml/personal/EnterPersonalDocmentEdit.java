package com.edu.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class EnterPersonalDocmentEdit extends BaseTest{
	
	@Test(description="����������ϱ༭ҳ��")
	public void test4(){
		webtest.click("xpath=//span[@class='spanactive']");
		//�����������
		webtest.click("xpath=//td[text()='']");
		//�����������
		webtest.click("xpath=//td[text()='��������']");
		//�������
		webtest.click("id=xiang_1576109763922_4058");
		webtest.enterFrame("winiframe_main");
		//����༭
		webtest.click("xpath=//td[text()='�༭']");
		//ѡ�и������ϼ�¼
		webtest.click("xpath=/html/body/table/tbody/tr/td[3]/div/div[5]/div/div[6]/div[3]/div/table/tbody]");
		//����༭
		webtest.click("xpath=//td[text()='�༭']");
		//�������
		webtest.click("xpath=//td[text()='����']");
		//�������V
		webtest.click("xpath=//td[text()='����V']");
		//����༭
		webtest.click("xpath=//td[text()='�༭']");
		webtest.leaveFrame();
	}

}
