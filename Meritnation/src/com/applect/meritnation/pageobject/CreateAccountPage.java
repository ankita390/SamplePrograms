package com.applect.meritnation.pageobject;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.applect.meritnation.generic.ExcelUtils;
import com.applect.meritnation.generic.WaitStatementLib;

public class CreateAccountPage
{
	@FindBy(xpath="//button[contains(text(), 'Create account')]")
	private WebElement createaccountbtn;
	@FindBy(xpath="//*[contains(@class,'popupForm')]//*[text()='Name']/preceding-sibling::input") 
	public WebElement nametxtbx;
	@FindBy(xpath="//*[contains(@class,'popupForm')]//*[text()='E-mail']/preceding-sibling::input")
	private WebElement emailtxtbx;
	@FindBy(xpath="//*[contains(@class,'popupForm')]//*[text()='Password']/preceding-sibling::input[@autocomplete='current-password']")
	private WebElement pwdtxtbx;
	@FindBy(xpath="//section[@class='fieldSec']/div[4]/input[@id='userPassword']")
	private WebElement pwdtxtbx1;
	@FindBy(xpath="//*[contains(@class,'popupForm')]//*[text()='Area PIN Code']/preceding-sibling::input")
	private WebElement pincodebx;
	@FindBy(xpath="//*[contains(@class,'popupForm')]//*[text()='Mobile No.']/preceding-sibling::input") 
	private WebElement mobbx;
	@FindBy(xpath="//*[contains(@class,'popupForm')]//select[contains(@id,'userCurriculum')]")
	private WebElement coursename;
	@FindBy(xpath="//*[contains(@class,'popupForm')]//select[contains(@id,'userGrade')]")
	private WebElement classname;
	@FindBy(xpath="//*[contains(@class,'popupForm')]//label[@data-type='Student']")
	private WebElement student;
	@FindBy(xpath="//*[contains(@class,'popupForm')]//label[@data-type='Teacher']") 
	private WebElement teacher;
	@FindBy(xpath="//*[contains(@class,'popupForm')]//button[text()='join for free']")  
	private WebElement joinbtn;
	@FindBy(id="subBtn_2") 
	private WebElement joinbtn1;
	@FindBy(xpath="//div[@class='information-box group']/div/div/div/div/span[4]") 
	private WebElement changelocationicon;
	@FindBy(xpath="//div[@class='bs-col-md-4']/div/div/div/span") 
	private List <WebElement> selectlocation;
	@FindBy(xpath="//div[@class='ui-select-choices-content selectize-dropdown-content']/div/div/div/span[text()='Mauritius']") 
	private WebElement country_Mauritius;
	@FindBy(xpath="//div[@class='ui-select-choices-content selectize-dropdown-content']/div/div[2]/div/span") 
	private WebElement city_Mauritius;
	@FindBy(xpath ="//div[@class='bs-col-md-12 text-center']/div/div/div/span[@class = 'ng-binding ng-scope']") 
	private WebElement schoolnamebx;
	@FindBy(xpath ="//div[contains(@class,'selectize-dropdown-content')]/div/div[2]")
	private WebElement schoolnamelist;
	
	
	
