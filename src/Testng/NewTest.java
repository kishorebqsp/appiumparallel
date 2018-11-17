package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void facebook() {
	  Reporter.log("loginnn",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("BM",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("AM",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("BC",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("AC",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("BT",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("AT",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("BS",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("AS",true);
  }

}
