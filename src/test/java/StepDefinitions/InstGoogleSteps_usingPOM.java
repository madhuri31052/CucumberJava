package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import POM_Pages.InstGoogleSteps_POM;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class InstGoogleSteps_usingPOM {

    WebDriver driver = null;
    private String username;
    private String password;
    InstGoogleSteps_POM login;

    @Given("User is on instagram page")
    public void user_is_on_instagram_page() throws InterruptedException {
        initializeWebDriver();
        driver.navigate().to("https://www.instagram.com/accounts/login/");
        Thread.sleep(5000);
    }

    @When("User enters username and password")
    public void user_enters_username_password() throws InterruptedException {
    	username = System.getenv("USERNAME");
        password = System.getenv("PASSWORD");

    	login.enterInstUser(username);
    	Thread.sleep(5000);
    	login.enterInstPass(password);
    	Thread.sleep(5000); 
    }

    @And("hits login button")
    public void hits_login_button() throws InterruptedException {
    	
    	login.clickInstLoginBtn();  	
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
		
		login.gogSearchText(query);
		Thread.sleep(2000);
	}

	@And("hits enter button of google")
	public void enter_button() throws InterruptedException {
		
		login.gogEnterBtn();
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

    @Before
    public void BeforeSteps() {
        System.out.println("I am inside before step, which is running before every scenario");
    }

    private void initializeWebDriver() throws InterruptedException {
        if (driver == null) {
        	String projectPath = System.getProperty("user.dir");
           	System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");
           	driver = new ChromeDriver();
            // ChromeOptions options = new ChromeOptions();      // This 3 lines of code will help run test without display
            // options.addArguments("--headless");
            // driver = new ChromeDriver(options);
           	login = new InstGoogleSteps_POM(driver);             // Every session new driver will be initiated 
            driver.manage().window().maximize();
            Thread.sleep(2000);
        }
    }
}

