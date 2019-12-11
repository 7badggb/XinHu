package com.edu.zmj.task;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;
@Listeners(ApiListener.class)
public class AddCustomer extends BaseTest{
	public void InitDemo() {
		//����ͻ�ģ��
		webtest.click("xpath=//span[@pmenuid='63']");
		//����ͻ�
		webtest.click("id=menu_list_num64");
		//����ҵĿͻ�
		webtest.click("id=menu_list_num112");
	}
	@Test(description="�������111�Ŀͻ�")
	public void AddCustomer1() throws InterruptedException {		
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");

		//��������Ϊ111
		webtest.type("name=name","111");
		//ѡ��ͻ�����
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='������']");
		//ѡ����Դ
		webtest.click("xpath=//select[@name='laiyuan']");
		webtest.click("xpath=//option[@value='���Ͽ���']");
		//�����ַΪ111
		webtest.type("name=address","111");
		//�������
		webtest.click("id=AltS");
		//�뿪iframeҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("111"));	
	}
	@Test(description="���������")
	public void AddCustomer2() throws InterruptedException {	
		refreshPage();
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//�������
		webtest.click("id=AltS");
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("���Ʋ���Ϊ��"));	
	}
	@Test(description="��ѡ��ͻ�����")
	public void AddCustomer3() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//��������Ϊ111
		webtest.type("name=name","111");
		//�������
		webtest.click("id=AltS");
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("�ͻ����Ͳ���Ϊ��"));	
	}
	@Test(description="��ѡ����Դ")
	public void AddCustomer4() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//��������Ϊ111
		webtest.type("name=name","111");
		//ѡ��ͻ�����
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='������']");
		
		//�������
		webtest.click("id=AltS");
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("��Դ����Ϊ��"));	
	}
	@Test(description="��ѡ���ַ")
	public void AddCustomer5() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//��������Ϊ111
		webtest.type("name=name","111");
		//ѡ��ͻ�����
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='������']");
		//ѡ����Դ
		webtest.click("xpath=//select[@name='laiyuan']");
		webtest.click("xpath=//option[@value='���Ͽ���']");
		//�������
		webtest.click("id=AltS");
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("��ַ����Ϊ��"));	
	}
}
