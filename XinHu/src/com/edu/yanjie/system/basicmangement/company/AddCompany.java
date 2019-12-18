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
		//进入系统模块
		webtest.click("xpath=//span[@pmenuid='1']");
		//点击基础管理
		webtest.click("id=menu_down_isons_num220");
		//点击公司单位
		webtest.click("id=menu_list_company");
	}
	@BeforeTest
	public void doBeforeTest() {
		deleteRecord("xinhu_company", "软件公司");
		deleteRecord("xinhu_company", "&lt;script&gt;alert(&#39xss攻击攻击&#39)&lt;/script&gt;");
                                deleteRecord("xinhu_company", "1234567890123456789112345678921234567893123456789412345678951234567896123456789712345678981234567899");
		deleteRecord("xinhu_company", "& @·？");		
	}
	@Test(description="添加名称软件公司的公司")
	public void AddCompany1() throws InterruptedException {		
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//输入名称为软件公司
		webtest.type("name=name","软件公司");
		//点击保存
		webtest.click("id=AltS");
		//离开iframe页面
		webtest.leaveFrame();
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("软件公司"));	
	}
	
	@Test(description="不添加名称")
	public void AddCompany2() throws InterruptedException {
		refreshPage();
		InitDemo();
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//点击保存
		webtest.click("id=AltS");
		assertTrue(webtest.isTextPresent("名称不能为空"));
		
	}
	@Test(description="添加已存在的名称为软件公司的公司")
	public void AddCompany3() throws InterruptedException {
		refreshPage();
		InitDemo();
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//输入名称
		webtest.type("name=name","软件公司");
		//点击保存
		webtest.click("id=AltS");
		//离开iframe页面
//		webtest.leaveFrame();
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("名称[软件公司]已存在"));	

	}
	@Test(description="添加名称<script>alert('xss攻击攻击')</script>的公司")
	public void AddCompany4() throws InterruptedException {
		refreshPage();
		InitDemo();
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//输入名称
		webtest.type("name=name","<script>alert('xss攻击攻击')</script>");
		//点击保存
		webtest.click("id=AltS");
		//离开iframe页面
		webtest.leaveFrame();
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("<script>alert('xss攻击攻击')</script>"));	

	}
	@Test(description="添加名称个数为100个的公司")
	public void AddCompany5() throws InterruptedException {
		refreshPage();
		InitDemo();
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//输入名称
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
		//点击保存
		webtest.click("id=AltS");
		//离开iframe页面
		webtest.leaveFrame();
		//检验是否添加成功
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
	@Test(description="添加名称含有特殊字符（enter 空格和@·？）的公司")
	public void AddCompany7() throws InterruptedException {
		refreshPage();
		InitDemo();
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//输入名称
		webtest.type("name=name","& @·？");
		//点击保存
		webtest.click("id=AltS");
		//离开iframe页面
		webtest.leaveFrame();
		//拖动浏览器滚动条到底端
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("& @·？"));				
	}



}
