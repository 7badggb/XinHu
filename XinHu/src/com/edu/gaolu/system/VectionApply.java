package com.edu.gaolu.system;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class VectionApply extends BaseTest{
	
//�����������	
	
	public void InitDemo() {
		//��������ģ��
		webtest.click("xpath=//span[@pmenuid='40']");
		//�����������
		webtest.click("id=menu_list_num42");		
	}
	
	@Test(description="����������������")
	public void AddApply1() {
		InitDemo();
		//����������
		webtest.click("xpath=//a[@onclick=\"openinput('�������','waichu',0)\"]");
		//�������frame
		webtest.enterFrame("openinputiframe");
		//�����ַ
		webtest.type("xpath=//*[@id=\"div_address\"]/input", "�϶�����·20��");
		//ѡ�����ʱ��
		webtest.runJs2("arguments[0].removeAttribute('readonly')", "xpath=//*[@id=\"div_happendt\"]/input");
		//ѡ��Ԥ�ƻظ�
		webtest.runJs2("arguments[0].removeAttribute('readonly')", "xpath=//*[@id=\"div_intime\"]/input");
		//�����������
		webtest.type("xpath=//*[@id=\"div_reason\"]/input","�úù���");
		//�������
		webtest.click("id=AltS");
		//�뿪frameҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
//		assertTrue(webtest.isTextPresent(""));				
	}
	
	@Test(description="�����Ѵ��ڵ�������������")
	public void AddApply2() {
		//����������
		webtest.click("xpath=//a[@onclick=\"openinput('�������','waichu',0)\"]");
		//�������frame
		webtest.enterFrame("openinputiframe");
		//�����ַ
		webtest.type("xpath=//*[@id=\"div_address\"]/input", "�϶�����·20��");
		//ѡ�����ʱ��
		webtest.runJs2("arguments[0].removeAttribute('readonly')", "xpath=//*[@id=\"div_happendt\"]/input");
		//ѡ��Ԥ�ƻظ�
		webtest.runJs2("arguments[0].removeAttribute('readonly')", "xpath=//*[@id=\"div_intime\"]/input");
		//�����������
		webtest.type("xpath=//*[@id=\"div_reason\"]/input","�úù���");
		//�������
		webtest.click("id=AltS");
		//�뿪frameҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
//		assertTrue(webtest.isTextPresent(""));				
	}
	
	@Test(description="����δ��д������ɵ�������������")
	public void AddApply3() {
		//����������
		webtest.click("xpath=//a[@onclick=\"openinput('�������','waichu',0)\"]");
		//�������frame
		webtest.enterFrame("openinputiframe");
		//�����ַ
		webtest.type("xpath=//*[@id=\"div_address\"]/input", "�϶�����·20��");
		//ѡ�����ʱ��
		webtest.runJs2("arguments[0].removeAttribute('readonly')", "xpath=//*[@id=\"div_happendt\"]/input");
		//ѡ��Ԥ�ƻظ�
		webtest.runJs2("arguments[0].removeAttribute('readonly')", "xpath=//*[@id=\"div_intime\"]/input");
		//�������
		webtest.click("id=AltS");
		//�뿪frameҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
//		assertTrue(webtest.isTextPresent(""));				
	}
}
