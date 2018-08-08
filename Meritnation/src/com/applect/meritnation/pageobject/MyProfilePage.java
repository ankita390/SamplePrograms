package com.applect.meritnation.pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.sql.SQLException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.applect.meritnation.generic.ExcelUtils;



public class MyProfilePage {

	@FindBy(xpath="//div[@class = 'navBox']/nav/ul/li[@id='user_menu']/a")
	private WebElement Medropdown;
	@FindBy(xpath="//ul[@class = 'navBox_bottom']/li[@id= 'user_menu']/ul[@class = 'sublist']/li/a[@href = '/mywall/index']")
	private WebElement myprofiledropdown;
	@FindBy(xpath= "//a[@id='viewAllFriends']")
	private WebElement ViewAllFriends;
	@FindBy(xpath= "//div[@id='myBadges']/header/a[@class='float-r']")
	private WebElement ViewAllBadges;
	@FindBy(xpath= "//a[@class='popupClose']")
	private WebElement CloseFriendsPopup;
	@FindBy(xpath= "//a[@class='moreBadges']")
	private WebElement verifyMoreBadges;
	@FindBy(xpath= "//a[@class='popupClose']")
	private WebElement CloseBadgesPopup;
	@FindBy(xpath= "//div[@id = 'myPoints']/header/a[@class='float-r standing']")
	private WebElement MeritpointStanding;
	@FindBy(xpath= "//div[@id='Newnav_Badges_achive']/div/div/div/h3")
	private WebElement leaderBoardTitle;
	@FindBy(xpath= "//a[@class='popupClose']")
	private WebElement closeMeritStandingPopup;
	@FindBy(xpath="//div[@class='formRight']/div/input[@id ='UserUsername']")
	private WebElement selectUserName;
	@FindBy(xpath="//div[@id='accountDeatil']/form/fieldset/div[@class='formRight']/div[@class='row']/input")
	private WebElement saveButton;
	@FindBy(xpath="//input[@id='UserAlternateEmail']")
	private WebElement alternateEmail;
	@FindBy(xpath="//select[@id='CurriculumId']")
	private WebElement board;
	@FindBy(xpath="//div/a[@class='grayButtons editprofilebtn edProf']")
	private WebElement editProfile;
	@FindBy(xpath="//li[@class='persnolDtl']")
	private WebElement personalDetail;
	@FindBy(xpath="//div[@class='formRight']/div[@class='row mBottom15']/input[@title='Name']")
	private WebElement nameOftheUser;
	@FindBy(xpath="//ul/li[@class='schoolDtl']")
	private WebElement schoolDetails;
	@FindBy(xpath="//div/div/div/div/ul/li[@class='parentsDtl']")
	private WebElement parentDetails;
	@FindBy(xpath="//ul[@class='profileSettingPaging']/li[@class='academicDtl']")
	private WebElement acedemicdetails;
	@FindBy(xpath="//div/input[@class='greenInputBtn float-r slideLastEle']")
	private WebElement saveOnAcedemicDetails;
	@FindBy(xpath="//div/a[@class='popupClose']")
	private WebElement closePopup;
	@FindBy(xpath="//div/figure[@id='uploadPic']/a[@id='linkChangeImageBanner']")
	private WebElement changePhotolink;
	@FindBy(xpath="//div[@class='fgrSection']/figure/a[text()='Change Photo']")
	private WebElement changePhototext;
	//xpath change picture with text
	@FindBy(xpath="//div[@class='leftBlock']/ul/li/a[@rel='chooseAvtar']")
	private WebElement chooseAvtar;
	@FindBy(xpath="//div[@id='chooseAvtar']/div/ul/li/a")
	private List <WebElement> chooseAvtarFromList;
	@FindBy(xpath="//div[@class='step2']/div[@class='buttonBlock']/a[text()='Submit']")
	private WebElement submitOnAvatarSelection;
	@FindBy(xpath="//div[@class='usr_mode']/strong[text()='Free']")
	private WebElement freeUserDetails;
	@FindBy(xpath="//div[@class='membershipType']/span/a[@title='Upgrade']")
	private WebElement upgradeButton;
	@FindBy(xpath="//div[@class='membershipType']/span/span/a[text()='Subscription Details']")
	private WebElement subscriptionDetailsButton;
	
	
	
	
	
