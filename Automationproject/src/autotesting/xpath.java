package autotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'Beauty')]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		String price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Green, 128 GB)']/../../div[2]/div[1]")).getText();
		System.out.println(price);
		//driver.findElement(By.name("q")).sendKeys("earbuds");
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		//driver.findElement(By.xpath(""))
		
		
	}

}
