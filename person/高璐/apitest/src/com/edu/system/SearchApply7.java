package com.edu.system;

import org.testng.annotations.Test;

public class SearchApply7 extends LoginDemo {

	public void initDemo() {	
		//������Դģ��
		webtest.click("xpath=//span[@pmenuid='19']");
		//���֪ʶ��Ϣ����
		webtest.click("id=menu_list_num134");
	}
	@Test
	public void AddKnow1() throws InterruptedException {
		
		initDemo();
		//����������
		webtest.type("xpath=//input[@class='form-control']","����");
		//�������
		webtest.click("xpath=//button[@click='search']");
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������frame
		webtest.enterFrame("openinputiframe");
		//�������
		webtest.type("xpath=//*[@id=\"div_title\"]/input", "֪ʶ");
		//ѡ���Ӧ����
		webtest.click("xpath=//*[@id=\"div_typeid\"]/select/option[2]");
		//��������
		webtest.type("xpath=//*[@id=\"div_sort\"]/input", "1");
		//�������
		webtest.click("id=AltS");
		//�뿪frameҳ��
		webtest.leaveFrame();
	}
}
