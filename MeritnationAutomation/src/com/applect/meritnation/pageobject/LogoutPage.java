package com.applect.meritnation.pageobject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.applect.meritnation.generic.ExcelUtils;


public class LogoutPage {
	WebDriver driver;
	@FindBy(xpath="//header[@class='main-header']/div/div/a[2]")
	private WebElement logo;
	@FindBy(xpath="//a[text()='Purchase']")
	private WebElement purchaseBtn;
	@FindBy(xpath="//button[text()='Call me']")
	private WebElement callmeBtn;
	@FindBy(xpath="//ul[@class='menu-items']/li[2]/a")
	private WebElement ncertSolnLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[3]/a")
	private WebElement entranceExmLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[4]/a")
	private WebElement classTwlveLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[5]/a")
	private WebElement classElvnLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[6]/a")
	private WebElement classTenLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[7]/a")
	private WebElement classNineLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[8]/a")
	private WebElement classEightLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[9]/a")
	private WebElement classSevenLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[10]/a")
	private WebElement classSixLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[11]/a")
	private WebElement classFiveLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[12]/a")
	private WebElement classFourLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[13]/a")
	private WebElement classThreeLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[14]/a")
	private WebElement classTwoLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[15]/a")
	private WebElement classOneLnk;
	@FindBy(xpath="//div[@class='banner-content']/div[2]/a[1]")
	private WebElement classFour_TwelveBtn;
	@FindBy(xpath="//div[@class='banner-content']/div[2]/a[2]")
	private WebElement entranceExmBtn;
	
	
	
	
		    
	public void clickLinkAndVerifyURL(WebDriver driver){	
	WebElement[] strs = {logo,purchaseBtn,ncertSolnLnk,entranceExmLnk,classTwlveLnk,classElvnLnk,classTenLnk,classNineLnk,classEightLnk,classSevenLnk,classSixLnk,classFiveLnk,classFourLnk,classThreeLnk,classTwoLnk,classOneLnk,classFour_TwelveBtn,entranceExmBtn};   /*alllinks.toArray(new WebElement[0]);*/
		List<WebElement> list = new ArrayList<WebElement>(Arrays.asList(strs));
		for(int i =0; i < strs.length;i++){
			list.get(i).click();
			Set <String> allWindow = driver.getWindowHandles();
			if(allWindow.size()==1){
				String displayedURL = driver.getCurrentUrl();
				driver.navigate().back();
					for(int j=(i+42);j<100;j++){
						BasePage.sleepForMilliSecond(1000);
					String actualURL = ExcelUtils.readData("TestData", j, 1).toString();
					Assert.assertTrue(displayedURL.equals(actualURL),"URL on address bar is not same as expected when clicked on "+ (j+1) +"th row (Written in testData sheet) on logout page");
					if(displayedURL.equals(actualURL)){
						break;
					}
					else
					{
						continue;
					}
				}
			}
			else{
				Iterator<String> itr = allWindow.iterator();
				List<String> myl = new ArrayList<String>();
				for (int k =0;k<allWindow.size();k++)
				{
					myl.add(itr.next());
				}
				driver.switchTo().window(myl.get(1));
				BasePage.sleepForMilliSecond(1000);
				String displayedURL = driver.getCurrentUrl();
				driver.close();
				driver.switchTo().window(myl.get(0));
				for(int j=(i+42);j<100;j++){
					BasePage.sleepForMilliSecond(1000);
				String actualURL = ExcelUtils.readData("TestData", j, 1).toString();
				Assert.assertTrue(displayedURL.equals(actualURL),"URL on address bar is not same as expected when clicked on "+ (j+1) +"th row (Written in testData sheet) on logout page");
				if(displayedURL.equals(actualURL)){
					break;
				}
				else
				{
					continue;
				}
			}
		}
	}
}
	
	
	
	
	

	
	public LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
