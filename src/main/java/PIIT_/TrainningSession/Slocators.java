package PIIT_.TrainningSession;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slocators {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       /* driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        WebElement Search=driver.findElement(By.id("twotabsearchtextbox"));
        
        WebElement Searchbutton=driver.findElement(By.id("nav-search-submit-text"));
        Search.sendKeys("Phones");
        Searchbutton.click();*/
        
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement Name=driver.findElement(By.name("email"));
        WebElement Psswd=driver.findElement(By.name("pass"));
        WebElement Sign=driver.findElement(By.name("login"));
        //WebElement Forgot=driver.findElement(By.partialLinkText("Forgot"));
        WebElement Forgot=driver.findElement(By.linkText("Forgot Password?"));
        WebElement Signbt=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/button"));
        //Name.sendKeys("manbabn@gmail.com");
        //Psswd.sendKeys("Masud");
        //Sign.click();
        Signbt.click();
        //Forgot.click();

	}

	private static By ByLinkText(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
