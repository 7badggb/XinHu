package com.edu.yanjie.system.IM.conversationManagement;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class SendMessage extends BaseTest {
	public void initDemo() {
		//����ϵͳģ��
//		webtest.click("xpath=//span[@pmenuid='1']");
		//�����ʱͨ�Ź���
//		webtest.click("id=menu_list_num14");				
		//����Ự����
//		webtest.click("id=menu_list_num16");
	}
	@Test(description="����������Ϣ")
	public void sendMessage1() {
		//�򿪻Ự����
		webtest.open("http://localhost:8888/xinhu_utf8_v1.5.9/?d=reim&m=chat&uid=2&type=group&winobj=group_2");
		webtest.type("class=content","���Ǻ�ѽ");
		webtest.click("xpath=//a[@tools='send']");
		assertTrue(webtest.isTextPresent("���Ǻ�ѽ"));
	}
	@Test(description="���ͱ�����Ϣ")
	public void sendMessage2() {
		//�򿪻Ự����
		webtest.open("http://localhost:8888/xinhu_utf8_v1.5.9/?d=reim&m=chat&uid=2&type=group&winobj=group_2");		
		webtest.type("class=content","[Ʋ��]");
		webtest.click("xpath=//a[@tools='send']");
		assertTrue(webtest.isElementPresent("xpath=//img[@src='web/images/im/emots/qq/1.gif']"));	
	}
	@Test(description="����ͼƬ�ļ�")
	public void sendMessage3() {
		//�򿪻Ự����
		webtest.open("http://localhost:8888/xinhu_utf8_v1.5.9/?d=reim&m=chat&uid=2&type=group&winobj=group_2");
		webtest.click("xpath=//a[@tools='file']");
//		webtest.runJs("arguments[0].setAttribute(arguments[1],"+"arguments[2])",webtest.FindElement("name=form_allfileinput"),display,block);
		WebElement element=webtest.FindElement("name=form_allfileinput");
		webtest.ElementDisplay(element);
		webtest.type("id=allfileinput", "D:\\demo\\tree.jpg");
		assertTrue(webtest.isDisplayed("xpath=//img[@fid='11']"));
	}
	@Test(description="���ͷ�ͼƬ�ļ�")
	public void sendMessage4() {
		//�򿪻Ự����
		webtest.open("http://localhost:8888/xinhu_utf8_v1.5.9/?d=reim&m=chat&uid=2&type=group&winobj=group_2");
		webtest.click("xpath=//a[@tools='file']");
//		webtest.runJs("arguments[0].setAttribute(arguments[1],"+"arguments[2])",webtest.FindElement("name=form_allfileinput"),display,block);
		WebElement element=webtest.FindElement("name=form_allfileinput");
		webtest.ElementDisplay(element);
		webtest.type("id=allfileinput", "D:\\demo\\1.txt");
		assertTrue(webtest.isTextPresent("1.txt"));
	}
	
	

}
