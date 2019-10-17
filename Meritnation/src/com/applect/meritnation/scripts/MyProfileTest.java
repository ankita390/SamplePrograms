package com.applect.meritnation.scripts;

import org.testng.annotations.Test;
import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.BasePage;
import com.applect.meritnation.pageobject.CreateAccountPage;
import com.applect.meritnation.pageobject.MyProfilePage;

public class MyProfileTest extends BaseLib {

	@Test
	public void TestProfile() {

		BasePage.login(driver);
		myprofilepage.clickMeMenu();
		myprofilepage.clickMyprofile();
		myprofilepage.clickViewAllFriends();
		myprofilepage.clickAllBadges();
		myprofilepage.clickStanding();
		myprofilepage.editProfile();
		myprofilepage.changeProfilePic();
		myprofilepage.viewSubscriptionDetails(driver);
		// myprofilepage.verifyMobileNumber();
	}

}
