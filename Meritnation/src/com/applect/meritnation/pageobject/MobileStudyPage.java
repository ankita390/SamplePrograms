package com.applect.meritnation.pageobject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;




public class MobileStudyPage {
	
	
	
	public MobileStudyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
   

	
	
	public void openTopicFeatures(WebDriver driver,AppiumDriver<MobileElement> _driver,   String subject, String topic, String features) {
		
		WebElement sbjctBtn = driver.findElement(By.xpath("//*[contains(@class,'"+subject+"Color')]"));
		sbjctBtn.click();
		BasePage.sleepForMilliSecond(8000);
		
		
		
		WebElement topicText1 =  driver.findElement(By.xpath("//div[contains(@class,'react-swipeable-view-container')]//label//*[text()='"+topic+"']"));
		
		//AndroidElement topicText2 = (AndroidElement) driver2.findElement(By.xpath("//button[@id='tab0']/../../../../../following-sibling::div//div[@class='posR list'][1]"));	
			
		/*@FindBy (xpath = "//button[@id='tab0']/../../../../../following-sibling::div//div[@class='posR list'][1]")
		private AndroidElement topicButton;*/
		
		//WebElement tpctest = driver.findElement(By.xpath("//button[@id='tab0']/../../../../../following-sibling::div//div[@class='posR list'][2]"));
		
		WebElement tpctest = driver.findElement(By.xpath("//div[contains(@class,'react-swipeable-view-container')]//label//span[text()='Electrostatic Potential And Capacitance']/following-sibling::p"));
		
		topicText1.getLocation();
		System.out.println(tpctest.getLocation());
		
		int startX = tpctest.getLocation().getX();
		int startY = tpctest.getLocation().getY();
		
		System.out.println("xcordinate: " +startX+ " ycordinate: " +startY);
		
		TouchAction actionTouch = new TouchAction(_driver);
		
		actionTouch.tap(PointOption.point(startX, startY)).perform();
		
		
		
		
		
		actionTouch.longPress(PointOption.point(tpctest.getLocation())).perform();
		
		
	
		
		
			
		}
		
		
		
		/*BasePage.sleepForMilliSecond(2000);
		WebElement featuresText = driver.findElement(By.xpath("//*[text()='"+features+"']"));
		featuresText.click();*/
		
	}


	
	

