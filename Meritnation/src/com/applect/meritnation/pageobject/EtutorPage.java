package com.applect.meritnation.pageobject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.applect.meritnation.generic.ExcelUtils;
import com.applect.meritnation.generic.WaitStatementLib;

public class EtutorPage {

	@FindBy(xpath = "//input[@id='userid']")
	private WebElement usertxtbx;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passtxtbx;
	@FindBy(xpath = "//input[@name='Login']")
	private WebElement login;
	@FindBy(xpath = "//a[@class='manageBatch greenBtn']")
	private WebElement managebatchbtn;
	@FindBy(xpath = "//input[@id='searchStudentEmail']")
	private WebElement searchstudnttxt;
	@FindBy(xpath = "//input[@id='searchBatchSbmtBtn']")
	private WebElement searchbtn;
	@FindBy(xpath = "//div[@class='CSSTableGenerator batchListWrappper']/table/tbody/tr[8]/td[11]/a[1]")
	private List<WebElement> manageclassbtn;
	@FindBy(xpath = "//div[@class='CSSTableGenerator batchListWrappper']/table/tbody/tr[8]/td[11]/a[1]")
	private WebElement manageclassbtn1;
	@FindBy(xpath = "//div[@class='CSSTableGenerator batchListWrappper']/table/tbody/tr[8]/td[11]")
	private WebElement classcounttxt;
	@FindBy(xpath = "//div[@class='mnPopupFront']/a")
	private WebElement closeclass;
	@FindBy(xpath = "//input[@id='startTime']")
	private WebElement starttimetxt;
	@FindBy(xpath = "//input[@id='duration']")
	private WebElement durationtxt;
	@FindBy(xpath = "//input[@id='displayTimeDuration']")
	private WebElement timedurationtxt;
	@FindBy(xpath = "//select[@id='roomNum']/option[2]")
	private WebElement roomnumselect;
	@FindBy(xpath = "//select[@id='wServiceId']/option[2]")
	private WebElement webinarselect;
	@FindBy(xpath = "//select[@id='professorId']/option[113]")
	//@FindBy(xpath = "//select[@id='professorId']/option[5]")
	private WebElement vipinpro;
	@FindBy(xpath = "//input[@id='callWebinarApis']")
	private WebElement webinarnow;
	@FindBy(xpath = "//input[@id='saveClassBtn']")
	private WebElement saveclass;
	@FindBy(xpath = "//span[@id='loadingImage']/span")
	private WebElement message;
	@FindBy(xpath = "//div[@class='classData']/table/tbody/tr[2]/td[13]/a")
	private WebElement enterclass;
	@FindBy(xpath = "//input[@id='username_login_1']")
	private WebElement studenttxtbx;
	@FindBy(xpath = "//div[@id='currentSession']/article/a[1]")
	private WebElement classbanner;
	@FindBy(xpath = "//div[@id='classInProgress']")
	private WebElement joinclass;
	@FindBy(xpath = "//div[@id='testpagedialog']/md-dialog/md-toolbar/div/button/md-icon")
	private WebElement systemclose;
	@FindBy(xpath = "//md-dialog-actions[@class='layout-row']/button")
	private WebElement gotitbtn;
	@FindBy(xpath = "//md-dialog-actions[@class='layout-row']/button")
	private WebElement EnterLiveSession;
	@FindBy(xpath = "//canvas[@id='temp-white-board-0']")
	private WebElement Drawingarea;
	@FindBy(xpath = "//div[@id='board-menu-bar']/button[10]")
	private WebElement uploaddoc;
	@FindBy(xpath = "//md-content[@class='_md']/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[2]")
	private WebElement chooserepo;
	@FindBy(xpath = "//div[@class='list-thumbnails']/md-card[4]/span")
	private WebElement folder2upld;
	@FindBy(xpath = "//div[@class='list-thumbnails']/md-card[1]")
	private WebElement file2upld;
	@FindBy(xpath = "//div[@class='button']/button[1]/span")
	private WebElement slctall;
	@FindBy(xpath = "//div[@class='button']/button[2]/span")
	private WebElement embed;
	@FindBy(xpath = "/html/body/div[9]/md-dialog/md-toolbar/div/button")
	private WebElement close;
	/*@FindBy(xpath = "//div[@class='button']/button[2]/span")
	private WebElement embed;
	@FindBy(xpath = "//div[@class='button']/button[2]/span")
	private WebElement embed;
	@FindBy(xpath = "//div[@class='button']/button[2]/span")
	private WebElement embed;
	@FindBy(xpath = "//div[@class='button']/button[2]/span")
	private WebElement embed;
	@FindBy(xpath = "//div[@class='button']/button[2]/span")
	private WebElement embed;
	@FindBy(xpath = "//div[@class='button']/button[2]/span")
	private WebElement embed;
	@FindBy(xpath = "//div[@class='button']/button[2]/span")
	private WebElement embed;
	*/
	
	
	
	

