package com.edu.yanjie.system.basicmangement.company;

import static org.testng.Assert.assertTrue;

import javax.naming.directory.InitialDirContext;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class SearchCompany extends BaseTest {
	
	public void initDemo() {
		
		//�����������
		webtest.click("id=menu_down_isons_num220");
		//�����˾��λ
		webtest.click("id=menu_list_company");
	}
	
	@Test
	public void SearchCompany1() {
		initDemo();
		webtest.type("xpath=//input[@class='form-control']","�ź������Ŷ�");
		webtest.click("xpath=//button[@click='searchbtn']");
		WebElement element=webtest.FindElement("xpath=//button[@click='searchbtn']");
			

		assertTrue(webtest.isTextPresent("�Ǻ���"));	
	}

}
