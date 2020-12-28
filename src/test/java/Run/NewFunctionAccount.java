package Run;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewFunctionAccount {
  //Third executed annotation
  @Test
  public void f() {
	  System.out.println("Annotation is test");
  }
  //Second executed annotation
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Annotation is beforeMethod");
  }
  //Fourth executed annotation
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Annotation is afterMethod");
  }
  //First executed annotation
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Annotation is beforeClass");
  }
  //Fifth executed annotation
  @AfterClass
  public void afterClass() {
	  System.out.println("Annotation is afterClass");
  }
  
  @Test
  public void f6() {
	  System.out.println("Annotation is test");
  }
}
