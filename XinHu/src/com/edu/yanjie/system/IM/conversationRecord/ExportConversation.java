package com.edu.yanjie.system.IM.conversationRecord;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class ExportConversation extends BaseTest {
	public void initDemo() {
//		����ϵͳģ��
		webtest.click("xpath=//span[@pmenuid='1']");
//		�����ʱͨ�Ź���
		webtest.click("id=menu_list_num14");				
//		����Ự��¼
		webtest.click("id=menu_list_num228");
	}
	@Test(description="�����Ự��¼")
	public void ExportConversation1() {
		initDemo();
		//��ϵͳ���Ѳ��
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		webtest.click("xpath=//button[@click='daochu,1']");
		assertTrue(webtest.isTextPresent("����ɹ�"));
	}
}
