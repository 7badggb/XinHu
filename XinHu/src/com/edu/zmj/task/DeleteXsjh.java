package com.edu.zmj.task;
import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;
public class DeleteXsjh extends BaseTest{
	public void InitDemo() {
		//����ͻ�ģ��
		webtest.click("xpath=//span[@pmenuid='63']");
		//������ۻ���
		webtest.click("id=menu_list_num73");
		//����ҵ����ۻ���
		webtest.click("id=menu_list_num110");
	}
	@Test(description="ɾ�����ۻ���")
	public void DeleteXsjh1(){		
		InitDemo();		
		//�������
		webtest.click("xpath=/html/body/table/tbody/tr/td[3]/div/div[4]/div/div[2]/div[3]/div[1]/table/tbody/tr[1]/td[11]/a");
	    //���ɾ��
		webtest.click("xpath=/html/body/div[1]/div/ul/li[10]");
		webtest.click("id=confirm_btn1");
		assertFalse(webtest.isTextPresent("�ٶ�"));	
	}
}