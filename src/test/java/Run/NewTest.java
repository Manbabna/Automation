package Run;

import org.testng.annotations.Test;

import Pages.facebook.Home;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
  public WebDriver driver;
  @Test
  public void f() {
	  Home ob=new Home(driver);
	  ob.emailofinput();
	  ob.psswrdoffield();
	  ob.Signin();
	 //using Home 
  }
  @BeforeClass
  public void beforeClass() {
	
	  Driver("Chrome", "https://www.facebook.com");
  }
  

  @AfterClass
  public void afterClass() {
  
	  //driver.close();
	 // System.out.println("Annotation is afterClass");
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
