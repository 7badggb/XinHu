package com.edu.yanjie.system.basicmangement.company;

import com.edu.yanjie.core.BaseTest;

public class LoginDemo extends BaseTest {
	public void LoginDemo1() {
			webtest.open("http://localhost:8888/xinhu_utf8_v1.5.9");
			//��¼
			webtest.type("name=adminuser", "admin");
			webtest.type("xpath=//input[@type='password']", "123456");
			webtest.click("name=button");
			//����ϵͳģ��
			webtest.click("xpath=//span[@pmenuid='1']");
			//�����������
			webtest.click("id=menu_down_isons_num220");
			//�����˾��λ
			webtest.click("id=menu_list_company");
		}


}
