package configurations;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

@SuppressWarnings("rawtypes")
public class Hooks {
		
	
	public AndroidDriver<MobileElement> driverSetUp(AndroidDriver<MobileElement> driver) {
		DesiredCapabilities caps = new DesiredCapabilities();
		File appFolder = new File("src");
		File app = new File(appFolder, "app.apk");
		
		caps.setCapability("deviceName", "zaroqi");
		caps.setCapability("platformName", "Android");
		caps.setCapability("app", app.getAbsolutePath());
		caps.setCapability( "noReset", true);
		caps.setCapability( "automatioName","uiautomator2");


		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
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