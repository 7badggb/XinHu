package com.edu.yanjie.system.subscriptionManagement.subscriptionManagement;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class SubscriptionOperate extends BaseTest {
	public void initDemo() {
//		����ϵͳģ��
		webtest.click("xpath=//span[@pmenuid='1']");
//		������Ĺ���
		webtest.click("id=menu_list_num237");				
//		������Ĺ���
		webtest.click("id=menu_list_rssglall");
	}
	@Test(description="������������Ϊ��ʱ����")
	public void subscripitonOperate1() throws InterruptedException{
		initDemo();
		//�������
		webtest.click("link=����");
		//ѡ�������������
		webtest.click("xpath=//li[@temp='3']");
		webtest.enterFrame("openinputiframe");
		//�ж��Ƿ���ʾ�������Ϊ��
		assertTrue(webtest.isTextPresent("����Ƶ�ʲ���Ϊ��"));
		
	}
	@Test(description="����������������Ƶ��Ϊÿ�� 02 02:05:00")
	public void subscripitonOperate2() throws InterruptedException{
		initDemo();
	    //�������
		webtest.click("link=����");
		//ѡ�������������
		webtest.click("xpath=//li[@temp='3']");
		webtest.enterFrame("openinputiframe");
		WebElement element=webtest.FindElement("name=rave_pinlvs2");
		webtest.RemoveAttribute(element);
		webtest.type("name=rave_pinlvs2", "2019-12-02 15:32:00");
		webtest.click("name=ratecont");
		//������水ť
		webtest.click("xpath=//input[@value='����(S)']");
		webtest.leaveFrame();
		assertTrue(webtest.isTextPresent("2019-12-02 15:32:00"));
	}

}
