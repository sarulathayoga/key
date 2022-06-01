package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginsteps {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

@When("the user enters the valid {string} and {string}")
public void the_user_enters_the_valid_and(String username, String password){
	  driver.findElement(By.name("txtUsername")).sendKeys(username); 
	  driver.findElement(By.name("txtPassword")).sendKeys(password);
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
driver.findElement(By.name("Submit")).click();
	}

	@Then("the user should be navigated to home page")
	public void the_user_should_be_navigated_to_home_page() {
	 boolean status = driver.findElement(By.linkText("Performance")).isDisplayed();
	 if(status) {
		 driver.quit();
		 System.out.println("done");
	 }
	}


}
