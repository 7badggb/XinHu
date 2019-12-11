package com.edu.wangna.test;

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
public class PersonnelAttendance_4 extends BaseTest {
	
	public void InitDemo() {
		//�������¿���ģ��
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[6]");
		//������ʹ���
		webtest.click("xpath=//*[@id=\"menu_list_num98\"]");
	}
	
	@DataProvider(name="name")
	public Object[][] getExcelDada() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("F:\\data\\time.xlsx","Sheet2");
	}
	
	@Test(description="���ղ�ͬ�Ĺؼ��ֲ鿴Ա���������",dataProvider="name")
	public void test1(String name) throws InterruptedException {	
		InitDemo();
		
		//�������
		webtest.click("xpath=//*[@id=\"menu_list_num99\"]");
		webtest.typeAndClear("xpath=//input[starts-with(@id,'key_')]", name);
		webtest.click("xpath=//*[@id=\"content_num99\"]/div[1]/table/tbody/tr/td[4]/button");
		
		assertTrue(true);
	}
	
}
