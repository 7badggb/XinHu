package com.edu.yanjie.system.subscriptionManagement.subscriptionManagement;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class RunSubscription extends BaseTest{
	public void initDemo() {
//		����ϵͳģ��
		webtest.click("xpath=//span[@pmenuid='1']");
//		������Ĺ���
		webtest.click("id=menu_list_num237");				
//		������Ĺ���
		webtest.click("id=menu_list_rssglall");
	}
	@Test(description="û��ѡ�ж���ʱ�ж����а�ť�Ƿ�Ϊ�û�״̬")
	public void subscripitonOperate1() throws InterruptedException{
		initDemo();
		//��ϵͳ���Ѳ��
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//�жϱ��水ť�Ƿ�Ϊ�û�״̬
		assertFalse(webtest.isEnabled("xpath=//button[@click='dinghue']"));			
	}
	@Test(description="ѡ�ж��ĺ�����")
	public void subscripitonOperate2() throws InterruptedException{
		initDemo();
		webtest.doubleClick("xpath=//td[@fields='cont']");
		//��ϵͳ���Ѳ��
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//������水ť
		webtest.click("xpath=//button[@click='dinghue']");
		assertTrue(webtest.isTextPresent("������"));	
	}

}
