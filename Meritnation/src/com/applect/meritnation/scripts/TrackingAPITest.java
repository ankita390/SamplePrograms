package com.applect.meritnation.scripts;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import org.testng.annotations.Test;
import com.applect.meritnation.generic.BaseLib;




public class TrackingAPITest extends BaseLib{
	
	@Test(invocationCount = 1, groups = "api", priority = 1)
	public void TC_001_TrackingAPITest() {
		
//		BasePage.login(driver);
//		studyPage.moveToStudyBoxAndClickPhysics(driver);
//		studyPage.verifyPhysicsPage(driver);
//		BasePage.logout(driver);
	Properties props = new Properties();
	props.put("mail.smtp.host", "smtp.gmail.com");
	props.put("mail.smtp.socketFactory.port", "465");
	props.put("mail.smtp.socketFactory.class",
			"javax.net.ssl.SSLSocketFactory");
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.port", "465");
	Session session = Session.getDefaultInstance(props,
		new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("qa.meritnation1@gmail.com","amit@765");
			}
		});
	try {
		Message message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress("qa.meritnation1@gmail.com", "Automaion User"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		message.addRecipients(Message.RecipientType.TO,
				InternetAddress.parse("deepesh.pathak@meritnation.com"));
		message.addRecipients(Message.RecipientType.TO,
				InternetAddress.parse("julfkar@meritnation.com"));
		
		message.addRecipients(Message.RecipientType.CC,
				InternetAddress.parse("anup.kumar@meritnation.com"));
		message.addRecipients(Message.RecipientType.CC,
				InternetAddress.parse("amit.pant@meritnation.com"));
		message.addRecipients(Message.RecipientType.CC,
				InternetAddress.parse("ashish.kumar@meritnation.com"));
		message.addRecipients(Message.RecipientType.CC,
				InternetAddress.parse("shruti.kaushik@meritnation.com"));
		message.addRecipients(Message.RecipientType.CC,
				InternetAddress.parse("ankita.sharma@meritnation.com"));
		message.addRecipients(Message.RecipientType.CC,
				InternetAddress.parse("ajit.kumar2@meritnation.com"));

		message.setSubject("TrackingAPI Report");
		
		BodyPart messageBodyPart = new MimeBodyPart();
		messageBodyPart.setContent("Dear All, <br> Please see below detail report regarding Tracking API: <br><br>","text/html; charset=utf-8");
		BodyPart messageBodyPart1 = new MimeBodyPart();
		messageBodyPart1.setContent( "<b>Otype is:</b> <br>"+ trackingApiPage.populateAllOtypes(), "text/html; charset=utf-8");
		BodyPart messageBodyPart2 = new MimeBodyPart();
		messageBodyPart2.setContent( "<br> <br> <b>Otype occurance count: </b>  "  + trackingApiPage.populateOtypeCount(), "text/html; charset=utf-8");
		BodyPart messageBodyPart3 = new MimeBodyPart();
		messageBodyPart3.setContent("<br><br>Cheers,","text/html; charset=utf-8");
		BodyPart messageBodyPart4 = new MimeBodyPart();
		messageBodyPart4.setContent("<br>Automation Team :)","text/html; charset=utf-8");
		
		
		Multipart multipart = new MimeMultipart();
		multipart.addBodyPart(messageBodyPart);
		multipart.addBodyPart(messageBodyPart1);
		multipart.addBodyPart(messageBodyPart2);
		multipart.addBodyPart(messageBodyPart3);
		multipart.addBodyPart(messageBodyPart4);
        message.setContent(multipart);
        Transport.send(message);
		} 
		catch (MessagingException e) 
		{
		throw new RuntimeException(e);
		}
	}	

}
