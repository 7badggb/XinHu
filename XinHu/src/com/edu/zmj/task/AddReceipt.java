package com.edu.zmj.task;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;

public class AddReceipt extends BaseTest{
	public void InitDemo() {
		//����ͻ�ģ��
		webtest.click("xpath=//span[@pmenuid='63']");
		//����տ
		webtest.click("id=menu_list_num105");
		//����ҵ��տ
		webtest.click("id=menu_list_num106");
	}
	@Test(description="����տ")
	public void AddReceipt1() throws InterruptedException {		
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//ѡ��ͻ�
		webtest.click("class=webbtn");
		webtest.click("xpath=//input[@xname='�ٶ�']");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//ѡ����Ŀ����
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='0']");
		//������Ϊ100
		webtest.type("name=money","100");
		//�������
		webtest.click("id=AltS");
		//�뿪iframeҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("�ٶ�"));	
	}
	@Test(description="��ѡ��ͻ�")
	public void AddReceipt2() throws InterruptedException {	
		refreshPage();
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//�������
		webtest.click("id=AltS");
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("�ͻ����Ʋ���Ϊ��"));	
	}
	@Test(description="��ѡ������")
	public void AddReceipt3() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//ѡ��ͻ�
		webtest.click("class=webbtn");
		webtest.click("xpath=//input[@xname='�ٶ�']");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		       
		//�������
		webtest.click("id=AltS");
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("���Ͳ���Ϊ��"));	
	}
	@Test(description="��������")
	public void AddReceipt4() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//ѡ��ͻ�
		webtest.click("class=webbtn");
		webtest.click("xpath=//input[@xname='�ٶ�']");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//ѡ����Ŀ����
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='0']");
	
		//�������
		webtest.click("id=AltS");
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("���������0"));	
	}
}
