package com.edu.system;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class VjobDailyApply extends BaseTest{

//���������ձ�
	
	public void InitDemo() {
		//��������ģ��
		webtest.click("xpath=//span[@pmenuid='40']");
		//�����������
		webtest.click("id=menu_list_num42");		
	}
	
	@Test(description="���������ձ�������")
	public void AddApply1() {
		InitDemo();
		//��������ձ�
		webtest.click("xpath=//a[@onclick=\"openinput('�����ձ�','daily',0)\"]");
		//�������frame
		webtest.enterFrame("openinputiframe");
		//ѡ������
		webtest.click("xpath=//*[@id=\"div_dt\"]/input");
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_table')]/table/tbody/tr[3]/td[4]");
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_queding')");
		//��������
		webtest.type("xpath=//*[@id=\"div_content\"]/textarea","�ú�����");
		//�������
		webtest.click("id=AltS");
		//�뿪frameҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
//		assertTrue(webtest.isTextPresent(""));				
	}
	
	@Test(description="������������Ĺ����ձ�������")
	public void AddApply2() {
		InitDemo();
		//��������ձ�
		webtest.click("xpath=//a[@onclick=\"openinput('�����ձ�','daily',0)\"]");
		//�������frame
		webtest.enterFrame("openinputiframe");
		//ѡ������
		webtest.click("xpath=//*[@id=\"div_dt\"]/input");
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_table')]/table/tbody/tr[3]/td[4]");
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_queding')");
		//��������
		webtest.type("xpath=//*[@id=\"div_content\"]/textarea","�ú�����");
		//�������
		webtest.click("id=AltS");
		//�뿪frameҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
//		assertTrue(webtest.isTextPresent(""));				
	}
	
	@Test(description="����δ��д���ݵĹ����ձ�������")
	public void AddApply3() {
		InitDemo();
		//��������ձ�
		webtest.click("xpath=//a[@onclick=\"openinput('�����ձ�','daily',0)\"]");
		//�������frame
		webtest.enterFrame("openinputiframe");
		//ѡ������
		webtest.click("xpath=//*[@id=\"div_dt\"]/input");
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_table')]/table/tbody/tr[3]/td[4]");
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_queding')");
		//��������
		webtest.type("xpath=//*[@id=\"div_content\"]/textarea","�ú�����");
		//�������
		webtest.click("id=AltS");
		//�뿪frameҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
//		assertTrue(webtest.isTextPresent(""));				
	}
	
}
