package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewebelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		List<WebElement> allLinks =driver.findElements(By.xpath("//a"));
		
		 int count=0;//1------363
		 for(WebElement wb:allLinks)//1
		 {
		  System.out.println(wb.getText());//1
		  count++;
		 }
		System.out.println("total no of Links:"+count);
		
		

 
	}

}
