package com.edu.zmj.task;

import static org.testng.Assert.assertTrue;

import static org.testng.Assert.assertFalse;
import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class SearchContract extends BaseTest {
	
	public void initDemo() {
		//����ͻ�ģ��
		webtest.click("xpath=//span[@pmenuid='63']");
		//�����ͬ
		webtest.click("id=menu_list_num104");
		//����ҵĺ�ͬ
		webtest.click("id=menu_list_num108");
	}
	
	@Test(description="�������еĹؼ���")
	public void SearchContract1() {
		initDemo();
		webtest.type("xpath=//input[@class='form-control']","HT-007");
		webtest.click("xpath=//button[@click='searchbtn']");
		//�ж��Ƿ��н��		
		assertTrue(webtest.isDisplayed("xpath=//tr[@oi='0']"));	
	}
	@Test(description="���������ڵĹؼ���")
	public void SearchContract2() throws InterruptedException {
		refreshPage();
		initDemo();
		webtest.type("xpath=//input[@class='form-control']","0");
		webtest.click("xpath=//button[@click='searchbtn']");
		//�ж��Ƿ��н��		
		assertFalse(webtest.isDisplayed("xpath=//tr[@oi='0']"));	
	}

}