package com.applect.meritnation.generic;




import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.applect.meritnation.pageobject.CreateAccountPage;
import com.applect.meritnation.pageobject.LoginPage;
import com.applect.meritnation.pageobject.LogoutPage;




public class BaseLib {
	public WebDriver driver;
	

	@BeforeMethod(alwaysRun =true)
	@Parameters(value="browser")
	public void precondition(String browsername){
		 final Logger logger = LogManager.getLogger(BaseLib.class);
		 logger.trace("entering into application");
		 
		if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/home/applect/workspace/MeritnationAutomation/Exe Files/geckodriver");
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("dom.webnotifications.enabled", false);
			profile.setPreference("geo.enabled", false);
			driver = new FirefoxDriver(profile);
			Reporter.log("Firefox Browser launches");
		}
		else if (browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/home/applect/workspace/MeritnationAutomation/Exe Files/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-geolocation");
			options.addArguments("--disable-notifications");
			options.addArguments("--no-sandbox");
			driver = new ChromeDriver(options);
			Reporter.log("Chrome Browser launches");
		}
		else if (browsername.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", ".\\Exe files\\IEdriverServer.exe");
			driver = new InternetExplorerDriver();
			Reporter.log("IE Browser launches");
		}
		driver.manage().window().maximize();
		driver.get(GetPropertyValues.getPropertyValue("liveURL"));
		Reporter.log("Navigate to the URL", true);
		WaitStatementLib.implicitWaitForSecond(driver, 5);
	}
	

	@AfterMethod(alwaysRun =true)
	public void postCondition(ITestResult result)
	{
		if (result.isSuccess())
		{
				Reporter.log("Script passed",true);
		}
		else
		{
		    Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		    String browserName = cap.getBrowserName().toLowerCase().toString();
			String filename = result.getMethod().getMethodName();
			ScreenShotLib sLib= new ScreenShotLib();
			sLib.getScreenShot(driver, filename, browserName);
			Reporter.log("Screenshot has been taken",true);
		}
		
		driver.close();
		Reporter.log("Browser closed",true);
	}
/*	@AfterSuite
	public static void sendEmail()
	{
		// Recipient's email ID needs to be mentioned.
	      String to = "anup.kumar@meritnation.com";
	      // Sender's email ID needs to be mentioned
	      String from = "anup.kumar@meritnation.com";
	      // Assuming you are sending email from localhost
	      String host = "www.gmail.com";
	      // Get system properties
	      Properties properties = System.getProperties();
	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);
	      properties.setProperty("mail.smtp.port", "487");
	      //properties.setProperty("smtp.starttls.enable", true);
	      // Get the default Session object.
	      javax.mail.Session session = javax.mail.Session.getDefaultInstance(properties);

	      try{
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);
	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));
	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO,
	                                  new InternetAddress(to));

	         // Set Subject: header field
	         message.setSubject("This is the Subject Line!");

	         // Create the message part 
	         BodyPart messageBodyPart = new MimeBodyPart();

	         // Fill the message
	         messageBodyPart.setText("This is message body");

	         // Create a multipar message
	         Multipart multipart = new MimeMultipart();

	         // Set text message part
	         multipart.addBodyPart(messageBodyPart);

	         // Part two is attachment
	         messageBodyPart = new MimeBodyPart();
	         String filename = "/home/applect/workspace/MeritnationAutomation/test-output/emailable-report.html";
	         DataSource source = new FileDataSource(filename);
	         messageBodyPart.setDataHandler(new DataHandler(source));
	         messageBodyPart.setFileName(filename);
	         multipart.addBodyPart(messageBodyPart);

	         // Send the complete message parts
	         message.setContent(multipart );

	         // Send message
	         Transport.send(message);
	      }
	      catch (MessagingException mex) 
	      {
	         mex.printStackTrace();
	      }
}*/
	
	
}

