package com.edu.system;

import org.testng.annotations.Test;

public class SearchApply6 extends LoginDemo{

//���뿼�ڻ��豸
	
	public void InitDemo() {
		//��������ģ��
		webtest.click("xpath=//span[@pmenuid='40']");
		//�����������
		webtest.click("id=menu_list_num42");		
	}
	
	@Test(description="�������ڻ��豸������")
	public void AddApply1() {
		InitDemo();
		//������ڻ��豸
		webtest.click("xpath=//a[@onclick=\"openinput('���ڻ��豸','kqjsn',0)\"]");
		//�������frame
		webtest.enterFrame("openinputiframe");
		//�����豸��
		webtest.type("name=num","19880419");
		//�����豸����
		webtest.type("name=name","zyloooong");
		//���빫˾��
		webtest.type("name=company","zylstudio");
		//�������
		webtest.click("id=AltS");
		//�뿪frameҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
//		assertTrue(webtest.isTextPresent("19880416"+"zyloooong"+"zylstudio"));				
	}
	@Test(description="����Ѵ��ڵ��豸����")
	public void AddApply2() {
		//InitDemo();
		//������ڻ��豸
		webtest.click("xpath=//a[@onclick=\"openinput('���ڻ��豸','kqjsn',0)\"]");
		//�������frame
		webtest.enterFrame("openinputiframe");
		//�����豸��
		webtest.type("name=num","19880416");
		//�����豸����
		webtest.type("name=name","zyloooong");
		//���빫˾��
		webtest.type("name=company","zylstudio");
		//�������
		webtest.click("id=AltS");
		//�뿪frameҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
//		assertTrue(webtest.isTextPresent("�����ɹ�"));				
	}
	
	@Test(description="����д�豸��")
	public void AddApply3() {
	//	InitDemo();
		//������ڻ��豸
		webtest.click("xpath=//a[@onclick=\"openinput('���ڻ��豸','kqjsn',0)\"]");
		//�������frame
		webtest.enterFrame("openinputiframe");
		//�������
		webtest.click("id=AltS");
//		assertTrue(webtest.isTextPresent("�豸�Ų���Ϊ��"));			
	}
}
