package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	@Parameters({"URL"})
  @Test
  public void Test1(String browserURL)
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get(browserURL);
	  driver.quit();
	  
	  
  }
}
