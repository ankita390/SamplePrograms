package com.applect.meritnation.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfessorApiPage {
	
	@FindBy(xpath="//span[text()='professor_id']/following-sibling::span")
	private WebElement professorID;

	
	public void checkProfessorID(){
		//Assert.assertTrue(!(professorID.getText()==null));
	}
	
	
	public ProfessorApiPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