	@FindBy(xpath ="//div[@class='ui-select-choices-content selectize-dropdown-content']/div/div[@role='option']/div/div/div/div/div[@title='a221, okhla phase - 1']")
	private WebElement schoolnamelist1;
	@FindBy(xpath="//div[@class='profilcePic']/div/img")
	private WebElement profileicon;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutbtn;
	@FindBy(xpath="//div[@id='notification_bar_top']")
	private WebElement topnotification;
	@FindBy(xpath="//div[@id='notification_bar_top']/div[@id='top-notification-close']")
	private WebElement closenotification;
	@FindBy(xpath="//div[@class='profileWrapper']/div[@class='usrInfoBox']/div[@class='usr_mode']/strong")
	private WebElement paidtxt;
	@FindBy(xpath="//div[@class='profileWrapper']/div[@class='usrInfoBox']/div[@class='usr_mode']/a")
	private WebElement paiddetailslnk;
	@FindBy(xpath="//div[@class='subscription-card']")
	private WebElement subscriptionbox;
	@FindBy(xpath="//div[@class='subscription-card']/div[1]")
	private WebElement courseinsubscriptionbox;
	@FindBy(xpath="//div[@class='subscription-card']/div[2]")
	private WebElement purchasedateinsubscriptionbox;
	@FindBy(xpath="//div[@class='subscription-card']/div[3]")
	private WebElement expirydateinsubscriptionbox;
	@FindBy(xpath="//div[@class='s_header group']/div[1]/a")
	private WebElement backarrow;
	@FindBy(xpath="//a[contains(text(),'Explore Courses')]")
	private WebElement linktodirectpkgpurchase;
	@FindBy(xpath="//div[@class='test-card__action']/div/button")
	private List <WebElement> buynowbtnontests;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[2]/ul/li")
	private List <WebElement> subjectlist;
	@FindBy(xpath="//div[@class='allsession']/ul/li/div")
	private List <WebElement> chapterlist;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div")
	private List <WebElement> leftmenu;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div")
	private List <WebElement> innerleftmenu;
	@FindBy(xpath="//div[@class='tablerow']/div[3]/i")
	private WebElement closeboardpprnotification;
	@FindBy(xpath = "//div[@id='webengage-notification-container']/iframe")
	private WebElement frame;
	@FindBy(xpath="//div[@class='display-ib width46per']/select/option")
	private List <WebElement> allBoards;
	@FindBy(xpath="//div[@class='close tablecell']")
	private WebElement closeOrangePopup;
	@FindBy(xpath="//form[@id='popup_registration']//*[@id='UserDetailFullname']")
	private WebElement untxtbx;
	@FindBy(xpath="//form[@id='popup_registration']//*[@id='UserEmail']")
	private WebElement junemailtxtbx;
	@FindBy(xpath="//form[@id='popup_registration']//*[@id='UserPassword']")
	private WebElement junpwdtxtbx;
	@FindBy(xpath="//form[@id='popup_registration']//*[@id='UserDetailMobile']") 
	private WebElement junmobbx;
	@FindBy(xpath="//form[@id='popup_registration']//*[@id='pincode1']")
	private WebElement junpincodebx;
	@FindBy(xpath="//form[@id='popup_registration']//*[@id='curboard_popup']")
	private WebElement juncoursename;
	@FindBy(xpath="//form[@id='popup_registration']//*[@id='regGradeId_popup']")
	private WebElement junclassname;
	@FindBy(xpath="//form[@id='popup_registration']//*[@id='curboard_popup']")
	private WebElement junstudent;
	@FindBy(xpath="//form[@id='popup_registration']//*[@id='juniorRegBtn']")  
	private WebElement junjoinbtn;
	@FindBy(id="subBtn_2") 
	private WebElement junjoinbtn1;
	@FindBy(xpath="//a[@class='signinBtn']")
	private WebElement gotobtn;
	@FindBy(xpath = "//div[@id='connecto-widget-container']/iframe")
	private WebElement JeeTestSeriesframe;
	@FindBy(xpath = "//div[contains(@class,'connecto')]/div/div[@class='close']")
	private WebElement closeJeeTestSeriesframe;
	@FindBy (xpath = "//div[@class='close tablecell']")
	private WebElement closePopup;
	@FindBy(xpath = "//div[contains(@id,'connecto-modal')]/iframe")
	private WebElement connectoFrame;
	@FindBy(xpath = "//div[@class='icon close']")
	private WebElement closeFrame;
	
	
	public CreateAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void createAccount(WebDriver driver)
	{
		if(BasePage.isPresentAndDisplayed(connectoFrame)){
			WaitStatementLib.explicitWaitForVisiblity(driver, 15, connectoFrame);
			try{
				driver.switchTo().frame(connectoFrame);
				WaitStatementLib.explicitWaitForVisiblity(driver, 5, closeFrame);
				closeFrame.click();
				BasePage.sleepForMilliSecond(1000);
				driver.switchTo().defaultContent();
			}
			catch(ElementNotVisibleException ex){
				
			}
			catch(TimeoutException ex){
			
			}
		BasePage.sleepForMilliSecond(2000);
		createaccountbtn.click();
		}
	}
	public void enterName()
	{
		String fullname = ExcelUtils.readData("TestData", 0, 1);
		nametxtbx.sendKeys(fullname);
	}	
	
	public void enterEmail()
	{
		String emailid = ExcelUtils.readData("TestData", 0, 2);
		emailid = emailid + BasePage.randomString() + "@applect.com";
		emailtxtbx.sendKeys(emailid);
	}
	
