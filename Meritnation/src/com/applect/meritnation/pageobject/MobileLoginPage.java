package com.applect.meritnation.pageobject;

import java.sql.SQLException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MobileLoginPage {

	@FindBy(xpath = "//a[text()='login']")
	private WebElement loginnBtn;
	@FindBy(xpath = "//*[@action='/users/login']//input")
	private List<WebElement> uNnPasstxtflds;
	@FindBy(xpath = "//*[@class='logRegSubmitBtn']")
	private WebElement greenLoginnBtn;
	@FindBy(xpath = "//ul[contains(@class,'subjectList')]/li")
	private List<WebElement> subList;
	@FindBy(xpath = "//a[@class='logo']")
	private WebElement logoIcon;
	@FindBy(xpath = "//div[@class='dCourseList']//div[contains(text(),'CBSE Class ')]")
	private WebElement selectedClass;
	@FindBy(xpath = "//a[@class='searchIcon']/i")
	private WebElement searchBoxIcon;
	@FindBy(xpath = "//div[contains(@class,'searchBox')]/input")
	private WebElement searchBox;
	@FindBy(xpath = "//input[@class='search-text']")
	private WebElement innerSearchBox;
	@FindBy(xpath = "//div[@class='tablerow']")
	private WebElement topnotification;
	@FindBy(xpath = "//div[@class='tablerow']/div[2]/i")
	private WebElement closenotification;
	@FindBy(xpath = "//div[@class='queRow item'][1]//b")
	private WebElement firstSearchedResult;
	@FindBy(xpath = "//div[@class='media-box landing']/div[2]")
	private WebElement searchedText;
	@FindBy(xpath = "//div[@class='media-box landing']/div[2]/p[2]")
	private WebElement actualQuestion;
	@FindBy(xpath = "//div[@class='media-box landing']/div[3]/div")
	private WebElement likeBtn;
	@FindBy(xpath = "//span[@class='followTxt']")
	private WebElement followBtn;
	@FindBy(xpath = "//a[text()='Register Now']")
	private WebElement registerLnk;
	@FindBy(xpath = "//input[@name ='data[UserDetail][fullname]']")
	private WebElement nameTxtFld;
	@FindBy(xpath = "//input[@name ='data[UserDetail][email]']")
	private WebElement emailTxtFld;
	@FindBy(xpath = "//input[@name ='data[User][password]']")
	private WebElement passwordTxtFld;
	@FindBy(xpath = "//input[@name ='data[UserDetail][mobile]']")
	private WebElement mobileTxtFld;
	@FindBy(xpath = "//select[@name ='data[UserDetail][curriculumId]']")
	private WebElement boardDrpDwn;
	@FindBy(xpath = "//select[@name ='data[UserDetail][gradeId]']")
	private WebElement gradeDrpDwn;
	@FindBy(xpath = "//input[@name ='data[pincode]']")
	private WebElement pincodeTxtFld;
	@FindBy(xpath = "//div[@id='userType1']/label[1]")
	private WebElement studentRdioBtn;
	@FindBy(xpath = "//button[@class='logRegSubmitBtn']")
	private WebElement signUpBtn;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement otpTxtFld;
	@FindBy(xpath = "//button[text()='verify']")
	private WebElement verifyBtn;
	@FindBy(xpath = "//strong[text()=' Change Country ']")
	private WebElement changeCountry;
	@FindBy(xpath = "//input[@placeholder='Select your Country Code']")
	private WebElement countyCodeTxtFld;
	@FindBy(xpath = "//section[@class='contryCodeFillter']//ul/li")
	private WebElement mauritiusCountry;
	@FindBy(xpath = "//div[@class='schoolList']/div[2]/form/input")
	private WebElement enterSchoolTxtFld;
	@FindBy(xpath = "//div[@class='schoolList']/article")
	private List<WebElement> selectSchool;
	@FindBy(xpath = "//div[@class='fotterTabWrapper']/button[3]")
	private WebElement profileIcon;
	@FindBy(xpath = "//div[@class='mainHeader']//div[@class='float-right']/button/div")
	private WebElement logoutIcon;
	@FindBy(xpath = "//div[@id='webengage-notification-container']/iframe")
	private WebElement frame;
	@FindBy(xpath = "//div[@class='close tablecell']")
	private WebElement closeOrangePopup;
	@FindBy(xpath = "//*[text()='Logout']")
	private WebElement logoutBtn;
	@FindBy(xpath = "//span[@class='input-group-btn close-black']")
	private WebElement closeSearchBox;
	@FindBy(xpath = "//span[@class='back-btn ana-back-btn']")
	private WebElement backArrow;
	@FindBy(xpath = "//a[@class='login-btn']")
	private WebElement signUpButton;
	@FindBy(xpath = "//div[@class='icon close']")
	private WebElement closeConnectoPopup1;
	@FindBy(xpath = "//div [contains(@id,'connecto-modal-overlay')]")
	private WebElement connectoPopup1;
	@FindBy(xpath = "//iframe[contains(@id,'container-notification-frame')]")
	private WebElement ConnectoFrame1;
	@FindBy(xpath = "//*[@id='main-content']//div[contains(@class,'media-content')]/p[1]")
	private WebElement askAndAnswerSearchedResut;
	@FindBy(xpath = "//div[contains(@id,'connecto-modal-fixedElement')]/iframe")
	private WebElement ConnectoFrame2;
	@FindBy(xpath = "//i[contains(@class,'_open mn-bar-menu')]")
	private WebElement barMenue;
	@FindBy(id = "userProfileBox")
	private WebElement userprofileBox;
	@FindBy (xpath = "//*[@class='editBtn']")
	private WebElement addSchoolEditButton;
	@FindBy (xpath = "//div[@class='relative']//*[contains(@class,'selectize-input')]")
	private WebElement schoolTextField;
	@FindBy (xpath = "//div[contains(@class,'ng-scope active')]")
	private WebElement activeSchool;
	
	
	

	public MobileLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickSignUpButton() {
		BasePage.sleepForMilliSecond(2000);
		signUpButton.click();
	}

	public void clickLogin() {
		loginnBtn.click();
	}

	public void clickLoginAndClosePopup(WebDriver driver) {
		loginnBtn.click();
		WaitStatementLib.explicitWaitForVisiblity(driver, 15, frame);
		try {
			driver.switchTo().frame(frame);
			BasePage.sleepForMilliSecond(1000);
			closeOrangePopup.click();
			BasePage.sleepForMilliSecond(1000);
			driver.switchTo().defaultContent();
		} catch (ElementNotVisibleException ex) {
		} catch (TimeoutException ex) {
			driver.switchTo().defaultContent();
		}

	}

	public void login(WebDriver driver) {
		uNnPasstxtflds.get(0).sendKeys(ExcelUtils.readData("TestData", 1, 6));
		uNnPasstxtflds.get(1).sendKeys(ExcelUtils.readData("TestData", 0, 3));
		WaitStatementLib.explicitWaitForVisiblity(driver, 10, greenLoginnBtn);
		BasePage.sleepForMilliSecond(2000);
		greenLoginnBtn.click();
		// WaitStatementLib.explicitWaitForVisiblity(driver, 15, frame);
		try {
			BasePage.sleepForMilliSecond(2000);
			if (BasePage.isPresentAndDisplayed(connectoPopup1)) {
				driver.switchTo().frame(ConnectoFrame1);
				closeConnectoPopup1.click();
				driver.switchTo().defaultContent();
			}
			WaitStatementLib.explicitWaitForVisiblity(driver, 15, frame);
			driver.switchTo().frame(frame);
			BasePage.sleepForMilliSecond(1000);
			closeOrangePopup.click();
			BasePage.sleepForMilliSecond(1000);
			driver.switchTo().defaultContent();
		} catch (ElementNotVisibleException ex) {
		} catch (TimeoutException ex) {
			driver.switchTo().defaultContent();
		}
	}

	public void verifyDashboard(WebDriver driver) {
		Assert.assertTrue(BasePage.isPresentAndDisplayed(logoIcon));
		Assert.assertTrue(BasePage.isPresentAndDisplayed(selectedClass));
		Assert.assertTrue(BasePage.isPresentAndDisplayed(searchBoxIcon));
		searchBoxIcon.click();
//		searchBox.click();
		System.out.println(GetPropertyValues.getPropertyValue("liveURL"));
		if (driver.getCurrentUrl() == GetPropertyValues.getPropertyValue("liveURL")) {
			driver.manage().window().maximize();
		}
		innerSearchBox.sendKeys(ExcelUtils.readData("TestData", 3, 1));
		BasePage.sleepForMilliSecond(1000);

		/*
		 * BasePage.switchToWindow(driver, firstSearchedResult);
		 * Assert.assertTrue(searchedText.toString().length()!=0);
		 */

		String forstSearchedRslt = firstSearchedResult.getText();
		firstSearchedResult.click();

		BasePage.sleepForMilliSecond(3000);
		closeConnectToPopup(driver);
		closeBarOrabgePopup(driver);

		WaitStatementLib.explicitWaitForVisiblity(driver, 10, askAndAnswerSearchedResut);
		Assert.assertEquals(forstSearchedRslt, askAndAnswerSearchedResut.getText());

		if (BasePage.isPresentAndDisplayed(actualQuestion)) {
			likeBtn.click();
			BasePage.sleepForMilliSecond(1000);
			likeBtn.click();
			followBtn.click();
			BasePage.sleepForMilliSecond(1000);
			followBtn.click();

		}

		clickSideMainMenusOptions(driver, "Home");
		// driver.close();

	}

	public void fillSignUpForm(WebDriver driver) {
		/*BasePage.scrollDown(registerLnk, driver);
		registerLnk.click();*/
		nameTxtFld.sendKeys(ExcelUtils.readData("TestData", 0, 1));
		String emailid = ExcelUtils.readData("TestData", 0, 2);
		emailid = emailid + BasePage.randomString() + "@applect.com";
		emailTxtFld.sendKeys(emailid);
		String password = ExcelUtils.readData("TestData", 0, 3);
		passwordTxtFld.sendKeys(password);
		String mobile = ExcelUtils.readData("TestData", 0, 5);
		mobileTxtFld.sendKeys(mobile);
		
		String pin = ExcelUtils.readData("TestData", 0, 4);
		pincodeTxtFld.sendKeys(pin);
		BasePage.sleepForMilliSecond(1000);
		BasePage.selectDrpdwnByVisibleText(boardDrpDwn, "CBSE");
		BasePage.selectDrpdwnByVisibleText(gradeDrpDwn, "IX");
		/*studentRdioBtn.click();
		signUpBtn.click();*/
		
		selectUserType(driver, "Student");
		signUpBtn.click();
		
		/*WaitStatementLib.explicitWaitForVisiblity(driver, 15, frame);
		try {
			driver.switchTo().frame(frame);
			BasePage.sleepForMilliSecond(1000);
			closeOrangePopup.click();
			BasePage.sleepForMilliSecond(1000);
			driver.switchTo().defaultContent();
		} catch (ElementNotVisibleException ex) {
		} catch (TimeoutException ex) {
			driver.switchTo().defaultContent();
		}*/
		closeBarOrabgePopup(driver);
		 //enterSchool(driver);
		// Enter School Details 
		
		
		//enterSchoolDetails(driver, "country", "Mauritius", "city", "Port Louis", "meriton");
		
		

		/*
		 * if(String.valueOf(BasePage.isPresentAndDisplayed(frame))=="true"){
		 * WaitStatementLib.explicitWaitForVisiblity(driver, 15, frame); try{
		 * driver.switchTo().frame(frame);
		 * WaitStatementLib.explicitWaitForVisiblity(driver, 5,
		 * closeboardpprnotification); closeboardpprnotification.click();
		 * BasePage.sleepForMilliSecond(1000); driver.switchTo().defaultContent(); }
		 * catch(ElementNotVisibleException ex){ } catch(TimeoutException ex){
		 * driver.switchTo().defaultContent(); }
		 */
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

	public void enterSchool(WebDriver driver) {
		
		addSchoolEditButton.click();
		
		
		
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

	public void logout(WebDriver driver) {
		BasePage.sleepForMilliSecond(2000);
		WaitStatementLib.explicitWaitForClickable(driver, 10, profileIcon);
		profileIcon.click();
		closeConnectToPopup(driver);
		/*
		 * WaitStatementLib.explicitWaitForClickable(driver, 10, logoutIcon);
		 * logoutIcon.click();
		 */
		WaitStatementLib.explicitWaitForClickable(driver, 10, userprofileBox);
		userprofileBox.click();
		WaitStatementLib.explicitWaitForClickable(driver, 10, logoutBtn);
		logoutBtn.click();

	}

	public void closeConnectToPopup(WebDriver driver) {
		try {
			BasePage.sleepForMilliSecond(2000);
			if (BasePage.isPresentAndDisplayed(connectoPopup1)) {
				driver.switchTo().frame(ConnectoFrame2);
				closeConnectoPopup1.click();
				driver.switchTo().defaultContent();
			}
		} catch (ElementNotVisibleException ex) {
		}
	}

	public void closeBarOrabgePopup(WebDriver driver) {

		try {

			WaitStatementLib.explicitWaitForVisiblity(driver, 15, frame);
			if(BasePage.isPresentAndDisplayed(closeOrangePopup)) {
			driver.switchTo().frame(frame);
			BasePage.sleepForMilliSecond(1000);
			closeOrangePopup.click();
			BasePage.sleepForMilliSecond(1000);
			driver.switchTo().defaultContent();
			}
		} catch (ElementNotVisibleException ex) {
		} catch (TimeoutException ex) {

		}
	}

	public void clickSideMainMenusOptions(WebDriver driver, String menueOptions) {
		barMenue.click();
		WebElement sideMenue = driver
				.findElement(By.xpath("//div[@class='side_main_menu']/a[text()='" + menueOptions + "']"));

		sideMenue.click();

	}
	
	public void selectUserType(WebDriver driver, String userType) {
		BasePage.sleepForMilliSecond(5000);
		
		WebElement user = driver.findElement(By.xpath("//div[contains(@class,'userType')]/*[@data-type='" +userType+ "']"));
		
		user.click();
	}
	
	// Enter School Details
	public void enterSchoolDetails(WebDriver driver, String countryDetailRow, String inputCountryDetails,
			String cityDetailRow, String inputCityDetails, String schoolName) {
		addSchoolEditButton.click();

		WebElement countryDetailsRow = driver
				.findElement(By.xpath("//div[@ng-model='userSchool." + countryDetailRow + "']"));
		countryDetailsRow.click();

		WebElement enterCountryDetails = driver
				.findElement(By.xpath("//div[@ng-model='userSchool." + countryDetailRow + "']//input[@placeholder]"));
		enterCountryDetails.sendKeys(inputCountryDetails);

		BasePage.selectElementByText(driver, inputCountryDetails);

		WebElement cityDetailsRow = driver.findElement(By.xpath("//div[@ng-model='userSchool." + cityDetailRow + "']"));
		cityDetailsRow.click();
		
		WebElement enterCityDetails = driver
				.findElement(By.xpath("//div[@ng-model='userSchool." + cityDetailRow + "']//input[@placeholder]"));
		WaitStatementLib.explicitWaitForClickable(driver, 10, enterCityDetails);
		enterCityDetails.sendKeys(inputCityDetails);

		BasePage.selectElementByText(driver, inputCityDetails);
		WaitStatementLib.explicitWaitForClickable(driver, 10, schoolTextField);
		BasePage.sleepForMilliSecond(3000);
		schoolTextField.click();
		schoolTextField.sendKeys(schoolName);
		activeSchool.click();
		
	}

}
