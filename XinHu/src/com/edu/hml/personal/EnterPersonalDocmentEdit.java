package com.edu.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class EnterPersonalDocmentEdit extends BaseTest{
	public void initDemo(){
		//���˰칫
		webtest.click("xpath=//span[@pmenuid='38']");
		//��������
		webtest.click("id=menu_list_num39");
	}
	
	@Test(description="����������ϱ༭ҳ��-����")
	public void test(){
		initDemo();
		//�����������
		webtest.click("id=menu_list_num101");
		//ѡ�и�������
		webtest.click("xpath=//table[@class='table table-striped table-bordered table-hover']/tbody");
		//�������
		webtest.click("xpath=//button[@click='view']");
		webtest.enterFrame("openinputiframe");
		//�������V
		webtest.click("id=showmenu");
		//����༭
		webtest.click("xpath=//li[@lx='1']");
		webtest.leaveFrame();
	}
	@Test(description="����������ϱ༭ҳ��-ֱ�ӵ���༭")
	public void test2(){
		initDemo();
		//�����������
		webtest.click("id=menu_list_num101");
		//ѡ�и�������
		webtest.click("xpath=//table[@class='table table-striped table-bordered table-hover']/tbody");
		//����༭
		webtest.click("xpath=//button[@click='edit']");
	}

}
