package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features/",
    glue = {"StepDefinitions", "POM_Pages"},
    monochrome = true,
    tags = "@smokeTests or @regressionTests",
    plugin = {"pretty", "html:target/HtmlReports/reports.html"}
)
public class TestRunner {

    @BeforeClass
    public static void setupWebDriver() {
        // Initialize WebDriver using WebDriverManager
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
    }
}