package com.edu.yanjie.system.subscriptionManagement.subscriptionManagement;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

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
		//�жϱ��水ť�Ƿ�Ϊ�û�״̬
		assertFalse(webtest.isEnabled("xpath=//input[@value='����(S)']"));	
		
	}
	@Test(description="����������������Ƶ��Ϊÿ�� 02 02:05:00")
	public void subscripitonOperate2() throws InterruptedException{
		initDemo();
	    //�������
		webtest.click("link=����");
		//ѡ�������������
		webtest.click("xpath=//li[@temp='3']");
		webtest.type("name=ratecont", "ÿ�� 02 02:05:00");
		//������水ť
		webtest.click("xpath=//input[@value='����(S)']");
	}

}
