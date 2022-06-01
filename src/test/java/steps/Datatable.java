package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Datatable {
	WebDriver driver;
	@Given("he is on login page")
	public void he_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

//@When("he enters the valid")
//public void he_enters_the_valid(DataTable dataTable, String username, String password) {
//		List<String> credentials = dataTable.asList(String.class);
//		
//		String username1 = credentials.get(0);
//		String password1 = credentials.get(1);
	@When("he enters the valid {string} and {string}")
	public void he_enters_the_valid_and(String username, String password) {
		  WebElement u = driver.findElement(By.name("txtUsername")); 
		  u.sendKeys(username);
		  WebElement p = driver.findElement(By.name("txtPassword"));
		  p.sendKeys(password);
	}

	@When("he clicks on the login button")
	public void he_clicks_on_the_login_button() {
		driver.findElement(By.name("Submit")).click();;
		driver.quit();
	}


}
