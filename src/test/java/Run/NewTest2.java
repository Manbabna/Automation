package Run;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Codetostar.Useability;
import Pages.facebook.Forgot_Password;
import Pages.facebook.Home;
import Pages.facebook.Home2;
import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest2 extends Useability {
	public WebDriver driver;
	@Test
  public void f() {
		 Home2 ob=new Home2(driver);
		  ob.emailofinput("mnoor@yahoo.com");
		  ob.psswrdoffield("Masud");
		  ob.Signin();
		  
		  ob.emailofinput("noor@gmail.com");
		  ob.psswrdoffield("to");
		  ob.Signin();
  }
	@Test
	public void Forgotlinkforpassword() {
	//Goto facebook and verify forgot password	
	Home2 it= new Home2(driver);
	it.Forgotlink();
	Forgot_Password ds=new Forgot_Password(driver);
	
	SoftAssert gt=new SoftAssert();
	String Forgoturtext=ds.ForgotYourAccountText().getText();
	System.out.println(Forgoturtext);
	gt.assertEquals(Forgoturtext, "Find Your Account");
	
	//assertEquals(Forgoturtext, "Find Your Account");
	//ds.searchfieldemail("noor@gmail.com");
	//ds.buttonlk();
	gt.assertAll();	
	}
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	 // Driver("Chrome", "https://www.facebook.com");
  }

  @AfterClass
  public void afterClass() {
  }
  public void Driver(String browser, String URI) {
		if(browser.equalsIgnoreCase("Chrome")) {
		String director=System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", director+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
      driver.get(URI);
      driver.manage().window().maximize();
		
	}else if (browser.equalsIgnoreCase("Firefox")) {
		String director=System.getProperty("user.dir");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", director+"\\Drivers\\geckodriver.exe");
      driver=new FirefoxDriver();
      driver.get(URI);
      driver.manage().window().maximize();

}

  }
}
