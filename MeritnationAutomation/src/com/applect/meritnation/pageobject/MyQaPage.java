package com.applect.meritnation.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.applect.meritnation.generic.ExcelUtils;
import com.applect.meritnation.generic.WaitStatementLib;

public class MyQaPage {

	@FindBy(xpath="//ul[@class='navBox_bottom']/li[@id='ana_menu']/a")
	private WebElement qadrpdwnbx;
	@FindBy(xpath="//ul[@class='navBox_bottom']/li[@id='ana_menu']/ul/li/a[text()= 'Recommended Questions']")
	private WebElement recommendedprojects;
	@FindBy(xpath="//span[@class='circle-float-ask']")
	private WebElement redaskbtn;
	@FindBy(xpath="//div[@class='editor_Box editorBorderBottom']/div[@id='MessageHtmlBox']")
	private WebElement questiontxtbx;
	@FindBy(xpath="//div[@class='editor_Box editorBorderBottom']/div/a[@class='ana_btn editorBox_btn margin_top_10px']")
	private WebElement greenasktbtn;
	@FindBy(xpath="//div[@class='showChapterSuggestion group marginTop17px']/ul/li[@class='sprite sprite-physics']")
	private WebElement tagphysicsicon;
	@FindBy(id="chapterAutoCompleteBox")
	private WebElement chaptertxtbx;
	@FindBy(xpath="//div[@class='floatLeft animateBtn']/div[@id='submitQuestionAsk']")
	private WebElement finalsubmiticon;
	@FindBy(xpath="//div[@class='mnPopupFront']/a")
	private WebElement crossIcon;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public MyQaPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

	public void clickRecommendedQuestions(WebDriver driver)
	{
		WaitStatementLib.implicitWaitForSecond(driver, 5);
		BasePage.focusElement(qadrpdwnbx, driver);
		BasePage.selectUsingOption(qadrpdwnbx, "Recommended Questions");
		recommendedprojects.click();
		try{
			Thread.sleep(5000);
			qadrpdwnbx.sendKeys(Keys.ARROW_DOWN);
		}
		catch(InterruptedException e)
		{
			qadrpdwnbx.sendKeys(Keys.ARROW_DOWN);
		}
	}
	public void clickAsk(WebDriver driver)
	{
		WaitStatementLib.implicitWaitForSecond(driver, 5);
		redaskbtn.click();
		try{
			Thread.sleep(5000);
			}
		catch(InterruptedException e)
		{
			
		}
	
	}

	public void enterQuestion(WebDriver driver) 
	{
		try{
			Thread.sleep(5000);
			String question = ExcelUtils.readData("TestData", 2, 1);
			question = question + BasePage.randomString() + "?";
			BasePage.focusElement(questiontxtbx, driver);
			questiontxtbx.sendKeys(question);
		}
		catch(InterruptedException e)
		{
			String question = ExcelUtils.readData("TestData", 2, 1);
			question = question + BasePage.randomString() + "?";
			questiontxtbx.sendKeys(question);
		}
		
	}
	public void submitQuestion()
	{
		try{
			greenasktbtn.click();
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			greenasktbtn.click();
		}
	}
	public void tagQuestion()
	{
		try{
			tagphysicsicon.click();
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			tagphysicsicon.click();	
		}
	}
	public void chooseChapter(WebDriver driver)
	{
		try{
			String chaptername = ExcelUtils.readData("TestData", 2, 2);	
			chaptertxtbx.sendKeys(chaptername);
			Thread.sleep(2000);
			chaptertxtbx.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			chaptertxtbx.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			
		}
	}
	public void finalSubmit()
	{
		try{
		finalsubmiticon.click();
		Thread.sleep(2000);
	}
		catch(InterruptedException e)
		{
			
		}
	}
	public void closeQuestenPostedPopup()
	{
		try{
			crossIcon.click();
			Thread.sleep(2000);
		}
			catch(InterruptedException e)
			{	
	}
}
}
