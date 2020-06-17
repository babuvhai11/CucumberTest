package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
         (
        	features=".//features/Login.feature",	
        	glue = {"Definition"}      	      	
        	     
        		 
         )

public class TestRunner {

}
