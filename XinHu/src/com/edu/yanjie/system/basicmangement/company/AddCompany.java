package com.edu.yanjie.system.basicmangement.company;

import static org.testng.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;

//@Listeners(ApiListener.class)
public class AddCompany extends BaseTest {
	
	public void InitDemo() {
		//����ϵͳģ��
		webtest.click("xpath=//span[@pmenuid='1']");
		//�����������
		webtest.click("id=menu_down_isons_num220");
		//�����˾��λ
		webtest.click("id=menu_list_company");
	}
	@BeforeTest
	public void doBeforeTest() {
		deleteRecord("xinhu_company", "�����˾");
		deleteRecord("xinhu_company", "&lt;script&gt;alert(&#39xss��������&#39)&lt;/script&gt;");
                                deleteRecord("xinhu_company", "1234567890123456789112345678921234567893123456789412345678951234567896123456789712345678981234567899");
		deleteRecord("xinhu_company", "& @����");		
	}
	@Test(description="������������˾�Ĺ�˾")
	public void AddCompany1() throws InterruptedException {		
		InitDemo();		
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//��������Ϊ�����˾
		webtest.type("name=name","�����˾");
		//�������
		webtest.click("id=AltS");
		//�뿪iframeҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("�����˾"));	
	}
	
	@Test(description="���������")
	public void AddCompany2() throws InterruptedException {
		refreshPage();
		InitDemo();
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//�������
		webtest.click("id=AltS");
		assertTrue(webtest.isTextPresent("���Ʋ���Ϊ��"));
		
	}
	@Test(description="����Ѵ��ڵ�����Ϊ�����˾�Ĺ�˾")
	public void AddCompany3() throws InterruptedException {
		refreshPage();
		InitDemo();
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//��������
		webtest.type("name=name","�����˾");
		//�������
		webtest.click("id=AltS");
		//�뿪iframeҳ��
//		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("����[�����˾]�Ѵ���"));	

	}
	@Test(description="�������<script>alert('xss��������')</script>�Ĺ�˾")
	public void AddCompany4() throws InterruptedException {
		refreshPage();
		InitDemo();
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//��������
		webtest.type("name=name","<script>alert('xss��������')</script>");
		//�������
		webtest.click("id=AltS");
		//�뿪iframeҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("<script>alert('xss��������')</script>"));	

	}
	@Test(description="������Ƹ���Ϊ100���Ĺ�˾")
	public void AddCompany5() throws InterruptedException {
		refreshPage();
		InitDemo();
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//��������
		webtest.type("name=name","1234567890"
				+ "1234567891"
				+ "1234567892"
				+ "1234567893"
				+ "1234567894"
				+ "1234567895"
				+ "1234567896"
				+ "1234567897"
				+ "1234567898"
				+ "1234567899"
			);
		//�������
		webtest.click("id=AltS");
		//�뿪iframeҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("1234567890"
				+ "1234567891"
				+ "1234567892"
				+ "1234567893"
				+ "1234567894"
				+ "1234567895"
				+ "1234567896"
				+ "1234567897"
				+ "1234567898"
				+ "1234567899"
				));		
	}
	@Test(description="������ƺ��������ַ���enter �ո��@�������Ĺ�˾")
	public void AddCompany7() throws InterruptedException {
		refreshPage();
		InitDemo();
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//��������
		webtest.type("name=name","& @����");
		//�������
		webtest.click("id=AltS");
		//�뿪iframeҳ��
		webtest.leaveFrame();
		//�϶���������������׶�
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("& @����"));				
	}



}
