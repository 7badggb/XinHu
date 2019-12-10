package com.webtest.xinhu.reim;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;

public class ReimSearch extends BaseTest{
	@DataProvider(name="data3")
	public static Object[][] data() throws IOException {
		ExcelDataProvider dataProvider = new ExcelDataProvider();
		return dataProvider.getTestDataByExcel("D:\\java\\java\\auto2019\\auto2019\\src\\data\\test.xlsx", "Sheet3");
	}
	public void InitDemo() {
		webtest.click("xpath=//span[@title='REIM��ʱͨ��']");
		webtest.click("id=confirm_btn1");
		webtest.switchWidow(1);
		webtest.max();
	}
	@Test(description="��������",dataProvider="data3")
	public void searchDemo1(String a1) {	
		InitDemo();
		webtest.typeAndClear("xpath=//*[@id=\"reim_keysou\"]", a1);
		assertTrue(webtest.isTextPresent(a1));
	}
}