	public void enterPassword()
	{
		String password = ExcelUtils.readData("TestData", 0, 3);
	//	WaitStatementLib.explicitWaitForVisiblity(driver, 5, pwdtxtbx);
		try{
		pwdtxtbx.sendKeys(password);	
		}
		catch(ElementNotVisibleException e){
			BasePage.sleepForMilliSecond(5000);
			pwdtxtbx1.sendKeys(password);
			
		}
	}
	public void enterPincode ()
	{
		String pin = ExcelUtils.readData("TestData", 0, 4);
		pincodebx.sendKeys(pin);	
	}
	public void enterMobile ()
	{
		String mobile = ExcelUtils.readData("TestData", 0, 5);
		mobbx.sendKeys(mobile);	
	}
	public void enterUserCourse ()
	{
		Select sel = new Select(coursename);
		sel.selectByVisibleText("CBSE");	
	}
	public void enterUserCourseAllBoard(){
		Select sel = new Select(coursename);
		for (int i=1;i<=allBoards.size();i++){
			sel.selectByIndex(i);
		}

	}
	public void enterUserClass ()
	{
		Select sel = new Select(classname);
		sel.selectByVisibleText("X");	
	}
	public void selectUserAsStudent()
	{
		student.click();
	}
	public void selectUserAsTeacher()
	{
		teacher.click();
	}
	public void gotodashboard(WebDriver driver)
	{
		gotobtn.click();
		BasePage.sleepForMilliSecond(1000);
	}
	public void joinNow(WebDriver driver)
	{
		
		try{
			BasePage.scrollDown(joinbtn, driver);
		joinbtn.click();
		}
		catch (Exception e){
			BasePage.scrollDown(joinbtn1, driver);
			joinbtn1.click();
		}
	}
	public void enterJuniorName()
	{
		String fullname = ExcelUtils.readData("TestData", 0, 1);
		untxtbx.sendKeys(fullname);
}
	public void enterjuniorEmail()
	{
		String emailid = ExcelUtils.readData("TestData", 0, 2);
		emailid = emailid + BasePage.randomString() + "@applect.com";
		junemailtxtbx.sendKeys(emailid);
	}
	public void enterjuniorPassword()
	{
		String password = ExcelUtils.readData("TestData", 0, 3);
	//	WaitStatementLib.explicitWaitForVisiblity(driver, 5, pwdtxtbx);
		try{
			junpwdtxtbx.sendKeys(password);	
		}
		catch(ElementNotVisibleException e){
			BasePage.sleepForMilliSecond(5000);
			junpwdtxtbx.sendKeys(password);
		}
	}
	public void enterjuniorPincode ()
	{
		String pin = ExcelUtils.readData("TestData", 0, 4);
		junpincodebx.sendKeys(pin);	
	}
	public void enterjuniorMobile ()
	{
		String mobile = ExcelUtils.readData("TestData", 0, 5);
		junmobbx.sendKeys(mobile);	
	}
	public void enterjuniorUserCourse ()
	{
		Select sel = new Select(juncoursename);
		sel.selectByVisibleText("CBSE");	
	}
	public void enterjuniorUserClass ()
	{
		Select sel = new Select(junclassname);
		sel.selectByVisibleText("V");	
	}
	public void selectjuniorUserAsStudent()
	{
		junstudent.click();
	}
	public void juniorjoinNow(WebDriver driver)
	{
		
		try{
			BasePage.scrollDown(junjoinbtn, driver);
			junjoinbtn.click();
		}
		catch (Exception e){
			BasePage.scrollDown(junjoinbtn, driver);
			junjoinbtn.click();
		}
	}
	
	public void enterSchoolName (WebDriver driver)  
	{
		WaitStatementLib.explicitWaitForVisiblity(driver, 15, changelocationicon);
		changelocationicon.click();
		BasePage.moveToElementAndClick(driver, selectlocation.get(0));
		BasePage.sleepForMilliSecond(2000);
		BasePage.moveToElementAndClick(driver,country_Mauritius);
		WaitStatementLib.explicitWaitForVisiblity(driver, 5, selectlocation.get(2));
		BasePage.sleepForMilliSecond(2000);
		BasePage.moveToElementAndClick(driver, selectlocation.get(2));
		BasePage.sleepForMilliSecond(2000);
		BasePage.moveToElementAndClick(driver,city_Mauritius);
		if(String.valueOf(BasePage.isPresentAndDisplayed(frame))=="true"){
			WaitStatementLib.explicitWaitForVisiblity(driver, 15, frame);
			try{
			driver.switchTo().frame(frame);
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, closeOrangePopup);
			closeOrangePopup.click();
			BasePage.sleepForMilliSecond(1000);
			driver.switchTo().defaultContent();
			}
			catch(ElementNotVisibleException ex){
				
			}
			catch(TimeoutException ex){
			driver.switchTo().defaultContent();
			}
		}
			schoolnamebx.click();
			String school = ExcelUtils.readData("TestData", 0, 6);
			Actions actions = new Actions(driver);
			actions.moveToElement(schoolnamebx);
		//	actions.click();
			BasePage.sleepForMilliSecond(2000);
			actions.sendKeys(school);
			actions.build().perform();
			BasePage.sleepForMilliSecond(2000); 
			schoolnamelist.click();
		
