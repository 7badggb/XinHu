package com.edu.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;
import com.edu.dataprovider.NSDataProvider;
import com.webtest.dataprovider.ExcelDataProvider;
@Listeners(ApiListener.class)
public class PersonnelAttendance_1_2 extends BaseTest {
	
	public void InitDemo() {
		//�������¿���ģ��
		webtest.click("xpath=//*[@id=\"topheaderid\"]/table/tbody/tr/td[2]/div/span[6]");
		//������µ���
		webtest.click("xpath=//*[@id=\"menu_list_num84\"]");
	}
	
	@Test(description="��������Ϊ���ź�����Ա����ͬ")
	public void test1() throws InterruptedException {	
		InitDemo();
		System.out.println("a");
		//���Ա����ͬ
		webtest.click("xpath=//*[@id=\"menu_list_num95\"]");
		//���������ť
		webtest.click("xpath=//button[starts-with(@id,'addbtn')]");
		//����iframeҳ��
		webtest.enterFrame("openinputiframe");
		//ѡ��ǩ����
		webtest.click("xpath=//*[@id=\"btnchange_uname\"]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/div[1]/table/tbody/tr/td[2]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/span[1]/div/table/tbody/tr/td[3]/input");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//������Ķ�λselect
		webtest.selectByValue("name=companyid", "2");
		webtest.click("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input");
		webtest.type("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input", "�ź�");
		webtest.selectByValue("name=httype", "�Ͷ���ͬ");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[3]/form/table/tbody/tr[3]/td[2]/span/input");
		
		//webtest.runJs("document.getElementsByTagName(\"H1\")[0].removeAttribute(\"style\");");
		//ѡ��ʱ�� ����readonly����
		webtest.runJs("arguments[0].removeAttribute('readonly')", "xpath=//span[@id='div_startdt']/input");
		webtest.type("xpath=//span[@id='div_startdt']/input", "2019-10-1");
		webtest.runJs("arguments[0].removeAttribute('readonly')","xpath=//span[@id='div_enddt']/input");
		webtest.type("xpath=//span[@id='div_enddt']/input", "2019-12-13");

		webtest.click("xpath=//input[@id=\"AltS\"]");
		
		webtest.leaveFrame();
		assertTrue(webtest.isTextPresent("����ɹ�"));
		
	}
	
	@Test(description="��������Ϊ��<script>����Ա����ͬ")
	public void test2() throws InterruptedException {	
		System.out.println("a");
		//���Ա����ͬ
		webtest.click("xpath=//*[@id=\"menu_list_num95\"]");
		//���������ť
		webtest.click("xpath=//button[starts-with(@id,'addbtn')]");
		//����iframeҳ��
		webtest.enterFrame("openinputiframe");
		//ѡ��ǩ����
		webtest.click("xpath=//*[@id=\"btnchange_uname\"]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/div[1]/table/tbody/tr/td[2]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/span[1]/div/table/tbody/tr/td[3]/input");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//������Ķ�λselect
		webtest.selectByValue("name=companyid", "2");
		webtest.click("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input");
		webtest.type("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input", "<script>");
		webtest.selectByValue("name=httype", "�Ͷ���ͬ");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[3]/form/table/tbody/tr[3]/td[2]/span/input");
		
		//webtest.runJs("document.getElementsByTagName(\"H1\")[0].removeAttribute(\"style\");");
		//ѡ��ʱ�� ����readonly����
		webtest.runJs("arguments[0].removeAttribute('readonly')", "xpath=//span[@id='div_startdt']/input");
		webtest.type("xpath=//span[@id='div_startdt']/input", "2019-10-1");
		webtest.runJs("arguments[0].removeAttribute('readonly')","xpath=//span[@id='div_enddt']/input");
		webtest.type("xpath=//span[@id='div_enddt']/input", "2019-12-13");

		webtest.click("xpath=//input[@id=\"AltS\"]");
		
		webtest.leaveFrame();
		assertTrue(webtest.isTextPresent("����ɹ�"));
	}
	
