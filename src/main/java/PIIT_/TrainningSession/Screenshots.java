package PIIT_.TrainningSession;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
    static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
	    	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
        driver.get("https://www.qatarairways.com/en/homepage.html");
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(6000);
        driver.findElement(By.id("cookie-close")).click();
        Picture("Airlines");
        WebElement dts=driver.findElement(By.id("T7-departure_1"));
        dts.click();
        Picture("Cockies");
        
        driver.findElement(By.xpath("(//*[text()='26'])[2]")).click();
        Thread.sleep(6000);
        Picture("Dates");
        
        }
	private static void Picture(String pic) throws IOException {
		// TODO Auto-generated method stub
		//capture sys date time
		//convert to string formate
		//use with picture name
		Date dt=new Date();
		System.out.println(dt);
		String si=dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(si);
		File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(shots,new File("C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\Pictures\\"+si+pic+".png"));
        				
	}
}
