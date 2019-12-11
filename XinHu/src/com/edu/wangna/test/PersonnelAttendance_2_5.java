package com.edu.test;

import static org.testng.Assert.assertFalse;
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
public class PersonnelAttendance_2_5 extends BaseTest {
	
	public void InitDemo() {
		//�������¿���ģ��
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[6]");
		//������¹���
		webtest.click("xpath=//*[@id=\"menu_list_num127\"]");
	}
	
	@Test(description="����Ա������")
	public void test1() throws InterruptedException {	
		InitDemo();
		//������ʹ���
		webtest.click("xpath=//*[@id=\"menu_list_num130\"]");
		//�������
		webtest.click("xpath=//*[@id=\"content_num130\"]/div[1]/table/tbody/tr/td[1]/button");
		webtest.enterFrame("openinputiframe");
		webtest.click("xpath=//*[@id=\"btnchange_object\"]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/div[1]/table/tbody/tr/td[2]");
		webtest.click("xpath=//input[starts-with(@name,'changeuserinput_')]");
		webtest.click("xpath=//input[starts-with(@id,'changeok_')]");
		webtest.selectByValue("xpath=//*[@id=\"div_result\"]/select", "����");
		webtest.runJs("arguments[0].removeAttribute('readonly')", "xpath=//*[@id=\"div_happendt\"]/input");
		webtest.type("xpath=//*[@id=\"div_happendt\"]/input", "2019-12-25 16:43:38");
		webtest.type("xpath=//*[@id=\"div_hapaddress\"]/input", "1");
		webtest.typeAndClear("xpath=//*[@id=\"div_money\"]/input", "2");
		webtest.type("xpath=//*[@id=\"div_explain\"]/textarea", "3");
		webtest.click("xpath=//*[@id=\"AltS\"]");
		webtest.click("xpath=//*[@id=\"menu_list_num127\"]");
		assertTrue(webtest.isTextPresent("��������ɹ�"));
	}
	
	@DataProvider(name="check")
	public Object[][] getExcelDada() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("F:\\data\\user.xlsx","Sheet4");
	}
	
	@Test(description="���ݲ�ͬ�Ĺؼ��ֲ鿴Ա������",dataProvider="check")
	public void test2(String check) throws InterruptedException {	
		InitDemo();
		//������ʹ���
		webtest.click("xpath=//*[@id=\"menu_list_num130\"]");
		//�������
		webtest.typeAndClear("xpath=//*[@id=\"content_num130\"]/div[1]/table/tbody/tr/td[2]/input", check);
		webtest.click("xpath=//*[@id=\"content_num130\"]/div[1]/table/tbody/tr/td[4]/div/button[1]");
		assertTrue(true);
	}
}