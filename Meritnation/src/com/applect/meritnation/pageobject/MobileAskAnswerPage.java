package com.applect.meritnation.pageobject;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.applect.meritnation.generic.ConnectDatabase;
import com.applect.meritnation.generic.ExcelUtils;
import com.applect.meritnation.generic.GetPropertyValues;
import com.applect.meritnation.generic.WaitStatementLib;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MobileAskAnswerPage {
	private AppiumDriver<MobileElement> _driver;
	
	@FindBy(xpath = "//div[@class='top-row group']/div[1]/div/span")
	private MobileElement classDrpdwn;
	@FindBy(xpath = "//nav[@class='nav-bar']//ul/li/a[text()='Class IX']")
	private MobileElement classNine;
	@FindBy(xpath = "//footer[@class='page-footer']/div[2]/a[2]/span")
	private MobileElement asknAnsFooter;
	@FindBy(xpath = "//div[@class='media-box']//div[@class='media-footer']//button/em")
	private List <MobileElement> ansCount;
	@FindBy(className = "view-full-answer")
	private MobileElement fullAnsLnk;
	@FindBy(id = "fullnameStep")
	private MobileElement fullName;
	@FindBy(id = "mobileStep")
	private MobileElement mobileNumber;
	@FindBy(id = "passwordStep")
	private MobileElement password;
	@FindBy(id = "pincodeStep")
	private MobileElement pinCode;
	@FindBy(className = "fillButton")
	private MobileElement signUpBtn;
	
	@FindBy(xpath = "//div [contains(@id,'connecto-modal-overlay')]")
	private MobileElement connectoPopup;
	@FindBy(xpath = "//iframe[contains(@id,'container-notification-frame')]")
	private MobileElement ConnectoFrame;
	@FindBy(xpath = "//div[@class='icon close']")
	private MobileElement closeConnectoPopup;
	@FindBy(id = "webengage-notification-container")
	private MobileElement webEngageNotfn;
	@FindBy(id = "webklipper-publisher-widget-container-notification-frame")
	private MobileElement webEngageNotfnActual;
	@FindBy(xpath = "//div[@class='close tablecell']/i")
	private MobileElement closeWebEngagePopup;
	@FindBy(xpath = "//div[@class='selectBoard']//span[@class='cbse']")
	private MobileElement cbseCourse;
	@FindBy(xpath = "//div[@class='selectClass']/button[text()='IX']")
	private MobileElement classNinee;
	@FindBy(xpath = "//input[@placeholder='Enter OTP']")
	private MobileElement otpTxtBx;
	@FindBy(xpath = "//button[text()='verify']")
	private MobileElement verifyBtn;
	@FindBy(id = "android:id/button1")
	private MobileElement allowBtn;
	@FindBy(xpath = "//strong[contains(text(),' Change Country ')]")
	private MobileElement changeCountry;
	@FindBy(name = "Change Country")
	private MobileElement changeCountryNew;
	@FindBy(xpath = "//input[@placeholder='Select your Country Code']")
	private MobileElement typeCountryName;
	@FindBy(xpath = "//span[text()='Mauritius']")
	private MobileElement selectCountry;
	@FindBy(xpath = "//input[@placeholder='Enter your school here']")
	private MobileElement typeSchoolName;
	@FindBy(xpath = "//h2[text()='Meriton']")
	private MobileElement selectSchool;
	@FindBy(xpath = "//a[@class='backButn']")
	private MobileElement backBtn;
	@FindBy(xpath = "//a[text()='Home']")
	private MobileElement HomeBtn;
	@FindBy(xpath = "//div[@class='fotterTabWrapper']/button[3]/div")
	private MobileElement profileFooter;
	@FindBy(xpath = "//div[@class='mainHeader']//button/div")
	private MobileElement clickToLogout;
	@FindBy(xpath = "//div[text()='Logout']")
	private MobileElement LogoutBtn;
	
	
	
	public MobileAskAnswerPage(AppiumDriver<MobileElement> _driver){
		this._driver=_driver;
		PageFactory.initElements(new AppiumFieldDecorator(this._driver), this); 
	}
	
	public void closeConnectoPopup(AppiumDriver<MobileElement> _driver){
		BasePage.sleepForMilliSecond(2000);
		if(BasePage.isPresentAndDisplayed(connectoPopup)){
			_driver.switchTo().frame(ConnectoFrame);
			closeConnectoPopup.click();
			_driver.switchTo().defaultContent();
		}
	}	
	public void closeWebEngageNotification(AppiumDriver<MobileElement> _driver){
		BasePage.sleepForMilliSecond(2000);
		if(BasePage.isPresentAndDisplayed(webEngageNotfn)){
			WaitStatementLib.explicitWaitForVisiblity(_driver, 10, webEngageNotfn);
			BasePage.sleepForMilliSecond(2000);
			_driver.switchTo().frame(webEngageNotfnActual);
			closeWebEngagePopup.click();
			_driver.switchTo().defaultContent();
		}
	}
	
	public void navigatingToAnaListingLogoutPage(){
		try{
			classDrpdwn.click();
		}
		catch(NoSuchElementException e){
			BasePage.sleepForMilliSecond(2000);
			classDrpdwn.click();
		}
		classNine.click();
		
		asknAnsFooter.click();
		closeConnectoPopup(_driver);
		ArrayList<WebElement> str = new ArrayList<WebElement>();
		 for (int i=0;i <= ansCount.size();i++){
			 if(!String.valueOf(ansCount.get(i).getText().toString()).equals("0")){  
			  str.add(ansCount.get(i));
			  str.get(0).click();
			  break;
			  	}
			  }
	}
	public void MobileRegistrationOnAnaListingLogoutPage(){
		 fullAnsLnk.click(); 
		 fullName.sendKeys(ExcelUtils.readData("TestData", 0, 1));
		 String mobile = "55612"+ BasePage.randomNumber();
		 mobileNumber.sendKeys(mobile);
		 password.sendKeys(ExcelUtils.readData("TestData", 0, 3));
		 pinCode.sendKeys(ExcelUtils.readData("TestData", 0, 4));
		 signUpBtn.click();
		 WaitStatementLib.explicitWaitForVisiblity(_driver, 5, cbseCourse);
		 closeWebEngageNotification(_driver);
		 WaitStatementLib.explicitWaitForVisiblity(_driver, 15, cbseCourse);
		 cbseCourse.click();
		 closeWebEngageNotification(_driver);
		 classNinee.click();
		 String dbUrl = GetPropertyValues.getPropertyValue("dbUrl");
			String dbusername = GetPropertyValues.getPropertyValue("dbusername");
			String dbpassword = GetPropertyValues.getPropertyValue("dbpassword");
			try {
				String otp = ConnectDatabase.connectToDatabase(dbUrl, dbusername, dbpassword, mobile);
				WaitStatementLib.explicitWaitForVisiblity(_driver, 10, otpTxtBx);
				otpTxtBx.sendKeys(otp);
				System.out.println(otp);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			verifyBtn.click();
			BasePage.sleepForMilliSecond(4000);
		 	BasePage.closeLocationPopupinMobileSite(_driver, allowBtn);
		    BasePage.sleepForMilliSecond(1000);
		    try{
		    WaitStatementLib.explicitWaitForVisiblity(_driver, 15, changeCountry);
		    changeCountry.click();
		   
		    }
		    catch(TimeoutException e){
		    	changeCountryNew.click();
		    }
		    BasePage.sleepForMilliSecond(1000);
		    typeCountryName.sendKeys("Mauritius");
		    BasePage.sleepForMilliSecond(1000);
		    selectCountry.click();
		    BasePage.sleepForMilliSecond(1000);
		    typeSchoolName.sendKeys(ExcelUtils.readData("TestData", 0, 6));
		    BasePage.sleepForMilliSecond(1000);
		    selectSchool.click();
		    BasePage.sleepForMilliSecond(7000);
		    BasePage.closeLocationPopupinMobileSite(_driver, allowBtn);
		    backBtn.click();
		    BasePage.sleepForMilliSecond(1000);
		    HomeBtn.click();
		    closeConnectoPopup(_driver);
		    BasePage.sleepForMilliSecond(1000);
		    }

	public void logOutFromMobileDashboard(){
		profileFooter.click();
		BasePage.sleepForMilliSecond(1000);
		clickToLogout.click();
		LogoutBtn.click();
	}
	public void registrationByGoogleLink(){
		
		for(int i =1;i<2;i++){
			closeConnectoPopup(_driver);
			_driver.get(ExcelUtils.readData("TestData", 145, i));
			closeConnectoPopup(_driver);
			MobileRegistrationOnAnaListingLogoutPage();
			closeConnectoPopup(_driver);
			logOutFromMobileDashboard();
			//closeConnectoPopup(_driver);
		}
	}
	

}

