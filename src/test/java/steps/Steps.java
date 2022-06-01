package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	WebDriver driver;
	@Given("user is entering google.co.in")
	public void user_is_entering_google_co_in() {
		WebDriverManager.chromedriver().setup();
driver =new ChromeDriver();
driver.get("https://www.google.com/");
	}

	@When("user is typing the searchj term {string}")
	public void user_is_typing_the_searchj_term(String searchterm) {
	driver.findElement(By.name("q")).sendKeys(searchterm);
	}

	@When("enters the return key")
	public void enters_the_return_key() {
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("the user should see the search results")
	public void the_user_should_see_the_search_results() {
	 boolean status = driver.findElement(By.partialLinkText("saru")).isDisplayed();
	 if(status) {
		 System.out.println("done");
	 }
	}


}
