package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SeleniumOperations 
{
	
	public static ChromeDriver driver=null;
	
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
	//browserLaunch
	public static Hashtable<String,Object> browserLaunch(Object [] inputParameters)
	{
		try 
		{
		String key= (String) inputParameters[0];
		String value=(String) inputParameters[1];
		
		System.setProperty(key, value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:browserLaunch,InputGiven: " + inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:browserLaunch,InputGiven: " + inputParameters[0].toString());
		
		}
		return outputParameters;

	}
	
	
	//openApplication
	public static Hashtable<String,Object> openApplication(Object [] inputParameters)
	{
		try
		{
		String url= (String) inputParameters[0];
	
	      driver.get(url);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:openApplication,InputGiven: " + inputParameters[0].toString());
			
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:openApplication,InputGiven: " + inputParameters[0].toString());
			
		}
		return outputParameters;

    }
	
	
	
	//clickonElement
		public static Hashtable<String,Object> clickOnElement(Object [] inputParameters)
		{
			try
			{
			String xpath= (String) inputParameters[0];
		
		     driver.findElementByXPath(xpath).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "methodUsed:clickOnElement,InputGiven: " + inputParameters[0].toString());
					
			}
			catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "methodUsed:clickOnElement,InputGiven: " + inputParameters[0].toString());
				
			}
			return outputParameters;
	   }
		
		
		//mouseOverAction
		public static Hashtable<String,Object> mouseOver(Object [] inputParameters)
		{
			try
			{
			String xpath= (String) inputParameters[0];
		
			  Actions act=new Actions(driver);
			   
				WebElement one=driver.findElementByXPath(xpath);
				 act.moveToElement(one).build().perform();
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					
					outputParameters.put("STATUS", "PASS");
					outputParameters.put("MESSAGE", "methodUsed:mouseOver,InputGiven: " + inputParameters[0].toString());
							
			}
			catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "methodUsed:mouseOver,InputGiven: " + inputParameters[0].toString());
				
			}
			return outputParameters;
		}
		
		
		//sendkyes
	   	public static Hashtable<String,Object> sendText(Object [] inputParameters)
		{
	   		try
	   		{
	   		String xpath= (String) inputParameters[0];
	   		String text= (String) inputParameters[1];
	   		
			driver.findElementByXPath(xpath).sendKeys(text);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:sendText,InputGiven: " + inputParameters[1].toString());
			
	   		}
	   		catch(Exception e)
			{
	   			outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "methodUsed:sendText,InputGiven: " + inputParameters[1].toString());
				
			}
	   		return outputParameters;
		}
	   	
	   	
	  
	   	
	   	//ValidatLogin
	   	public static Hashtable<String,Object> validateLogin(Object [] inputParameters)
	   	{
	   		try
	   		{
	   		
	   		String requiredUrl= (String) inputParameters[0];
	   		
	   		String catchUrl=driver.getCurrentUrl();	
	   		
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			if(catchUrl.equalsIgnoreCase(requiredUrl))
	   		{
	   			System.out.println("Test Case Pass");
	   			
	   			outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "methodUsed:validateLogin,InputGiven: " + inputParameters[0].toString());
				
	   		}
	   		
	   		else
	   		{
	   			System.out.println("Test Case Fail");
	   		}
	   		
			
	   		}
	   		catch(Exception e)
			{
	   			outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "methodUsed:validateLogin,InputGiven: " + inputParameters[0].toString());
			}
	   		return outputParameters;
	   	}
	   	
	   	
		
		
	  
}
