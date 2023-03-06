package Framework;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Objectrepo.Homepage;
import Objectrepo.Loginpage;

public class Properties_file {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//step 1:connect java with Properties file
		FileInputStream fis=new FileInputStream("./PropertyData.properties.txt");
		
		//step2: Load the Properties file to java system
		Properties pro= new Properties();
		pro.load(fis);
		
		
		//step 3: Fetch data from file
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
			driver.get(URL);
			
			Loginpage login = new Loginpage(driver);
			login.logintoApp(USERNAME, PASSWORD);
			
			Thread.sleep(1000);
			Homepage home = new Homepage(driver);
			home.ClickLink();
			
			
		
	//	driver.get(URL);
	//	driver.findElement(By.id("username")).sendKeys(USERNAME);
	//	driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
	//	driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.cssSelector("div.popup_menu_button_settings")).click();
		driver.findElement(By.linkText("Types of Work")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		
		//Fetching data from Excel
		
		//Connect to Excel sheet
		FileInputStream efis= new FileInputStream("./Automationproject.xlsx");
		
		//Load Excel in java
		Workbook book = WorkbookFactory.create(efis);
		
		//Fetch the required Sheet
		Sheet sh = book.getSheet("Sheet1");
		
		//Fetch the Required row
		Row row = sh.getRow(3);
		
		//Fetch the Required cell
		Cell cell = row.getCell(1);
		
		//Fetch the Data
		String ExcelData = cell.getStringCellValue();
		driver.findElement(By.name("name")).sendKeys(ExcelData);
		
		
		

	}

}
