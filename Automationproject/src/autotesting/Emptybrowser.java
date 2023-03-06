package autotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Emptybrowser {
	@Test
	public void Emptytest() throws InterruptedException
	{
		// TODO Auto-generated method stub
		String key="webDrive.chrome.drver";
		String value="./chromedriver.exe";
		System.setProperty(key, value);
			
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//by using css selector
		//driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		//driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a#loginButton.initial")).click();
		//driver.findElement(By.className("initial")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Enter Time-Track")).click();
		driver.findElement(By.partialLinkText("View Time")).click();
		System.out.println("worked");
	}
		
		public void m1()
		{
		System.out.println("m1 running");
		


	}

}
