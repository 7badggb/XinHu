package com.edu.yanjie.system.subscriptionManagement.subscriptionTable;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class OperateSubscriptionTable extends BaseTest {

		public void initDemo() {
//			����ϵͳģ��
			webtest.click("xpath=//span[@pmenuid='1']");
//			������Ĺ���
			webtest.click("id=menu_list_num237");				
//			������ı���
			webtest.click("id=menu_list_rssinfoall");
		}
		@Test(description="�����")
		public void openSuscription() {
			initDemo();
			//�����
			webtest.click("xpath=//td[@cell=4]");		
			//�ж��Ƿ��Ǵ򿪵��Ǹ�ҳ��
			webtest.switchWidow(1);
			assertEquals(webtest.getUrl(), "http://localhost:8888/xinhu_utf8_v1.5.9/upload/2019-12/%E8%AE%A2%E9%98%85%E7%AE%A1%E7%90%86(%E8%AE%A2%E9%98%85%E7%AE%A1%E7%90%86)_03_145533.html");		                        
		}
//		@Test(description="ɾ�����ı���")
//		public void delSuscription1() throws InterruptedException {			
//			refreshPage();
//			initDemo();
//			//�����
//			webtest.click("link=����");
//			//���ɾ��
//			webtest.click("xpath=//li[@temp=4]");
//			//���ȷ��
//			webtest.click("id=confirm_btn1");
//				                        
//		}
		@Test(description="�������ı���")
		public void SearchSuscription() {
			webtest.switchWidow(0);
			initDemo();
			//����ؼ���
			webtest.type("xpath=//input[@placeholder='�ؼ���']","����ͳ�Ƽ��");
			//�������
			webtest.click("xpath=//button[@click='searchbtn']");
			//�ж��Ƿ��н������
			assertTrue(webtest.isDisplayed("xpath=//tr[@oi='0']"));				                        
		}

}
