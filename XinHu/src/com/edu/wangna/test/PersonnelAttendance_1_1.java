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
public class PersonnelAttendance_1_1 extends BaseTest {
	
	public void InitDemo() {
		//�������¿���ģ��
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[6]");
		//������µ���
		webtest.click("xpath=//*[@id=\"menu_list_num84\"]");
	}
	
	@DataProvider(name="dangan")
	public Object[][] getExcelDada() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("F:\\data\\user.xlsx","Sheet2");
	}
	
	@Test(description="���ղ�ͬ�ؼ��ֲ鿴Ա������",dataProvider="dangan")
	public void test1(String name) throws InterruptedException {	
		InitDemo();
		System.out.println(name);
		//���Ա������
		webtest.click("xpath=//*[@id=\"menu_list_num85\"]");
		//�鿴��ͬ���ŵ�Ա������
		webtest.typeAndClear("xpath=//*[@id=\"content_num85\"]/div[1]/table/tbody/tr/td[2]/input", name);
		webtest.click("xpath=//*[@id=\"content_num85\"]/div[1]/table/tbody/tr/td[4]/div/button[1]");
		
		assertTrue(true);
		
	}
}
