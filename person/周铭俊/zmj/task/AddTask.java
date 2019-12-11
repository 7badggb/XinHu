package com.edu.zmj.task;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;
@Listeners(ApiListener.class)
public class AddTask extends BaseTest{
	public void InitDemo() {
		//��������ģ��
		webtest.click("xpath=//span[@pmenuid='66']");
		//����ҵ�����
		webtest.click("id=menu_list_num68");
	}
	@Test(description="�������111������")
	public void AddProject1() throws InterruptedException {		
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//ѡ������
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='bug']");
		//ѡ��ȼ�
		webtest.click("xpath=//select[@name='grade']");
		webtest.click("xpath=//option[@value='��']");
		//�������Ϊ111
		webtest.type("name=title","111");
		//�������
		//�������
		webtest.click("id=AltS");
		//�뿪iframeҳ��
		webtest.leaveFrame();
		assertTrue(webtest.isTextPresent("111"));	
	}
	@Test(description="����ӱ���")
	public void AddProject2() throws InterruptedException {	
		refreshPage();
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//�������
		webtest.click("id=AltS");
		assertTrue(webtest.isTextPresent("���ⲻ��Ϊ��"));
		//�뿪iframeҳ��

	}
	@Test(description="��ѡ������")
	public void AddProject3() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//�������Ϊ111
		webtest.type("name=title","111");		
		//�������
		webtest.click("id=AltS");
		assertTrue(webtest.isTextPresent("���Ͳ���Ϊ��"));
	}
	@Test(description="��ѡ��ȼ�")
	public void AddProject4() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//�������Ϊ111
		webtest.type("name=title","111");
		//ѡ������
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='bug']");
		//�������
		webtest.click("id=AltS");
		assertTrue(webtest.isTextPresent("�ȼ�����Ϊ��"));
	}
}