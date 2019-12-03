package com.applect.meritnation.scripts;

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
				return new PasswordAuthentication("anup.kumar@meritnation.com","Anup.preeti46");
			}
		});
	try {
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress("anup.kumar@meritnation.com"));
		message.addRecipients(Message.RecipientType.TO,
				InternetAddress.parse("deepesh.pathak@meritnation.com"));
		message.addRecipients(Message.RecipientType.TO,
				InternetAddress.parse("julfkar@meritnation.com"));
		message.setRecipients(Message.RecipientType.CC,
				InternetAddress.parse("enggqa@meritnation.com"));
		message.setSubject("TrackingAPI Report");
		
		BodyPart messageBodyPart = new MimeBodyPart();
		messageBodyPart.setContent("Dear All, Please see below detail report regarding Tracking API: ","text/html; charset=utf-8");
		BodyPart messageBodyPart1 = new MimeBodyPart();
		messageBodyPart1.setContent( "Otype is: "+ trackingApiPage.populateAllOtypes(), "text/html; charset=utf-8");
		BodyPart messageBodyPart2 = new MimeBodyPart();
		messageBodyPart2.setContent( "  and Otype occurance count is  "  + trackingApiPage.populateOtypeCount(), "text/html; charset=utf-8");
		BodyPart messageBodyPart3 = new MimeBodyPart();
		messageBodyPart3.setContent("Cheers","text/html; charset=utf-8");
		BodyPart messageBodyPart4 = new MimeBodyPart();
		messageBodyPart4.setContent("Automation Team :)","text/html; charset=utf-8");
		
		
		Multipart multipart = new MimeMultipart();
		multipart.addBodyPart(messageBodyPart);
		multipart.addBodyPart(messageBodyPart1);
		multipart.addBodyPart(messageBodyPart2);
	//	multipart.addBodyPart(messageBodyPart3);
	//	multipart.addBodyPart(messageBodyPart4);
        message.setContent(multipart);
        Transport.send(message);
		} 
		catch (MessagingException e) 
		{
		throw new RuntimeException(e);
		}
	}	

}
