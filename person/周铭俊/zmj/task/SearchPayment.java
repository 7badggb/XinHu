package com.edu.zmj.task;

import static org.testng.Assert.assertTrue;

import static org.testng.Assert.assertFalse;
import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class SearchPayment extends BaseTest {
	
	public void initDemo() {
		//����ͻ�ģ��
		webtest.click("xpath=//span[@pmenuid='63']");
		//������
		webtest.click("id=menu_list_num118");
		//����ҵĸ��
		webtest.click("id=menu_list_num107");
	}
	
	@Test(description="�������еĹؼ���")
	public void SearchPayment1() {
		initDemo();
		webtest.type("xpath=//input[@class='form-control']","HT-003");
		webtest.click("xpath=//button[@click='searchbtn']");
		//�ж��Ƿ��н��		
		assertTrue(webtest.isDisplayed("xpath=//tr[@oi='0']"));	
	}
	@Test(description="���������ڵĹؼ���")
	public void SearchPayment2() throws InterruptedException {
		refreshPage();
		initDemo();
		webtest.type("xpath=//input[@class='form-control']","0");
		webtest.click("xpath=//button[@click='searchbtn']");
		//�ж��Ƿ��н��		
		assertFalse(webtest.isDisplayed("xpath=//tr[@oi='0']"));	
	}

}
