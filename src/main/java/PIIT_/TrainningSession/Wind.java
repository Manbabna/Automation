package PIIT_.TrainningSession;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wind {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        Actions its=new Actions(driver);
        its.moveToElement(driver.findElement(By.xpath("//*[text()='Hello, Sign in']"))).build().perform();
        //its.moveToElement(driver.findElement(By.xpath("(//span[text()='Sign in'][2])"))).click().build().perform();
        its.moveToElement(driver.findElement(By.xpath("//*[text()='Hello, Sign in']"))).click().build().perform();
        
        String parentWindowHandles=driver.getWindowHandle();
       // System.out.print(parentWindowHandles);
        its.keyDown(driver.findElement(By.id("createAccountSubmit")), Keys.LEFT_SHIFT).click().build().perform();
        its.keyUp(Keys.LEFT_SHIFT).build().perform();
        
        
        Set<String> MultiplesWindows=driver.getWindowHandles();
        for (String Window : MultiplesWindows) {
        	if (Window.equalsIgnoreCase(parentWindowHandles)) {
        		System.out.println("This to switch");
        	}else {
        		driver.switchTo().window(Window);
        	}
        }
        
        WebElement name=driver.findElement(By.id("ap_customer_name"));
        name.sendKeys("name");
        driver.switchTo().window(parentWindowHandles);
        WebElement user6=driver.findElement(By.id("ap_customer_name"));
        user6.sendKeys("name");
        		
        
        
        
        
	}

}
