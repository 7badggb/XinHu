package com.webtest.xinhu;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.dataprovider.NSDataProvider;

public class Administration extends BaseTest{

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
		//������Ʒ
		public void test2() {
			webtest.click("xpath=//*[@id=\"menu_list_num28\"]");
			webtest.click("xpath=//*[@id=\"menu_list_num30\"]");
			webtest.click("xpath=//*[@id=\"content_num30\"]/table/tbody/tr/td[3]/div[1]/table/tbody/tr/td[1]/button");
			webtest.enterFrame("openinputiframe");
			webtest.type("xpath=//*[@id=\"div_name\"]/input", "��ӡ��");
			webtest.selectByValue("xpath=//*[@id=\"div_typeid\"]/select", "65");
			webtest.selectByValue("xpath=//*[@id=\"div_unit\"]/select", "̨");
			webtest.click("xpath=//*[@id=\"AltS\"]");
		
			webtest.leaveFrame();
			webtest.click("xpath=//*[@id=\"winiframe_spancancel\"]");
			webtest.leaveFrame();
		}
		
		@DataProvider(name="wupin")
		public Object[][] getExcelDada() throws IOException{
			return new ExcelDataProvider().getTestDataByExcel("F:\\data\\time.xlsx","Sheet4");
		}
		
		@Test(dataProvider="wupin")
		//���ݲ�ͬ�Ĺؼ��ֲ鿴��Ʒ��������
		public void test3(String thing) {
			webtest.leaveFrame();
			webtest.click("xpath=//*[@id=\"menu_list_num31\"]");
			webtest.typeAndClear("xpath=//*[@id=\"content_num31\"]/table/tbody/tr/td[3]/div[1]/table/tbody/tr/td[3]/input", thing);
			webtest.click("xpath=//*[@id=\"content_num31\"]/table/tbody/tr/td[3]/div[1]/table/tbody/tr/td[4]/button");
		}
}
