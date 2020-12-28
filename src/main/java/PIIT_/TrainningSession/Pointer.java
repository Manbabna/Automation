package PIIT_.TrainningSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pointer {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        Actions its=new Actions(driver);
        its.moveToElement(driver.findElement(By.xpath("//*[text()='Hello, Sign in']"))).build().perform();
        its.moveToElement(driver.findElement(By.xpath("(//*[@class='nav-line-1'])[3]"))).build().perform();
        its.moveToElement(driver.findElement(By.xpath("(//span[text()='Sign in'][2])"))).click().build().perform();
        its.keyDown(driver.findElement(By.id("createAccountSubmit")), Keys.LEFT_SHIFT).click().build().perform();
        its.keyUp(Keys.LEFT_SHIFT).build().perform();
        
        
	}

}
