package com.edu.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CreateSchedule extends BaseTest{
	public void initDemo(){
		//���˰칫
		webtest.click("xpath=//span[@pmenuid='38']");
	}
	@Test(description="�����ճ�")
	//�����ճ�
	public void test(){
		initDemo();
		//����ճ�
		webtest.click("id=menu_list_schedule");
		//�������
		webtest.click("xpath=//button[@click='clickwin,0']");
		//�������
		webtest.type("xpath=//input[@name='title']","�ճ�500");
		//����ʱ��
		webtest.click("xpath=//input[@readonly name='startdt']");
		//����1��
		webtest.click("xpath=//td[@xu='1']");
		//���ȷ��
		webtest.click("xpath=//div[@class='rockdatepicker']/div[4]/a[3]");
		//��ֹʱ��
		webtest.click("xpath=//input[@readonly name='enddt']");
		//����30��
		webtest.click("xpath=//td[@xu='30']");
		//���ȷ��
		webtest.click("xpath=//div[@class='rockdatepicker']/div[4]/a[3]");
		//�������
		webtest.click("id=AltS");
	}
}
