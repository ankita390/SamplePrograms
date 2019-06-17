package com.applect.meritnation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.openqa.selenium.support.FindBy;
import com.applect.meritnation.generic.ExcelUtils;
import com.applect.meritnation.generic.WaitStatementLib;

public class EtutorPage {
	
	@FindBy(xpath="//input[@id='userid']")
	private WebElement usertxtbx;
	@FindBy(xpath="//input[@id='password']")
	private WebElement passtxtbx;
	@FindBy(xpath="//input[@name='Login']")
	private WebElement login;
	@FindBy(xpath="//a[@class='manageBatch greenBtn']")
	private WebElement managebatchbtn;
	@FindBy(xpath="//input[@id='searchStudentEmail']")
	private WebElement searchstudnttxt;
	@FindBy(xpath="//input[@id='searchBatchSbmtBtn']")
	private WebElement searchbtn;
	@FindBy(xpath="//div[@class='CSSTableGenerator batchListWrappper']/table/tbody/tr[2]/td[11]/a[1]")
	private List<WebElement> manageclassbtn;
	@FindBy(xpath="//div[@class='CSSTableGenerator batchListWrappper']/table/tbody/tr[2]/td[11]/a[1]")
	private WebElement manageclassbtn1;
	@FindBy(xpath="//div[@class='CSSTableGenerator batchListWrappper']/table/tbody/tr[2]/td[11]")
	private WebElement classcounttxt;
	@FindBy(xpath="//div[@class='classData']/table/tbody/tr[2]/td[15]/ul/li[2]/span/a")
	private WebElement editclass;
	@FindBy(xpath="//div[@class='mnPopupFront']/a")
	private WebElement closeclass;
	@FindBy(xpath="//input[@id='startTime']")
	private WebElement starttimetxt;
	@FindBy(xpath="//input[@id='duration']")
	private WebElement durationtxt;
	@FindBy(xpath="//input[@id='displayTimeDuration']")
	private WebElement timedurationtxt;
	@FindBy(xpath="//select[@id='roomNum']/option[2]")
	private WebElement roomnumselect;
	@FindBy(xpath="//select[@id='wServiceId']/option[2]")
	private WebElement webinarselect;
	@FindBy(xpath="//select[@id='professorId']/option[98]")
	private WebElement vipinpro;
	@FindBy(xpath="//input[@id='callWebinarApis']")
	private WebElement webinarnow;

	
	public EtutorPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void enterteacher(WebDriver driver, int i, int j) {
		try{
			String username = ExcelUtils.readData("TestData", i, j);
			if(username!=""){
				usertxtbx.sendKeys(username);
			}
			WaitStatementLib.implicitWaitForSecond(driver, 2);
		}
		catch (NullPointerException ex){		
		}
	}
		public void enteretutorPassword(WebDriver driver)
		{
			String password = ExcelUtils.readData("TestData", 1, 17);
			passtxtbx.sendKeys(password);
			WaitStatementLib.implicitWaitForSecond(driver, 2);
			}
		public void etutorlogin() {
			login.click();
		}
		public void createclass (WebDriver driver) {
			managebatchbtn.click();
			searchstudnttxt.sendKeys("enggqatest+62@meritnation.com");
			WaitStatementLib.explicitWaitForVisiblity(driver, 2, searchbtn);
			searchbtn.click();
			BasePage.sleepForMilliSecond(2000);
			BasePage.switchToWindow(driver,classcounttxt, manageclassbtn);
			for(int e = 2;e <= 9;e++)
			{
				driver.findElement(By.xpath("//div[@class='classData']/table/tbody/tr["+ e +"]/td[15]/ul/li[2]/span/a"));
				editclass.click();
				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				Date date = new Date(e);
				
				String systemdateandtime= dateFormat.format(date);
				String firsttime = (systemdateandtime+ 5);
				String secondtime = (systemdateandtime+10);
				for (int i=0 ; i<=0; i++) {
				starttimetxt.sendKeys(firsttime);
				durationtxt.sendKeys("10");
				timedurationtxt.sendKeys("10");
				roomnumselect.click();
				webinarselect.click();
				vipinpro.click();	
				webinarnow.click();
				closeclass.click();

				}
				for (int i=1 ; i<=6; i++) {
					starttimetxt.sendKeys(secondtime);
					durationtxt.sendKeys("10");
					timedurationtxt.sendKeys("10");
					roomnumselect.click();
					webinarselect.click();
					vipinpro.click();	
					webinarnow.click();
					closeclass.click();

				}
				
			}

				}
		}


	


