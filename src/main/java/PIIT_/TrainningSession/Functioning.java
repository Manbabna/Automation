package PIIT_.TrainningSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functioning {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        
        WebElement CreateAnAccount=driver.findElement(By.xpath("//a[@id='u_0_2']"));
        CreateAnAccount.click();
        
         WebElement Sign=driver.findElement(By.xpath("(//*[text()='Log In'])[1]"));
         Sign.click();

	}

}

