package com.applect.meritnation.scripts;

import org.testng.annotations.Test;

import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.BasePage;
import com.applect.meritnation.pageobject.LoginPage;
import com.applect.meritnation.pageobject.SearchPage;


public class SearchTest extends BaseLib
{
	@Test(groups="Regression")
	public void SearchTest()
	{
		
		SearchPage searchPage = new SearchPage(driver); 
		BasePage.login(driver);
		searchPage.enterSearchBox(driver);
		searchPage.clickFirstSearchedOption();
		searchPage.verifySearchedResult(driver);
}
}
