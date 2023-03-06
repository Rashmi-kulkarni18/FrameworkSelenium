package autotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prokabbadi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.prokabaddi.com/standings");
		System.out.println("opened url");
		driver.manage().window().maximize();
		WebElement matches_played = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru Bulls')]/following::div[1]"));
		String mp = matches_played.getText();
		WebElement matches_won = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru Bulls')]/following::div[2]"));
		String mwon = matches_won.getText();
		WebElement matches_lost = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru Bulls')]/following::div[3]"));
		String mlost = matches_lost.getText();
		WebElement matches_draw = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru Bulls')]/following::div[4]"));
		String mdraw = matches_draw.getText();
		System.out.println("Total matches played :" + mp);
		System.out.println("Total matches won :" + mwon);
		System.out.println("Total matches lost :" + mlost);
		System.out.println("Totalmatches drawn :"  + mdraw);
		driver.quit();
		System.out.println("program sucessful");
		
		
		


	}

}
