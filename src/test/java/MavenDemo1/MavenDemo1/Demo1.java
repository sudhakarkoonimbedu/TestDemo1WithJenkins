package MavenDemo1.MavenDemo1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 
{
	   @Test
	   public void openGoogleApp()
	   {
		   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
			
			System.out.println(driver.getTitle());
	   }
}
