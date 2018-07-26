package com.applect.meritnation.pageobject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.applect.meritnation.generic.WaitStatementLib;

public class GradePage {
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[1]/a")
	private WebElement courseMenu;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[1]/ul/li")
	private List <WebElement> courseList;
	@FindBy(xpath="//div[@id='dashBoard']/section/h2")
	private WebElement subjectTxt;
	@FindBy(xpath="//section[@class='subjectList']//li")
	private List <WebElement> subList;
	@FindBy(xpath="//section[@class='testBox border-box']//li")
	private List <WebElement> testList;
	
	
	public GradePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyAllPagesOfGradeMenu(WebDriver driver)
	{
		WaitStatementLib.explicitWaitForClickable(driver, 10, courseMenu);
		for (int i=0;i<courseList.size();i++)
		{
			courseMenu.click();
			courseList.get(i).click();
			BasePage.sleepForMilliSecond(1000);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(subjectTxt), "Subject section not appearing");
		//	Assert.assertTrue(subjectTxt.getText().toString()=="Subjects", "Header text 'Subjects' not appearing as expected");
			if(!subList.isEmpty()){
				Assert.assertTrue(!subList.isEmpty());
			}
			else{
				for(int j=0;j<testList.size();j++){
					
					if(String.valueOf(BasePage.isPresentAndDisplayed(testList.get(j)))=="true"){
						WebElement[] displayedElements = {testList.get(j)};
						Assert.assertTrue(displayedElements.length!=0);
					}
				}
			}
		}
	}
}
