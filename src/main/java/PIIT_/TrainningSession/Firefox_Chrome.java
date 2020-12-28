package PIIT_.TrainningSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Chrome {
    static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver("Chrome", "https://www.facebook.com");
		//Driver("Firefox", "https://www.facebook.com");
		
		 WebElement CreateNewAccounts=driver.findElement(By.linkText("Create New Account")) ;
	        boolean button=CreateNewAccounts.isDisplayed();
	        System.out.println(button);
	        WebElement ds=driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on F')]"));
	        String textheading=ds.getText();
	        System.out.println(textheading);
	        


	}
	public static void Driver(String browser, String URI) {
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
