package Run;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.response.Response;


public class API {
  //@Test
  public void f() {
	  //how to recieve response with get method
	  Response it=get("https://reqres.in/api/users?page=2");
	  it.prettyPrint();
	  System.out.println(it.getStatusCode());
	  System.out.println(it.getTime());
  }
  
  @Test
  public void f6() {
	  File ti=new File("C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\Entry.jason");
	  Response it=given().contentType(ContentType.JSON).body(ti).post("https://reqres.in/api/users");
	  it.prettyPrint();
	  System.out.println(it.getStatusCode());
	  System.out.println(it.getTime());
	  
	  int status =it.getStatusCode();
	  Assert.assertEquals(status, 201);
  }
}
