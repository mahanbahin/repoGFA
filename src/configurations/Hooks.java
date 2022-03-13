package configurations;


import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.MobileCapabilityType;


@SuppressWarnings("rawtypes")
public class Hooks {
		
	
	public AndroidDriver<MobileElement> driverSetUp(AndroidDriver<MobileElement> driver) {
		DesiredCapabilities caps = new DesiredCapabilities();

		/*File appFolder = new File("src");
		File app = new File(appFolder, "app.apk");
		
		caps.setCapability("deviceName", "zaroqi");
		caps.setCapability("platformName", "Android");
		caps.setCapability("app", app.getAbsolutePath());
		caps.setCapability( "noReset", true);
		caps.setCapability( "automatioName","uiautomator2");
*/
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulatorQ2");
		caps.setCapability(MobileCapabilityType.APP, "G:\\eclipse-work1\\repoGFA-master task\\src\\app.apk");
		caps.setCapability("appActivity", "com.restaurant365.ui.splash.SplashActivity");
		caps.setCapability("appPackage", "com.restaurant365.dev");

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);

		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return driver;
	}
}