package com.edu.zmj.task;
import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;
public class DeleteProject extends BaseTest{
	public void InitDemo() {
		//��������ģ��
		webtest.click("xpath=//span[@pmenuid='66']");
		//�����Ŀ����
		webtest.click("id=menu_down_isons_num79");
		//�����ִ�е���Ŀ
		webtest.click("id=menu_list_num69");
	}
	@Test(description="ɾ������111����Ŀ")
	public void DeleteProject1(){		
		InitDemo();		
		//�������
		webtest.click("xpath=/html/body/table/tbody/tr/td[3]/div/div[4]/div/div[2]/div[3]/div[1]/table/tbody/tr[1]/td[12]/a");
	    //���ɾ��
		webtest.click("xpath=/html/body/div[1]/div/ul/li[10]");
		webtest.click("id=confirm_btn1");
		assertFalse(webtest.isTextPresent("111"));	
	}
}
