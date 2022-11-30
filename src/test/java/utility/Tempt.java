package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt {

	public static void main(String[] args) throws InterruptedException 
	{
		//LaunchBrowser
    	System.setProperty("webdriver.chrome.driver", "F:\\Automation Support\\chromedriver.exe");	
		ChromeDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		
		//Open Application
		driver.get("https://www.flipkart.com/");	
		
		//Cancle Login page
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();	                                
		//move to element
		Actions act=new Actions(driver);
		
		WebElement a=driver.findElementByXPath("//*[text()='Login']");
		act.moveToElement(a).build().perform();
		
		//Click on My Profile
		driver.findElementByXPath("//*[text()='My Profile']").click();		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Enter username
		driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("9764888093");                         
		//Enter Password
		driver.findElementByXPath("//*[@type='password']").sendKeys("abcd@1234");
		//click on Login button
		driver.findElementByXPath("(//*[@type='submit'])[2]").click();
		
     	Thread.sleep(5000);
		driver.findElementByXPath("//*[text()='Manage Addresses']").click();
	    driver.findElementByClassName("_1QhEVk").click();
		driver.findElementByXPath("//*[@name='name']").sendKeys("Gandal Chatragun");
		driver.findElementByXPath("//*[@name='phone']").sendKeys("9764888093");
		driver.findElementByXPath("//*[@name='pincode']").sendKeys("414001");
		driver.findElementByXPath("//*[@name='addressLine2']").sendKeys("Nagar");
		driver.findElementByXPath("//*[@name='addressLine1']").sendKeys("kgbrakam");
		driver.findElementByXPath("(//*[@type='button'])[2]").click();
	
		
		
		//	String abc=driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").getText();        
		
		
		
		
		//sel java mav cuc report conf
		
}

	}


