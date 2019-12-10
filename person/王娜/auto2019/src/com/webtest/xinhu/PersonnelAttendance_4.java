package com.webtest.xinhu;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.dataprovider.NSDataProvider;

public class PersonnelAttendance_4 extends BaseTest {

	
	//���¿���ģ��-������ѵ
	
		@Test(dataProvider="excel",dataProviderClass=NSDataProvider.class)
		//��¼���������¿���ģ��
		public void test1(String name,String pwd) {
			System.out.println(name+pwd);
			webtest.open("http://localhost:9999/?m=login");
			webtest.type("name=adminuser", name);
			webtest.type("xpath=//input[@type='password']", pwd);
			webtest.click("class=webbtn");
			webtest.click("xpath=//span[@pmenuid=27]");
		}
		
		@DataProvider(name="kaoshi")
		public Object[][] getExcelDada() throws IOException{
			return new ExcelDataProvider().getTestDataByExcel("F:\\data\\time.xlsx","Sheet3");
		}
		
		@Test(dataProvider="kaoshi")
		//�鿴����㿼����ѵ
		public void test2(String Name) {
			webtest.click("xpath=//*[@id=\"menu_list_num199\"]");
			webtest.click("xpath=//*[@id=\"menu_list_num201\"]");
			webtest.typeAndClear("xpath=//input[starts-with(@id,'key_')]", Name);
			webtest.click("xpath=//*[@id=\"content_num201\"]/div[1]/table/tbody/tr/td[2]/button");
		}
	
}
