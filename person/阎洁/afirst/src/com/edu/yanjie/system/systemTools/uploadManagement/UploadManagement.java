package com.edu.yanjie.system.systemTools.uploadManagement;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class UploadManagement extends BaseTest {
	public void initDemo() {
//		����ϵͳģ��
		webtest.click("xpath=//span[@pmenuid='1']");
//		���ϵͳ����
		webtest.click("id=menu_list_num46");				
//		����ϴ��ļ�����
		webtest.click("id=menu_list_num161");
	}
	@Test(description="�鿴ͼƬ")
	public void viewPhoto() {
		initDemo();
		webtest.click("link=�鿴");		
		assertTrue(webtest.isTextPresent("�����ļ�"));
		
	}

}
