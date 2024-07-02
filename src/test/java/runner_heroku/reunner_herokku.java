package runner_heroku;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(features =   "src/test/resources/login/login.feature",glue="defination")
public class reunner_herokku extends AbstractTestNGCucumberTests {

}
