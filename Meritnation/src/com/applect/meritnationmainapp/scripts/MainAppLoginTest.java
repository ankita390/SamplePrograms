package com.applect.meritnationmainapp.scripts;


import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.MainAppLoginPage;

import io.appium.java_client.MobileElement;

public class MainAppLoginTest extends BaseLib {
	
	@Test(groups = "MainApp")
	public void TC_001_VerifyValidLogin() throws MalformedURLException, InterruptedException{
		
		MainAppLoginPage mainAppLoginPage = new MainAppLoginPage(driver);
		Thread.sleep(5000);
	//	MobileElement hgh = _driver.findElement(By.xpath("//android.widget.TextView[@text='LOGIN']"));
	//	hgh.click();
		mainAppLoginPage.validLogin();
		Thread.sleep(10000);
		
		
	}

}
