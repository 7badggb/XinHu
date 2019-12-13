package core;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.edu.utils.ReadPro;

public class MailUtils {	

	public static  void sendMail1() throws IOException {
		  String from=ReadPro.getPropValue("from");
		  String auth_code=ReadPro.getPropValue("auth_code");
		  String to=ReadPro.getPropValue("tomail");
		
		//1����properties����
		Properties prop=new Properties();
		prop.put("mail.transport.protocol","smtp");//Э��
		prop.put("mail.smtp.host", "smtp.126.com");
		prop.put("mail.smtp.auth",true);
		
		
		//2����session����
		Session session=Session.getInstance(prop,new Authenticator(){

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				
				// TODO Auto-generated method stub
				return new PasswordAuthentication(from,auth_code);
			}	
			
		});
		
		
		//3message�������ã������ˣ��ռ��ˣ����⣬����
		Message message=new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
			message.setSubject("���Ա���");
			String resultPath=ReadPro.getPropValue("resultPath");
			String content=MailUtils.readFile(resultPath);
			MimeBodyPart attachPart = new MimeBodyPart();
			attachPart.setContent(content,"text/html;charset=gb2312");
			MimeMultipart mimeMultipart=new MimeMultipart();
			mimeMultipart.addBodyPart(attachPart);
			message.setContent(mimeMultipart);
			Transport.send(message);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//4ʹ��transport����
		
	}
	
	public static String readFile(String filePathAndName) {
        String fileContent = "";
        try {
            File f = new File(filePathAndName);
            if(f.isFile()&&f.exists()){
                InputStreamReader read = new InputStreamReader(new FileInputStream(f),"gb2312");
                BufferedReader reader=new BufferedReader(read);
                String line;
                while ((line = reader.readLine()) != null) {
           //����ȡ�����ַ�ƴ��  
                  fileContent += line;
                }
                read.close();
            }
        } catch (Exception e) {
            System.out.println("��ȡ�ļ����ݲ�������");
            e.printStackTrace();
        }
        return fileContent;
    }
	

}
