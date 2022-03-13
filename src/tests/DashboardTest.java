package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Dashboard.DashboardActions;
import Dashboard.DashboardAsssertions;


public class DashboardTest {
	DashboardActions dashboardActions;
	DashboardAsssertions dashboardAssertions;
	
	@BeforeClass
	public void beforeClass() {
		dashboardActions = new DashboardActions();
		dashboardAssertions = new DashboardAsssertions();
	}

	@Test
	public void navigateToInvoentoryCounts() throws Throwable {
		dashboardActions
		.clickHamburgerMenu();
		System.out.println("clicked menu");
		dashboardAssertions
		.verifyHamburgerMenuVisbility();
		dashboardActions.clickInventoryCounts(); 
		Thread.sleep(8000);
		//todo assert the inveentory counts 
		System.out.println("Assertion Successfully");
	}
}
