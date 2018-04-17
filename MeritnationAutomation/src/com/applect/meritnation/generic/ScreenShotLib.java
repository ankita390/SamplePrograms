package com.applect.meritnation.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScreenShotLib 
{
	public void getScreenShot(WebDriver driver, String filename, String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome")){
			
			EventFiringWebDriver efw= new EventFiringWebDriver(driver);
			File srcFile = efw.getScreenshotAs(OutputType.FILE);
			File destFile = new File("/var/www/mn-testing/MeritnationAutomation/Screenshot/Chrome/ "+ filename+".png");
			
			
			try
			{
				FileUtils.copyFile(srcFile, destFile);
			} 
			catch (IOException e) 
			{
			
				e.printStackTrace();
				
			}
		}
		else if (browserName.equalsIgnoreCase("firefox")){
			EventFiringWebDriver efw= new EventFiringWebDriver(driver);
			File srcFile = efw.getScreenshotAs(OutputType.FILE);
			File destFile = new File("/var/www/mn-testing/MeritnationAutomation/Screenshot/Firefox/ "+ filename+".png");
			
			
			try
			{
				FileUtils.copyFile(srcFile, destFile);
			} 
			catch (IOException e) 
			{
			
				e.printStackTrace();
				
			}
			
		}
		
		
	}
}	


