package Run;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

import Codetostar.Useability;

public class Ilistners extends Useability implements ITestNGListener {

	 public void onTestSuccess(ITestResult result) {
		  // TODO Auto-generated method stub
		  //ITestListener.super.onTestSuccess(result);
		  System.out.println("Automation is passed");
		  this.driver = ((Useability)result.getInstance()).driver;
		  Date dt=new Date();
		  System.out.println(dt);
		  String si=dt.toString().replace(" ", "_").replace(":", "_");
		  System.out.println(si);
		  File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   try {
		   FileHandler.copy(shots,new File("C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\Pictures\\"+si+".png"));
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
	 }

		   public void onTestFailure(ITestResult result) {
			   // TODO Auto-generated method stub
			   //ITestListener.super.onTestFailure(result);
			   this.driver = ((Useability)result.getInstance()).driver;
			   Date dt=new Date();
			   System.out.println(dt);
			   String si=dt.toString().replace(" ", "_").replace(":", "_");
			   System.out.println(si);
			   File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			    try {
			    FileHandler.copy(shots,new File("C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\Pictures\\"+si+".png"));
			   } catch (IOException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			   }
			  }
		  
		 }

/*Date dt=new Date();
System.out.println(dt);
String si=dt.toString().replace(" ", "_").replace(" ", "_");
System.out.println(si);
File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(shots, new File("C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\Pictures\\"+si+".png"));

*/