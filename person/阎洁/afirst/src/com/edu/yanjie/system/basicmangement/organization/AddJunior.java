package com.edu.yanjie.system.basicmangement.organization;


import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;


public class AddJunior extends BaseTest {
	
	public void initDemo() {
		//�����������
		webtest.click("id=menu_down_isons_num220");
		//�����֯�ṹ
		webtest.click("id=menu_list_num6");		
	}
	@Test(description="ֱ�ӵ�������¼�")
	public void addJunior1() {
		initDemo();
		//�ж������¼���ť�Ƿ�һ�
		assertFalse(webtest.isEnabled("xpath=//button[@class='btn btn-success']"));		
	}
	@Test(description="ѡ��һ����֯�������¼�")
	public void addJunior2() {
		initDemo();
		webtest.click("xpath=//td[@row='4']");
		//��������¼�
		webtest.click("xpath=//button[@class='btn btn-success']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//��������Ϊ�Ǻ���
	    webtest.type("name=name","�Ǻ���");
		//�������
		webtest.click("class=btn btn-primary");
		//�뿪iframeҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("�Ǻ���"));	
	
	}



}
