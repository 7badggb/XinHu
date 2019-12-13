package com.edu.wangna.test;

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

public class Administration_1_1 extends BaseTest {
	
	public void InitDemo() {
		//��������ģ��
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[7]");
		//�����Ʒ����
		webtest.click("xpath=//*[@id=\"menu_list_num28\"]");
	}
	
	
	@Test(description="������Ʒ")
	public void test1() throws InterruptedException {	
		InitDemo();
		
		//�������
		webtest.click("xpath=//*[@id=\"menu_list_num30\"]");
		webtest.click("xpath=//*[@id=\"content_num30\"]/table/tbody/tr/td[3]/div[1]/table/tbody/tr/td[1]/button");
		webtest.enterFrame("openinputiframe");
		webtest.type("xpath=//*[@id=\"div_name\"]/input", "��ӡ��");
		webtest.selectByValue("xpath=//*[@id=\"div_typeid\"]/select", "65");
		webtest.selectByValue("xpath=//*[@id=\"div_unit\"]/select", "̨");
		webtest.click("xpath=//*[@id=\"AltS\"]");
	
		webtest.leaveFrame();
		webtest.click("xpath=//*[@id=\"winiframe_spancancel\"]");
		assertFalse(webtest.isTextPresent("��Ʒ�Ѵ�����"));
		webtest.leaveFrame();
		assertTrue(true);
	}
	
}
