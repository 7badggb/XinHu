package com.edu.system;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class MeetingApply extends BaseTest {
	
//��������
	
	public void initDemo() {
		//��������ģ��
		webtest.click("xpath=//span[@pmenuid='40']");
		//�����������
		webtest.click("id=menu_list_num42");		
	}
	
	@Test(description="�������������")
	public void AddApplyRepair1() throws InterruptedException{
		
		initDemo();
		//���ά�ޱ���
		webtest.click("xpath=//a[@onclick=\"openinput('֪ͨ����','gong',0)\"]");
		//�������frame
		webtest.enterFrame("openinputiframe");
		//�������
		webtest.type("name=title","����֪ͨ");
		//ѡ����������
		webtest.click("name=typename");
		webtest.click("xpath=//*[@id=\"div_typename\"]/select/option[2]");
		//�������
		webtest.click("id=AltS");
		//�뿪frameҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
//		assertTrue(webtest.isTextPresent(""));				
	}
	
	@Test(description="����Ѵ��ڵĻ�������")
	public void AddApplyRepair2() {
		//���ά�ޱ���
		webtest.click("xpath=//a[@onclick=\"openinput('֪ͨ����','gong',0)\"]");
		//�������frame
		webtest.enterFrame("openinputiframe");
		//�������
		webtest.type("name=title","����֪ͨ");
		//ѡ����������
		webtest.click("name=typename");
		webtest.click("xpath=//*[@id=\"div_typename\"]/select/option[2]");
		//�������
		webtest.click("id=AltS");
		//�뿪frameҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
	//	assertTrue(webtest.isTextPresent("�����ɹ�"));				
	}
	
	@Test(description="����д����")
	public void AddApplyRepair3() {
		initDemo();
		//���ά�ޱ���
		webtest.click("xpath=//a[@onclick=\"openinput('֪ͨ����','gong',0)\"]");
		//�������frame
		webtest.enterFrame("openinputiframe");
		//�������
		webtest.click("id=AltS");
		
	}
}
