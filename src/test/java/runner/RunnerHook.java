package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Hooks/Hooks.feature",
glue  = {"com.steps","org.hooksbeforeafter"},
tags = "~@tag1,@tag",
monochrome = true

		)
public class RunnerHook {

}
