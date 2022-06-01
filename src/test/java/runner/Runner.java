package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature/Datatable.feature",
glue =  "steps",monochrome = true,plugin = {"pretty","html:report/webreport","json:reort/jsonreport.json"}


)
public class Runner {
}
