package com.webtest.Personal;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SalaryEdit extends BaseTest{
	@Test//(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	public void login(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9090/?m=login");
		webtest.type("name=admin", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
	}
	@Test(description="编辑薪资情况")
	public void test(){
		webtest.click("xpath=//span[@class='spanactive']");//个人办公
		webtest.click("id=menu_list_num39");//个人中心
		webtest.click("id=menu_list_num184");//我的薪资
		webtest.click("xpath=//button[@class='btn btn-default']");//月份按钮
		webtest.click("xpath=//a[@class='a03']");//年份，月份
		webtest.click("xpath=//td[text()='搜索']");//搜索
		webtest.click("xpath=//tr[@dataid='12']");//选中一条薪资记录
		webtest.click("xpath=//button[@id='xiang_157961699980_2435']");//详情
		webtest.enterFrame("openinputiframe");
		webtest.click("id=showmenu");//操作V
		webtest.click("xpath=//li[@lx='1']");//编辑
		webtest.type("xpath=//input[@name='base']","2000");
		webtest.click("id=AltS");//保存
		webtest.leaveFrame();
	}

}
