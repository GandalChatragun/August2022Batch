package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
                (
                		
                	plugin="pretty",	
                	features="src/test/resources/BUSINESS_LOGIC",
                	glue="cucumbermap",
                	tags="@SmokeTest",
                	monochrome=true	
                		
                )	
                		
                		
                		
                		
                		
                
public class RunTest 
{

}
