package com.applect.meritnation.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatementLib {
	
	public static void implicitWaitForSecond (WebDriver driver, int time )
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public static void implicitWaitForMinute (WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.MINUTES);
	}
	public static void explicitWaitForClickable (WebDriver driver, int time, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	public static void explicitWaitForVisiblity (WebDriver driver, int time, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait (driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/*public static void fluentWait(WebDriver driver, final WebElement element){
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)

			       .withTimeout(30, TimeUnit.SECONDS)

			       .pollingEvery(5, TimeUnit.SECONDS)

			       .ignoring(NoSuchElementException.class);
		  WebElement foo = wait.until(new Function<WebDriver, WebElement>() 
		
		  {

			     public WebElement apply(WebDriver driver) {

			       return element;

			     }

			   });}*/
	}
