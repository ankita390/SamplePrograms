package com.applect.meritnation.pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import com.applect.meritnation.generic.ExcelUtils;
import com.applect.meritnation.generic.WaitStatementLib;




public abstract class BasePage {
	static WebDriver driver;
	
	public static void closeJEETestSeriesPopup(WebDriver driver, WebElement element, WebElement element1){
		if(String.valueOf(BasePage.isPresentAndDisplayed(element))=="true"){
		try{
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, element1);
			element1.click();
			BasePage.sleepForMilliSecond(1000);
		
			}
			catch(ElementNotVisibleException ex){
				
			}
			catch(TimeoutException ex){
		
			}
		}
	}
	
	public static void scrollDown(WebElement element, WebDriver driver){
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView(true);", element);

	}
	
	public static String randomString() 
	{
		int leftLimit = 97;
		int rightLimit = 122; 
		int targetStringLength = 4;
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++) {
			int randomLimitedInt = leftLimit + (int) 
					(random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomLimitedInt);
		}
		String generatedString = buffer.toString();
		return (generatedString);
	}
	public static void login (WebDriver driver)
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginButtonClick(driver);
		loginPage.enterUserName(driver);
		loginPage.enterPassword(driver);
		loginPage.signInBtnClick(driver);
	}
	public static void logout(WebDriver driver)
	{
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		createAccountPage.clickProfileIcon(driver);
		createAccountPage.logoutClick(driver);
	}
	public static void focusElement(WebElement element, WebDriver driver)
	{
	 
	Actions actions = new Actions(driver);
	actions.moveToElement(element).build().perform();
	}
	
	public static void selectDrpdwnValue(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	
	public static void selectDrpdwnByVisibleText(WebElement element, String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);;
	}
	public static void selectUsingOption(WebElement element, String text)
	{
		element.click();
		element.getAttribute(text);
		
	}
	public static void elementDisplay(WebElement element, String text)
	{
		element.isDisplayed();
	}
	
	
	public static void sleepForMilliSecond(int time)  
	{
		try{
			Thread.sleep(time);
		}
		catch(InterruptedException ex){
			
		}
	}
	public static void switchToWindow(WebDriver driver, List<WebElement> element)
	{
		element.get(0).click();
		try{
			Set <String> allWindow = driver.getWindowHandles();
			Iterator<String> itr = allWindow.iterator();
			List<String> myl = new ArrayList<String>();
			for (int i =0;i<allWindow.size();i++)
			{
				myl.add(itr.next());
			}
			driver.switchTo().window(myl.get(1));
			//BasePage.sleepForMilliSecond(2000);
			}
		catch(RuntimeException ex){
			
		}
	}
	public static void switchToParentWindow(WebDriver driver){
		
		try{
			Set <String> allWindow = driver.getWindowHandles();
			Iterator<String> itr = allWindow.iterator();
			List<String> myl = new ArrayList<String>();
			
			for (int i =0;i<allWindow.size();i++){
				myl.add(itr.next());
			}
			driver.switchTo().window(myl.get(0));
			}
		catch(RuntimeException ex){
			
		}
	}
	public static boolean isPresentAndDisplayed(final WebElement element) {
		  try {
		    return element.isDisplayed();
		  } catch (NoSuchElementException e) {
		    return false;
		  }
		}
	public static boolean isSelected(WebElement element, String className) {
	    return element.getAttribute("class").contains(className);
	}
	

	public static void verifyCourseMenuContent(List<WebElement> element){
		for (int i=0;i<element.size();i++)
		{
			String visibledata = element.get(i).getText().toString();
			for (int j=4;j<=15;j++)
			{
				String data = ExcelUtils.readData("TestData", j, 1).toString();
				if(data.equals(visibledata)){
					break;
				}
				else{
					continue;
				}
			}
		}
	}
	
	public static void verifyCourseMenuContentforAllClasses(List<WebElement> element, int k){
		for (int i=0;i<element.size();i++)
		{
			String visibledata = element.get(i).getText().toString();
			for (int j=4;j<=15;j++)
			{
				String data = ExcelUtils.readData("TestData", j, k).toString();
				if(data.equals(visibledata)){
					break;
				}
				else{
					continue;
				}
			}
		}
	}
	public static void verifyCourseMenuContentforAllClassesSPecificUsers(WebElement element1,List<WebElement> element, int k){
		Assert.assertTrue((element1.getText().toString()).equals(ExcelUtils.readData("TestData", 3, k).toString()));
		for (int i=0;i<element.size();i++)
		{
			String visibledata = element.get(i).getText().toString();
			for (int j=4;j<=15;j++)
			{
				String data = ExcelUtils.readData("TestData", j, k).toString();
				if(data.equals(visibledata)){
					break;
				}
				else{
					continue;
				}
			}
		}
	}
	
	
	
	public static void verifyStudyMenuContent(List<WebElement> element){
		for (int i=0;i<element.size();i++)
		{
			String visibledata = element.get(i).getText().toString();
		
			for (int j=15;j<25;j++)
			{
				String data = ExcelUtils.readData("TestData", j, 1).toString();
			
				if(data.equalsIgnoreCase(visibledata)){
					break;
				}
				else{
					continue;
				}
			}
		}
	}
	public static void verifyStudyMenuContentForAllClasses(List<WebElement> element, int k){
		for (int i=0;i<element.size();i++)
		{
			String visibledata = element.get(i).getText().toString();
		
			for (int j=15;j<25;j++)
			{
				String data = ExcelUtils.readData("TestData", j, k).toString();
			
				if(data.equalsIgnoreCase(visibledata)){
					break;
				}
				else{
					continue;
				}
			}
		}
	}
	
	public static void verifyAnaMenuContent(List<WebElement> element){
		for (int i=0;i<element.size();i++)
		{
			String visibledata = element.get(i).getText().toString();
			for (int j=22;j<26;j++)
			{
				String data = ExcelUtils.readData("TestData", j, 1).toString();
				if(data.equalsIgnoreCase(visibledata)){
					break;
				}
				else{
					continue;
				}
			}
		}
	}
	
	public static void verifyMeMenuContent(List<WebElement> element){
		for (int i=0;i<element.size();i++)
		{
			String visibledata = element.get(i).getText().toString();
			for (int j=26;j<35;j++)
			{
				String data = ExcelUtils.readData("TestData", j, 1).toString();
				if(data.equalsIgnoreCase(visibledata)){
					break;
				}
				else{
					continue;
				}
			}
		}
	}
	
	public static boolean checkLogoutBox(final WebElement element) {
		  try {
		    return element.isDisplayed();
		  } catch (NoSuchElementException e) {
		    return false;
		  }
		  
		}
	
	public static void moveToElementAndClick(WebDriver driver, WebElement toElement, WebElement toElement1){
		Actions act = new Actions(driver);
		act.moveToElement(toElement).moveToElement(toElement1).click().build().perform();
	}
	public static void moveToElementAndClick(WebDriver driver, WebElement toElement){
		Actions act = new Actions(driver);
		act.moveToElement(toElement).click().build().perform();
	}
	public static void moveToElementAndStay(WebDriver driver, WebElement toElement){
	
		Actions act = new Actions(driver);
		act.moveToElement(toElement).build().perform();
	}
	public static void pressEscapeKey(WebDriver driver){
		
		try {
			Robot r = new Robot();
			r.keyPress(java.awt.event.KeyEvent.VK_ESCAPE); 
			r.keyRelease(java.awt.event.KeyEvent.VK_ESCAPE);
			
		} catch (AWTException e) {
			
			e.printStackTrace();
		} 
	}
public static void pressHomeKey(WebDriver driver){
		
		try {
			Robot r = new Robot();
			r.keyPress(java.awt.event.KeyEvent.VK_HOME); 
			r.keyRelease(java.awt.event.KeyEvent.VK_HOME);
			
		} catch (AWTException e) {
			
			e.printStackTrace();
		} 
	}
	public static void usingSoftAssert(boolean condition){
		SoftAssert sf = new SoftAssert();
		sf.assertTrue(condition);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public BasePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
