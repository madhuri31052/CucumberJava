package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class GoogleSearchSteps {

    WebDriver driver = null;
    public String user;
    public String pass;

    @Given("User is on instagram page")
    public void user_is_on_instagram_page() throws InterruptedException {
        initializeWebDriver();
        driver.navigate().to("https://www.instagram.com/accounts/login/");
        Thread.sleep(5000);
    }

    @When("User enters username and password")
    public void user_enters_username_password() throws InterruptedException {
        user = System.getenv("username");
        pass = System.getenv("password");
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/label[1]/input[1]")).sendKeys(user);
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys(pass);
        Thread.sleep(5000);
    }

    @And("hits login button")
    public void hits_login_button() throws InterruptedException {
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]")).click();
        Thread.sleep(5000);
    }

    @Then("User should go to respective results page")
    public void user_should_go_to_respective_page() throws InterruptedException {
        driver.getPageSource().contains("Save your login info?");
        Thread.sleep(2000);
    }


	@Given("User is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		initializeWebDriver();
	    driver.navigate().to("https://google.com");
	    Thread.sleep(2000);
	}

	@When("^User enters (.*) in search box of google$")
	public void user_enters_in_search_box(String query) throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(query);
		Thread.sleep(2000);
	}

	@And("hits enter button of google")
	public void enter_button() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("User should go to respective page of google")
	public void user_should_go_respective_page() throws InterruptedException {
		driver.getPageSource().contains("Online Courses");
		Thread.sleep(2000);
	}

    @After
    public void tearDown() {
        if (driver != null) {
        	driver.close();
            driver.quit();
        }
    }

    private void initializeWebDriver() throws InterruptedException {
        if (driver == null) {
            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(2000);
        }
    }
}
