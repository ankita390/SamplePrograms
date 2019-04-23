package com.applect.meritnation.pageobject;

import java.sql.SQLException;
import java.util.List;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.applect.meritnation.generic.ConnectDatabase;
import com.applect.meritnation.generic.ExcelUtils;
import com.applect.meritnation.generic.GetPropertyValues;
import com.applect.meritnation.generic.WaitStatementLib;

public class MobileLoginPage {
	
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginnBtn;
	@FindBy(xpath="//div[@data-role='fieldcontain']/div/input")
	private List <WebElement> uNnPasstxtflds;
	@FindBy(xpath="//div[@class='loggreen-btn']/a/span")
	private WebElement greenLoginnBtn;
	@FindBy(xpath="//ul[contains(@class,'subjectList')]/li")
	private List <WebElement> subList;
	@FindBy(xpath="//a[@class='logo']")
	private WebElement logoIcon;
	@FindBy(xpath="//div[@class='dCourseList']//div[text()='CBSE Class 9']")
	private WebElement selectedClass;
	@FindBy(xpath="//a[@class='searchIcon']/i")
	private WebElement searchBoxIcon;
	@FindBy(xpath="//div[contains(@class,'searchBox')]/input")
	private WebElement searchBox;
	@FindBy(xpath="//div[@class='table-cell']/input")
	private WebElement innerSearchBox;
	@FindBy(xpath="//div[@class='tablerow']")
	private WebElement topnotification;
	@FindBy(xpath="//div[@class='tablerow']/div[2]/i")
	private WebElement closenotification;
	@FindBy(xpath="//div[@class='resultBox']/ul/li/a")
	private List <WebElement> firstSearchedResult;
	@FindBy(xpath="//div[@class='media-box landing']/div[2]")
	private WebElement searchedText;
	@FindBy(xpath="//div[@class='media-box landing']/div[2]/p[2]")
	private WebElement actualQuestion;
	@FindBy(xpath="//div[@class='media-box landing']/div[3]/div")
	private WebElement likeBtn;
	@FindBy(xpath="//span[@class='followTxt']")
	private WebElement followBtn;
	@FindBy(xpath="//a[text()='Register Now']")
	private WebElement registerLnk;
	@FindBy(id="name")
	private WebElement nameTxtFld;
	@FindBy(id="email")
	private WebElement emailTxtFld;
	@FindBy(id="password")
	private WebElement passwordTxtFld;
	@FindBy(id="mobile")
	private WebElement mobileTxtFld;
	@FindBy(id="board")
	private WebElement boardDrpDwn;
	@FindBy(id="grade")
	private WebElement gradeDrpDwn;
	@FindBy(id="pincode")
	private WebElement pincodeTxtFld;
	@FindBy(xpath="//div[@id='userType1']/label[1]")
	private WebElement studentRdioBtn;
	@FindBy(xpath="//span[@class='ui-btn-inner']/span[text()='Sign up']")
	private WebElement signUpBtn;
	@FindBy(xpath="//input[@type='password']")
	private WebElement otpTxtFld;
	@FindBy(xpath="//button[text()='verify']")
	private WebElement verifyBtn;
	@FindBy(xpath="//strong[text()=' Change Country ']")
	private WebElement changeCountry;
	@FindBy(xpath="//input[@placeholder='Select your Country Code']")
	private WebElement countyCodeTxtFld;
	@FindBy(xpath="//section[@class='contryCodeFillter']//ul/li")
	private WebElement mauritiusCountry;
	@FindBy(xpath="//div[@class='schoolList']/div[2]/form/input")
	private WebElement enterSchoolTxtFld;
	@FindBy(xpath="//div[@class='schoolList']/article")
	private List <WebElement> selectSchool;
	@FindBy(xpath="//div[@class='fotterTabWrapper']/button[3]")
	private WebElement profileIcon;
	@FindBy(xpath="//div[@class='mainHeader']//div[@class='float-right']/button/div")
	private WebElement logoutIcon;
	@FindBy(xpath="//div[@id='webengage-notification-container']/iframe")
	private WebElement frame;
	@FindBy(xpath="//div[@class='close tablecell']")
	private WebElement closeOrangePopup;
	@FindBy(xpath="//div[@role='menu']")
	private WebElement logoutBtn;
	@FindBy(xpath="//span[@class='input-group-btn close-black']")
	private WebElement closeSearchBox;
	@FindBy(xpath="//span[@class='back-btn ana-back-btn']")
	private WebElement backArrow;
	
	

	public MobileLoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void clickLogin(){
		loginnBtn.click();
	}
	
