package com.applect.meritnation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.applect.meritnation.generic.ExcelUtils;
import com.applect.meritnation.generic.WaitStatementLib;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class MainAppLoginPage {
	
	@FindBy(xpath="//android.widget.TextView[@text='LOGIN']")
	private WebElement loginBtn;
	@FindBy(id="com.meritnation.school:id/etLoginId")
	private WebElement userNameTxtBx;
	@FindBy(id="com.meritnation.school:id/etPassword")
	private WebElement passwordTxtBx;
	@FindBy(id="com.meritnation.school:id/tvLogin")
	private WebElement actualLoginBtn;
	@FindBy(id="com.meritnation.school:id/tvBoardName")
	private WebElement iAmStudent;
	@FindBy(id="com.meritnation.school:id/menu_chat")
	private WebElement doubtIcon;
	@FindBy(id="com.meritnation.school:id/tv_askQuestion")
	private WebElement tapToAskIcon;
	@FindBy(id="com.meritnation.school:id/et_add_answer")
	private WebElement askQuestionText;
	@FindBy(id="com.meritnation.school:id/tv_submit")
	private WebElement nextBtn;
	@FindBy(id="com.meritnation.school:id/spinnerSubject")
	private WebElement selectSubject;
	@FindBy(id="com.meritnation.school:id/spinnerChapter")
	private WebElement selectChapter;
	@FindBy(xpath="//android.widget.TextView[@text='Math']")
	private WebElement math;
	
	
	
	public MainAppLoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void validLogin(){
		BasePage.sleepForMilliSecond(2000);
		loginBtn.click();
		userNameTxtBx.sendKeys(ExcelUtils.readData("TestData", 1, 1));
		passwordTxtBx.sendKeys(ExcelUtils.readData("TestData", 1, 2));
		actualLoginBtn.click();
		
		}
	public void clickIAmStudent(){
		iAmStudent.click();
	}
	public void askQuestionOnDOC(WebDriver driver){
		doubtIcon.click();
		BasePage.sleepForMilliSecond(2000);
		tapToAskIcon.click();
		driver.navigate().back();
		BasePage.sleepForMilliSecond(2000);
		String question = ExcelUtils.readData("TestData", 2, 1);
		question = BasePage.randomString()+ " " + question + BasePage.randomString() + "?";
		askQuestionText.sendKeys(question);
		BasePage.sleepForMilliSecond(1000);
		nextBtn.click();
		BasePage.sleepForMilliSecond(2000);
		selectSubject.click();
		math.click();
	//	BasePage.selectDrpdwnByVisibleText(selectSubject, "Select Subject");
	//	BasePage.scrollToExactElement("Math");
		
		
		
		
		
		
	}
}
