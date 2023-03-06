package autotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cssselecor {
	@Test
	public void Csselectortest() {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//cssselector
		//{AttributeName='AttributeValue'}
		//driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
		//shortcut
		//driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		//htmltag[AttributeName="AtrributeValue"]
		//driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		//driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		//cssselector by using class
		//{AttributeName='AttributeValue'}
		//driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("manager");
		//driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
		
		//shortcut
		//driver.findElement(By.cssSelector(".pwdfield")).sendKeys("manager");
		
		//driver.findElement(By.cssSelector("input#class'textField pwdfield")).sendKeys("manager");
		//driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manger");
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");

		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		System.out.println("login successfully");
		
		driver.findElement(By.xpath("//a[contains(text(),'View')]")).click();
		

		
		


	}

}
