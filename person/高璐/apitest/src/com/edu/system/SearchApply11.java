package com.edu.system;

import org.testng.annotations.Test;

public class SearchApply11 extends LoginDemo{

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
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_now')");
		//ѡ���ֹ����
		webtest.click("xpath=//*[@id=\"div_enddt\"]/input");
		webtest.click("xpath=//*[contains(@id,'rockdatepicker_table']/table/tbody/tr[3]/td[4]");
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_queding')");
		//��������
		webtest.type("xpath=//*[@id=\"div_content\"]/textarea","�ú�����");
		//�������
		webtest.click("id=AltS");
		//�뿪frameҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
//		assertTrue(webtest.isTextPresent("19880416"+"zyloooong"+"zylstudio"));				
	}
	
/*	@Test(description="����������������")
	public void AddApply2() {
		InitDemo();
		//����������
		webtest.click("xpath=//a[@onclick=\"openinput('�������','waichu',0)\"]");
		//�������frame
		webtest.enterFrame("openinputiframe");
		//�����ַ
		webtest.type("xpath=//*[@id=\"div_address\"]/input", "�϶�����·20��");
		//ѡ�����ʱ��
		webtest.click("xpath=//*[@id=\"div_outtime\"]/input");
//		webtest.click("xpath=//*[contains(@id,'rockdatepicker_now']");
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_now')");
		//ѡ��Ԥ�ƻظ�
		webtest.click("xpath=//*[@id=\"div_intime\"]/input");
		webtest.click("xpath=//*[contains(@id,'rockdatepicker_table']/table/tbody/tr[3]/td[4]");
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_queding')");
		//�����������
		webtest.type("xpath=//*[@id=\"div_reason\"]/input","�úù���");
		//�������
		webtest.click("id=AltS");
		//�뿪frameҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
//		assertTrue(webtest.isTextPresent("19880416"+"zyloooong"+"zylstudio"));				
	}
*/	
}
