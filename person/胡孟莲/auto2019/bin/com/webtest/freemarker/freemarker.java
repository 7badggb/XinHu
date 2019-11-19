package com.webtest.freemarker;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class freemarker0{
	 
	@Test
	public void testFreeMarker() throws Exception {
		//1������һ��ģ���ļ�
		//2������һ��Configuration����
		Configuration configuration = new Configuration(Configuration.getVersion());
		//3������ģ���ļ������Ŀ¼
		configuration.setDirectoryForTemplateLoading(new File("D:/workspaces-itcast/JavaEE32/e3-item-web/src/main/webapp/WEB-INF/ftl"));
		//4��ģ���ļ��ı����ʽ��һ�����utf-8
		configuration.setDefaultEncoding("utf-8");
		//5������һ��ģ���ļ�������һ��ģ�����
		Template template = configuration.getTemplate("hello.ftl");
		//6������һ�����ݼ���������pojoҲ������map���Ƽ�ʹ��map
		Map data = new HashMap<>();
		data.put("hello", "hello freemarker!");
		//7������һ��Writer����ָ������ļ���·�����ļ�����   ���������ļ���λ��,ʲô�ļ���������������txtΪ��
		Writer out = new FileWriter(new File("D:/temp/JavaEE32/freemarker/hello.txt"));
		//8�����ɾ�̬ҳ��
		template.process(data, out);
		//9���ر���
		out.close();
	}
}