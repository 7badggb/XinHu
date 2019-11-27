package com.edu.yanjie.system.basicmangement.company;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class AddCompany extends BaseTest {
	
	public void InitDemo() {
		//�����������
		webtest.click("id=menu_down_isons_num220");
		//�����˾��λ
		webtest.click("id=menu_list_company");
	}
	@Test(description="������ƺǺ��յĹ�˾")
	public void AddCompany1() {
		InitDemo();
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//��������Ϊ�Ǻ���
		webtest.type("name=name","�Ǻ���");
		//�������
		webtest.click("id=AltS");
		//�뿪iframeҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("�Ǻ���"));				
	}
	@Test(description="���������")
	public void AddCompany2() {
		InitDemo();
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//�������
		webtest.click("id=AltS");
		assertTrue(webtest.isTextPresent("���Ʋ���Ϊ��"));			
	}
	@Test(description="����Ѵ��ڵ�����Ϊ�Ǻ��յĹ�˾")
	public void AddCompany3() {
		InitDemo();
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//��������
		webtest.type("name=name","�Ǻ���");
		//�������
		webtest.click("id=AltS");
		//�뿪iframeҳ��
//		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent("�����Ѵ���"));				
	}
	@Test(description="�������<script>alert('xss��������')</script>�Ĺ�˾")
	public void AddCompany4() {
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
	@Test(description="������Ƹ���Ϊ200���Ĺ�˾")
	public void AddCompany5() {
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
	@Test(description="������Ƹ���Ϊ200���Ĺ�˾")
	public void AddCompany6() {
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
				+"1234567890"
				+ "1234567891"
				+ "1234567892"
				+ "1234567893"
				+ "1234567894"
				+ "1234567895"
				+ "1234567896"
				+ "1234567897"
				+ "1234567898"
				+ "1234567899");
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
				+"1234567890"
				+ "1234567891"
				+ "1234567892"
				+ "1234567893"
				+ "1234567894"
				+ "1234567895"
				+ "1234567896"
				+ "1234567897"
				+ "1234567898"
				+ "1234567899"));				
	}
	@Test(description="������ƺ��������ַ���enter �ո��@�������Ĺ�˾")
	public void AddCompany7() {
		InitDemo();
		//�������
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//�������iframe
		webtest.enterFrame("openinputiframe");
		//��������
		webtest.type("name=name",""
				+ "& @����");
		//�������
		webtest.click("id=AltS");
		//�뿪iframeҳ��
		webtest.leaveFrame();
		//�����Ƿ���ӳɹ�
		assertTrue(webtest.isTextPresent(""
				+ "& @����"));				
	}



}
