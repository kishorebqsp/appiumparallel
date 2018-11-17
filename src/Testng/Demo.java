package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void calls()
	{
		Reporter.log("calls",true);
	}
	
	@Test(invocationCount=4,enabled=false)
	public void settings()
	{
		Reporter.log("settings",true);
	}

	@Test(priority=1,invocationCount=0)
	public void chats()
	{
		Reporter.log("chats",true);
	}
	
}
