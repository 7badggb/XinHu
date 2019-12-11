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
public class PersonnelAttendance_5 extends BaseTest {
	
	public void InitDemo() {
		//�������¿���ģ��
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[6]");
		//���������ѵ
		webtest.click("xpath=//*[@id=\"menu_list_num199\"]");
	}
	
	@DataProvider(name="kaoshi")
	public Object[][] getExcelDada() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("D:\\git\\XinHu\\XinHu\\data\\time.xlsx","Sheet3");
	}
	
	@Test(description="�鿴ͨ����ͬ�ؼ��ֿ�����ѵ",dataProvider="kaoshi")
	public void test1(String Name) throws InterruptedException {	
		InitDemo();
		
		//�������
		webtest.click("xpath=//*[@id=\"menu_list_num201\"]");
		webtest.typeAndClear("xpath=//input[starts-with(@id,'key_')]", Name);
		webtest.click("xpath=//*[@id=\"content_num201\"]/div[1]/table/tbody/tr/td[2]/button");
		
		assertTrue(true);
	}
	
}
