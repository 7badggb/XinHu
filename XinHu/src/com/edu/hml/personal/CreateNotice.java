package com.edu.hml.personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CreateNotice extends BaseTest{
	
	@Test(description="����֪ͨ����")
	public void test3(){
		webtest.click("xpath=//span[@class='spanactive']");
		//���֪ͨ����
		webtest.click("xpath=//td[text()='֪ͨ����']");
		//���������
		webtest.click("id=addbtn_1576053590979_4784");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//������⢘
		webtest.type("xpath=//textarea[@class='ys2']", "֪ͨ����");
		//�������
		webtest.click("xpath=//td[text()='����']");
		//ѡ��������
		webtest.click("xpath=/html/body/div/div[2]/div/iframe/html/body/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/span/select/option[2]");
		//�������
		webtest.click("xpath=//td[text()='����']");
		//�뿪iframe
		webtest.leaveFrame();
	}

}
