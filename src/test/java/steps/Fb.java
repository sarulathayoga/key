package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb {
	WebDriver driver;
	@Given("the user has to enter {string} and {string}")
	public void the_user_has_to_enter_and(String username, String password) {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	  driver.findElement(By.id("email")).sendKeys("sarulatha");
	  driver.findElement(By.id("pass")).sendKeys("shanyoga@08");
	 
	 
	}

	@When("the user has to login")
	public void the_user_has_to_login() {
	driver.findElement(By.name("login")).click();
	}

	@Then("invalid mail should display")
	public void invalid_mail_should_display() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
 boolean result = driver.findElement(By.partialLinkText("Saru Latha")).isDisplayed();
	 if(result) {
		 driver.quit();
		 System.out.println("done");
	 }
	
	}

}
