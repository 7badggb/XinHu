package com.edu.wangna.test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;
import com.edu.dataprovider.NSDataProvider;
import com.webtest.dataprovider.ExcelDataProvider;

public class PersonnelAttendance_2_3 extends BaseTest {
	
	public void InitDemo() {
		//�������¿���ģ��
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[6]");
		//������¹���
		webtest.click("xpath=//*[@id=\"menu_list_num127\"]");
	}
	
	@Test(description="�������µ���")
	public void test1() throws InterruptedException {	
		InitDemo();
		//������µ���
		webtest.click("xpath=//*[@id=\"menu_list_num128\"]");
		//�������
		webtest.click("xpath=//*[@id=\"content_num128\"]/div[1]/table/tbody/tr/td[1]/button");
		webtest.enterFrame("openinputiframe");
		webtest.click("xpath=//*[@id=\"btnchange_tranname\"]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/div[3]/table/tbody/tr/td[2]");
		webtest.click("xpath=//input[starts-with(@name,'changeuserinput')]");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		webtest.click("xpath=//*[@id=\"btnchange_newdeptname\"]");
		webtest.click("xpath=//input[starts-with(@name,'changeuserinput')]");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		webtest.selectByValue("xpath=//*[@id=\"div_trantype\"]/select", "ƽ��");
		webtest.type("xpath=//*[@id=\"div_newranking\"]/input", "2");
		webtest.click("xpath=//*[@id=\"AltS\"]");
		assertTrue(webtest.isTextPresent("����Ա���������"));
		webtest.leaveFrame();
		webtest.click("xpath=//*[@id=\"winiframe_spancancel\"]");
	}
}