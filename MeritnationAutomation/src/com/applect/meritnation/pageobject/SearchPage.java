package com.applect.meritnation.pageobject;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.generic.ExcelUtils;
import com.applect.meritnation.generic.WaitStatementLib;

public class SearchPage {
	@FindBy(xpath="//div[@class='headerSearchBox']/div/div/div/form")
	private WebElement searchbx;
	@FindBy(xpath="//div[@class='ng-scope']/a[text()='Chapter']")
	private WebElement firstsearchedoption;
	@FindBy(xpath="//div[@class='allsession']/h1[text()='Quadratic Equations']")
	private WebElement headername;
	
	
	
	
	
	
	
	
	
	
	



	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void enterSearchBox(WebDriver driver)
	{
		try{
			WaitStatementLib.explicitWaitForClickable(driver, 5, searchbx);
			searchbx.click();
			Thread.sleep(2000);
			Actions actions = new Actions(driver);
			Thread.sleep(2000);
			String searchtxt = ExcelUtils.readData("TestData", 3, 1);
			actions.moveToElement(searchbx).click().sendKeys(searchtxt).build().perform();;
			Thread.sleep(2000);
		}
		
		catch(InterruptedException e)
		{
			
		}
	}
		public void clickFirstSearchedOption()
		{
			firstsearchedoption.click();
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







	

