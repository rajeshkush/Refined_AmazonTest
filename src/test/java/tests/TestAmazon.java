package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class TestAmazon extends BaseClass {

	@Test
	public void shoppingTV() throws InterruptedException {
		
		
				System.out.println("Shopping Started..Hi..");
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				System.out.println("Session created ");
				
			
//				MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Amazon Shopping");
//				el3.click();
				// click to skip the sign in window 
				MobileElement el5 = (MobileElement) driver.findElementById("com.amazon.mShop.android.shopping:id/skip_sign_in_button");
				el5.click();

				MobileElement el2 = (MobileElement) driver.findElementById("com.amazon.mShop.android.shopping:id/rs_search_src_text");
				el2.sendKeys("1 Kg almond");	
				
			
				MobileElement el4 = (MobileElement) driver.findElementById("com.amazon.mShop.android.shopping:id/rs_search_src_text");
				el4.sendKeys("1 Kg almond");	
				
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				System.out.println("Session 1 Kg almond ");
				el4.clear();
				MobileElement el8 = (MobileElement) driver.findElementById("com.amazon.mShop.android.shopping:id/rs_search_src_text");
				
				el8.sendKeys("65 inches TV ");	

			
//				//
				System.out.println("Wait for search 65 inches TV works here ");
//				
//				driver.wait(1);
				System.out.println("Wait works here Thanks ");
			
				
		
	}
}
