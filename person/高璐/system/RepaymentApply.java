package com.edu.system;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class RepaymentApply extends BaseTest {

//���뻹�
		public void InitDemo() {
			//��������ģ��
			webtest.click("xpath=//span[@pmenuid='40']");
			//�����������
			webtest.click("id=menu_list_num42");		
		}
		
		@Test(description="����������뻹����С��Ƿ����500")
		public void AddApply1() {
			InitDemo();
			//������
			webtest.click("xpath=//a[@onclick=\"openinput('���','finhkd',0)\"]");
			//�������frame
			webtest.enterFrame("openinputiframe");
			//���뻹����
			webtest.type("name=money","416");
			//�������
			webtest.click("id=AltS");
			//�뿪frameҳ��
			webtest.leaveFrame();
			//�����Ƿ���ӳɹ�
//			assertTrue(webtest.isTextPresent("416"));				
		}
		
		@Test(description="����д������Ĭ��Ϊ0")
		public void AddApply2() {
			InitDemo();
			//������ڻ��豸
			webtest.click("xpath=//a[@onclick=\"openinput('���','finhkd',0)\"]");
			//�������frame
			webtest.enterFrame("openinputiframe");
			//�������
			webtest.click("id=AltS");
//			assertTrue(webtest.isTextPresent("�������С��0"));			
		}
		
		@Test(description="����������뻹�������Ƿ����500")
		public void AddApply3() {
			InitDemo();
			//������
			webtest.click("xpath=//a[@onclick=\"openinput('���','finhkd',0)\"]");
			//�������frame
			webtest.enterFrame("openinputiframe");
			//���뻹����
			webtest.type("name=money","501");
			//�������
			webtest.click("id=AltS");
			//�뿪frameҳ��
			webtest.leaveFrame();
			//�����Ƿ���ӳɹ�
//			assertTrue(webtest.isTextPresent("��������軹���"));				
		}
}
