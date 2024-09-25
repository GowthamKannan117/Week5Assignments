package Week5Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseSteps  {
			
	ChromeOptions options;
	ChromeDriver driver;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	
	public void preCondition(String url, String uname, String pass) {
		
		options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("Login")).click();

	}
	
	@AfterMethod
	public void postCondition() {
		
		driver.close();
		
	}


}