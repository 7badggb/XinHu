package com.edu.system;

import org.testng.annotations.Test;

public class SearchApply4 extends LoginDemo {
	
//����ά�ޱ���
		
		public void initDemo() {
			//��������ģ��
			webtest.click("xpath=//span[@pmenuid='40']");
			//�����������
			webtest.click("id=menu_list_num42");		
		}
		
		@Test(description="����ά�ޱ��޵�����")
		public void AddApplyRepair1() throws InterruptedException{
			
			initDemo();
			//���ά�ޱ���
			webtest.click("xpath=//a[@onclick=\"openinput('ά�ޱ���','repair',0)\"]");
			//�������frame
			webtest.enterFrame("openinputiframe");
			//���뱨���ʲ�
			webtest.type("name=assetm","��ʾ��");
			//���뱨��ԭ��
			webtest.type("name=reason","�����޷�ʹ��");
			//�������
			webtest.click("id=AltS");
			//�뿪frameҳ��
			webtest.leaveFrame();
			//�����Ƿ���ӳɹ�
//			assertTrue(webtest.isTextPresent("��ʾ��"+"�����޷�ʹ��"));				
		}
		
		@Test(description="����Ѵ��ڵı����ʲ�Ϊ��ʾ���ı�������")
		public void AddApplyRepair2() {
			//���ά�ޱ���
			webtest.click("xpath=//a[@onclick=\"openinput('ά�ޱ���','repair',0)\"]");
			//�������frame
			webtest.enterFrame("openinputiframe");
			//���뱨���ʲ�
			webtest.type("name=assetm","��ʾ��");
			//���뱨��ԭ��
			webtest.type("name=reason","�����޷�ʹ��");
			//�������
			webtest.click("id=AltS");
			//�뿪frameҳ��
			webtest.leaveFrame();
			//�����Ƿ���ӳɹ�
		//	assertTrue(webtest.isTextPresent("�����ɹ�"));				
		}
		
		@Test(description="����д�����ʲ�")
		public void AddApplyRepair3() {
			
			//���ά�ޱ���
			webtest.click("xpath=//a[@onclick=\"openinput('ά�ޱ���','repair',0)\"]");
			//�������frame
			webtest.enterFrame("openinputiframe");
			//�������
			webtest.click("id=AltS");		
		}
}
