package com.edu.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SearchSessionRecord extends BaseTest{
	
	public void initDemo(){
		//���˰칫
		webtest.click("xpath=//span[@pmenuid='38']");
		//��������
		webtest.click("id=menu_list_num39");
		//�ҵĻỰ��¼
		webtest.click("id=menu_list_reimrecord");
	}
	
	@Test(description="�����ҵĻỰ��¼-������")
	public void test(){
		initDemo();
		//��������������Ҫ����������
		webtest.type("xpath=//input[@placeholder='��Ϣ����']","��Ϣ");
		//�������
		webtest.click("xpath=//button[@click='search']");
	}
	@Test(description="�����ҵĻỰ��¼-������/������")
	public void test2(){
		initDemo();
		//���������/�����˺��������ͼ��
		webtest.click("xpath=//button[@click='getdists,1']");
		//ѡ������
		webtest.click("xpath=//td[@deptxu='1_1']");
		//ѡ����ʯ
		webtest.click("xpath=//input[@xname='��ʯ']");
		//���ȷ��
		webtest.click("xpath=//input[@value='ȷ��']");
		//�������
		webtest.click("xpath=//button[@click='search']");
	}

}
