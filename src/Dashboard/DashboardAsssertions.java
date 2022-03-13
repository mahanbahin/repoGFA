package Dashboard;

import org.testng.Assert;

import tests.BaseTest;

public class DashboardAsssertions {
	Dashboard page =new  Dashboard();

	public DashboardAsssertions verifyHamburgerMenuVisbility() throws InterruptedException {
		BaseTest.waitVisibilityOf(page.invenortyCountsMenuItem);
		Assert.assertTrue(page.invenortyCountsMenuItem.isDisplayed());
		return this;	
	}
}
