package com.edu.zmj.task;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;
@Listeners(ApiListener.class)
public class AddContract extends BaseTest{
	public void InitDemo() {
		//����ͻ�ģ��
		webtest.click("xpath=//span[@pmenuid='63']");
		//�����ͬ
		webtest.click("id=menu_list_num104");
		//����ҵĺ�ͬ
		webtest.click("id=menu_list_num108");
	}
	@Test(description="��Ӻ�ͬ")
	public void AddContract1() throws InterruptedException {		
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//ѡ��ͻ�
		webtest.click("class=webbtn");
		webtest.click("xpath=//input[@xname='�ٶ�']");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
        //ѡ��ʼ����
		webtest.click("id=div_startdt");
		webtest.click("xpath=/html/body/div[1]/div[4]/a[2]");
		//ѡ���ֹ����
		webtest.click("id=div_enddt");
		webtest.click("xpath=/html/body/div[1]/div[2]/table/tbody/tr[4]/td[7]");
		webtest.click("xpath=/html/body/div[1]/div[4]/a[3]");
		//�������
		webtest.click("id=AltS");
		//�뿪iframeҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("�ٶ�"));	
	}
	@Test(description="���������")
	public void AddContract2() throws InterruptedException {	
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
	@Test(description="��ѡ����Ч����")
	public void AddContract3() throws InterruptedException {
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
		assertTrue(webtest.isTextPresent("��Ч���ڲ���Ϊ��"));	
	}
	@Test(description="��ѡ���ֹ����")
	public void AddContract4() throws InterruptedException {
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
		//ѡ��ʼ����
		webtest.click("id=div_startdt");
		webtest.click("xpath=/html/body/div[1]/div[4]/a[2]");
				
		//�������
		webtest.click("id=AltS");
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("��ֹ���ڲ���Ϊ��"));	
	}
}