package com.edu.zmj.task;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;
@Listeners(ApiListener.class)
public class AddProject extends BaseTest{
	public void InitDemo() {
		//��������ģ��
		webtest.click("xpath=//span[@pmenuid='66']");
		//�����Ŀ����
		webtest.click("id=menu_down_isons_num79");
		//�����ִ�е���Ŀ
		webtest.click("id=menu_list_num69");
	}
	@Test(description="�������111����Ŀ")
	public void AddProject1() throws InterruptedException {		
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//ѡ����Ŀ����
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='һ����Ŀ']");
		//������Ϊ111
		webtest.type("name=num","111");
		//��������Ϊ111
		webtest.type("name=title","111");
		//ѡ������
		webtest.click("id=btnchange_fuze");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/div[1]/table/tbody/tr/td[2]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/span[1]/div/table/tbody/tr/td[3]/input");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//ѡ��ִ����
		webtest.click("id=btnchange_runuser");
	
		webtest.click("xpath=//input[@xname='������']");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//�������
		webtest.click("id=AltS");
		//�뿪iframeҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("111"));	
	}
	@Test(description="���������")
	public void AddProject2() throws InterruptedException {	
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
	@Test(description="��ѡ����Ŀ����")
	public void AddProject3() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//��������Ϊ111
		webtest.type("name=title","111");
		//�������
		webtest.click("id=AltS");
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("��Ŀ���Ͳ���Ϊ��"));	
	}
	@Test(description="��ѡ������")
	public void AddProject4() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//ѡ����Ŀ����
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='һ����Ŀ']");
		//������Ϊ111
		webtest.type("name=num","111");
		//��������Ϊ111
		webtest.type("name=title","111");
		//�������
		webtest.click("id=AltS");
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("�����˲���Ϊ��"));	
	}
	@Test(description="��ѡ��ִ����")
	public void AddProject5() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//ѡ����Ŀ����
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='һ����Ŀ']");
		//������Ϊ111
		webtest.type("name=num","111");
		//��������Ϊ111
		webtest.type("name=title","111");
		//ѡ������
		webtest.click("id=btnchange_fuze");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/div[1]/table/tbody/tr/td[2]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/span[1]/div/table/tbody/tr/td[3]/input");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//�������
		webtest.click("id=AltS");
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("ִ���˲���Ϊ��"));	
	}
}
