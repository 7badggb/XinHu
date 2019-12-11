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
public class Administration_2_1 extends BaseTest {
	
	public void InitDemo() {
		//��������ģ��
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[7]");
		//����̶��ʲ�
		webtest.click("xpath=//*[@id=\"menu_list_num137\"]");
	}
	
	@Test(description="�����̶��ʲ�")
	public void test1() throws InterruptedException {	
		InitDemo();
		
		//�������
		webtest.click("xpath=//*[@id=\"content_num137\"]/table/tbody/tr/td[3]/div[1]/table/tbody/tr/td[1]/button[1]");
		webtest.enterFrame("openinputiframe");
		webtest.selectByValue("xpath=//*[@id=\"div_typeid\"]/select", "206");
		webtest.type("xpath=//*[@id=\"div_title\"]/input", "1");
		webtest.selectByValue("xpath=//*[@id=\"div_ckid\"]/select", "214");
		webtest.selectByValue("xpath=//*[@id=\"div_laiyuan\"]/select", "����");
		webtest.selectByValue("xpath=//*[@id=\"div_state\"]/select", "1");
		webtest.click("xpath=//*[@id=\"AltS\"]");
		assertTrue(webtest.isTextPresent("��������ɹ�"));

	}
	
}
