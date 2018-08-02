package com.applect.meritnation.pageobject;


import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.applect.meritnation.generic.ExcelUtils;
import com.applect.meritnation.generic.WaitStatementLib;

public class SearchPage {
	@FindBy(xpath="//div[@class='headerSearchBox']/div/div/div/form")
	private WebElement searchbx;
	@FindBy(xpath="//div[contains(@class,'suggesionbox-dropdpwn')]/div[@class='queRow item ng-scope']")
	private List <WebElement> allsearchedoption;
	@FindBy(xpath="//div[@class='alignmentBox']/div[2]")
	private WebElement headername;
	@FindBy(xpath="//div[@id='notification_bar_top']")
	private WebElement topnotification;
	@FindBy(xpath="//div[@id='notification_bar_top']/div[@id='top-notification-close']")
	private WebElement closenotification;
	
	
	
	
	
	
	
	
	
	
	



	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void enterSearchBox(WebDriver driver)
	{
		try{
			BasePage.isPresentAndDisplayed(topnotification);
			closenotification.click();
		}
		catch(NoSuchElementException e){
			
		}
			WaitStatementLib.explicitWaitForClickable(driver, 5, searchbx);
			searchbx.click();
			Actions actions = new Actions(driver);
			String searchtxt = ExcelUtils.readData("TestData", 3, 1);
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, searchbx);
			searchbx.click();
			actions.moveToElement(searchbx).click().sendKeys(searchtxt).build().perform();;
			BasePage.sleepForMilliSecond(2000);
	}
		public void clickFirstSearchedOption()
		{
			allsearchedoption.get(0).click();
		}
	
		public void verifySearchedResult(WebDriver driver)
		{
		
			WaitStatementLib.explicitWaitForClickable(driver, 5, headername);
			String str = ExcelUtils.readData("TestData", 3, 2);
			if  (str.equals(headername.getText().toString()))
			{
				BasePage.logout(driver);
			}
			
		}
	}







	

