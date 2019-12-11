package com.edu.yanjie.system.basicmangement.userMangement;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class ChangePhoto extends BaseTest {
	public void initDemo() {
		//����ϵͳģ��
		webtest.click("xpath=//span[@pmenuid='1']");
		//�����������
		webtest.click("id=menu_down_isons_num220");				
		//����û�����
		webtest.click("id=menu_list_user");
	}
	@Test(description="�ж�û��ѡ���û�ʱ���޸�ͷ��ť�Ƿ�һ�")
	public void changePhoto1() throws InterruptedException {
		initDemo();
		//��ϵͳ���Ѳ��
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		assertFalse(webtest.isEnabled("xpath=//button[@class='btn btn-default']"));
	}
	@Test(description="ѡ���û��޸�ͷ���ϴ�ͼƬ�ļ�")
		public void changePhoto2() throws InterruptedException {
		refreshPage();
		initDemo();
       //ѡ��һ���û�
		webtest.click("id=faceviewabc_21");
		//��ϵͳ���Ѳ��
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//����޸�ͷ��
		webtest.click("xpath=//button[@click='editface']");
		//����iframe
		webtest.enterFrame("winiframe");
		//������ļ�
		webtest.click("id=addbtn");
		//��input����Ϊ�ɼ�
		WebElement element=webtest.FindElement("name=myform");
		webtest.ElementDisplay(element);
		//ѡ��һ��ͼƬ
		webtest.type("id=inputfileid", "D:\\demo\\tree.jpg");
		//�����ʼ�ϴ�
		webtest.click("id=startbtn");
		//�ϴ���Ϻ���ȷ��
		webtest.click("id=quebtn");
		webtest.leaveFrame();
		//�ж��Ƿ�����µ�ͼƬ
		assertTrue(webtest.isElementPresent("xpath=//img[@src='upload/face/10_8292.jpg']"));
		assertTrue(webtest.isTextPresent("�޸ĳɹ�,��û��ʾ����ͷ��,��������������"));
	}
	@Test(description="ѡ���û��޸�ͷ���ϴ���ͼƬ�ļ�")
	public void changePhoto3() throws InterruptedException {
		refreshPage();
		initDemo();
	    //ѡ��һ���û�
		webtest.click("id=faceviewabc_11");
		//��ϵͳ���Ѳ��
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//����޸�ͷ��
		webtest.click("xpath=//button[@click='editface']");
		//����iframe
		webtest.enterFrame("winiframe");
		//������ļ�
		webtest.click("id=addbtn");
		//��input����Ϊ�ɼ�
		WebElement element=webtest.FindElement("name=myform");
		webtest.ElementDisplay(element);
		//ѡ��һ����ͼƬ�ļ�
		webtest.type("id=inputfileid", "D:\\demo\\1.txt");
		//�����ʼ�ϴ�
		webtest.click("id=startbtn");
		//�ϴ���Ϻ���ȷ��
		webtest.click("id=quebtn");
//		webtest.leaveFrame();
		assertTrue(webtest.isTextPresent("�ļ����Ͳ����ϣ���ѡ������Ϊ[jpg,png,gif,bmp,jpeg]���ļ�"));
	}
	@Test(description="ѡ���û��޸�ͷ���ϴ�2��ͼƬ")
	public void changePhoto4() throws InterruptedException {
		refreshPage();
		initDemo();
	   //ѡ��һ���û�
		webtest.click("id=faceviewabc_11");
		//��ϵͳ���Ѳ��
		webtest.click("xpath=//div[@style='position:absolute;right:3px;top:0px;cursor:pointer']");
		//����޸�ͷ��
		webtest.click("xpath=//button[@click='editface']");
		//����iframe
		webtest.enterFrame("winiframe");
		//������ļ�
		webtest.click("id=addbtn");
		//��input����Ϊ�ɼ�
		WebElement element=webtest.FindElement("name=myform");
		webtest.ElementDisplay(element);
		//ѡ��һ��ͼƬ
		webtest.type("id=inputfileid", "D:\\demo\\ͷ��.png");
		webtest.type("id=inputfileid", "D:\\demo\\tree.jpg");
		//�����ʼ�ϴ�
		webtest.click("id=startbtn");
		//�ϴ���Ϻ���ȷ��
		webtest.click("id=quebtn");
//		webtest.leaveFrame();
		//�ж��Ƿ�����µ�ͼƬ
		assertTrue(webtest.isElementPresent("�������1���ļ�"));
	}
	
	
}
