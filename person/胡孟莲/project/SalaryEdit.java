package com.webtest.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SalaryEdit extends BaseTest{
	public void initDemo(){
		//���˰칫
		webtest.click("xpath=//span[@pmenuid='38']");
		//��������
		webtest.click("id=menu_list_num39");
	}
	@Test(description="�༭н�����")
	public void test(){
		initDemo();
		//����ҵ�н��
		webtest.click("id=menu_list_num184");
		//����·ݰ�ť
		webtest.click("xpath=//button[@click='clickdt,2']");
		//���걾��
		webtest.click("xpath=//div[@class='rockdatepicker']/div[2]/a[2]");
		//����
		webtest.click("xpath=//button[@click='search']");
		//ѡ��һ��н�ʼ�¼
		webtest.click("xpath=//tr[@dataid='12']");
		//����
		webtest.click("xpath=//button[@click='view']");
		//����iframe
		webtest.enterFrame("openinputiframe");
		//����V
		webtest.click("id=showmenu");
		//�༭
		webtest.click("xpath=//li[@lx='1']");
		//�޸Ļ�������
		webtest.type("xpath=//input[@name='base']","2000");
		//�������
		webtest.click("id=AltS");
		//�뿪iframe
		webtest.leaveFrame();
	}

}
