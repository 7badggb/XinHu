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
public class PersonnelAttendance_3 extends BaseTest {
	
	public void InitDemo() {
		//�������¿���ģ��
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[6]");
		//��������ձ�
		webtest.click("xpath=//*[@id=\"menu_list_num192\"]");
	}
	
	@DataProvider(name="time")
	public Object[][] getExcelDada() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("D:\\git\\XinHu\\XinHu\\data\\time.xlsx","Sheet1");
	}
	
	@Test(description="���ղ�ͬ�Ĺؼ��ֲ鿴�����ձ�",dataProvider="time")
	public void test1(String time) throws InterruptedException {	
		InitDemo();
		
		//�������
		webtest.click("xpath=//*[@id=\"menu_list_num193\"]");
		webtest.typeAndClear("xpath=//input[starts-with(@id,'key_')]", time);
		webtest.click("xpath=//*[@id=\"content_num193\"]/div[1]/table/tbody/tr/td[3]/div/button[1]");
		
		assertTrue(true);
	}
	
}
