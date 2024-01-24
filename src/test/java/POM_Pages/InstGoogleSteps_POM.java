package test.java.POM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class InstGoogleSteps_POM {
    
	WebDriver driver;
	
	By inst_username = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/label[1]/input[1]");
	
	By inst_password = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/label[1]/input[1]");
	
	By inst_loginBtn = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]");
	
	By gog_searchBox = By.name("q");
	
	
	public GoogleSearch_POM(WebDriver driver){
		this.driver = driver;
	}

	public void enterInstUser(String username) {
		
		driver.findElement(inst_username).sendKeys(username);
	}
	
	public void enterInstPass(String password) {
		
		driver.findElement(inst_password).sendKeys(password);
	}
	
	public void clickInstLoginBtn() {
		
		driver.findElement(inst_loginBtn).click();
	}
	
	public void gogSearchText(String query) {
		
		driver.findElement(gog_searchBox).sendKeys(query);
	}
	
	public void gogEnterBtn() {
		
		driver.findElement(gog_searchBox).sendKeys(Keys.ENTER);
	}
	
	public void instTasks(String username, String password) {
		
		driver.findElement(inst_username).sendKeys(username);
		driver.findElement(inst_username).sendKeys(password);
		driver.findElement(inst_loginBtn).click();
	}
	
	public void gogTasks(String query) {
		
		driver.findElement(gog_searchBox).sendKeys(query);
		driver.findElement(gog_searchBox).sendKeys(Keys.ENTER);
	}




}
