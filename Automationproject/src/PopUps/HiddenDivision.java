package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webDriver.chrome.driver";
		String value="./chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.cssSelector("div#container_tasks")).click();
		
		//by using multiple attribute
		driver.findElement(By.xpath("//div[@class='text' and text()='AA]")).click();
		
		
		driver.findElement(By.xpath("//div[text()='AA'][2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='checkbox inactive']/div[@class='img']1]"));
		driver.findElement(By.cssSelector("div.delete.button")).click();
		driver.findElement(By.xpath("div.cancelBtn.greyButton")).click();
		 
	

	}

}
