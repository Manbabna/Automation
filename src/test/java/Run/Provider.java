package Run;

import org.testng.annotations.Test;

import Codetostar.Useability;
import Pages.facebook.Home2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class Provider extends Useability {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	Home2 ob=new Home2(driver);
	  ob.emailofinput(n);
	  ob.psswrdoffield(s);
	  Thread.sleep(6000);
	  ob.Signin();
	 
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"mnoor@yahoo.com", "Masud" },
      new Object[] { "noor@gmail.com", "to" },
      new Object[] { "automation@gmail.com", "us" },
    };
  }
}

/* enter valid username and invalid password
enter invalid username and valid password
enter invalid username and invalid password */