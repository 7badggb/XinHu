package com.xiets.javamaildemo;

import java.util.ArrayList; 
import java.util.Date; 
import java.util.List; 
import java.util.Properties; 
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Address; 
import javax.mail.Authenticator; 
import javax.mail.BodyPart; 
import javax.mail.Message; 
import javax.mail.PasswordAuthentication; 
import javax.mail.Session; 
import javax.mail.Transport; 
import javax.mail.internet.InternetAddress; 
import javax.mail.internet.MimeBodyPart; 
import javax.mail.internet.MimeMessage; 
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

import com.sun.mail.util.MailSSLSocketFactory; 

public class Main {

	public static void main(String[] args) throws Exception { 
		  // ������Ϣ 
		  Properties pro = new Properties(); 
		  pro.put("mail.smtp.host", "smtp.163.com"); 
		  pro.put("mail.smtp.auth", "true"); 
		  // SSL���� 
		  MailSSLSocketFactory sf = null; 
		  sf = new MailSSLSocketFactory(); 
		  // �����������е����� 
		  sf.setTrustAllHosts(true); 
		  pro.put("mail.smtp.ssl.enable", "true"); 
		  pro.put("mail.smtp.ssl.socketFactory", sf); 
		  // �����ʼ��ĻỰ���Թ���һ�������ʼ���Session��������Ҫע������û������ﲻ�ܼӺ�׺������㲻���û����� 
		  //����Ҫע����ǣ���������벻������ʹ������ĵ�½���룬���ǿͻ������ɵ���һ��ר�ŵ���Ȩ�� 
		  MailAuthenticator authenticator = new MailAuthenticator("tuzongxun123", 
		    "�ͻ�����Ȩ��"); 
		  Session session = Session.getInstance(pro, authenticator); 
		  // ����Session �����ʼ���Ϣ 
		  Message message = new MimeMessage(session); 
		  // �����ʼ������ߵ�ַ 
		  Address from = new InternetAddress("tuzongxun123@163.com"); 
		  // �����ʼ���Ϣ�ķ����� 
		  message.setFrom(from); 
		  // ��֤�ռ��������ַ 
		  List<String> toAddressList = new ArrayList<>(); 
		  toAddressList.add("1160569243@qq.com"); 
		  StringBuffer buffer = new StringBuffer(); 
		  if (!toAddressList.isEmpty()) { 
		   String regEx = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$"; 
		   Pattern p = Pattern.compile(regEx); 
		   for (int i = 0; i < toAddressList.size(); i++) { 
		    Matcher match = p.matcher(toAddressList.get(i)); 
		    if (match.matches()) { 
		     buffer.append(toAddressList.get(i)); 
		     if (i < toAddressList.size() - 1) { 
		      buffer.append(","); 
		     } 
		    } 
		   } 
		  } 
		  String toAddress = buffer.toString(); 
		  if (!toAddress.isEmpty()) { 
		   // �����ʼ��Ľ����ߵ�ַ 
		   Address[] to = InternetAddress.parse(toAddress); 
		   // �����ʼ������˵�ַ 
		   message.setRecipients(Message.RecipientType.TO, to); 
		   // �ʼ����� 
		   // message.setSubject("java�ʼ�����"); 
		   message.setSubject("Ϊʲô����"); 
		   // �ʼ����� 
		   MimeMultipart mimeMultiPart = new MimeMultipart(); 
		   // ����HTML 
		   BodyPart bodyPart = new MimeBodyPart(); 
		   // �ʼ����� 
		   // String htmlText = "java�ʼ�����001"; 
		   String htmlText = "java"; 
		   bodyPart.setContent(htmlText, "text/html;charset=utf-8"); 
		   mimeMultiPart.addBodyPart(bodyPart); 
		   // ��Ӹ��� 
		   List<String> fileAddressList = new ArrayList<String>(); 
		   fileAddressList 
		     .add("C:\\Users\\AAA\\Desktop\\                 .docx"); 
		   if (fileAddressList != null) { 
		    BodyPart attchPart = null; 
		    for (int i = 0; i < fileAddressList.size(); i++) { 
		     if (!fileAddressList.get(i).isEmpty()) { 
		      attchPart = new MimeBodyPart(); 
		      // ��������Դ 
		      DataSource source = new FileDataSource( 
		        fileAddressList.get(i)); 
		      // ����������Դ��ӵ��ʼ��� 
		      attchPart.setDataHandler(new DataHandler(source)); 
		      // ���ø�������Ϊԭ�ļ��� 
		      attchPart.setFileName(MimeUtility.encodeText(source 
		        .getName())); 
		      mimeMultiPart.addBodyPart(attchPart); 
		     } 
		    } 
		   } 
		   message.setContent(mimeMultiPart); 
		   message.setSentDate(new Date()); 
		   // �����ʼ� 
		   message.saveChanges(); 
		   // �����ʼ� 
		   Transport.send(message); 
		  } 
		 } 
		} 
		  
		class MailAuthenticator extends Authenticator { 
		  
		 /** 
		  * �û��� 
		  */
		 private String username; 
		 /** 
		  * ���� 
		  */
		 private String password; 
		  
		 /** 
		  * ����һ���µ�ʵ�� MailAuthenticator. 
		  * 
		  * @param username 
		  * @param password 
		  */
		 public MailAuthenticator(String username, String password) { 
		  this.username = username; 
		  this.password = password; 
		 } 
		  
		 public String getPassword() { 
		  return password; 
		 } 
		  
		 @Override
		 protected PasswordAuthentication getPasswordAuthentication() { 
		  return new PasswordAuthentication(username, password); 
		 } 
		  
		 public String getUsername() { 
		  return username; 
		 } 
		  
		 public void setPassword(String password) { 
		  this.password = password; 
		 } 
		  
		 public void setUsername(String username) { 
		  this.username = username; 
		 }  
}
