package stepdefinaion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ActualFile {
WebDriver driver;
	@Given("^open browser$")
	public void open_browser() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}
	
	@When("^enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_user_and_pass(String user, String pass) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
	    
	}

	@Then("^CLICK ON LOGIN$")
	public void CLICK_ON_LOGIN() throws Throwable {
	    driver.findElement(By.name("login")).click();
	}
	
	@Then("^close$")
	public void close() throws Throwable {
	    driver.quit();
	}

}
