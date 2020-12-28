package PIIT_.TrainningSession;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Popups {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.get("https://www.qatarairways.com/en/homepage.html");
        driver.manage().window().maximize();
       /* WebElement sb=driver.findElement(By.name("submit"));
        sb.click();
        //driver.switchTo().alert().accept();
       // driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();*/
        Thread.sleep(6000);
        driver.findElement(By.id("cookie-close")).click();
        WebElement dts=driver.findElement(By.id("T7-departure_1"));
        dts.click();
        driver.findElement(By.xpath("(//*[text()='26'])[2]")).click();
        
        //How to take screenshots and save
        File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(shots, new File("C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\Pictures\\Airlines.png"));
        //method for taking screenshot
        
        

	}

}
