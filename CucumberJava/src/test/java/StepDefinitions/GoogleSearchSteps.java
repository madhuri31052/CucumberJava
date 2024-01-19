package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;


public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	@Given("User is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path is" + projectPath);
	    System.setProperty("webDriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
//	    WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.titleContains("Example"));
	    Thread.sleep(2000);
	    driver.navigate().to("https://google.com");
	}

	@When("User enters something in search box")
	public void user_enters_something_in_search_box() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		Thread.sleep(2000);
	}

	@And("hits enter button")
	public void hits_enter_button() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("User should go to respective page")
	public void user_should_go_to_respective_page() throws InterruptedException {
		driver.getPageSource().contains("Online Courses");
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
	}

}
