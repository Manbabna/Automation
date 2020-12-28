package Run;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Codetostar.Useability;
import Pages.facebook.Home2;

public class shots extends Useability {
  @Test
  public void f() {
	  Home2 ob=new Home2(driver);
	  ob.emailofinput("mnoor@yahoo.com");
	  ob.psswrdoffield("Masud");
	  ob.Signin();
	  	  
  }
  @Test
  public void f6() {
	  Home2 ob=new Home2(driver);
	  ob.emailofinput("noor@gmail.com");
	  ob.psswrdoffield("to");
	  ob.Signin(); 
	  
  }
  @Test
  public void f600() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.findElement(By.id("gj")).click();
  }
  @Test
  public void f60000() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.findElement(By.id("gj")).click();
}
