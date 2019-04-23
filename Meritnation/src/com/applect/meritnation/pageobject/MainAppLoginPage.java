package com.applect.meritnation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainAppLoginPage {
	
	@FindBy(xpath="//android.widget.TextView[@text='LOGIN']")
	private WebElement loginBtn;
	
	public MainAppLoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void validLogin(){
		BasePage.sleepForMilliSecond(2000);
		loginBtn.click();
		
	}
}
