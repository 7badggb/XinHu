package com.webtest.xinhu;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.dataprovider.NSDataProvider;

public class Administration_1 extends BaseTest {

	//����ģ��
	
			@Test(dataProvider="excel",dataProviderClass=NSDataProvider.class)
			//��¼����������ģ��
			public void test1(String name,String pwd) {
				System.out.println(name+pwd);
				webtest.open("http://localhost:9999/?m=login");
				webtest.type("name=adminuser", name);
				webtest.type("xpath=//input[@type='password']", pwd);
				webtest.click("class=webbtn");
				webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[7]");
			}
			
			@Test
			//����-�̶��ʲ�-�����̶��ʲ�
			public void test2() {
				webtest.click("xpath=//*[@id=\"menu_list_num137\"]");
				webtest.click("xpath=//*[@id=\"content_num137\"]/table/tbody/tr/td[3]/div[1]/table/tbody/tr/td[1]/button[1]");
				webtest.enterFrame("openinputiframe");
				webtest.selectByValue("xpath=//*[@id=\"div_typeid\"]/select", "206");
				webtest.type("xpath=//*[@id=\"div_title\"]/input", "1");
				webtest.selectByValue("xpath=//*[@id=\"div_ckid\"]/select", "214");
				webtest.selectByValue("xpath=//*[@id=\"div_laiyuan\"]/select", "����");
				webtest.selectByValue("xpath=//*[@id=\"div_state\"]/select", "1");
				webtest.click("xpath=//*[@id=\"AltS\"]");

			}
			
			@DataProvider(name="zichan")
			public Object[][] getExcelDada() throws IOException{
				return new ExcelDataProvider().getTestDataByExcel("F:\\data\\time.xlsx","Sheet5");
			}
			
			@Test(dataProvider="zichan")
			//���ݲ�ͬ�Ĺؼ��ֲ鿴�̶��ʲ�
			public void test3(String zichan) {
				webtest.typeAndClear("xpath=//*[@id=\"content_num137\"]/table/tbody/tr/td[3]/div[1]/table/tbody/tr/td[2]/input", zichan);
				webtest.click("xpath=//*[@id=\"content_num137\"]/table/tbody/tr/td[3]/div[1]/table/tbody/tr/td[3]/button");
				
			}
}
