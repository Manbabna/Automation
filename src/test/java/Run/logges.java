package Run;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logges {

	public static Logger lg=Logger.getLogger(logges.class.getName());
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("C:\\Users\\Babna\\eclipse-workspace\\TrainningSession\\logged.properties");
        lg.info("This is our first log for use");
	}

}

//1)download and add log4j dependencies into pom file
//2)create properties file under project
//3)create logger instance in the class
//4)give path for properties file