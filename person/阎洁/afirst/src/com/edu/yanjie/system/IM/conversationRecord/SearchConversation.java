package com.edu.yanjie.system.IM.conversationRecord;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class SearchConversation extends BaseTest {
	public void initDemo() {
//		����ϵͳģ��
		webtest.click("xpath=//span[@pmenuid='1']");
//		�����ʱͨ�Ź���
		webtest.click("id=menu_list_num14");				
//		����Ự��¼
		webtest.click("id=menu_list_num228");
	}
	@Test(description="������Ϣ���ݽ�������")
	public void searchConversation1() {
		initDemo();
		webtest.type("xpath=//input[@placeholder='��Ϣ����']", "[΢Ц]");
		webtest.click("xpath=//button[@click='search']");
		//�ж��Ƿ��н��
		assertTrue(webtest.isDisplayed("xpath=//tr[@oi='0']"));
	}
	@Test(description="���벻���ڵ���Ϣ���ݽ�������")
	public void searchConversation2() {
		initDemo();
		webtest.type("xpath=//input[@placeholder='��Ϣ����']", "��");
		webtest.click("xpath=//button[@click='search']");
		//�ж��Ƿ�û�н��
		assertFalse(webtest.isDisplayed("xpath=//tr[@oi='0']"));
	}
	@Test(description="������Ϣ�����˽�������")
	public void searchConversation3() {
		initDemo();
		//�����������ķŴ�
		webtest.click("xpath=//button[@click='getdists,1']");
		//ѡ�������tom
		webtest.click("xpath=//td[@deptxu='1_1']");
		webtest.click("xpath=//input[@xname='tom']");
		webtest.click("xpath=//input[@value='ȷ��']");
		//���������ť
		webtest.click("xpath=//button[@click='search']");
		//�ж��Ƿ��н��
		assertFalse(webtest.isDisplayed("xpath=//tr[@oi='0']"));
	}
	

}
