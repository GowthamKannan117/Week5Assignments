package Week5Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProjectSpecificMethod {

	@Test
	@Parameters({"url","username","password"})
	public void runProjectAssignment(String url, String username, String password) {

		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable Notifications");

		ChromeDriver driver= new ChromeDriver(opt);
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		driver.findElement(By.xpath("//p[text()='Legal Entities']")).click();
		driver.findElement(By.xpath("//diva[@class='slds-context-bar__label-action slds-p-left_none slds-p-right_x-small']")).click();
		driver.findElement(By.xpath("//span[text()='New Legal Entity']")).click();
		driver.findElement(By.partialLinkText("(//input[@class='slds-input'])[2]")).sendKeys("Test");
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("Salesforces");
		driver.findElement(By.xpath("//button[@id='combobox-button-123']")).click();
		driver.findElement(By.xpath("//span[@title='Active']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		String text = driver.findElement(By.xpath("//a[@href='javascript:void(0)' and @data-index='0']")).getText();
		
		System.out.println(text);
		
		
		
		
		
	}

}
