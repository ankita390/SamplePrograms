package com.applect.meritnation.pageobject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.applect.meritnation.generic.ExcelUtils;
import com.applect.meritnation.generic.WaitStatementLib;

public class LoginPage {
	WebDriver driver;
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement loginbtn;
	@FindBy(xpath="//*[contains(@class,'popupForm')]//*[text()='Name']/preceding-sibling::input") 
	public WebElement nametxtbx;
	@FindBy(xpath="//input[@id='username_login_1']")
	private WebElement untxtbx;
	@FindBy(xpath="//input[@id='password_login_1']")
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
	@FindBy(xpath="//div[@class='headerSearchBox']/div/div/div/form")
	private WebElement searchbx;
	@FindBy(xpath="//div[@class='tablerow']")
	private WebElement boardpprnotification;
	@FindBy(xpath="//div[@class='tablerow']/div[3]/i")
	private WebElement closeboardpprnotification;
	@FindBy(xpath = "//div[@id='webengage-notification-container']/iframe")
	private WebElement frame;
	@FindBy(xpath = "//div[contains(@id,'connecto-modal')]/iframe")
	private WebElement connectoFrame;
	@FindBy(xpath = "//div[@class='icon close']")
	private WebElement closeFrame;
	
	@FindBy(xpath="//div[@class='profilcePic']/div/img")
	private WebElement profileicon;
	@FindBy(xpath = "//div[@id='connecto-widget-container']/iframe")
	private WebElement JeeTestSeriesframe;
	@FindBy(xpath = "//div[contains(@class,'connecto')]/div/div[@class='close']")
	private WebElement closeJeeTestSeriesframe;
	@FindBy(xpath = "//iframe[contains(@id,'container-notification-frame')]")
	private List<WebElement> newframe;
	@FindBy(xpath = "//div[@class='wrapper']/div[1]")
	private WebElement closenewframe;
	@FindBy(xpath = "//li[@id = 'samplePaper']")
	private WebElement samplePaper_NeetCatalystUser;
	@FindBy(xpath = "//li[@id = 'solvedPaper']")
	private WebElement prvsYrPaper_NeetCatalystUser;
	@FindBy(xpath = "//li[@id = 'aits']")
	private WebElement testSession_NeetCatalystUser;
	@FindBy(xpath = "//ul[@id='testTypeFilter']/li[text()='AIPMT']")
	private WebElement testSessionValueOne_NeetCatalystUser;
	@FindBy(xpath = "//ul[@id='testTypeFilter']/li[text()='AIIMS']")
	private WebElement testSessionValueTwo_NeetCatalystUser;
	@FindBy(xpath = "//ul[@id='testTypeFilter']/li[text()='NEET']")
	private WebElement testSessionValueThree_NeetCatalystUser;
	@FindBy(xpath = "//div[@class='boxesRow group']/div")
	private List <WebElement> totalTestSessions_NeetCatalystUser;
	@FindBy(xpath = "//div[@class='boxesRow group']/div/div[2]/div[2]/a")
	private List <WebElement> viewDetailsBtnOnTestSessions_NeetCatalystUser;
	@FindBy(xpath = "//div[@class='jsession-card-wrap']/div")
	private List <WebElement> itemsOnTestSessions_NeetCatalystUser;
	@FindBy(xpath = "//div[@class='jsession-card-wrap']/div/div/div[2]/div/button[2]")
	private WebElement viewDetailBtnOnTestSession_NeetCatalystUser;
	@FindBy(xpath = "//div[@class='overlay-window']/div[1]")
	private WebElement preNotesOnTestSession_NeetCatalystUser;
	@FindBy(xpath = "//div[@class='overlay']/button/i")
	private WebElement closePreNotesOnTestSession_NeetCatalystUser;
	@FindBy(xpath = "//div[@class='jsession-card-wrap']/div[2]/div/div/div[2]/span[3]/a[text()='View report']")
	private WebElement viewReportBtnOnTestSession_NeetCatalystUser;
	@FindBy(xpath = "//div[@class='exit_game_button']/a")
	private WebElement goBakBtnOnTestSession_NeetCatalystUser;
	@FindBy(xpath = "//div[@class='text-center']/a")
	private WebElement viewSyllabusOnTestSession_NeetCatalystUser;
	@FindBy(xpath = "//div[@id='liveClass']/h3[text()='Sample Papers']")
	private WebElement samplePapermain_NeetCatalystUser;
	@FindBy(xpath = "//ul[@id='subjectFilter']/li[text()='AIPMT']")
	private WebElement samplePapermainvalueone_NeetCatalystUser;
	@FindBy(xpath = "//ul[@id='subjectFilter']/li[text()='AIIMS']")
	private WebElement samplePapermainvalueTwo_NeetCatalystUser;
	@FindBy(xpath = "//div[@class='testPaperSection']/ul/li")
	private List <WebElement> samplePprLst_NeetCatalystUser;
	@FindBy(xpath = "//div[@class='testPaperSection']/ul/li/a[@href]")
	private List <WebElement> allBtnssamplePprLst_NeetCatalystUser;
	@FindBy(xpath = "//div[@id='liveClass']/h3[contains(text(),'Previous')]")
	private WebElement previousYrQuestion_NeetCatalystUser;
	@FindBy(xpath = "//ul[@id='testTypeFilter']/li[text()='JEE-Advanced']")
	private WebElement testSessionValueOne_IITPowerPrepUser;
	@FindBy(xpath = "//ul[@id='testTypeFilter']/li[text()='JEE-Mains']")
	private WebElement testSessionValueTwo_IITPowerPrepUser;
	@FindBy(xpath = "//ul[@id='subjectFilter']/li[text()='JEE-Advanced']")
	private WebElement samplePaperMainValueOne_IITPowerPrepUser;
	@FindBy(xpath = "//ul[@id='subjectFilter']/li[text()='JEE-Mains']")
	private WebElement samplePaperMainValueTwo_IITPowerPrepUser;
	@FindBy(xpath = "//ul[@id='subjectFilter']/li[text()='AIEEE']")
	private WebElement prvsYrQValueOne_IITPowerPrepUser;
	@FindBy(xpath = "//ul[@id='subjectFilter']/li[text()='JEE-Advanced']")
	private WebElement prvsYrQValueTwo_IITPowerPrepUser;
	@FindBy(xpath = "//ul[@id='subjectFilter']/li[text()='JEE-Mains']")
	private WebElement prvsYrQValueThree_IITPowerPrepUser;
	@FindBy(xpath="//a[@href='/cbse-class-10/12']")
	private WebElement classTenLnk;
	@FindBy(xpath="//li[@id='ana_menu_logout']/a/i")
	private WebElement anaDrpdn;
	@FindBy(xpath="//*[@id='ana_menu_logout']/ul/li[1]/a")
	private WebElement latestQueLnk;
	@FindBy(xpath="//a[contains(@class,'social-btn')]/span[2]")
	private List<WebElement> ansCount;
	@FindBy(xpath="//a[@class='view-full-answer']")
	private WebElement fullAnsLnk;
	@FindBy(xpath="//li[@class='gradient-1']")
	private WebElement subjlnk;
	@FindBy(xpath="//div[@id='test']")
	private WebElement testlnk;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div[6]/div[2]/div/ul/li[3]/a")
	private WebElement brdsollnk;
	@FindBy(xpath="//div[@class='testPaperSection']/ul/li[1]")
	private WebElement viewsollnk;
	@FindBy(xpath="//ul[@id='ques_1']/li/div/a")
	private WebElement viewsolbtn;
	@FindBy(xpath="//div[@class='navBox_top']/a")
	private WebElement demolnk;
	@FindBy(xpath="//button[@class='line-btn']")
	private WebElement checkoutbtn;
	@FindBy(xpath="//div[@class='payment-box']/div/div[2]/div/button[1]")
	private WebElement signupbtn;
	@FindBy(xpath="//ul[@class='newChapterList']/li[2]/div/div[2]/div/a")
	private WebElement scndchaplnk;
	@FindBy(xpath="//a[@class='create_new']")
	private WebElement newaccount;
	@FindBy(xpath="//a[@class='psa_bg']")
	private WebElement ncrtsollnk;
	@FindBy(xpath="//a[@id='sign-in']")
	private WebElement createbtn;
	@FindBy(xpath="//input[@id='username_authReg']")
	private WebElement nametxt;
	@FindBy(xpath="//input[@id='userEmail_authReg']")
	private WebElement emailtxt;
	@FindBy(xpath="//input[@id='userPassword_authReg']")
	private WebElement passtxt;
	@FindBy(xpath="//input[@id='userPincode_authReg']")
	private WebElement pintxt;
	@FindBy(xpath="//select[@id='userCurriculum_authReg']")
	private WebElement brddrpdwn;
	@FindBy(xpath="//select[@id='userGrade_authReg']")
	private WebElement classselect;
	@FindBy(xpath="//div[@class='userType1']/label[1]")
	private WebElement usertype;
	@FindBy(xpath="//button[@id='subBtn_0']")
	private WebElement joinfree;
	@FindBy(xpath="//a[@class='bps_bg']")
	private WebElement entranceexam;
	@FindBy(xpath="//li[@class='signUp-link mnRegistrationPopup']/a")
	private WebElement signup;
	@FindBy(xpath="//a[@href='/live-new']")
	private WebElement livenew;
	@FindBy(xpath="//a[@class='signinBtn']")
	private WebElement signfree;
	@FindBy(xpath="//a[@href='/live']")
	private WebElement livesign;
	@FindBy(xpath="//a[@id='createAccount1']")
	private WebElement createacc;
	@FindBy(xpath="//a[@href='/junior/grade-5']")
	private WebElement gradefive;
	@FindBy(xpath="//div[@class='header_btns']/a[2]")
	private WebElement junacc;
	@FindBy(xpath="//div[@class='register_form']/div[1]/form/div[1]/input")
	private WebElement stuid;
	@FindBy(xpath="//div[@class='register_form']/div[1]/form/div[2]/input[1]")
	private WebElement juniemail;
	@FindBy(xpath="//div[@class='register_form']/div[1]/form/div[3]/input")
	private WebElement junipass;
	@FindBy(xpath="//div[@class='register_form']/div[1]/form/div[4]/input")
	private WebElement junimobno;
	@FindBy(xpath="//select[@id='curboard_popup']")
	private WebElement joniboarddrpdwn;
	@FindBy(xpath="//select[@id='regGradeId_popup']")
	private WebElement joniclassdrpdwn;
	@FindBy(xpath="//div[@class='register_form']/div[1]/form/div[6]/input")
	private WebElement junipin;
	@FindBy(xpath="//div[@class='register_form']/div[1]/form/div[7]/div/input")
	private WebElement junifree;
	@FindBy(xpath="//span[@class='editBtn']")
	private WebElement juniedcon;
	@FindBy(xpath="//div[@id='UserSchoolCountry']/div[1]")
	private WebElement juniselcon;
	@FindBy(xpath="//div[@id='UserSchoolCountry']/div[2]/div/div")
	private WebElement juniconsel;
	@FindBy(xpath="//div[@class='bs-col-md-4']/div/div/div/span")
	private List <WebElement> selectlocation;
	@FindBy(xpath="//div[contains(@class,'ui-select-choices')]/span")
	private WebElement junicitysel;
	@FindBy(xpath="//div[@class='bs-col-md-12 text-center']/div/div/div/span[@class = 'ng-binding ng-scope']")
	private WebElement junischname;
	@FindBy(xpath="//div[@class='ui-select-choices-content selectize-dropdown-content']/div/div[@role='option']/div/div/div/div/div[@title='a221, okhla phase - 1']")
	private WebElement schoolselclick;
	@FindBy(xpath="//*[contains(@class,'popupForm')]//*[text()='Name']/preceding-sibling::input")
	private WebElement chapuid;
	@FindBy(xpath="//input[@id='UserEmailHeaderRegPopup']")
	private WebElement chapemail;
	@FindBy(xpath="//input[@id='UserPassword']")
	private WebElement chapuidpass;
	@FindBy(xpath="//select[@id='selectboard-popup']")
	private WebElement chapregboard;
	@FindBy(xpath="//select[@id='classNpopup']")
	private WebElement chapregclass;
	@FindBy(xpath="//input[@id='UserDetailMobile']")
	private WebElement chapregmob;
	@FindBy(xpath="//input[@id='pincode']")
	private WebElement chappincode;
	@FindBy(xpath="//div[@class='radio-btns']/label[1]/input")
	private WebElement chapusersel;
	@FindBy(xpath="//div[@class='row row1']/button[2]")
	private WebElement chapjoinfree;
	@FindBy(id="textbook_solution")
	private WebElement txtbooklnk;
	@FindBy(xpath="//ul[@class=\"newChapterList\"]/li[1]/a")
	private WebElement fsttxtbooklnk;
	@FindBy(xpath="//span[@class='userimg']/img")
	private WebElement userimg;
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement testlogout;
	private WebElement profileImage;
	@FindBy(xpath ="//div[@class='usr_grade']/i")
	private WebElement editGradeFromProfileIcon;
	@FindBy(xpath ="//div[@id='currIdDropDown']")
	private WebElement clickOnCurrentBoard;
	@FindBy(xpath ="//*[@id='currList']/li")
	private List<WebElement> allBoardListFromProlieIcon;
	@FindBy(xpath ="//span[@id ='gradeSelected']")
	private WebElement grade;
	@FindBy(xpath ="//*[@id ='gradeList']/li")
	   
