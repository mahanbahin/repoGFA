package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import login.LoginActions;
import login.LoginAssertions;

public class LoginTest extends BaseTest{
//y	LoginActions loginActions = new LoginActions();
//	LoginAssertions loginAssertions = new LoginAssertions();
	
	LoginActions loginActions;
	LoginAssertions loginAssertions;
	@BeforeClass
	public void beforeClass() {
		loginActions = new LoginActions();
		loginAssertions = new LoginAssertions();
	}

	@Test
	public void loginToApp() throws Throwable {
		loginActions
		.typeInUserName("tester2")
		.clickNextButton()
		.typeInPassword("123")
		.clickLoginButton(); 
		System.out.println("Login Successfully");
		loginAssertions
		.verifyDashboard();
		System.out.println("Assertion Successfully");
	}
	
	
	

}
