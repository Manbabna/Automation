package Run;

import org.testng.annotations.Test;

import Codetostar.Useability;
import Pages.facebook.Home2;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Functions extends Useability {
  //public WebDriver driver;
	@Test(priority=1,dependsOnMethods = "g")
  public void f() {
	
	Home2 ob=new Home2(driver);
	  ob.emailofinput("mnoor@yahoo.com");
	  ob.psswrdoffield("Masud");
	  ob.Signin();
	  
	  ob.emailofinput("noor@gmail.com");
	  ob.psswrdoffield("to");
	  ob.Signin(); 
	  }
	
	@Test(priority=2)
	public void g() {
		System.out.println("g");
		driver.findElement(By.linkText("di"));
	}
	
 /* @BeforeClass
  public void beforeClass() {
  Driver("Chrome", "https://facebook.com");
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

}*/

}

