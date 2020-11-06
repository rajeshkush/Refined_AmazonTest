package capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public class DCapabilities {

	public void setup() {
	// To create an object of Desired Capabilities
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
			
			// Name of the OS: Android –  My device is running Android 
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			
			// Mobile OS version –  My device is running Android 4.4.2
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
			
			// Device name:  – I am using Samsung device
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.65.110:5555");
			
			// Path to <project folder>/Apps -> Amazon/Amazon .apk file
			cap.setCapability(MobileCapabilityType.APP, "D:\\KOPLAYER\\download\\Amazon_shopping.apk");
			
			// Java package of the tested Android app
			cap.setCapability("appPackage","com.amazon.mShop.android.shopping");
			
			// An activity name for the Android activity you want to run from your package.
			cap.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
			
			cap.setCapability("automationName", "UiAutomator2");
			cap.setCapability("clearSystemFiles", "true");
			
	}
}
