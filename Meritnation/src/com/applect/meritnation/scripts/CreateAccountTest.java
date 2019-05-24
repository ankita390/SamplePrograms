package com.applect.meritnation.scripts;

import java.io.IOException;

import org.testng.annotations.Test;
import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.generic.WaitStatementLib;
import com.applect.meritnation.pageobject.BasePage;
import com.applect.meritnation.pageobject.CreateAccountPage;
import com.applect.meritnation.pageobject.LoginPage;

public class CreateAccountTest extends BaseLib
{
	@Test(invocationCount=1, groups="Regression", priority =1)
	public void TC_001_CreateAccountTest() 
	{
		BasePage.signup(driver);
		BasePage.logout(driver);
		}
	
	@Test(groups="")

	public void TC_002_ANARegistrationTest() throws IOException{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.proceedToNext(driver);
		BasePage.signup(driver);
		BasePage.logout(driver);
		
	}
		
	 @Test(groups="")
	public void TC_003_brdRegistrationTest(){
		LoginPage loginPage=new LoginPage(driver);
		loginPage.BrdLogIN();
		BasePage.signup(driver);
		BasePage.logout(driver);
		}
		
	//to test
	@Test(groups="")
	public void TC_004_demoRegistrationTest(){
		LoginPage lp=new LoginPage(driver);
		lp.demologin();
		BasePage.signup(driver);
		BasePage.logout(driver);
	}
		

	@Test(groups="")
	public void TC_005_chapterRegistrationTest(){
		LoginPage lp = new LoginPage(driver);
		lp.chapterregistration();
		BasePage.signup(driver);
		BasePage.logout(driver);
	}
	
	//to test
		    @Test(groups="") 
	public void TC_006_ncertregistration(){
			  LoginPage lp=new LoginPage(driver);
			  lp.ncertregistration();
			  lp.enterUserName(driver);
			  
		  }
		  
		  @Test(groups="")
	public void TC_008_testregistration(){
			  LoginPage lp = new LoginPage(driver);
			  lp.testprep(driver);
			  BasePage.signup(driver);
			  lp.logout();
		  }
		 @Test(groups="")
	public void TC_009_livenewregistration(){
			  LoginPage lp= new LoginPage(driver);
			  lp.livenewreg();
			  BasePage.signup(driver);
			  CreateAccountPage cap=new CreateAccountPage(driver);
			  cap.gotodashboard(driver);
			  BasePage.logout(driver);
		  }
			  

	@Test(groups="")
	public void TC_010_juniorregis() throws Exception{
		LoginPage lp=new LoginPage(driver);
		lp.juniorregistration(driver);
		
	}

	@Test(groups="") 
	public void TC_011_chapwaitreg(){
		LoginPage lp=new LoginPage(driver);
		lp.chapwaitreg(driver);
	}
		    
	@Test(groups="CurrentTask")
	public void TC_012_ncrtwaitreg(){
		LoginPage lp=new LoginPage(driver);
		lp.ncertwaitreg(driver);
		BasePage.logout(driver);
	}
	
	
	
}