	public EtutorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterteacher(WebDriver driver, int i, int j) {
		try {
			String username = ExcelUtils.readData("TestData", i, j);
			if (username != "") {
				usertxtbx.sendKeys(username);
			}
			WaitStatementLib.implicitWaitForSecond(driver, 2);
		} catch (NullPointerException ex) {
		}
	}

	public void enteretutorPassword(WebDriver driver) {
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
			//searchstudnttxt.sendKeys("ajit11@m.com");
			WaitStatementLib.explicitWaitForVisiblity(driver, 2, searchbtn);
			searchbtn.click();
			BasePage.sleepForMilliSecond(2000);
			BasePage.scrollDown(classcounttxt, driver);
			BasePage.switchToWindow(driver,classcounttxt, manageclassbtn);
			int classtime = 2;
			for(int e=2;e<=2;e++)
			{
				WebElement editclass = driver.findElement(By.xpath("//div[@class='classData']/table/tbody/tr["+e+"]/td[15]/ul[1]/li[2]/span[1]/a"));
				editclass.click();
				Calendar calendar= Calendar.getInstance();
				if(e==2) {
					calendar.add(Calendar.MINUTE, classtime);
				}
				else {
					classtime=classtime+10;
					calendar.add(Calendar.MINUTE, classtime);
				}
				 SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				 String firsttime = format1.format(calendar.getTime());
				 starttimetxt.sendKeys(firsttime);
					durationtxt.sendKeys("10");
					timedurationtxt.sendKeys("10");
					roomnumselect.click();
					WebElement webinarselect = driver.findElement(By.xpath("//select[@id='wServiceId']/option[3]"));
					webinarselect.click();
					vipinpro.click();	
					webinarnow.click();
					saveclass.click();
				WaitStatementLib.explicitWaitForVisiblity(driver,3,message);
				Assert.assertEquals(message.getText(),"Class information saved successfully.");
				System.out.println(message.getText());
					closeclass.click();
		}
			}
	public void enterstudent(WebDriver driver, int i, int j) {
		try {
			String username = ExcelUtils.readData("TestData", i, j);
			if (username != "") {
				studenttxtbx.sendKeys(username);
			}
			WaitStatementLib.implicitWaitForSecond(driver, 2);
		} catch (NullPointerException ex) {
		}
	}
	public void enterclass(WebDriver driver) {
	enterclass.click();

		}

	public void joinclass() {
		classbanner.click();
		joinclass.click();
	}
	public void verifyclass(WebDriver driver) {
		BasePage.sleepForMilliSecond(2000);
		BasePage.switchToWindow(driver);
		WaitStatementLib.explicitWaitForVisiblity(driver,10, systemclose);
		systemclose.click();
		/*Actions builder = new Actions(driver);
	    Action drawAction = builder.moveToElement(Drawingarea,135,15) //start points x axis and y axis. 
	              .click()
	              .moveByOffset(200, 60) // 2nd points (x1,y1)
	              .click()
	              .moveByOffset(100, 70)// 3rd points (x2,y2)
	              .doubleClick()
	              .build();
	    drawAction.perform();*/
	  /* BasePage.sleepForMilliSecond(2000);
	    uploaddoc.click();
	    chooserepo.click();
	    BasePage.sleepForMilliSecond(1000);
	    folder2upld.click();
	    file2upld.click();
	    WaitStatementLib.explicitWaitForVisiblity(driver,100, slctall);	
	    slctall.click();
	    embed.click();
	    BasePage.sleepForMilliSecond(3000);
	    close.click();*/
	    WaitStatementLib.explicitWaitForVisiblity(driver,400, gotitbtn);		
		gotitbtn.click();
		WaitStatementLib.explicitWaitForVisiblity(driver,5, systemclose);
		WaitStatementLib.explicitWaitForVisiblity(driver,10, EnterLiveSession);
		EnterLiveSession.click();
		
	}
	}
