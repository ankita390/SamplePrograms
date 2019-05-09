package com.applect.meritnation.scripts;

import java.io.IOException;

import org.testng.annotations.Test;
import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.BasePage;
import com.applect.meritnation.pageobject.CreateAccountPage;
import com.applect.meritnation.pageobject.LoginPage;

public class CreateAccountTest extends BaseLib
{
	@Test(invocationCount=1, groups="Regression", priority =1)
	public void TC_001_CreateAccountTest() 
	{
		
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		createAccountPage.createAccount();
		createAccountPage.enterName();
		createAccountPage.enterEmail();
		createAccountPage.enterPassword();
		createAccountPage.enterPincode();
		createAccountPage.enterMobile();
		createAccountPage.enterUserCourse();
		createAccountPage.enterUserClass();
		createAccountPage.selectUserAsStudent();
		createAccountPage.joinNow(driver);
		createAccountPage.enterSchoolName(driver);
		BasePage.logout(driver);
		}
	
	@Test(groups="Regression")

	public void TC_002_ANARegistrationTest() throws IOException{
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.proceedToNext(driver);
		createAccountPage.enterName();
		createAccountPage.enterEmail();
		createAccountPage.enterPassword();
		createAccountPage.enterPincode();
		createAccountPage.enterMobile();
		createAccountPage.enterUserCourse();
		createAccountPage.enterUserClass();
		createAccountPage.selectUserAsStudent();
		createAccountPage.joinNow(driver);
		createAccountPage.enterSchoolName(driver);
		BasePage.logout(driver);
		
	}
		
	 @Test(groups="")
	public void TC_003_brdRegistrationTest(){
		LoginPage loginPage=new LoginPage(driver);
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		loginPage.BrdLogIN();
		createAccountPage.enterName();
		createAccountPage.enterEmail();
		createAccountPage.enterPassword();
		createAccountPage.enterPincode();
		createAccountPage.enterMobile();
		createAccountPage.enterUserCourse();
		createAccountPage.enterUserClass();
		createAccountPage.selectUserAsStudent();
		createAccountPage.joinNow(driver);
		createAccountPage.enterSchoolName(driver);
		BasePage.logout(driver);
		}
		

	@Test(groups="")
	public void TC_004_demoRegistrationTest(){
		LoginPage lp=new LoginPage(driver);
		lp.demologin();
		lp.createAccount();
	}
		

	@Test(groups="")
	public void TC_005_chapterRegistrationTest(){
		LoginPage lp = new LoginPage(driver);
		lp.chapterregistration();
		lp.createAccount();
	}
		    @Test(groups="")
	public void TC_006_ncertregistration(){
			  LoginPage lp=new LoginPage(driver);
			  lp.ncertregistration();
			  lp.createAccount();
		  }
		  
		  @Test(groups="")
	public void TC_008_testregistration(){
			  LoginPage lp = new LoginPage(driver);
			  lp.testprep(driver);
			  lp.createAccount();
		  }
		 @Test(groups="")
	public void TC_009_livenewregistration(){
			  LoginPage lp= new LoginPage(driver);
			  lp.livenewreg();
		  }
	@Test(groups="")
	public void TC_010_liveregistration(){
		LoginPage lp=new LoginPage(driver);
		lp.livereg();
		lp.createAccount();
	}
			  
	@Test(groups="CurrentTas")
	public void TC_011_juniorregis() throws Exception{
		LoginPage lp=new LoginPage(driver);
		lp.juniorregistration(driver);
		
	}

	@Test(groups="") 
	public void TC_012_chapwaitreg(){
		LoginPage lp=new LoginPage(driver);
		lp.chapwaitreg(driver);
	}
		    
	@Test(groups="")
	public void TC_013_ncrtwaitreg(){
		LoginPage lp=new LoginPage(driver);
		lp.ncertwaitreg(driver);
	}
	
	
	
}
