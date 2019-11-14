package com.webtest.core;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.testng.annotations.Test;

public class SendMail{
	
	String from="3052221098@qq.com";
	String auth_code="123456abcd";//��Ȩ�룬��������
	String to="2724702423@qq.com";
	@Test
	public void sendMail() {
//		1������Properties����
		Properties prop=new Properties();
		prop.put("mail.transport.protocol", "smtp");
		prop.put("mail.smtp.host", "smtp.@qq.com");
		prop.put("mail.smtp.auth", true);
//		2��Session�������÷����䡢��Ȩ��
		Session session=Session.getInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from,auth_code );
			}
			
		});
//		3��Message�������ã������ˣ��ռ��ˣ����⣬����
		
		Message message=new MimeMessage(session);
		//�������������ָ������Ķ���
//		MimeMessage message=new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(from));
//			��ʾ�����԰��ռ��˵�ַ������properties�ļ���
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Hello,����");
			message.setText("�����ʼ�");
//			4��ʹ��Transport����
			Transport.send(message);
		
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	
	}

}
