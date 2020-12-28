package PIIT_.TrainningSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement CreateAnAccounts=driver.findElement(By.linkText("Create New Account"));
        CreateAnAccounts.click();
        Thread.sleep(6000);
        WebElement birth=driver.findElement(By.name("birthday_month"));
        Select ob=new Select(birth);
        //ob.selectByValue("6");
        ob.selectByVisibleText("Jan");
        
        WebElement day=driver.findElement(By.name("birthday_day"));
        Select di=new Select(day);
        di.selectByValue("31");
        
        WebElement year=driver.findElement(By.name("birthday_year"));
        Select yr=new Select(year);
        yr.selectByValue("1985");
        
        WebElement gr=driver.findElement(By.xpath("(//*[@class='_8esa'])[2]"));
        gr.click();
		
	}

}