		if(String.valueOf(BasePage.isPresentAndDisplayed(topnotification))=="true"){
			closenotification.click();
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, profileicon);
		}
		BasePage.closeJEETestSeriesPopup(driver, JeeTestSeriesframe,closeJeeTestSeriesframe);

		if(String.valueOf(BasePage.isPresentAndDisplayed(frame))=="true"){
			WaitStatementLib.explicitWaitForVisiblity(driver, 15, frame);
			try{
			driver.switchTo().frame(frame);
		//	WaitStatementLib.explicitWaitForVisiblity(driver, 5, closeboardpprnotification);
			closeboardpprnotification.click();
			BasePage.sleepForMilliSecond(1000);
			driver.switchTo().defaultContent();
			}
			catch(ElementNotVisibleException ex){
				
			}
			catch(TimeoutException | NoSuchElementException ex){
				if (BasePage.isPresentAndDisplayed(closePopup)){
					closePopup.click();
					BasePage.sleepForMilliSecond(1000);
				}
					
			driver.switchTo().defaultContent();
			}
		}
		else if(BasePage.isPresentAndDisplayed(connectoFrame)){
			WaitStatementLib.explicitWaitForVisiblity(driver, 15, connectoFrame);
			try{
				driver.switchTo().frame(connectoFrame);
				WaitStatementLib.explicitWaitForVisiblity(driver, 5, closeFrame);
				closeFrame.click();
				BasePage.sleepForMilliSecond(1000);
				driver.switchTo().defaultContent();
			}
			catch(ElementNotVisibleException ex){
				
			}
			catch(TimeoutException ex){
			driver.switchTo().defaultContent();
			}
			
		}
	
	}
	public void clickProfileIcon(WebDriver driver)
	{
		//This code needs to uncommeneted when any webengage notification starts appearing
			/*if(String.valueOf(BasePage.isPresentAndDisplayed(topnotification))=="true"){
				closenotification.click();
			}
			if(String.valueOf(BasePage.isPresentAndDisplayed(frame))=="true"){
				WaitStatementLib.explicitWaitForVisiblity(driver, 15, frame);
				try{
				driver.switchTo().frame(frame);
				WaitStatementLib.explicitWaitForVisiblity(driver, 5, closeboardpprnotification);
				closeboardpprnotification.click();x	
				BasePage.sleepForMilliSecond(1000);
				driver.switchTo().defaultContent();
				}
				catch(ElementNotVisibleException ex){
					
				}
				catch(TimeoutException ex){
				driver.switchTo().defaultContent();
				}
			}*/
		 
			WaitStatementLib.explicitWaitForVisiblity(driver, 15, profileicon);
	

		profileicon.click();
	}
	public void verifyPaidSubscription(WebDriver driver)
	{
		WaitStatementLib.implicitWaitForSecond(driver, 5);
		BasePage.sleepForMilliSecond(2000);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(paidtxt));
		Assert.assertTrue(paidtxt.getText().toString().equalsIgnoreCase("Paid"));
		paiddetailslnk.click();
		WaitStatementLib.implicitWaitForSecond(driver, 5);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(subscriptionbox));
		Assert.assertTrue(BasePage.isPresentAndDisplayed(purchasedateinsubscriptionbox));
		Assert.assertTrue(BasePage.isPresentAndDisplayed(expirydateinsubscriptionbox));
		backarrow.click();
	}
	public void verifyPaidAccess(WebDriver driver){
		
	StudyPage studypage	= new StudyPage(driver);
	BasePage.moveToElementAndClick(driver, studypage.studybx, subjectlist.get(0));
	for(int i=0;i<leftmenu.size();i++){
    	if(String.valueOf(leftmenu.get(i).getText().toString().equalsIgnoreCase("Chapters")) != "false"){
    		leftmenu.get(i).click();
			}
			else{
				continue;
			}
	}
	for(int j=3;j<chapterlist.size();j++){
		if(String.valueOf(BasePage.isPresentAndDisplayed(chapterlist.get(j)))=="true"){
			chapterlist.get(j).click();
		}
		else{
			continue;
		}
	}
	BasePage.sleepForMilliSecond(2000);
    Assert.assertFalse(BasePage.isPresentAndDisplayed(linktodirectpkgpurchase));
    for(int k=0;k<innerleftmenu.size();k++){
    	if(String.valueOf(innerleftmenu.get(k).getText().toString().equalsIgnoreCase("Tests")) == "true"){
    		innerleftmenu.get(k).click();
			BasePage.sleepForMilliSecond(2000);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(buynowbtnontests.get(0)));
			for(int i=0;i<buynowbtnontests.size();i++){
				Assert.assertFalse(buynowbtnontests.get(0).getText().toString().equalsIgnoreCase("Buy Now"));
			}
			
		}
    	else{
    		continue;
    	}
    }
   
  }
	public void logoutClick(WebDriver driver)
	{
	//	LoginPage loginpage = new LoginPage(driver);
	//	loginpage.closeBoardPaperSolutionpopup();
		WaitStatementLib.explicitWaitForVisiblity(driver, 5, logoutbtn);
	//	BasePage.sleepForMilliSecond(2000);
		logoutbtn.click();
	}
	
}
