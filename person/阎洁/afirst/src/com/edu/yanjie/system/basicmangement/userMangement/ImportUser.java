package com.edu.yanjie.system.basicmangement.userMangement;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class ImportUser extends BaseTest  {
	
	public void initDemo() {
		//����ϵͳģ��
		webtest.click("xpath=//span[@pmenuid='1']");
		//�����������
		webtest.click("id=menu_down_isons_num220");				
		//����û�����
		webtest.click("id=menu_list_user");
	}
	@Test(description="�ɹ������û�")
	public void importUser1() throws InterruptedException {
		initDemo();
		//��ϵͳ���Ѳ��
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//������밴ť
		webtest.click("xpath=//button[@click='daoru,1']");
		//��������
		webtest.type("xpath=//textarea[@class='form-control']", "zxp2");
		//��������
		webtest.click("xpath=//a[@click='insrtss']");
		//�����û���
		webtest.type("xpath=//textarea[@class='form-control']", "zxp2");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "��");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "12345678906");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "�ź������Ŷ�/������");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "cro");
		webtest.click("xpath=//button[@click='saveadd']");
		assertTrue(webtest.isTextPresent("�ɹ�����1������"));

	}
	@Test(description="�����Ѵ��ڵ��û�")
	public void importUser2() throws InterruptedException {
		initDemo();
		//��ϵͳ���Ѳ��
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//������밴ť
		webtest.click("xpath=//button[@click='daoru,1']");
		//��������
		webtest.type("xpath=//textarea[@class='form-control']", "zxp1");
		//��������
		webtest.click("xpath=//a[@click='insrtss']");
		//�����û���
		webtest.type("xpath=//textarea[@class='form-control']", "zxp1");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "��");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "12345678905");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "�ź������Ŷ�/������");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "cro");
		webtest.click("xpath=//button[@click='saveadd']");
		assertTrue(webtest.isTextPresent("û�пɵ��������,�����д����ظ�����"));

	}
	@Test(description="���������Ϊ�յ��û�")
	public void importUser3() throws InterruptedException {
		initDemo();
		//��ϵͳ���Ѳ��
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//������밴ť
		webtest.click("xpath=//button[@click='daoru,1']");
		//��������
		webtest.type("xpath=//textarea[@class='form-control']", "");
		//��������
		webtest.click("xpath=//a[@click='insrtss']");
		//�����û���
		webtest.type("xpath=//textarea[@class='form-control']", "");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "��");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "12345678905");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "�ź������Ŷ�/������");
		webtest.click("xpath=//a[@click='insrtss']");
		webtest.type("xpath=//textarea[@class='form-control']", "cro");
//		Thread.sleep(3000);
		webtest.click("xpath=//button[@click='saveadd']");
		assertTrue(webtest.isTextPresent("û�пɵ��������,ע��*�Ǳ����Ŷ"));
	}
	@Test(description="����յ��û�")
	public void importUser4() throws InterruptedException {
		initDemo();
		//��ϵͳ���Ѳ��
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//������밴ť
		webtest.click("xpath=//button[@click='daoru,1']");
		webtest.click("xpath=//button[@click='saveadd']");
		assertTrue(webtest.isTextPresent("û�������κζ���"));
	}
	
	

}
