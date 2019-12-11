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
public class Administration_1_2 extends BaseTest {
	
	public void InitDemo() {
		//��������ģ��
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[7]");
		//�����Ʒ����
		webtest.click("xpath=//*[@id=\"menu_list_num28\"]");
	}
	
	
	@DataProvider(name="wupin")
	public Object[][] getExcelDada() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("F:\\data\\time.xlsx","Sheet4");
	}
	
	@Test(description="���ݲ�ͬ�Ĺؼ��ֲ鿴��Ʒ��������",dataProvider="wupin")
	public void test1(String thing) throws InterruptedException {	
		InitDemo();
		
		//�������
		webtest.click("xpath=//*[@id=\"menu_list_num31\"]");
		webtest.typeAndClear("xpath=//*[@id=\"content_num31\"]/table/tbody/tr/td[3]/div[1]/table/tbody/tr/td[3]/input", thing);
		webtest.click("xpath=//*[@id=\"content_num31\"]/table/tbody/tr/td[3]/div[1]/table/tbody/tr/td[4]/button");
	}
	
}