	@Test(description="��������Ϊ��!@%**0����Ա����ͬ")
	public void test3() throws InterruptedException {	
		System.out.println("a");
		//���Ա����ͬ
		webtest.click("xpath=//*[@id=\"menu_list_num95\"]");
		//���������ť
		webtest.click("xpath=//button[starts-with(@id,'addbtn')]");
		//����iframeҳ��
		webtest.enterFrame("openinputiframe");
		//ѡ��ǩ����
		webtest.click("xpath=//*[@id=\"btnchange_uname\"]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/div[1]/table/tbody/tr/td[2]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/span[1]/div/table/tbody/tr/td[3]/input");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//������Ķ�λselect
		webtest.selectByValue("name=companyid", "2");
		webtest.click("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input");
		webtest.type("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input", "!@%**0");
		webtest.selectByValue("name=httype", "�Ͷ���ͬ");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[3]/form/table/tbody/tr[3]/td[2]/span/input");
		
		//webtest.runJs("document.getElementsByTagName(\"H1\")[0].removeAttribute(\"style\");");
		//ѡ��ʱ�� ����readonly����
		webtest.runJs("arguments[0].removeAttribute('readonly')", "xpath=//span[@id='div_startdt']/input");
		webtest.type("xpath=//span[@id='div_startdt']/input", "2019-10-1");
		webtest.runJs("arguments[0].removeAttribute('readonly')","xpath=//span[@id='div_enddt']/input");
		webtest.type("xpath=//span[@id='div_enddt']/input", "2019-12-13");

		webtest.click("xpath=//input[@id=\"AltS\"]");
		
		webtest.leaveFrame();
		assertTrue(webtest.isTextPresent("����ɹ�"));
	}
	
	@Test(description="��������Ϊ��false����Ա����ͬ")
	public void test4() throws InterruptedException {	
		System.out.println("a");
		//���Ա����ͬ
		webtest.click("xpath=//*[@id=\"menu_list_num95\"]");
		//���������ť
		webtest.click("xpath=//button[starts-with(@id,'addbtn')]");
		//����iframeҳ��
		webtest.enterFrame("openinputiframe");
		//ѡ��ǩ����
		webtest.click("xpath=//*[@id=\"btnchange_uname\"]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/div[1]/table/tbody/tr/td[2]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/span[1]/div/table/tbody/tr/td[3]/input");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//������Ķ�λselect
		webtest.selectByValue("name=companyid", "2");
		webtest.click("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input");
		webtest.type("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input", "false");
		webtest.selectByValue("name=httype", "�Ͷ���ͬ");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[3]/form/table/tbody/tr[3]/td[2]/span/input");
		
		//webtest.runJs("document.getElementsByTagName(\"H1\")[0].removeAttribute(\"style\");");
		//ѡ��ʱ�� ����readonly����
		webtest.runJs("arguments[0].removeAttribute('readonly')", "xpath=//span[@id='div_startdt']/input");
		webtest.type("xpath=//span[@id='div_startdt']/input", "2019-10-1");
		webtest.runJs("arguments[0].removeAttribute('readonly')","xpath=//span[@id='div_enddt']/input");
		webtest.type("xpath=//span[@id='div_enddt']/input", "2019-12-13");

		webtest.click("xpath=//input[@id=\"AltS\"]");
		
		webtest.leaveFrame();
		assertTrue(webtest.isTextPresent("����ɹ�"));
	}
	
	@Test(description="��������Ϊ��12345����Ա����ͬ")
	public void test5() throws InterruptedException {	
		System.out.println("a");
		//���Ա����ͬ
		webtest.click("xpath=//*[@id=\"menu_list_num95\"]");
		//���������ť
		webtest.click("xpath=//button[starts-with(@id,'addbtn')]");
		//����iframeҳ��
		webtest.enterFrame("openinputiframe");
		//ѡ��ǩ����
		webtest.click("xpath=//*[@id=\"btnchange_uname\"]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/div[1]/table/tbody/tr/td[2]");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div[2]/span[1]/span/span[1]/div/table/tbody/tr/td[3]/input");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//������Ķ�λselect
		webtest.selectByValue("name=companyid", "2");
		webtest.click("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input");
		webtest.type("xpath=/html/body/div/div[2]/div[3]/form/table/tbody/tr[2]/td[2]/span/input", "12345");
		webtest.selectByValue("name=httype", "�Ͷ���ͬ");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[3]/form/table/tbody/tr[3]/td[2]/span/input");
		
		//webtest.runJs("document.getElementsByTagName(\"H1\")[0].removeAttribute(\"style\");");
		//ѡ��ʱ�� ����readonly����
		webtest.runJs("arguments[0].removeAttribute('readonly')", "xpath=//span[@id='div_startdt']/input");
		webtest.type("xpath=//span[@id='div_startdt']/input", "2019-10-1");
		webtest.runJs("arguments[0].removeAttribute('readonly')","xpath=//span[@id='div_enddt']/input");
		webtest.type("xpath=//span[@id='div_enddt']/input", "2019-12-13");

		webtest.click("xpath=//input[@id=\"AltS\"]");
		
		webtest.leaveFrame();
		assertTrue(webtest.isTextPresent("����ɹ�"));
	}
	
}