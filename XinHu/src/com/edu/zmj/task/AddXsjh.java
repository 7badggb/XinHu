package com.edu.zmj.task;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;

public class AddXsjh extends BaseTest{
	public void InitDemo() {
		//����ͻ�ģ��
		webtest.click("xpath=//span[@pmenuid='63']");
		//������ۻ���
		webtest.click("id=menu_list_num73");
		//����ҵ����ۻ���
		webtest.click("id=menu_list_num110");
	}
	@Test(description="��Ӱٶȿͻ�")
	public void AddXsjh1() throws InterruptedException {		
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//ѡ��ͻ�
		webtest.click("class=webbtn");
		webtest.click("xpath=//input[@xname='�ٶ�']");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
        //ѡ����Դ
		webtest.click("xpath=//select[@name='laiyuan']");
		webtest.click("xpath=//option[@value='��������']");
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
	public void AddXsjh2() throws InterruptedException {	
		refreshPage();
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//�������
		webtest.click("id=AltS");
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("�ͻ�����Ϊ��"));	
	}
	@Test(description="��ѡ����Դ")
	public void AddXsjh3() throws InterruptedException {
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
		assertTrue(webtest.isTextPresent("�ͻ����Ͳ���Ϊ��"));	
	}
}
