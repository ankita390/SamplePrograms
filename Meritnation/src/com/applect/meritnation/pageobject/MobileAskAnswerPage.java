package com.applect.meritnation.pageobject;

import java.sql.Driver;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.applect.meritnation.generic.ConnectDatabase;
import com.applect.meritnation.generic.ExcelUtils;
import com.applect.meritnation.generic.GetPropertyValues;
import com.applect.meritnation.generic.WaitStatementLib;

public class MobileAskAnswerPage {
	
	@FindBy(xpath = "//div[@class='sticky-tab']/a[2]/span[text()='Ask N Ans']")
	private WebElement clickAskAns;
	@FindBy(xpath = "//nav[@id='mainTabs']/ul[@class='mobile-tab swiper-wrapper']/li")
	private List<WebElement> elementsOnDashboard ;
	@FindBy(xpath = "//div[@class ='anaFilterTabs ' ]/ul/li/a")
	private List<WebElement> popularQuestionTab;
	@FindBy(xpath = "//div[@id='questionsList']/div")
	private List<WebElement> popularQuestionsList;
	@FindBy(xpath="//div[contains(@class,'swiper-main-box swiper-container')]//div[@class='media-box']")
	private List<WebElement> latestQuestionList;
	@FindBy(xpath = "//div[@class='media-title']/p/strong")
	private List<WebElement> QuestionAskedByuser; 
	@FindBy(xpath = "//div[@class='view-full-answer']/a")
	private WebElement ViewfullAnswerLink;
	@FindBy(xpath = "//div[@class='inputRow']/input[@id='name']")
	private WebElement nameTextBox;
	@FindBy(xpath = "//div[@class='inputRow']/input[@id='email']")
	private WebElement emailTextbook;
	@FindBy(xpath = "//div[@class='inputRow']/input[@id='password']")
	private WebElement pwdtxtbx;
	@FindBy(xpath = "//div[@class='float-r dropDownmenu']/input[@id='mobile']")
	private WebElement mobileNumberForSignup;
	@FindBy(xpath = "//div/div/select[@id='board']")
	private WebElement courseName;
	@FindBy(xpath = "//div[@class = 'float-r dropDownmenu']/select[@id='grade']")
	private WebElement EnterClass;
	@FindBy(xpath = "//div[@class='inputRow mb10 pincodeRow']/input[@id='pincode']")
	private WebElement enterPincode;
	@FindBy(xpath="//div[@id='userType1']/label/input[@id='UserDetailUserType1']")
	private WebElement chooseOptionStudent;
	@FindBy(xpath = "//div[@class='login-btn']/div/a[@id='registerBtn']")
	private WebElement registerButton;
	@FindBy(xpath="//div[@class='inputRow group mB25Px']/input[@placeholder='Enter OTP']")
	private WebElement enterOtpField;
	@FindBy(xpath = "//div[@class='inputRow mT30Px']/button[@type='submit']")
	private WebElement verifyOtp;
	@FindBy(xpath = "//section/div/button[@type ='button' ]")
	private WebElement allowForSchoollocation;
	
	@FindBy(xpath="//div[@id='webengage-notification-container']/iframe")
	private WebElement frame;
	@FindBy(xpath="//div[@class='close tablecell']")
	private WebElement closeOrangePopup;
	
	public MobileAskAnswerPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickAskAnswer(){
		BasePage.sleepForMilliSecond(3000);
		clickAskAns.click();
		
		}
	
	public void verifyDashboardOptions(WebDriver driver){

			Assert.assertEquals(elementsOnDashboard.get(0).getText(), "QUESTIONS");
			
			Assert.assertEquals(popularQuestionTab.get(0).getText(), "Popular");
			Assert.assertFalse(popularQuestionsList.isEmpty());
			//popularQuestionsList.get(0).click();
			BasePage.sleepForMilliSecond(3000);
			popularQuestionTab.get(1).click();
			BasePage.sleepForMilliSecond(3000);
			String usernameOfaskedQuestion=QuestionAskedByuser.get(0).getText().toString();
		    latestQuestionList.get(0).click();
		   // System.out.println(QuestionAskedByuser.get(0).getText());
		    //Assert.assertTrue(QuestionAskedByuser.get(0).getText().equalsIgnoreCase(usernameOfaskedQuestion));
		   // System.out.println(usernameOfaskedQuestion);
		    BasePage.sleepForMilliSecond(2000);
		   driver.navigate().back();
		   popularQuestionTab.get(0).click();
		   BasePage.sleepForMilliSecond(2000);
		   latestQuestionList.get(0).click();
		   BasePage.scrollDown(ViewfullAnswerLink, driver);
		   ViewfullAnswerLink.click();
		   BasePage.sleepForMilliSecond(2000);
		   
	}
	public void createAccountOnMobile(WebDriver driver){
		nameTextBox.click();
		String name = ExcelUtils.readData("TestData", 0, 1);
		nameTextBox.sendKeys(name);
		BasePage.sleepForMilliSecond(2000);
		emailTextbook.click();
		String email = ExcelUtils.readData("TestData", 0, 2);
		email = email +BasePage.randomString() + "@applect.com";
		emailTextbook.sendKeys(email);
		BasePage.sleepForMilliSecond(2000);
		pwdtxtbx.click();
		String password = ExcelUtils.readData("TestData", 0, 3);
		pwdtxtbx.sendKeys(password);
		mobileNumberForSignup.click();
		String mobileNumber = ExcelUtils.readData("TestData", 0, 5);
		mobileNumberForSignup.sendKeys(mobileNumber);
		BasePage.sleepForMilliSecond(2000);
		BasePage.selectDrpdwnByVisibleText(courseName, "CBSE");
		BasePage.sleepForMilliSecond(2000);
		enterPincode.click();
		String pincode = ExcelUtils.readData("TestData", 0, 4);
		BasePage.selectDrpdwnByVisibleText(EnterClass, "X");
		enterPincode.sendKeys(pincode);
		BasePage.sleepForMilliSecond(2000);
		chooseOptionStudent.click();
		registerButton.click();
		BasePage.sleepForMilliSecond(8000);
		String dbUrl = GetPropertyValues.getPropertyValue("dbUrl");
		String dbusername = GetPropertyValues.getPropertyValue("dbusername");
		String dbpassword = GetPropertyValues.getPropertyValue("dbpassword");
		try {
			String otp = ConnectDatabase.connectToDatabase(dbUrl, dbusername, dbpassword);
			WaitStatementLib.explicitWaitForVisiblity(driver, 15, frame);
			try{
			driver.switchTo().frame(frame);
			BasePage.sleepForMilliSecond(1000);
			closeOrangePopup.click();
			BasePage.sleepForMilliSecond(1000);
			driver.switchTo().defaultContent();
			}
			catch(ElementNotVisibleException ex){
			}
			/*catch(TimeoutException ex){
			driver.switchTo().defaultContent();
			}*/
			enterOtpField.sendKeys(otp);
			verifyOtp.click();
			MobileLoginPage loginPage = new MobileLoginPage(driver);
			loginPage.enterSchool(driver);
			BasePage.sleepForMilliSecond(1000);
			//loginPage.logout(driver);
			//allowForSchoollocation.click();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	} 

}

