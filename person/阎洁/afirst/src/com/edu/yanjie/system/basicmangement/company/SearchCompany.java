package com.edu.yanjie.system.basicmangement.company;

import static org.testng.Assert.assertTrue;

import javax.naming.directory.InitialDirContext;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class SearchCompany extends BaseTest {
	
	public void initDemo() {
		//����ϵͳģ��
		webtest.click("xpath=//span[@pmenuid='1']");
		//�����������
		webtest.click("id=menu_down_isons_num220");
		//�����˾��λ
		webtest.click("id=menu_list_company");
	}
	
	@Test(description="�������еĹؼ���")
	public void SearchCompany1() {
		initDemo();
		webtest.type("xpath=//input[@class='form-control']","�ź������Ŷ�");
		webtest.click("xpath=//button[@click='searchbtn']");
		//�ж��Ƿ��н��		
		assertTrue(webtest.isDisplayed("xpath=//tr[@oi='0']"));	
	}
	@Test(description="���������ڵĹؼ�����")
	public void SearchCompany2() throws InterruptedException {
		refreshPage();
		initDemo();
		webtest.type("xpath=//input[@class='form-control']","��");
		webtest.click("xpath=//button[@click='searchbtn']");
		//�ж��Ƿ��н��		
		assertTrue(webtest.isDisplayed("xpath=//tr[@oi='0']"));	
	}

}
