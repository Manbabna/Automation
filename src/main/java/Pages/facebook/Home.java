package Pages.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public WebDriver driver;
	@FindBy(name = "email")
	WebElement emailfieldkeys;
	@FindBy(name = "pass")
	WebElement passwordfieldkeys;
	@FindBy(name = "login")
	WebElement sign;
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void emailofinput() {
		emailfieldkeys.sendKeys("mnoor@yahoo.com");
	}
	
	public void psswrdoffield() {
		passwordfieldkeys.sendKeys("masud");
	}
	
	public void Signin() {
		sign.click();
	}
	

}
