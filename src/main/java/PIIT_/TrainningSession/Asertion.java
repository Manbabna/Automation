package PIIT_.TrainningSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Asertion {
	static WebDriver driver;
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\Drivers\\chromedriver.exe");
        //driver=new ChromeDriver();
		//Firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\Drivers\\geckodriver.exe");
        driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement CreateNewAccounts=driver.findElement(By.linkText("Create New Account")) ;
        boolean button=CreateNewAccounts.isDisplayed();
        System.out.println(button);
        WebElement ds=driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on F')]"));
        String textheading=ds.getText();
        System.out.println(textheading);

	}


}
