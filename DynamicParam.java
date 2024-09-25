package Week5Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DynamicParam {

	@Parameters({"url","username","password"})
	@Test(dataProvider = "runName")
	public void runDynamicParam(String entityName, String companyName) {
	
		
ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys("gokul.sekar@testleaf.com");
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).sendKeys("Leaf$321");
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
		

	
		if(text.equals(entityName)) {
			System.out.println("Legal Entity Name Verified");
		}else{
			System.out.println("Not Correct");
		}
		
	}
	
	@DataProvider
	public String[][] runName() {
		
		String str [] [] = new String[2][2];
		
		str [0][0] ="Salesforce Automation 1";
		str [0][1] ="Rick";
		
		str [1][0] ="Salesforce Automation 2";
		str [1][1] ="Grimes";
				
		return str;
	}
}