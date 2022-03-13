package tests;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
	public static AndroidDriver<MobileElement> driver ;
	static DesiredCapabilities caps = new DesiredCapabilities();
	
	public BaseTest() {
		
			PageFactory.initElements(new AppiumFieldDecorator(BaseTest.driver,Duration.ofSeconds(50)), this);
	}
	

	@BeforeClass
	public static void driverSetUp() {
		File appFolder = new File("src");
		File app = new File(appFolder, "app.apk");
		
		
		caps.setCapability("deviceName", "zaroqi");
		caps.setCapability("platformName", "Android");
		caps.setCapability("app", app.getAbsolutePath());
		caps.setCapability( "noReset", true);
		caps.setCapability( "automatioName","uiautomator2");

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http:0.0.0.0:4723/wd/hub"), caps);

		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		driverSetUp();
	}

	public static void waitVisibilityOf(MobileElement element) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 40);
		webDriverWait.until(ExpectedConditions.visibilityOf(element));
	}
}
