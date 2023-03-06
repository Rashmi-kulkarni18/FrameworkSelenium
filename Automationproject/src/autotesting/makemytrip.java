package autotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		String fromcity = "Hunugunda";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);

		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='notification-frame-22a34493b']")));
	    //driver.findElement(By.xpath(".//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
		
		driver.switchTo().frame(1);
		System.out.println("switched to frame");
		
		driver.findElement(By.xpath("//p[@data-cy='LoginHeaderText']")).click();
		System.out.println("Clicked login");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("fromCity")).click();
		System.out.println("clicked from city");
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(fromcity);
		System.out.println("Done");
		driver.quit();
		//driver.findElement(By.xpath(""))
		
		


	}

}
