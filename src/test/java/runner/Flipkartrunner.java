package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features  ="src/test/java/flipkart/flipkart.feature",
glue = "steps")
public class Flipkartrunner {

}
