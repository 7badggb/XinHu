package com.edu.zmj.task;

import static org.testng.Assert.assertTrue;

import static org.testng.Assert.assertFalse;
import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class SearchProject extends BaseTest {
	
	public void initDemo() {
		//��������ģ��
		webtest.click("xpath=//span[@pmenuid='66']");
		//�����Ŀ����
		webtest.click("id=menu_down_isons_num79");
		//�����ִ�е���Ŀ
		webtest.click("id=menu_list_num69");
	}
	
	@Test(description="�������еĹؼ���")
	public void SearchProject1() {
		initDemo();
		webtest.type("xpath=//input[@class='form-control']","΢��С���򿪷�");
		webtest.click("xpath=//button[@click='searchbtn']");
		//�ж��Ƿ��н��		
		assertTrue(webtest.isDisplayed("xpath=//tr[@oi='0']"));	
	}
	@Test(description="���������ڵĹؼ���")
	public void SearchProject2() throws InterruptedException {
		refreshPage();
		initDemo();
		webtest.type("xpath=//input[@class='form-control']","0");
		webtest.click("xpath=//button[@click='searchbtn']");
		//�ж��Ƿ��н��		
		assertFalse(webtest.isDisplayed("xpath=//tr[@oi='0']"));	
	}
	@Test(description="ͨ��״̬����")
	public void SearchProject3() throws InterruptedException{
		refreshPage();
		initDemo();
		webtest.click("xpath=//select[@class='form-control']");
		webtest.click("xpath=//option[@value='0']");
		webtest.click("xpath=//button[@click='searchbtn']");
		//�ж��Ƿ��н��		
		assertTrue(webtest.isDisplayed("xpath=//tr[@oi='0']"));	
	}
}