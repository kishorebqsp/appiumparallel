package Testng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SAmple {
	public AndroidDriver driver;
	@BeforeMethod
	public void openapp() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities d = new DesiredCapabilities();
		d.setCapability("platformVersion","6.0.1");
		d.setCapability("platformName","android");
		d.setCapability("deviceName","Asus");
		d.setCapability("appActivity","com.myntra.android.activities.LoginRegisterActivity");
		d.setCapability("appPackage", "com.myntra.android");
		URL u=new URL("http://0.0.0.0:4726/wd/hub");
		 AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(u, d);
		 System.out.println(driver.getContext());
		 Thread.sleep(6000);
	}

	@Test
	public void login() throws InterruptedException
	{
		 driver.findElementByXPath("//android.widget.TextView[@index='0']").click();
		 Thread.sleep(9000);
		// String e = driver.getTitle();
		 Aessert.assertEquals(driver.findElement(By.xpath()), "A");
		 driver.findElementByXPath("//android.widget.TextView[@text='Log In   .   Sign Up']").click();

}
}
