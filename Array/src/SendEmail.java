import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
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

public class SendEmail {
	
		public static void main(String[] args) {
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
						return new PasswordAuthentication("anup.kumar@meritnation.com","Anup@12345");
					}
				});

			try {

				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress("anup.kumar@meritnation.com"));
				message.setRecipients(Message.RecipientType.TO,
						InternetAddress.parse("gaurav.gandhi@meritnation.com"));
				message.setSubject("Testing Subject");
				message.setText("Dear Mail Crawler," +
						"\n\n No spam to my email, please!");
				BodyPart messageBodyPart = new MimeBodyPart();
				Multipart multipart = new MimeMultipart();
		         String filename = "/var/www/mn-testing/MeritnationAutomation/test-output/emailable-report.html";
		         DataSource source = new FileDataSource(filename);
		         messageBodyPart.setDataHandler(new DataHandler(source));
		         messageBodyPart.setFileName(filename);
		         multipart.addBodyPart(messageBodyPart);
		         message.setContent(multipart );

				Transport.send(message);

				System.out.println("Done");

			} catch (MessagingException e) {
				throw new RuntimeException(e);
			}
		}
	}



