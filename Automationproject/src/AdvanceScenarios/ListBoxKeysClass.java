package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ListBoxKeysClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create a new account")).click();
		
		Thread.sleep(1000);
		WebElement daylist=driver.findElement(By.id("day"));
		
		Select day = new Select(daylist);
		
		day.selectByVisibleText("10");
		System.out.println("day selected");
		
		WebElement month=driver.findElement(By.id("month"));
		Select monthlist=new Select(month);
		monthlist.selectByValue("2");
		System.out.println("month selected");
		
		WebElement year=driver.findElement(By.id("year"));
		Select yearlist=new Select(year);
		yearlist.selectByValue("2022");
		System.out.println("year selected");
//		daylist.click();
//		daylist.sendKeys(Keys.ARROW_UP);
//		daylist.sendKeys(Keys.ARROW_DOWN);
//		daylist.sendKeys(Keys.ARROW_DOWN);
//		daylist.sendKeys(Keys.ARROW_DOWN);
//		daylist.sendKeys(Keys.ARROW_DOWN);
//		daylist.sendKeys(Keys.RETURN);
		
		
		

	}

}