	public void clickLoginAndClosePopup(WebDriver driver){
		loginnBtn.click();
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
			catch(TimeoutException ex){
			driver.switchTo().defaultContent();
		}
		
	}
	public void login(WebDriver driver){
		uNnPasstxtflds.get(0).sendKeys(ExcelUtils.readData("TestData", 1, 6));
		uNnPasstxtflds.get(1).sendKeys(ExcelUtils.readData("TestData", 0, 3));
		greenLoginnBtn.click();
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
				catch(TimeoutException ex){
				driver.switchTo().defaultContent();
			}
	}
	public void verifyDashboard(WebDriver driver){
		Assert.assertTrue(BasePage.isPresentAndDisplayed(logoIcon));
		Assert.assertTrue(BasePage.isPresentAndDisplayed(selectedClass));
		Assert.assertTrue(BasePage.isPresentAndDisplayed(searchBoxIcon));
		searchBoxIcon.click();
//		searchBox.click();
		System.out.println(GetPropertyValues.getPropertyValue("liveURL"));
		if(driver.getCurrentUrl()==GetPropertyValues.getPropertyValue("liveURL")){
			driver.manage().window().maximize();
		}
		innerSearchBox.sendKeys(ExcelUtils.readData("TestData", 3, 1));
		BasePage.sleepForMilliSecond(1000);
		BasePage.switchToWindow(driver, firstSearchedResult);
		Assert.assertTrue(searchedText.toString().length()!=0);
		if(BasePage.isPresentAndDisplayed(actualQuestion)){
			likeBtn.click();
			BasePage.sleepForMilliSecond(1000);
			likeBtn.click();
			followBtn.click();
			BasePage.sleepForMilliSecond(1000);
			followBtn.click();
			
		}
		driver.close();
		BasePage.switchToParentWindow(driver);
	}
	public void fillSignUpForm(WebDriver driver){
		BasePage.scrollDown(registerLnk, driver);
		registerLnk.click();
		nameTxtFld.sendKeys(ExcelUtils.readData("TestData", 0, 1));
		String emailid = ExcelUtils.readData("TestData", 0, 2);
		emailid = emailid + BasePage.randomString() + "@applect.com";
		emailTxtFld.sendKeys(emailid);
		String password = ExcelUtils.readData("TestData", 0, 3);
		passwordTxtFld.sendKeys(password);
		String mobile = ExcelUtils.readData("TestData", 0, 5);
		mobileTxtFld.sendKeys(mobile);	
		BasePage.selectDrpdwnByVisibleText(boardDrpDwn, "CBSE");
		BasePage.selectDrpdwnByVisibleText(gradeDrpDwn, "IX");
		String pin = ExcelUtils.readData("TestData", 0, 4);
		pincodeTxtFld.sendKeys(pin);
		BasePage.sleepForMilliSecond(1000);
		studentRdioBtn.click();
		signUpBtn.click();
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
			catch(TimeoutException ex){
			driver.switchTo().defaultContent();
		}
		
		/*if(String.valueOf(BasePage.isPresentAndDisplayed(frame))=="true"){
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
			}*/
		String dbUrl = GetPropertyValues.getPropertyValue("dbUrl");
		String dbusername = GetPropertyValues.getPropertyValue("dbusername");
		String dbpassword = GetPropertyValues.getPropertyValue("dbpassword");
		try {
			String otp = ConnectDatabase.connectToDatabase(dbUrl, dbusername, dbpassword);
			WaitStatementLib.explicitWaitForVisiblity(driver, 10, otpTxtFld);
			otpTxtFld.sendKeys(otp);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		WaitStatementLib.explicitWaitForClickable(driver, 10, verifyBtn);
		verifyBtn.click();
		BasePage.sleepForMilliSecond(8000);
		}
	
	public void enterSchool(WebDriver driver){
		changeCountry.click();
		countyCodeTxtFld.sendKeys("Mauritius");
		WaitStatementLib.explicitWaitForClickable(driver, 10, mauritiusCountry);
		mauritiusCountry.click();
		WaitStatementLib.explicitWaitForVisiblity(driver, 10, enterSchoolTxtFld);
		enterSchoolTxtFld.sendKeys("Meriton");
		BasePage.sleepForMilliSecond(2000);
		WaitStatementLib.explicitWaitForClickable(driver, 10, selectSchool.get(0));
		selectSchool.get(0).click();
		
	}
	public void logout(WebDriver driver){
		BasePage.sleepForMilliSecond(2000);
		WaitStatementLib.explicitWaitForClickable(driver, 10, profileIcon);
		profileIcon.click();
		WaitStatementLib.explicitWaitForClickable(driver, 10, logoutIcon);
		logoutIcon.click();
		WaitStatementLib.explicitWaitForClickable(driver, 10, logoutBtn);
		logoutBtn.click();
	
		
		
		
	}

}
