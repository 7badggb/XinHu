package com.edu.system;

import org.testng.annotations.Test;

public class SearchApply10 extends LoginDemo{
//�������ۻ���
	
	public void initDemo() {
		//��������ģ��
		webtest.click("xpath=//span[@pmenuid='40']");
		//�����������
		webtest.click("id=menu_list_num42");		
	}
	
	@Test(description="�������ۻ��������")
	public void AddApplyRepair1() throws InterruptedException{
		
		initDemo();
		//�����������
		webtest.click("xpath=//a[@onclick=\"openinput('���ۻ���','custsale',0)\"]");
		//�������frame
		webtest.enterFrame("openinputiframe");
		//ѡ��ͻ�
		webtest.click("xpath=//a[@onclick=\"c.selectdata('selectcust,custid',false,'custname','�ͻ�',0)\"]");
		//�����ź�
		webtest.type("xpath=//input[contains(@id,'changekey')]","�ź�");
		//ѡ���ź�
		webtest.click("xpath=//label[contains(@id,'selectlist')]/div[1]");
		//�������
		webtest.click("xpath=//input[contains(@id,'changeok')]");
		//ѡ����Դ
		webtest.click("name=laiyuan");
		//ѡ��������ϵ
		webtest.click("xpath=//*[@id=\"div_laiyuan\"]/select/option[3]");
		//ѡ��״̬
		webtest.click("name=state");
		//ѡ���ѳɽ�
		webtest.click("value=0");
		//������
		webtest.type("xpath=//*[@id=\"div_money\"]/input","416");
		//�������
		webtest.click("id=AltS");
		//�뿪frameҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
//		assertTrue(webtest.isTextPresent(""));				
	}
}
