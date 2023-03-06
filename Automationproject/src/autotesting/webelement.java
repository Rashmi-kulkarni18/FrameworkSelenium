package autotesting;



import java.net.MulticastSocket;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		/*WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("admin");
		Thread.sleep(2000);
		//user.clear();
		
		//dimension class
		Dimension dim= user.getSize();
		System.out.println(dim.getWidth()+"------------"+dim.getHeight());
		
		WebElement pwd=driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		
		Dimension dimp=pwd.getSize();
		System.out.println(dimp.getWidth()+"----------"+dimp.getHeight());
		
		//Point getlocation
		Point loc=user.getLocation();
		System.out.println(loc.getX()+"------------"+loc.getY());
		
		Point locp=pwd.getLocation();
		System.out.println(locp.getX()+"----------"+locp.getY());
		
		//Rectangle 
		Rectangle rect=user.getRect();
		System.out.println(rect.getHeight()+"-------"+rect.getWidth());
		System.out.println(rect.getX()+"--------"+rect.getY());*/
	
		//isdisplayed
		/*WebElement logo = driver.findElement(By.className("atLogoImg"));
		if(logo.isDisplayed())
				{
			System.out.println("logo of actitime is visible");
				}
		else {
			System.out.println("logo is not visible");
		
				}*/
		//isEnabled
		/*WebElement UserName= driver.findElement(By.id("username"));
		if(UserName.isEnabled())
		{
			UserName.sendKeys("admin");
			System.out.println("enter username");
			
		}
		else {
			System.out.println("UserName is disable");
		}*/
		
		//isSelected
		/*WebElement checkBox=driver.findElement(By.id("keepLoggedInLabel"));
		checkBox.click();
		if(checkBox.isSelected())
		{
			System.out.println("checked");
		}
		else {
			System.out.println("not checked");
			
		}*/
		
		//tagname
		/*WebElement pwd=driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		System.out.println(pwd.getTagName());
		
		//getAttribute
		String attribute=pwd.getAttribute("class");
		System.out.println("name attribute value is :"+attribute);*/
		
		//getDomAttribute
		/*WebElement UserName=driver.findElement(By.id("username"));
		UserName.sendKeys("admin");
		System.out.println(UserName.getDomAttribute("name"));
		
		//getDomPorperty
		System.out.println(UserName.getDomProperty("placeholder"));
		
		WebElement login=driver.findElement(By.id("loginButton"));
		System.out.println(login.getDomProperty("class"));
		Thread.sleep(2000);*/
		
		/*driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		WebElement tasklink =driver.findElement(By.cssSelector("a.tasks"));
		System.out.println("name of the task s Dom is :" );
		System.out.println(tasklink.getAccessibleName());*/
		//tasklink.findElement(By.id("conatiner_tasks")).click();
		
		//getArialRole
		WebElement user=driver.findElement(By.id("username"));
		System.out.println(user.getAriaRole());
		
		WebElement login=driver.findElement(By.id("loginButton"));
		System.out.println(login.getAriaRole());
		
	
	
		
		
	
		

	}

}