	public MyProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickMeMenu() {
		BasePage.sleepForMilliSecond(2000);
		Medropdown.click();
		BasePage.sleepForMilliSecond(2000);
	}
	public void clickMyprofile(){
		myprofiledropdown.click();
	    BasePage.sleepForMilliSecond(2000);
	}

	public void clickViewAllFriends() {
		 
		boolean element = BasePage.isPresentAndDisplayed(ViewAllFriends);
		String str = String.valueOf(element);
		
		if(str!="false"){
			ViewAllFriends.click();
			BasePage.sleepForMilliSecond(3000);
			CloseFriendsPopup.click();
			 BasePage.sleepForMilliSecond(3000);
		}
 
	}
	
	public void clickAllBadges(){
		try {
			ViewAllBadges.click();
			BasePage.sleepForMilliSecond(3000);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(verifyMoreBadges));
			CloseBadgesPopup.click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		BasePage.sleepForMilliSecond(3000);
	}	


	public void clickStanding(){
		
		
		MeritpointStanding.click();
			BasePage.sleepForMilliSecond(3000);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(leaderBoardTitle));
			BasePage.sleepForMilliSecond(3000);
			closeMeritStandingPopup.click();		
			BasePage.sleepForMilliSecond(3000);
		
	}
	
	public void editProfile(){
		editProfile.click();
		BasePage.sleepForMilliSecond(3000);
		//System.out.println(selectUserName.getText());
		
		if(selectUserName.isEnabled()){
			//System.out.println(selectUserName.getText());
			//BasePage.isPresentAndDisplayed(selectUserName);
			selectUserName.sendKeys(ExcelUtils.readData("TestData", 40, 1)+ BasePage.randomString()+"test");
			saveButton.click();
		}
			Assert.assertTrue(BasePage.isPresentAndDisplayed(alternateEmail));
			BasePage.sleepForMilliSecond(3000);
			personalDetail.click();
			BasePage.sleepForMilliSecond(1000);
			schoolDetails.click();
			BasePage.sleepForMilliSecond(1000);
			parentDetails.click();
			BasePage.sleepForMilliSecond(1000);
			acedemicdetails.click();
			BasePage.sleepForMilliSecond(1000);
			//Assert.assertTrue(nameOftheUser.getText().toString().length()>0);
			saveOnAcedemicDetails.click();
			BasePage.sleepForMilliSecond(2000);
			closePopup.click();
			BasePage.sleepForMilliSecond(3000);
			}
	public void changeProfilePic(){
      
		if(BasePage.isPresentAndDisplayed(changePhototext)){
			changePhotolink.click();
			BasePage.sleepForMilliSecond(2000);
			chooseAvtar.click();
			BasePage.sleepForMilliSecond(2000);
			chooseAvtarFromList.get(0).click();
			BasePage.sleepForMilliSecond(3000);
			submitOnAvatarSelection.click();
			BasePage.sleepForMilliSecond(2000);
			
		}else{
			changePhotolink.click();
			BasePage.sleepForMilliSecond(2000);
			chooseAvtar.click();
			BasePage.sleepForMilliSecond(3000);
			chooseAvtarFromList.get(1).click();
			BasePage.sleepForMilliSecond(3000);
			submitOnAvatarSelection.click();
			BasePage.sleepForMilliSecond(3000);
		}
		
		
		
	}
	
	public void viewSubscriptionDetails (WebDriver driver){
		CreateAccountPage createAcccountPage = new CreateAccountPage(driver);
		createAcccountPage.clickProfileIcon(driver);
		if(BasePage.isPresentAndDisplayed(freeUserDetails)){
			
			Assert.assertTrue(BasePage.isPresentAndDisplayed(upgradeButton));
			upgradeButton.click();
		}else{
			Assert.assertTrue(BasePage.isPresentAndDisplayed(subscriptionDetailsButton));
			subscriptionDetailsButton.click();
		}
	}
		}
	
	/*public void verifyMobileNumber() throws ClassNotFoundException, SQLException{
		
		BasePage.TestDb();
	}*/
	

