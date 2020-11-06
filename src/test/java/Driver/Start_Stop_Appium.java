package Driver;

import java.io.File;
import java.util.HashMap;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Start_Stop_Appium {

	private static AppiumDriverLocalService server;
	
	/**
	 * Starting the Appium Server through Code using AppiumServiceBuilder
	 * 
	 */
	public static void startAppiumServer() {
		
		
		AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
		
//         Use any port, in case the default 4723 is already taken (May be by another Appium server)
//         serviceBuilder.usingAnyFreePort();
        
        serviceBuilder.withIPAddress("127.0.0.1");
        serviceBuilder.usingPort(4723);
        
        // Tell serviceBuilder where node is installed. Or set this path in an environment variable named NODE_PATH
        serviceBuilder.usingDriverExecutable(new File("/usr/local/bin/node"));
        
        // Tell serviceBuilder where Appium is installed. Or set this path in an environment variable named APPIUM_PATH
        serviceBuilder.withAppiumJS(new File("/usr/local/bin/appium"));

        HashMap<String, String> environment = new HashMap<String, String>();
        environment.put("PATH", "/usr/local/bin:" + System.getenv("PATH"));
        serviceBuilder.withEnvironment(environment);

        server = AppiumDriverLocalService.buildService(serviceBuilder);
        server.start();
	}
	/**
	 * Stop's the Appium Server and Close the Connection
	 */
	public static void stopAppiumServer() {
        server.stop();
    }
}
