package Week5Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class Annotations extends BaseSteps  {

	@Test
	public void runAnnotations() {

		
		
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		
		WebElement element = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element).click().perform();
		
		driver.findElement(By.xpath("//div[@title='New']")).click();
		

		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("TestLeaf");
		
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		
		driver.findElement(By.xpath("//div[@role='none']")).click();
		
		driver.findElement(By.xpath("//span[@title='Active']")).click();
		

		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		String text = driver.findElement(By.xpath("//a[@href='javascript:void(0)' and @data-index='0']")).getText();
		
	
		
		System.out.println(text);
		
		
		
		
	}

}