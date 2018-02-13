package com.applect.meritnation.pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.applect.meritnation.generic.ExcelUtils;
import com.applect.meritnation.generic.WaitStatementLib;
import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class LoginPage {
	WebDriver driver;
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement loginbtn;
	@FindBy(xpath="//input[@id='username_login']")
	private WebElement untxtbx;
	@FindBy(xpath="//input[@id='password_login']")
	private WebElement pwdtxtbx;
	@FindBy(id="loginBtn_1")
	private WebElement signInBtn;
	@FindBy(xpath="//div[@class='coursesSlider']/ul/a[2]")
	private WebElement rightarrow;
	@FindBy(xpath="//div[@id='notification_bar_top']")
	private WebElement topnotification;
	@FindBy(xpath="//div[@id='notification_bar_top']/div[@id='top-notification-close']")
	private WebElement closenotification;
	@FindBy(id="jeeHeader")
	private WebElement header;
	@FindBy(xpath="//div[@class='newLogo']")
	private WebElement logo;
	@FindBy(xpath="//div[@class='navBox']/nav/div/span[1]")
	private WebElement phoneno;
	@FindBy(xpath="//div[@class='navBox']/nav/div/span[2]")
	private WebElement ortxt;
	@FindBy(xpath="//div[@class='navBox']/nav/div/button")
	private WebElement callmebtn;
	@FindBy(xpath="//div[@class='navBox']/nav/div/a")
	private WebElement upgradebtn;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[1]")
	private WebElement coursemenu;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[1]/a/span")
	private WebElement selectedcoursetext;
	
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[1]/ul/li")
	private List <WebElement> coursecontent;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[2]")
	private WebElement studymenu;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[2]/ul/li")
	private List <WebElement> studycontent;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[3]")
	private WebElement anamenu;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[3]/ul/li")
	private List <WebElement> anacontent;
	
	


	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[4]")
	private WebElement feed;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[5]")
	private WebElement memenu;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[5]/ul/li")
	private List <WebElement> mecontent;
	
	


	@FindBy(xpath="//div[@class='profile']/span")
	private WebElement fullname;
	@FindBy(xpath="//div[@id='jeeMain']/div/aside/div/div")
	private WebElement rightbanner;
	
	
	@FindBy(xpath="//div[@id='jeeMain']/div/aside/div/div/section/h3")
	private List <WebElement> rightbannercontent;
	@FindBy(xpath="//div[@id='jeeMain']/div/aside/div/div/section[@class='myStats border-box ng-scope']/ul/li")
	private WebElement statlist;
	@FindBy(xpath="//div[@id='jeeMain']/div/aside/div/div/section[@class='myStats border-box ng-scope']/div[@class='summaryBox']/button")
	private WebElement viewallbtn;
	@FindBy(xpath="//div[@id='jeeMain']/div/aside/div/div/section[@class='myStats border-box ng-scope']/div[@class='rankbox']/div[@class='points']/span")
	private WebElement points;
	@FindBy(xpath="//div[@id='jeeMain']/div/aside/div/div/section[@class='myStats border-box ng-scope']/div[@class='rankbox']/div[@class='rank']/span")
	private WebElement rank;
	@FindBy(xpath="//div[@class='boxContent']")
	private WebElement blogconntent;
	@FindBy(xpath="//section[@class='subjectList']/ul")
	private WebElement subjectsection;
	@FindBy(xpath="//section[@id='whatNext']/div[2]/div[1]")
	private WebElement sessionssection;
	@FindBy(xpath="//section[@id='whatNext']/div[2]/div[2]")
	private WebElement videosection;
	@FindBy(xpath="//section[@id='whatNext']/div[2]/div[3]")
	private WebElement assignmentsection;
	@FindBy(xpath="//div[@class='topQue']/section/div/section/div/div[1]/div/div[2]/a")
	private WebElement topquestion;
	
	







	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginButtonClick(WebDriver driver)
	{
		loginbtn.click();
		WaitStatementLib.implicitWaitForSecond(driver, 2);
	}
	public void enterUserName(WebDriver driver)
	{
		String username = ExcelUtils.readData("TestData", 1, 1);
		untxtbx.sendKeys(username);
		WaitStatementLib.implicitWaitForSecond(driver, 2);
		
	}
	public void enterUserNameAllClasses(WebDriver driver, int i)
	{
			String username = ExcelUtils.readData("TestData", 1, i);	
			untxtbx.sendKeys(username);
			WaitStatementLib.implicitWaitForSecond(driver, 2);	
	}
	
	public void enterPassword(WebDriver driver)
	{
		String password = ExcelUtils.readData("TestData", 1, 2);
		pwdtxtbx.sendKeys(password);
		WaitStatementLib.implicitWaitForSecond(driver, 2);
		}
	public void signInBtnClick()
	{
			signInBtn.click();
			BasePage.sleepForMilliSecond(2000);
		try{
			BasePage.isPresentAndDisplayed(topnotification);
			closenotification.click();
		}
		catch(NoSuchElementException e){
			
		}
			
		/*	rightarrow.click();
			BasePage.sleepForMilliSecond(1000);
			rightarrow.click();
			BasePage.sleepForMilliSecond(1000);
			rightarrow.click();
		try{	topnotification.isDisplayed();
			
				closenotification.click();
				}
				
				finally{
				BasePage.sleepForMilliSecond(1000);
				}
				
				/*rightarrow.click();
				BasePage.sleepForMilliSecond(1000);
				rightarrow.click();
				BasePage.sleepForMilliSecond(1000);
				rightarrow.click();
			}*/
		
	}
	
	public void checkHeaderDisplay(WebDriver driver)
	{
			Assert.assertTrue((String.valueOf(BasePage.isPresentAndDisplayed(header))!= "false"));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(logo));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(phoneno));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(ortxt));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(callmebtn));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(upgradebtn));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(coursemenu));
			coursemenu.click();
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyCourseMenuContent(coursecontent);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(studymenu));
			BasePage.moveToElementAndStay(driver, studymenu);
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyStudyMenuContent(studycontent);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(anamenu));
			anamenu.click();
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyAnaMenuContent(anacontent);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(feed));
			BasePage.sleepForMilliSecond(1000);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(memenu));;
			memenu.click();
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyMeMenuContent(mecontent);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(fullname));;
			Assert.assertTrue(fullname.getText().toString().length()!=0);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(rightbanner));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(rightbannercontent.get(0)));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(rightbannercontent.get(1)));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(statlist));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(viewallbtn));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(points));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(rank));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(blogconntent));
			Assert.assertTrue(blogconntent.getText().toString().length() !=0);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(subjectsection));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(sessionssection));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(videosection));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(assignmentsection));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(topquestion));
			Assert.assertTrue(topquestion.getText().toString().length()!=0);
	}
	public void checkHeaderDisplayForAllClasses(WebDriver driver, int k)
	{
			Assert.assertTrue((String.valueOf(BasePage.isPresentAndDisplayed(header))!= "false"));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(logo));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(phoneno));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(ortxt));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(callmebtn));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(upgradebtn));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(coursemenu));
			coursemenu.click();
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyCourseMenuContentforAllClasses(coursecontent, k);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(studymenu));
			BasePage.moveToElementAndStay(driver, studymenu);
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyStudyMenuContentForAllClasses(studycontent, k);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(anamenu));
			anamenu.click();
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyAnaMenuContent(anacontent);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(feed));
			BasePage.sleepForMilliSecond(1000);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(memenu));;
			memenu.click();
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyMeMenuContent(mecontent);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(fullname));;
			Assert.assertTrue(fullname.getText().toString().length()!=0);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(rightbanner));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(rightbannercontent.get(0)));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(rightbannercontent.get(1)));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(statlist));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(viewallbtn));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(points));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(rank));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(blogconntent));
			/*Assert.assertTrue(blogconntent.getText().toString().length() !=0);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(subjectsection));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(sessionssection));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(videosection));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(assignmentsection));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(topquestion));
			Assert.assertTrue(topquestion.getText().toString().length()!=0);*/
	}
	public void checkHeaderDisplayForAllClassesSpecificUsers(WebDriver driver, int k)
	{
			Assert.assertTrue((String.valueOf(BasePage.isPresentAndDisplayed(header))!= "false"));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(logo));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(phoneno));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(ortxt));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(callmebtn));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(upgradebtn));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(coursemenu));
		
			coursemenu.click();
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyCourseMenuContentforAllClassesSPecificUsers(selectedcoursetext,coursecontent, k);
		/*	Assert.assertTrue(BasePage.isPresentAndDisplayed(studymenu));
			BasePage.moveToElementAndStay(driver, studymenu);
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyStudyMenuContentForAllClasses(studycontent, k);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(anamenu));
			anamenu.click();
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyAnaMenuContent(anacontent);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(feed));
			BasePage.sleepForMilliSecond(1000);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(memenu));;
			memenu.click();
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyMeMenuContent(mecontent);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(fullname));;
			Assert.assertTrue(fullname.getText().toString().length()!=0);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(rightbanner));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(rightbannercontent.get(0)));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(rightbannercontent.get(1)));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(statlist));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(viewallbtn));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(points));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(rank));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(blogconntent));
			/*Assert.assertTrue(blogconntent.getText().toString().length() !=0);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(subjectsection));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(sessionssection));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(videosection));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(assignmentsection));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(topquestion));
			Assert.assertTrue(topquestion.getText().toString().length()!=0);*/
	}
}
