package Server;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Prgm {

	public static void main(String[] args) {
		
		AppiumDriverLocalService service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File("C:/Program Files/nodejs/node.exe"))
				.withAppiumJS(new File("C:\\\\Users\\\\Admin\\\\AppData\\\\Local\\\\Programs\\\\appium-desktop\\\\resources\\\\app\\\\node_modules\\\\appium\\\\build\\\\lib\\\\main.js"))
				.withIPAddress("0.0.0.0").usingPort(4723));
				System.out.println("server started");
				service.start();		
				
		
	}

}
