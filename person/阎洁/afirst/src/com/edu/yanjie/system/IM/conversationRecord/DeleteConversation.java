package com.edu.yanjie.system.IM.conversationRecord;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class DeleteConversation extends BaseTest {
	public void initDemo() {
//		����ϵͳģ��
		webtest.click("xpath=//span[@pmenuid='1']");
//		�����ʱͨ�Ź���
		webtest.click("id=menu_list_num14");				
//		����Ự��¼
		webtest.click("id=menu_list_num228");
	}
	@Test(description="δѡ�лỰ��¼ʱ���ж�ɾ����ť�Ƿ�Ϊ�û�״̬")
	public void deleteConversation1() {
		initDemo();
		//��ϵͳ���Ѳ��
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		assertFalse(webtest.isEnabled("xpath=//button[@click='del']"));
	}

}
