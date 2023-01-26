package Maven_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateOrg {
	@Test
	public void connectDb() {
		

		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		String BROWSER = System.getProperty("Browser");
		
		System.out.println("URL-----"+URL);
		 System.out.println("USERNAME-----"+USERNAME);	
		 System.out.println("PASSWORD-----"+PASSWORD);
		 System.out.println("BROWSER-----"+BROWSER);
		 
		 WebDriver driver =  new ChromeDriver();
		 driver.get(URL);
		 driver.close();
	}

}
