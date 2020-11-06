package tests;


//Library used to verify if URL is malformed
import java.net.MalformedURLException;

//Library used to create URL for the Appium server
import java.net.URL;

// TestNG Libraries
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Libraries of android driver and android element
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

//Libraries for configuring Desired Capabilities
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	static AndroidDriver<AndroidElement> driver;
	
	
	/**
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	//TestNG annotation for @Before Test
	@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException {
		
		try {
		
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
		///AppiumTestProject/src/test/resources/apps/Amazon_shopping.apk
		// Java package of the tested Android app
		cap.setCapability("appPackage","com.amazon.mShop.android.shopping");
		
		// An activity name for the Android activity you want to run from your package.
		cap.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("clearSystemFiles", "true");
		
		// Constructor to initialize driver object with new Url and Capabilities
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<AndroidElement> (url,cap);
		
			} catch(Exception exp) {
						
						System.out.println(exp.getCause());
						System.out.println(exp.getMessage());
						exp.printStackTrace();

			}
		
		
	}
	
	@Test
	public void mobiletest() {
		System.out.println("Amazon Shopping Test  Start here ");
	}
	
	//TestNG annotation for @After Test
	@AfterTest
	public void teardown() {
//		driver.close();
		driver.quit();
		
	}

}
