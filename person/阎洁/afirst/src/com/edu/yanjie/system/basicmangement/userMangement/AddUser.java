package com.edu.yanjie.system.basicmangement.userMangement;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class AddUser extends BaseTest {
	public void InitDemo() {
		//�����������
		webtest.click("id=menu_down_isons_num220");
		//����û�����
		webtest.click("id=menu_list_user");
	}
	@Test(description="����û���Ϊtom1���û�")
	public void addUser1() {
		InitDemo();
		webtest.click("xpath=//button[@class='btn btn-primary']");
		webtest.enterFrame("openinputiframe");
		//�����������û���
		webtest.type("name=name", "tom1");
		webtest.type("name=user", "tom1");
		//ѡ����
		webtest.click("id=btnchange_deptname");
		webtest.click("xpath=//input[@xname='�����']");		
		//���ȷ����ť
		webtest.click("xpath=//input[@value='ȷ��']");
		//��дְλ
		webtest.type("name=ranking", "cmo");
		//ѡ��������λ
		webtest.click("xpath=//select[@name='companyid']");
		webtest.click("xpath=//option[@value='1']");
		//�����ֻ���
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.type("name=mobile", "12345678903");
		webtest.click("id=AltS");
		//�뿪iframeҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("tom1"));				
		
	}

}
