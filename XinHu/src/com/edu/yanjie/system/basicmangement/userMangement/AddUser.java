package com.edu.yanjie.system.basicmangement.userMangement;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.edu.core.BaseTest;
import com.edu.dataprovider.NSDataProvider;

public class AddUser extends BaseTest {
	public void InitDemo() {
		//����ϵͳģ��
		webtest.click("xpath=//span[@pmenuid='1']");
		//�����������
		webtest.click("id=menu_down_isons_num220");
		//����û�����
		webtest.click("id=menu_list_user");
	}
	@BeforeTest
	public void doBeforeTest() {	
		deleteRecord("xinhu_admin", "tom2");
		deleteRecord("xinhu_admin", "tom3");	
		deleteRecord("xinhu_admin", "tom4");	
		deleteRecord("xinhu_admin", "jerry1");	
		deleteRecord("xinhu_admin", "jerry2");	
	}
	@Test(dataProvider="excel",dataProviderClass=NSDataProvider.class,description="������������µ��û�")
	public void addUser1(String name,String user,String ranking,String mobile,String condition) {
		InitDemo();
		webtest.click("xpath=//button[@class='btn btn-primary']");
		webtest.enterFrame("openinputiframe");
		//�����������û���
		webtest.type("name=name", name);
		webtest.type("name=user", user);
		//ѡ����
		webtest.click("id=btnchange_deptname");
		webtest.click("xpath=//input[@xname='�����']");		
		//���ȷ����ť
		webtest.click("xpath=//input[@value='ȷ��']");
		//��дְλ
		webtest.type("name=ranking", ranking);
		//ѡ��������λ
		webtest.click("xpath=//select[@name='companyid']");
		webtest.click("xpath=//option[@value='1']");
		//�����ֻ���
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.type("name=mobile", mobile);
		webtest.click("id=AltS");
		//�뿪iframeҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent(condition));
	}
		
		@Test(description="����û���Ϊ���ĵ��û�")
		public void addUser2() throws InterruptedException {
			refreshPage();
			InitDemo();
			webtest.click("xpath=//button[@class='btn btn-primary']");
			webtest.enterFrame("openinputiframe");
			//�����������û���
			webtest.type("name=name", "tom3");
			webtest.type("name=user", "��ķ3");
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
			webtest.type("name=mobile", "12345678904");
			webtest.click("id=AltS");
			//�뿪iframeҳ��
//			webtest.leaveFrame();
			//��֤�Ƿ���ʾ����������
			assertTrue(webtest.isTextPresent("�û�������������"));				
			
	}

}
