package com.edu.test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;
import com.edu.dataprovider.NSDataProvider;
import com.webtest.dataprovider.ExcelDataProvider;
@Listeners(ApiListener.class)
public class PersonnelAttendance_2_1 extends BaseTest {
	
	public void InitDemo() {
		//�������¿���ģ��
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[6]");
		//������¹���
		webtest.click("xpath=//*[@id=\"menu_list_num127\"]");
	}
	
	@Test(description="�鿴ת������")
	public void test1() throws InterruptedException {	
		InitDemo();
		//���ת������
		webtest.click("xpath=//*[@id=\"menu_list_num96\"]");
		//�������
		webtest.click("xpath=//tbody[starts-with(@id,'tbody_')]/tr/td[11]/a");
		webtest.click("xpath=//div[starts-with(@id,'rockmenuli')]/ul/li[1]");
		webtest.click("xpath=//div[@id=\"winiframe_spancancel\"]");
		
		assertTrue(true);
	}
	
}
