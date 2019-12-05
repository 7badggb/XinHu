package com.edu.yanjie.system.basicmangement.groupMangement;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class AddGroupUser extends BaseTest {
	public void InitDemo() {
		//����ϵͳģ��
		webtest.click("xpath=//span[@pmenuid='1']");
		//�����������
		webtest.click("id=menu_down_isons_num220");
		//��������
		webtest.click("id=menu_list_group");
	}
	@Test(description="������³�Ա")
	public void addGroupUser1() throws InterruptedException {
		InitDemo();
		webtest.doubleClick("xpath=//td[@cell='2']");
		//��ϵͳ���Ѳ��
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//���������³�Ա
		webtest.click("xpath=//button[@click='addguser,0']");
		//ѡ������
		webtest.click("xpath=//td[@deptxu='1_1']");
		//ѡ��tom1
		webtest.click("xpath=//input[@xname='tom1']");
		//���ȷ��
		webtest.click("xpath=//input[@value='ȷ��']");
		//�ٴ�ѡ����飬�鿴���ڳ�Ա
		webtest.doubleClick("xpath=//td[@cell='2']");
		assertTrue(webtest.isTextPresent("tom1"));
		
	}
	@Test(description="��ѡ����ֱ�ӵ��������³�Ա")
	public void addGroupUser2() throws InterruptedException {
		InitDemo();
		//��ϵͳ���Ѳ��
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//ֱ�ӵ��ȷ�����ж�������³�Ա��ť�Ƿ��û�״̬
		assertFalse(webtest.isEnabled("xpath=//button[@click='addguser,0']"));
	}
	@Test(description="��ѡ���Ա��ֱ�ӵ��ȷ��")
	public void addGroupUser3() throws InterruptedException {
		InitDemo();
		webtest.doubleClick("xpath=//td[@cell='2']");		
		//��ϵͳ���Ѳ��
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//���������³�Ա
		webtest.click("xpath=//button[@click='addguser,0']");
		//ֱ�ӵ��ȷ�����ж�ȷ����ť�Ƿ��û�״̬
		assertFalse(webtest.isEnabled("xpath=//input[@value='ȷ��']"));
	}


}
