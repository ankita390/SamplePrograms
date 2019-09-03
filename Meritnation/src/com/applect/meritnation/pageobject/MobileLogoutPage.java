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

public class MobileLogoutPage {
	
	@FindBy(xpath = "//div[contains(@class,'right-section')]//a[contains(@class,'mobSearch')]")
	private WebElement searchButton;
	@FindBy(xpath = "//div[@class='searchBox']/input[@placeholder='Type your question']")
	private WebElement searchInputText;
	@FindBy (xpath = "//div[contains(@class,'questionBox')]/*[text()='Your Question']")
	private WebElement yourQuestionText;
	
	
	
	public MobileLogoutPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
		public void verifyAskAndAnswer(WebDriver driver) {
			searchButton.click();
			BasePage.sleepForMilliSecond(3000);
			Assert.assertEquals(searchInputText.getAttribute("placeholder"), "Type your question");
			
		}
	

}
