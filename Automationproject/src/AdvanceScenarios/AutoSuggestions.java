package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("bluetooth");
		Thread.sleep(2000);
		
		List<WebElement> allLinks =driver.findElements(By.tagName("li"));
		
		for(WebElement wb:allLinks)
		{
			System.out.println(wb.getText());
			if(wb.getText().contains("headset"))
			{
				wb.click();
				break;
				
			}
		}
		

	}

}
