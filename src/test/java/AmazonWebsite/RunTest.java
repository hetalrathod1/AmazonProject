package AmazonWebsite;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = "@addcart",format = {"pretty","html:target/cucumber-reports"})

public class RunTest {
}
