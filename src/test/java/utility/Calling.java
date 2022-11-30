package utility;


public class Calling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//browserLaunch
		Object [] input=new Object[2];
		          input[0]="webdriver.chrome.driver";
		          input[1]= "F:\\Automation Support\\chromedriver.exe";
		          SeleniumOperations.browserLaunch(input);
	
	          //openApplication
		          Object [] input1=new Object[1];
		          input1[0]="https://www.flipkart.com/";
		          SeleniumOperations.openApplication(input1);
		          
		         //click on Login window 
		          Object [] input2=new Object[1];
                  input2 [0]="//*[@class='_2KpZ6l _2doB4z']";
		          SeleniumOperations.clickOnElement(input2);
		          
		          //mouseover
		          Object [] input3=new Object[1];
                  input3 [0]="//*[text()='Login']";
		          SeleniumOperations.mouseOver(input3);
		          
		          //click on MyProfile
		          Object [] input4=new Object[1];
                  input4 [0]="//*[text()='My Profile']";
		          SeleniumOperations.clickOnElement(input4);
		          
		          Thread.sleep(5000);
		          //sendText user name
		          Object [] input5=new Object[2];
		          input5[0]="(//*[@type='text'])[2]";
		          input5[1]="9764888093";
		          SeleniumOperations.sendText(input5);
		          
		          //send password
		          Object [] input6=new Object[2];
		          input6[0]="//*[@type='password']";
		          input6[1]="abcd@1234";
		          SeleniumOperations.sendText(input6);
		          
		          // click on Login
		          Object [] input7=new Object[1];
                  input7 [0]="(//*[@type='submit'])[2]";
		          SeleniumOperations.clickOnElement(input7);
		          
		          Thread.sleep(5000);
		          // click my addresses
		          Object [] input8=new Object[1];
                  input8 [0]="//*[text()='Manage Addresses']";
		          SeleniumOperations.clickOnElement(input8);
		          
		         
		          //click add new address
		          Object [] input9=new Object[1];
                  input9 [0]="//*[@class='_1QhEVk']";
		          SeleniumOperations.clickOnElement(input9);
		          Thread.sleep(5000);
		          
		          ////send name
		          Object [] input10=new Object[2];
		          input10[0]="//*[@name='name']";
		          input10[1]="Gandal Chatragun";
		          SeleniumOperations.sendText(input10);
		          
		          //send mobail number
		          Object [] input11=new Object[2];
		          input11[0]="//*[@name='phone']";
		          input11[1]="9764888093";
		          SeleniumOperations.sendText(input11);
		          
		          //send pincode
		          Object [] input12=new Object[2];
		          input12[0]="//*[@name='pincode']";
		          input12[1]="414001";
		          SeleniumOperations.sendText(input12);
		          
		          //send Location
		          Object [] input13=new Object[2];
		          input13[0]="//*[@name='addressLine2']";
		          input13[1]="Nagar";
		          SeleniumOperations.sendText(input13);
		          
		          Thread.sleep(5000);
		           // send Address
		          Object [] input14=new Object[2];
		          input14[0]="//*[@name='addressLine1']";
		          input14[1]="kgbrakaam";
		          SeleniumOperations.sendText(input14);
		          
		          //click save
		          Object [] input15=new Object[1];
		          input15[0]="(//*[@type='button'])[2]";
		          SeleniumOperations.clickOnElement(input15);
		          
		          
		          
  
	
	}		          
}
