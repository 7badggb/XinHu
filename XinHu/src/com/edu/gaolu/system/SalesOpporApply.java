package com.edu.system;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class SalesOpporApply extends BaseTest{
	
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
		//ѡ���ź�
		webtest.click("xpath=//input[starts-with(@name,'changeuserinput')]");
		//�������
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
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
	
	@Test(description="�����Ѵ��ڵ����ۻ��������")
	public void AddApplyRepair2() throws InterruptedException{
		//�����������
		webtest.click("xpath=//a[@onclick=\"openinput('���ۻ���','custsale',0)\"]");
		//�������frame
		webtest.enterFrame("openinputiframe");
		//ѡ��ͻ�
		webtest.click("xpath=//a[@onclick=\"c.selectdata('selectcust,custid',false,'custname','�ͻ�',0)\"]");
		//�����ź�
		webtest.type("xpath=//input[contains(@id,'changekey')]","�ź�");
		//ѡ���ź�
		webtest.click("xpath=//input[starts-with(@name,'changeuserinput')]");
		//�������
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
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
	
	@Test(description="����δѡ��ͻ������ۻ��������")
	public void AddApplyRepair3() throws InterruptedException{
		//�����������
		webtest.click("xpath=//a[@onclick=\"openinput('���ۻ���','custsale',0)\"]");
		//�������frame
		webtest.enterFrame("openinputiframe");
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
	
	@Test(description="�������ۻ��������")
	public void AddApplyRepair4() throws InterruptedException{
		//�����������
		webtest.click("xpath=//a[@onclick=\"openinput('���ۻ���','custsale',0)\"]");
		//�������frame
		webtest.enterFrame("openinputiframe");
		//ѡ��ͻ�
		webtest.click("xpath=//a[@onclick=\"c.selectdata('selectcust,custid',false,'custname','�ͻ�',0)\"]");
		//�����ź�
		webtest.type("xpath=//input[contains(@id,'changekey')]","�ź�");
		//����΢��˾
		webtest.typeAndClear("xpath=//input[contains(@id,'changekey')]", "΢��˾");
		//��������
		webtest.typeAndClear("xpath=//input[contains(@id,'changekey')]", "����");
		//�����ٶ�
		webtest.typeAndClear("xpath=//input[contains(@id,'changekey')]", "�ٶ�");
		//���ȡ��
		webtest.click("xpath=//input[starts-with(@id,'changecancl')]");
		//�����Ƿ���ӳɹ�
//		assertTrue(webtest.isTextPresent(""));				
	}
}
