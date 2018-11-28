package com.applect.meritnation.generic;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.applect.meritnation.pageobject.BasePage; 





public class BaseLib {
	public WebDriver driver;
	@BeforeSuite(alwaysRun=true)
	
	public void deleteOutputDirectory(){
		
		String filepath = "/var/www/mn-testing/Meritnation/test-output";
		try {
			FileUtils.deleteDirectory(new File(filepath));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	@BeforeMethod(alwaysRun =false, groups = "MobileRegression")
	@Parameters({"browser"})
	public void preconditionMobile(String browsername){
		 final Logger logger = LogManager.getLogger(BaseLib.class);
		 logger.trace("entering into application");
		 
		if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/var/www/mn-testing/Meritnation/Exe Files/geckodriver");
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("dom.webnotifications.enabled", false);
			profile.setPreference("geo.enabled", false);
		/*	String Node = "http://10.0.2.83:6666/wd/hub";
	 		DesiredCapabilities cap = DesiredCapabilities.firefox();
	 
	 		try {
				driver = new RemoteWebDriver(new URL(Node), cap);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}*/
			
			driver = new FirefoxDriver(profile);
			Reporter.log("Firefox Browser launches");
		}
		else if (browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/var/www/mn-testing/Meritnation/Exe Files/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-geolocation");
			options.addArguments("--disable-notifications");
			options.addArguments("--no-sandbox");
			
			/*	String Node = "http://10.0.7.202:9999/wd/hub";
	 		DesiredCapabilities cap = DesiredCapabilities.chrome();
	 		try {
				driver = new RemoteWebDriver(new URL(Node), cap);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}*/
			
			driver = new ChromeDriver(options);
			Reporter.log("Chrome Browser launches");
		}
		else if (browsername.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", ".\\Exe files\\IEdriverServer.exe");
			driver = new InternetExplorerDriver();
			Reporter.log("IE Browser launches");
		}
		driver.manage().window().setSize(new Dimension (412, 732));
		driver.get(GetPropertyValues.getPropertyValue("MobileURL"));
		Reporter.log("Navigate to the URL", true);
		WaitStatementLib.implicitWaitForSecond(driver, 5);
		}
	@BeforeMethod(alwaysRun =false, groups = "Regression")
	@Parameters({"browser"})
	public void preConditionWeb(String browsername){
		 final Logger logger = LogManager.getLogger(BaseLib.class);
		 logger.trace("entering into application");
		 if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/var/www/mn-testing/Meritnation/Exe Files/geckodriver");
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("dom.webnotifications.enabled", false);
			profile.setPreference("geo.enabled", false);
			
			String Node = "http://10.0.2.83:6666/wd/hub";
	 		DesiredCapabilities cap = DesiredCapabilities.firefox();
	 
	 		try {
				driver = new RemoteWebDriver(new URL(Node), cap);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			
		//	driver = new FirefoxDriver(profile);
			Reporter.log("Firefox Browser launches");
		}
		else if (browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/var/www/mn-testing/Meritnation/Exe Files/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-geolocation");
			options.addArguments("--disable-notifications");
			options.addArguments("--no-sandbox");
			
			/*	String Node = "http://10.0.2.83:6666/wd/hub";
	 		DesiredCapabilities cap = DesiredCapabilities.chrome();
	 
	 		try {
				driver = new RemoteWebDriver(new URL(Node), cap);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}*/
			
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
	

	@BeforeMethod(alwaysRun =false, groups = "CurrentTask")
	@Parameters({"browser"})
	public void precondition(String browsername){
		 final Logger logger = LogManager.getLogger(BaseLib.class);
		 logger.trace("entering into application");
		 
		if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/var/www/mn-testing/Meritnation/Exe Files/geckodriver");
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("dom.webnotifications.enabled", false);
			profile.setPreference("geo.enabled", false);
		/*	String Node = "http://10.0.2.83:6666/wd/hub";
	 		DesiredCapabilities cap = DesiredCapabilities.firefox();
	 
	 		try {
				driver = new RemoteWebDriver(new URL(Node), cap);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}*/
			
			driver = new FirefoxDriver(profile);
			Reporter.log("Firefox Browser launches");
		}
		else if (browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/var/www/mn-testing/Meritnation/Exe Files/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-geolocation");
			options.addArguments("--disable-notifications");
			options.addArguments("--no-sandbox");
			
			/*	String Node = "http://10.0.7.202:9999/wd/hub";
	 		DesiredCapabilities cap = DesiredCapabilities.chrome();
	 		try {
				driver = new RemoteWebDriver(new URL(Node), cap);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}*/
			
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
		//driver.manage().window().setSize(new Dimension (412, 732));
		driver.get(GetPropertyValues.getPropertyValue("liveURL"));
		Reporter.log("Navigate to the URL", true);
		WaitStatementLib.implicitWaitForSecond(driver, 5);
		}
	
	
	
	
	/*
@BeforeGroups(alwaysRun =true, groups = "tests")
	
	public void testSetUpForMobileSiteRegression(){
		System.out.println("sakkdjsdnsn");
		System.setProperty("webdriver.chrome.driver", "/home/applect/workspace/MeritnationAutomation/Exe Files/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-geolocation");
		options.addArguments("--disable-notifications");
		options.addArguments("--no-sandbox");
		driver = new ChromeDriver(options);
		Reporter.log("Chrome Browser launches");
		driver.manage().window().maximize();
		driver.navigate().to("https://m.meritnation.com/cbse-class-12-science/chemistry/chemistry-part-i/study/46_5_17");
		//driver.get(GetPropertyValues.getPropertyValue("liveURL"));
		Reporter.log("Navigate to the URL", true);
		WaitStatementLib.implicitWaitForSecond(driver, 5);
	}
@BeforeGroups(alwaysRun =true, groups = "Regression")

public void testSetUpForFullRegression(){
	System.out.println("sakkdjsdnsn");
	System.setProperty("webdriver.chrome.driver", "/home/applect/workspace/MeritnationAutomation/Exe Files/chromedriver");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("disable-geolocation");
	options.addArguments("--disable-notifications");
	options.addArguments("--no-sandbox");
	driver = new ChromeDriver(options);
	Reporter.log("Chrome Browser launches");
	driver.manage().window().maximize();
	driver.get(GetPropertyValues.getPropertyValue("liveURL"));
	Reporter.log("Navigate to the URL", true);
	WaitStatementLib.implicitWaitForSecond(driver, 5);
}
	
*/
		
	
	

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
			SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy");  
			Date date = new Date();
			String chromeFolder = "/var/www/mn-testing/Meritnation/Screenshot/Chrome/" + formatter.format(date);  
			File file1 = new File(chromeFolder);
			if(!file1.exists()){
				file1.mkdir();
			}
			ScreenShotLib sLib= new ScreenShotLib();
			sLib.getScreenShot(driver, filename, browserName, chromeFolder);
			Reporter.log("Screenshot has been taken",true);
		}
		driver.quit();
		Reporter.log("Browser closed",true);
	}
	@AfterSuite(alwaysRun=true)
	public static void sendEmail()
	{
		File srcFile = new File("/var/www/mn-testing/Meritnation/test-output");
		String filepath = "/var/www/mn-testing/Meritnation/Customized";
		File file = new File(filepath);
		if(!file.exists()){
			file.mkdir();
			
		}
		File destFile = new File(filepath);
			for (String f : srcFile.list()) {
		        BasePage.copy(new File(srcFile, f), new File(destFile, f));
		    }
		//	BasePage.sendEmail();
		
	}
}

