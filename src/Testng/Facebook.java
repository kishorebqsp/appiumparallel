package Testng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Facebook {

	@Parameters({"platformversion","devicename","appAct","appPac","URL"})
	@Test
	public void openapp(String platformversion,String devicename ,String appAct,String appPac,String URL) throws MalformedURLException
	{
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability("platformVersion",platformversion);
		d.setCapability("platformName","android");
		d.setCapability("deviceName",devicename);
		d.setCapability("appActivity",appAct);
		d.setCapability("appPackage",appPac);

		AndroidDriver driver=new AndroidDriver(new URL("http://"+URL),d);
	}

	
	}
