package Codetostar;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Useability {

	public WebDriver driver;
	
	 @Parameters({"browser","URI"})
  @BeforeClass
  public void beforeClass(String browser,String site) {
		if(browser.equalsIgnoreCase("Chrome")) {
			String director=System.getProperty("user.dir");
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\Drivers\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", director+"\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
	  driver.get(site);
	  driver.manage().window().maximize();
			
		}else if (browser.equalsIgnoreCase("Firefox")) {
			String director=System.getProperty("user.dir");
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\Drivers\\geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", director+"\\Drivers\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get(site);
	  driver.manage().window().maximize();

	}

	}

  }

 
		


