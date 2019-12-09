package com.webtest.xinhu.reim;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;

public class ReimSet extends BaseTest{
	@DataProvider(name="data1")
	public static Object[][] data() throws IOException {
		ExcelDataProvider dataProvider = new ExcelDataProvider();
		return dataProvider.getTestDataByExcel("D:\\java\\java\\auto2019\\auto2019\\src\\data\\test.xlsx", "Sheet1");
	}
	public void InitDemo() {
		webtest.click("xpath=//span[@title='REIM��ʱͨ��']");
		webtest.click("id=confirm_btn1");
		webtest.switchWidow(1);
		webtest.max();
	}
	@Test(description="����������")
	public void setDemo1() {
		InitDemo();
		webtest.click("xpath=//span[@title='����']");
		assertTrue(webtest.isTextPresent("[����]"));
	}
	@Test(description="�����Ự",dataProvider ="data1")
	public void setDemo2(String a1) {
		webtest.click("id=syscogshow_cancel");
		webtest.click("xpath=//div[@title='�Ự/Ⱥ']");
		webtest.click("xpath=//span[@title='�����Ự']");
		webtest.type("id=confirm_input", a1);
		webtest.click("id=confirm_btn1");
		assertTrue(webtest.isTextPresent(a1));
	}
	@Test(description="ˢ��reimҳ��")
	public void setDemo3() {
		webtest.click("xpath=//span[@title='ˢ��']");
		assertTrue(webtest.isTextPresent("������Ϣ"));
	}
	@Test(description="��֯����ģ�鹦���Ƿ�����")
	public void setDemo4() {
		webtest.click("xpath=//div[@title='��֯�ṹ']");
		webtest.click("xpath=//div[@onclick='reim.showdept(5,2)']");
		webtest.click("xpath=//div[@onclick='reim.openuserzl(5)']");
		webtest.click("id=userziliao_btn0");
		webtest.switchWidow(1);
		webtest.click("xpath=//a[@title='close']");
		assertTrue(webtest.isTextPresent("�����"));
}
}
