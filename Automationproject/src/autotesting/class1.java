package autotesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) {
		String key="webDrive.chrome.drver";
		String value="./chromedriver.exe";
		System.setProperty(key, value);
			
	
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String data=driver.getPageSource();
		System.out.println(data);
		
		driver.navigate().refresh();
		//driver.close();
		//driver.quit();
		
	}
	

}
