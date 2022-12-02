package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login 
{
	
	@When ("^user provide \"(.*)\" and exe location as \"(.*)\"$")
	      public void bLaunch(String key, String exe)
	      {
		     Object [] input=new Object[2];
             input[0]=key;
             input[1]= exe;
             SeleniumOperations.browserLaunch(input);
             System.out.println(input);
          }

	
	@When ("^user provide url as \"(.*)\"$")
	      public void openApp(String url)
	      {
		     Object [] input1=new Object[1];
             input1[0]=url;
             SeleniumOperations.openApplication(input1);
	      }
	
	
	@When ("^user cancle initial Login page$")
	     public void cancle()
	     {
		    Object [] input2=new Object[1];
            input2 [0]="//*[@class='_2KpZ6l _2doB4z']";
            SeleniumOperations.clickOnElement(input2);
         
	     }
	@When ("^user navigate on Login$")
	     public void navigate()
	     {
		     Object [] input3=new Object[1];
               input3 [0]="//*[text()='Login']";
            Hashtable<String, Object> output3= SeleniumOperations.mouseOver(input3);
            
            HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^user navigate on Login$", output3.get("MESSAGE").toString());  

	     }
	
	
	@When ("^user click on My Profile$")     
	     public void clickMypro() throws InterruptedException 
	     {
		 Object [] input4=new Object[1];
         input4 [0]="//*[text()='My Profile']";
         Hashtable<String, Object> output4= SeleniumOperations.clickOnElement(input4);
        
         HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on My Profile$", output4.get("MESSAGE").toString());  

        Thread.sleep(5000);
         }

	
	@When ("^user enter \"(.*)\" as username$")
	     public void enterUserNa(String userN)   //
	     { 	
		
		    Object [] input5=new Object[2];
            input5[0]="(//*[@type='text'])[2]";
            input5[1]=userN;
            Hashtable<String, Object> output5 =SeleniumOperations.sendText(input5);
            
            HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter \"(.*)\" as username$", output5.get("MESSAGE").toString());  

	     }
	
	
	@When ("^user enter \"(.*)\" as password$")
	    public void enterPass(String passw) 
	    {
		 Object [] input6=new Object[2];
         input6[0]="//*[@type='password']";
         input6[1]=passw;
         Hashtable<String, Object> output6 = SeleniumOperations.sendText(input6);
         
         HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter \"(.*)\" as password$", output6.get("MESSAGE").toString());  

	    }
	
	
	@When ("^user click on Login button$")
	     public void clickOnLogi()
	{
		    Object [] input7=new Object[1];
            input7 [0]="(//*[@type='submit'])[2]";
            Hashtable<String, Object> output7= SeleniumOperations.clickOnElement(input7);
            
            HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on Login button$", output7.get("MESSAGE").toString());  

	     }
	   
	
	@Then ("^application shows user profile to user$")
	      public void applicationShowsUserPro() throws InterruptedException 
	      {
		Thread.sleep(5000);
		
		    Object [] input8=new Object[1];
            input8 [0]= "https://www.flipkart.com/account/?rd=0&link=home_account";
            Hashtable<String, Object> output8= SeleniumOperations.validateLogin(input8);
           
            HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^application shows user profile to user$", output8.get("MESSAGE").toString());  
  
         } 
		
	     
}
		

