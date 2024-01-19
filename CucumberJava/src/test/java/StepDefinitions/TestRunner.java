package StepDefinitions;

// To maintain many feature files we create this file

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", 
glue= {"StepDefinitions"}, 
monochrome = true,
plugin = {"pretty", "junit:target/JUnitReports/reports.xml"},
tags = "@smoketests"

)

public class TestRunner {

}
