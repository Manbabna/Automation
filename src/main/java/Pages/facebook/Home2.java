package Pages.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home2 {
	public WebDriver driver;
	@FindBy(name = "email")
	WebElement emailfieldkeys;
	@FindBy(name = "pass")
	WebElement passwordfieldkeys;
	@FindBy(name = "login")
	WebElement sign;
	
	@FindBy(linkText = "Forgot Password?")
	WebElement Forgotpasswordfield;
	public Home2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void emailofinput(String name) {
		//Explicit wait
		WebDriverWait it=new WebDriverWait(driver, 10);
		it.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("email")));
		emailfieldkeys.clear();
		emailfieldkeys.sendKeys(name);
	}
	
	public void psswrdoffield(String field) {
		//Explicit wait
		WebDriverWait it=new WebDriverWait(driver, 10);
		it.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("pass")));
		
		passwordfieldkeys.sendKeys(field);
	}
	
	public void Signin() {
		WebDriverWait it=new WebDriverWait(driver, 10);
		it.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("login")));
		sign.click();
	}
	public void Forgotlink() {
    Forgotlink();
    
	}
	

}
