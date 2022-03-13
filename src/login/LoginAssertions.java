package login;

import org.testng.Assert;

import tests.BaseTest;

public class LoginAssertions {
	Login page =new  Login();

	public LoginAssertions verifyDashboard() throws InterruptedException {
		BaseTest.waitVisibilityOf(page.dashboardText);
		Assert.assertTrue(page.dashboardText.isDisplayed());
		return this;
		
	}

	
}
