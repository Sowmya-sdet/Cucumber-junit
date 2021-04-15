package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)	
@CucumberOptions(features={"src/test/resources/Login/Login.feature"}, 
glue= {"StepDefinition"},
tags= "@Login",
dryRun=false,//this is to check if I implemented all the methods
monochrome=true,//to get the right format in console
strict=true,//is any step is missed in step definition
plugin = {"html:testoutput/sowmya.html", "junit:testoutput/sowmya.xml", "json:testoutput/sowmya.json"}
)
public class Test_Runner {


}
