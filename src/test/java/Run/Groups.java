package Run;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Groups {
  @Test(groups = {"smoke"})
  public void f() {
	  System.out.println("smoke test with f");
  }
  @Test(groups = {"Adhoc","Regression"})
  public void f2() {
	  throw new SkipException("forcing to skip");
	 // Assert.fail();
	 // System.out.println("Adhoc or regression with f2");
  }
  @Test(groups = {"Regression"})
  public void f6() {
	  System.out.println("Regression with f6");
  }
  @Test(groups = {"smoke","Adhoc"})
  public void f9() {
	  System.out.println("smoke or adhoc with f9");
  }
  @Test(groups = {"Adhoc"})
  public void f0() {
	  System.out.println("Adhoc with f0");
  }
  @Test(groups = {"Regression"})
  public void f666() {
	  System.out.println("Regression with f666");
  }
  
}