	private List<WebElement> allgradelist;
	@FindBy(xpath = "//div[@class='gradeEditBox']/div/div/a/i")
	private WebElement SubmitBtnOfGradeChange;
	@FindBy(xpath = "//span[text()= '011-40705070']")
	private WebElement phoneNoOnDashboard;
	@FindBy(xpath = "//span[text()=' or']")
	private WebElement or;
	@FindBy(xpath = "//button[text()= 'Call me']")
	private WebElement Call_me;
	@FindBy(xpath = "//div[@id='callMeBox']/div/div/div")
	private WebElement call_me_popUp;
	@FindBy(xpath="//span[@class='close-btn btn-modal-close']")
	private WebElement cancelIconOfCall_me_popUp;
	@FindBy(xpath ="//a[text()='PURCHASE']")
	private WebElement PurchaseButton;
	@FindBy(xpath ="//a[text()='PURCHASE']/@href")
	private WebElement PurchaseButtonLink;
	@FindBy(xpath="//a[@class='logo']")
	private WebElement logo1;

	
	
	

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void closeBoardPaperSolutionpopup(){
		
		if(String.valueOf(BasePage.isPresentAndDisplayed(topnotification))=="true"){
			closenotification.click();
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, profileicon);
		}
		BasePage.closeJEETestSeriesPopup(driver, JeeTestSeriesframe,closeJeeTestSeriesframe);

		
		if(String.valueOf(BasePage.isPresentAndDisplayed(frame))=="true"){
			WaitStatementLib.explicitWaitForVisiblity(driver, 15, frame);
			
			try{
			driver.switchTo().frame(frame);
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, closeboardpprnotification);
			closeboardpprnotification.click();
			BasePage.sleepForMilliSecond(1000);
			driver.switchTo().defaultContent();
			}
			catch(ElementNotVisibleException ex){
				
			}
			catch(TimeoutException ex){
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
	public void createAccount(){
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		createAccountPage.enterName();
		createAccountPage.enterEmail();
		createAccountPage.enterPassword();
		createAccountPage.enterPincode();
		createAccountPage.enterMobile();
		createAccountPage.enterUserCourse();
		createAccountPage.enterUserClass();
		createAccountPage.selectUserAsStudent();
		createAccountPage.joinNow(driver);
		createAccountPage.enterSchoolName(driver);
		BasePage.logout(driver);
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
	public void enterUserName(WebDriver driver, int i, int j)
	{
		try{
			String username = ExcelUtils.readData("TestData", i, j);
			if(username!=""){
				untxtbx.sendKeys(username);
			}
			WaitStatementLib.implicitWaitForSecond(driver, 2);
		}
		catch (NullPointerException ex){
			
		}
		
		
		
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
	public void signInBtnClick(WebDriver driver)
	{
			signInBtn.click();
			BasePage.sleepForMilliSecond(2000);
	//	This code needs to uncommented when any webengange notification starts coming.
			
		
			if(String.valueOf(BasePage.isPresentAndDisplayed(topnotification))=="true"){
				closenotification.click();
				WaitStatementLib.explicitWaitForVisiblity(driver, 5, profileicon);
			}
			BasePage.closeJEETestSeriesPopup(driver, JeeTestSeriesframe,closeJeeTestSeriesframe);

			if(String.valueOf(BasePage.isPresentAndDisplayed(frame))=="true"){
				WaitStatementLib.explicitWaitForVisiblity(driver, 15, frame);
				try{
				driver.switchTo().frame(frame);
				WaitStatementLib.explicitWaitForVisiblity(driver, 5, closeboardpprnotification);
				closeboardpprnotification.click();
				BasePage.sleepForMilliSecond(1000);
				driver.switchTo().defaultContent();
				}
				catch(ElementNotVisibleException ex){
					
				}
				catch(TimeoutException ex){
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
	
	public void loginUserForchangeGradeFromProfile (WebDriver driver)
	{
	String username = ExcelUtils.readData("TestData", 1, 3);	
	untxtbx.sendKeys(username);
	WaitStatementLib.implicitWaitForSecond(driver, 2);	
	}

	public void clickOnProfileFromDashboardHeader (WebDriver driver)
	{
	BasePage.sleepForMilliSecond(2000);	
	profileicon.click();
	}

	public void changeGradeFromProfile (WebDriver driver)
	{
	editGradeFromProfileIcon.click();
	clickOnCurrentBoard.click();
	WaitStatementLib.explicitWaitForClickable(driver, 3, allBoardListFromProlieIcon.get(1));
	allBoardListFromProlieIcon.get(1).click();
	grade.click();
	allgradelist.get(12).click();
	SubmitBtnOfGradeChange.click();
	WaitStatementLib.implicitWaitForMinute(driver, 2);

	}

	public void againChangeGradeFromProfile (WebDriver driver)
	{
	editGradeFromProfileIcon.click();
	clickOnCurrentBoard.click();
	WaitStatementLib.explicitWaitForClickable(driver, 3, allBoardListFromProlieIcon.get(1));
	allBoardListFromProlieIcon.get(1).click();
	grade.click();
	allgradelist.get(6).click();
	SubmitBtnOfGradeChange.click();
	WaitStatementLib.implicitWaitForMinute(driver, 2);
	}

	public void verifyHeaderTest (WebDriver driver)
	{
	phoneNoOnDashboard.isDisplayed();
	or.isDisplayed();
	Call_me.isEnabled();
	Call_me.click();
	call_me_popUp.isDisplayed();
	WaitStatementLib.explicitWaitForClickable(driver, 1000, cancelIconOfCall_me_popUp);
	cancelIconOfCall_me_popUp.click();
    BasePage.isPresentAndDisplayed(PurchaseButton);
	BasePage.sleepForMilliSecond(2000);
	PurchaseButton.click();
	WaitStatementLib.implicitWaitForMinute(driver, 2);
	String displayedURL = driver.getCurrentUrl();
	String actualPurchaseURL = ExcelUtils.readData("Sheet2", 0, 1);
	Assert.assertTrue(displayedURL.equals(actualPurchaseURL),"Incorrect URL");
	Assert.assertTrue(BasePage.isPresentAndDisplayed(logo1), "Logo Not Displayed");
	logo1.click();


	}

			
		
		
	
	public void checkOnlyHeader(WebDriver driver){
		Assert.assertTrue((String.valueOf(BasePage.isPresentAndDisplayed(header))!= "false"),"Header not ddisplayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(logo), "Logo Not Displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(phoneno), "Phone number not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(ortxt), "OR text not displayed on header");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(callmebtn),"Call me button not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(upgradebtn), "Upgrade button not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(coursemenu), "Course menu not displayed");
		coursemenu.click();
		BasePage.sleepForMilliSecond(1000);
		BasePage.verifyCourseMenuContent(coursecontent);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(studymenu),"Study Menu not displayed");
		BasePage.moveToElementAndStay(driver, studymenu);
		BasePage.sleepForMilliSecond(1000);
		BasePage.verifyStudyMenuContent(studycontent);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(anamenu), "ana menu not displayed");
		anamenu.click();
		BasePage.sleepForMilliSecond(1000);
		BasePage.verifyAnaMenuContent(anacontent);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(feed), "feed not displayed");
		BasePage.sleepForMilliSecond(1000);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(memenu),"Me menu not displayed");
		memenu.click();
		BasePage.sleepForMilliSecond(1000);
		BasePage.verifyMeMenuContent(mecontent);
		//Assert.assertTrue(BasePage.isPresentAndDisplayed(searchbx));
		Assert.assertTrue(BasePage.isPresentAndDisplayed(fullname),"Full Name not displayed");;
		Assert.assertTrue(fullname.getText().toString().length()!=0);
	}
	
	public void checkHeaderDisplay(WebDriver driver)
	{
			Assert.assertTrue((String.valueOf(BasePage.isPresentAndDisplayed(header))!= "false"),"Header not ddisplayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(logo), "Logo Not Displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(phoneno), "Phone number not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(ortxt), "OR text not displayed on header");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(callmebtn),"Call me button not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(upgradebtn), "Upgrade button not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(coursemenu), "Course menu not displayed");
			coursemenu.click();
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyCourseMenuContent(coursecontent);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(studymenu),"Study Menu not displayed");
			BasePage.moveToElementAndStay(driver, studymenu);
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyStudyMenuContent(studycontent);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(anamenu), "ana menu not displayed");
			anamenu.click();
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyAnaMenuContent(anacontent);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(feed), "feed ot displayed");
			BasePage.sleepForMilliSecond(1000);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(memenu),"Me menu not displayed");
			memenu.click();
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyMeMenuContent(mecontent);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(searchbx));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(fullname),"Full Name not displayed");;
			Assert.assertTrue(fullname.getText().toString().length()!=0);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(rightbanner),"Right side banner on dashboard not displayed");
		//	Assert.assertTrue(BasePage.isPresentAndDisplayed(rightbannercontent.get(0)),"Right side banner content not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(rightbannercontent.get(1)),"Right side banner content not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(statlist),"Stat List not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(viewallbtn), "View All button not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(points),"Points not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(rank),"Rank not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(blogconntent),"Blog contet not displayed");
		/*	Assert.assertTrue(blogconntent.getText().toString().length() !=0);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(subjectsection),"Subject section on dashboard not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(sessionssection),"Session section on dashboard not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(videosection),"Video section on dashboard not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(assignmentsection),"Assignmentt section on Dashboard not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(topquestion),"Top Question on Dashboard not displayed");
			Assert.assertTrue(topquestion.getText().toString().length()!=0);*/
	}
	public void checkHeaderDisplayForAllClasses(WebDriver driver, int k)
	{
		Assert.assertTrue((String.valueOf(BasePage.isPresentAndDisplayed(header))!= "false"),"Header not ddisplayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(logo), "Logo Not Displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(phoneno), "Phone number not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(ortxt), "OR text not displayed on header");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(callmebtn),"Call me button not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(upgradebtn), "Upgrade button not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(coursemenu), "Course menu not displayed");
			coursemenu.click();
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyCourseMenuContentforAllClasses(coursecontent, k);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(studymenu),"Study Menu not displayed");
			BasePage.moveToElementAndStay(driver, studymenu);
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyStudyMenuContentForAllClasses(studycontent, k);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(anamenu),"Ana Menu not displayed");
			anamenu.click();
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyAnaMenuContent(anacontent);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(feed),"Feed not displayed");
			BasePage.sleepForMilliSecond(1000);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(memenu),"Me Menu not displayed");;
			memenu.click();
			BasePage.sleepForMilliSecond(1000);
			BasePage.verifyMeMenuContent(mecontent);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(searchbx));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(fullname),"Full Name not displayed");
			Assert.assertTrue(fullname.getText().toString().length()!=0);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(rightbanner),"Right side banner on dashboard not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(rightbannercontent.get(0)),"Right side banner content not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(rightbannercontent.get(1)),"Right side banner content not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(statlist),"Stat List not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(viewallbtn), "View All button not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(points),"Points not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(rank),"Rank not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(blogconntent),"Blog contet not displayed");
			BasePage.sleepForMilliSecond(1000);
			/*Assert.assertTrue(blogconntent.getText().toString().length() !=0);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(subjectsection),"Subject section on dashboard not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(sessionssection),"Session section on dashboard not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(videosection),"Video section on dashboard not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(assignmentsection),"Assignmentt section on Dashboard not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(topquestion),"Top Question on Dashboard not displayed");
			Assert.assertTrue(topquestion.getText().toString().length()!=0);*/
	}
	public void checkHeaderDisplayForAllClassesSpecificUsers(WebDriver driver, int k)
	{
		Assert.assertTrue((String.valueOf(BasePage.isPresentAndDisplayed(header))!= "false"),"Header not ddisplayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(logo), "Logo Not Displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(phoneno), "Phone number not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(ortxt), "OR text not displayed on header");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(callmebtn),"Call me button not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(upgradebtn), "Upgrade button not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(coursemenu), "Course menu not displayed");
		coursemenu.click();
		BasePage.sleepForMilliSecond(1000);
		BasePage.verifyCourseMenuContentforAllClassesSPecificUsers(selectedcoursetext,coursecontent, k);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(studymenu),"Study Menu not displayed");
		BasePage.moveToElementAndStay(driver, studymenu);
		BasePage.sleepForMilliSecond(1000);
		BasePage.verifyStudyMenuContentForAllClasses(studycontent, k);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(anamenu),"Ana Menu not displayed");
		anamenu.click();
		BasePage.sleepForMilliSecond(1000);
		BasePage.verifyAnaMenuContent(anacontent);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(feed),"Feed not displayed");
		BasePage.sleepForMilliSecond(1000);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(memenu),"Me Menu not displayed");;
		memenu.click();
		BasePage.sleepForMilliSecond(1000);
		BasePage.verifyMeMenuContent(mecontent);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(fullname), "Full Name not displayed");;
		Assert.assertTrue(fullname.getText().toString().length()!=0);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(rightbanner),"Right side banner on dashboard not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(rightbannercontent.get(0)),"Right side banner content not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(rightbannercontent.get(1)),"Right side banner content not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(statlist),"Stat List not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(viewallbtn), "View All button not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(points),"Points not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(rank),"Rank not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(blogconntent),"Blog contet not displayed");
		BasePage.sleepForMilliSecond(1000);
		/*	Assert.assertTrue(blogconntent.getText().toString().length() !=0);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(subjectsection),"Subject section on dashboard not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(sessionssection),"Session section on dashboard not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(videosection),"Video section on dashboard not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(assignmentsection),"Assignmentt section on Dashboard not displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(topquestion),"Top Question on Dashboard not displayed");
			Assert.assertTrue(topquestion.getText().toString().length()!=0);*/
		while (k==13){
			Assert.assertTrue(BasePage.isPresentAndDisplayed(samplePaper_NeetCatalystUser),"Sample paper for Neet Catalyst user doesn't displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(prvsYrPaper_NeetCatalystUser),"Previous Year paper for Neet Catalyst user doesn't displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(testSession_NeetCatalystUser), "Test Sessions for Neet Catalyst user doesn't displayed");
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, testSession_NeetCatalystUser);
			testSession_NeetCatalystUser.click();
			Assert.assertTrue(BasePage.isPresentAndDisplayed(testSessionValueOne_NeetCatalystUser), "Value AIPMT is not dislplayed for Neet Catalyst User");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(testSessionValueTwo_NeetCatalystUser), "Value AIIMS is not dislplayed for Neet Catalyst User");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(testSessionValueThree_NeetCatalystUser), "Value NEET	 is not dislplayed for Neet Catalyst User");
			Assert.assertFalse(totalTestSessions_NeetCatalystUser.isEmpty(), "No Test Sessions displayed");
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, totalTestSessions_NeetCatalystUser.get(0));
			viewDetailsBtnOnTestSessions_NeetCatalystUser.get(0).click();
			Assert.assertTrue(itemsOnTestSessions_NeetCatalystUser.size()==3,"All items are not displayed on Test Session window");
			WaitStatementLib.explicitWaitForClickable(driver, 5, viewDetailBtnOnTestSession_NeetCatalystUser);
			viewDetailBtnOnTestSession_NeetCatalystUser.click();
			Assert.assertTrue(BasePage.isPresentAndDisplayed(preNotesOnTestSession_NeetCatalystUser),"Prenotes on test session not displayed");
			Assert.assertTrue(preNotesOnTestSession_NeetCatalystUser.getText().length()>10,"Contents of Prenotes on test session not displayed");
			BasePage.sleepForMilliSecond(1000);
			closePreNotesOnTestSession_NeetCatalystUser.click();
			BasePage.sleepForMilliSecond(1000);	
			WaitStatementLib.explicitWaitForVisiblity(driver, 10, viewReportBtnOnTestSession_NeetCatalystUser);
			viewReportBtnOnTestSession_NeetCatalystUser.click();
			BasePage.sleepForMilliSecond(1000);		
			goBakBtnOnTestSession_NeetCatalystUser.click();
			Assert.assertTrue(BasePage.isPresentAndDisplayed(viewSyllabusOnTestSession_NeetCatalystUser),"view syllabus link not displayed");
			logo.click();
			testSession_NeetCatalystUser.click();
			samplePapermain_NeetCatalystUser.click();
			Assert.assertTrue(BasePage.isPresentAndDisplayed(samplePapermainvalueone_NeetCatalystUser),"Value AIPMT not displayed on sample paper");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(samplePapermainvalueTwo_NeetCatalystUser),"Value AIIMS not displayed on sample paper");
			WaitStatementLib.explicitWaitForVisiblity(driver, 10, samplePprLst_NeetCatalystUser.get(0));
			Assert.assertTrue(samplePprLst_NeetCatalystUser.size()>5, "All Sample papers not displayed");
			allBtnssamplePprLst_NeetCatalystUser.get(0).click();
			BasePage.sleepForMilliSecond(1000);		
			goBakBtnOnTestSession_NeetCatalystUser.click();
			Assert.assertTrue(BasePage.isPresentAndDisplayed(previousYrQuestion_NeetCatalystUser));
			previousYrQuestion_NeetCatalystUser.click();
			Assert.assertTrue(BasePage.isPresentAndDisplayed(samplePapermainvalueone_NeetCatalystUser),"Value AIPMT not displayed on Previous Year question paper");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(samplePapermainvalueTwo_NeetCatalystUser),"Value AIIMS not displayed on Previous Year question paper");
			WaitStatementLib.explicitWaitForVisiblity(driver, 10, samplePprLst_NeetCatalystUser.get(0));
			Assert.assertTrue(samplePprLst_NeetCatalystUser.size()>5, "All Sample papers not displayed");
			allBtnssamplePprLst_NeetCatalystUser.get(0).click();
			BasePage.sleepForMilliSecond(1000);		
			goBakBtnOnTestSession_NeetCatalystUser.click();
			break;
		}
		while(k==14){
			Assert.assertTrue(BasePage.isPresentAndDisplayed(samplePaper_NeetCatalystUser),"Sample paper for IIT Power Prep User doesn't displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(prvsYrPaper_NeetCatalystUser),"Previous Year paper for IIT Power Prep User doesn't displayed");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(testSession_NeetCatalystUser), "Test Sessions for IIT Power Prep User doesn't displayed");
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, testSession_NeetCatalystUser);
			testSession_NeetCatalystUser.click();
			Assert.assertTrue(BasePage.isPresentAndDisplayed(testSessionValueOne_IITPowerPrepUser), "Value JEE-Advance is not dislplayed for IIT Power Prep User");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(testSessionValueTwo_IITPowerPrepUser), "Value JEE-Mains is not dislplayed for IIT Power Prep User");
			Assert.assertFalse(totalTestSessions_NeetCatalystUser.isEmpty(), "No Test Sessions displayed");
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, totalTestSessions_NeetCatalystUser.get(0));
			viewDetailsBtnOnTestSessions_NeetCatalystUser.get(0).click();
			
			Assert.assertTrue(itemsOnTestSessions_NeetCatalystUser.size()==3,"All items are not displayed on Test Session window");
			WaitStatementLib.explicitWaitForClickable(driver, 5, viewDetailBtnOnTestSession_NeetCatalystUser);
			viewDetailBtnOnTestSession_NeetCatalystUser.click();
			Assert.assertTrue(BasePage.isPresentAndDisplayed(preNotesOnTestSession_NeetCatalystUser),"Prenotes on test session not displayed");
			Assert.assertTrue(preNotesOnTestSession_NeetCatalystUser.getText().length()>10,"Contents of Prenotes on test session not displayed");
			BasePage.sleepForMilliSecond(1000);
			closePreNotesOnTestSession_NeetCatalystUser.click();
			BasePage.sleepForMilliSecond(1000);	
			WaitStatementLib.explicitWaitForVisiblity(driver, 10, viewReportBtnOnTestSession_NeetCatalystUser);
			viewReportBtnOnTestSession_NeetCatalystUser.click();
			BasePage.sleepForMilliSecond(1000);		
			goBakBtnOnTestSession_NeetCatalystUser.click();
			Assert.assertTrue(BasePage.isPresentAndDisplayed(viewSyllabusOnTestSession_NeetCatalystUser),"view syllabus link not displayed");
			logo.click();
			testSession_NeetCatalystUser.click();
			samplePapermain_NeetCatalystUser.click();
			Assert.assertTrue(BasePage.isPresentAndDisplayed(samplePaperMainValueOne_IITPowerPrepUser),"Value JEE-Advance not displayed on sample paper");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(samplePaperMainValueTwo_IITPowerPrepUser),"Value JEE-Mains not displayed on sample paper");
			WaitStatementLib.explicitWaitForVisiblity(driver, 10, samplePprLst_NeetCatalystUser.get(0));
			Assert.assertTrue(samplePprLst_NeetCatalystUser.size()>5, "All Sample papers not displayed");
			allBtnssamplePprLst_NeetCatalystUser.get(0).click();
			BasePage.sleepForMilliSecond(1000);		
			goBakBtnOnTestSession_NeetCatalystUser.click();
			Assert.assertTrue(BasePage.isPresentAndDisplayed(previousYrQuestion_NeetCatalystUser));
			previousYrQuestion_NeetCatalystUser.click();
			Assert.assertTrue(BasePage.isPresentAndDisplayed(prvsYrQValueOne_IITPowerPrepUser),"Value AIEEE not displayed on Previous Year question paper");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(prvsYrQValueTwo_IITPowerPrepUser),"Value JEE-Advance not displayed on Previous Year question paper");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(prvsYrQValueThree_IITPowerPrepUser),"Value JEE-Mains not displayed on Previous Year question paper");
			WaitStatementLib.explicitWaitForVisiblity(driver, 10, samplePprLst_NeetCatalystUser.get(0));
			Assert.assertTrue(samplePprLst_NeetCatalystUser.size()>5, "All Sample papers not displayed");
			allBtnssamplePprLst_NeetCatalystUser.get(0).click();
			BasePage.sleepForMilliSecond(1000);		
			goBakBtnOnTestSession_NeetCatalystUser.click();
			break;
			
		}
			
	}
	
	
	public void proceedToNext(WebDriver driver){
		ArrayList<WebElement> str = new ArrayList<WebElement>();
		 classTenLnk.click();
		    anaDrpdn.click();
		    latestQueLnk.click(); 
		    for (int i=0;i <= ansCount.size();i++){
		    	if(!String.valueOf(ansCount.get(i).getText().toString()).equals("0")){  
		   		str.add(ansCount.get(i));
		   		str.get(0).click();
		   		break;
		    	}
		    	
		    	}
		    
		    	    Set <String> allWindow = driver.getWindowHandles();
		    Iterator<String> itr = allWindow.iterator();
		    List<String> myl = new ArrayList<String>();
		    for (int k =0;k<allWindow.size();k++)
		    {
		    myl.add(itr.next());
		    }
		    driver.switchTo().window(myl.get(1));
		    BasePage.sleepForMilliSecond(5000);
		     fullAnsLnk.click(); 
		    }
	public void BrdLogIN(){
		classTenLnk.click();
		subjlnk.click();
		testlnk.click();
		brdsollnk.click();
		viewsollnk.click();
		viewsolbtn.click();		
	}
	public void demologin() {
		classTenLnk.click();
		demolnk.click();
		checkoutbtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		signupbtn.click();	
	}
	public void chapterregistration(){
		classTenLnk.click();
		subjlnk.click();
		scndchaplnk.click();
		newaccount.click();
	}
	public void ncertregistration(){
		ncrtsollnk.click();
		createbtn.click();
		/*nametxt.sendKeys("werty");
		emailtxt.sendKeys("werty@mn.com");
		passtxt.sendKeys("123456");
		pintxt.sendKeys("110089");
		Select board = new Select(brddrpdwn);
		board.selectByValue("1");
		Select stn =new Select (classselect);
		stn.selectByValue("10");
		usertype.click();
		joinfree.click();*/
	}
	public void testprep(WebDriver driver){
		entranceexam.click();
		Set <String> allWindow = driver.getWindowHandles();
	    Iterator<String> itr = allWindow.iterator();
	    List<String> myl = new ArrayList<String>();
	    for (int k =0;k<allWindow.size();k++)
	    {
	    myl.add(itr.next());
	    }
	    driver.switchTo().window(myl.get(1));
		signup.click();
		}
	public void livenewreg(){
		livenew.click();
		signfree.click();
		
			}
	public void livereg(){
	livesign.click();
	createacc.click();
	}
	
	public void juniorregistration(WebDriver driver) throws Exception{
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		gradefive.click();
		junacc.click();
		WaitStatementLib.implicitWaitForSecond(driver, 5);
		createAccountPage.enterJuniorName();
		createAccountPage.enterjuniorEmail();
		createAccountPage.enterjuniorPassword();
		createAccountPage.enterjuniorPincode();
		createAccountPage.enterjuniorMobile();
		createAccountPage.enterjuniorUserCourse();
		createAccountPage.enterjuniorUserClass();
		createAccountPage.selectjuniorUserAsStudent();
		createAccountPage.juniorjoinNow(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		juniedcon.click();
		juniselcon.click();
		Actions act=new Actions(driver);
		act.moveToElement(juniselcon).click().sendKeys("Mauri").build().perform();
		juniconsel.click();	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions actcity=new Actions(driver);
		actcity.moveToElement(selectlocation.get(2)).click().sendKeys("port").build().perform();
		junicitysel.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(junischname);
		actions.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actions.sendKeys("Meriton");
		actions.build().perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      schoolselclick.click();
	}
       
	public void chapwaitreg(WebDriver driver){
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		classTenLnk.click();																																																																																																																											
		subjlnk.click();
		scndchaplnk.click();
		WaitStatementLib.explicitWaitForVisiblity(driver, 300, nametxtbx);
		createAccountPage.enterName();
		createAccountPage.enterEmail();
		createAccountPage.enterPassword();
		createAccountPage.enterPincode();
		createAccountPage.enterMobile();
		createAccountPage.enterUserCourse();
		createAccountPage.enterUserClass();
		createAccountPage.selectUserAsStudent();
		createAccountPage.joinNow(driver);
	    juniedcon.click();
		juniselcon.click();
		Actions act=new Actions(driver);
		act.moveToElement(juniselcon).click().sendKeys("Mauri").build().perform();
		juniconsel.click();	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		Actions actcity=new Actions(driver);
		actcity.moveToElement(selectlocation.get(2)).click().sendKeys("port").build().perform();
		junicitysel.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(junischname);
		actions.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		actions.sendKeys("Meriton");
		actions.build().perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
      schoolselclick.click();
	}
	
	public void ncertwaitreg(WebDriver driver){
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		classTenLnk.click();																																																																																																																											
		subjlnk.click();
		txtbooklnk.click();
		fsttxtbooklnk.click();
		WaitStatementLib.explicitWaitForVisiblity(driver, 300, nametxtbx);
		createAccountPage.enterName();
		createAccountPage.enterEmail();
		createAccountPage.enterPassword();
		createAccountPage.enterPincode();
		createAccountPage.enterMobile();
		createAccountPage.enterUserCourse();
		createAccountPage.enterUserClass();
		createAccountPage.selectUserAsStudent();
		createAccountPage.joinNow(driver);
	juniedcon.click();
	juniselcon.click();
	Actions act=new Actions(driver);
	act.moveToElement(juniselcon).click().sendKeys("Mauri").build().perform();
	juniconsel.click();	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	Actions actcity=new Actions(driver);
	actcity.moveToElement(selectlocation.get(2)).click().sendKeys("port").build().perform();
	junicitysel.click();
	Actions actions = new Actions(driver);
	actions.moveToElement(junischname);
	actions.click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	actions.sendKeys("Meriton");
	actions.build().perform();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  schoolselclick.click();
}
	public void logout ()
	{
		userimg.click();
		testlogout.click();
		
	}
	
	
	
	
	
	
	
	
	
}
