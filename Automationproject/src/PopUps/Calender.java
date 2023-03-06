package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		//Dynamic xpath
		String month="January 2023";
		String date="12";
		driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::"
				+ "div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
		

	}

}
