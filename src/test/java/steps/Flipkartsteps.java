package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkartsteps {
	WebDriver driver;
	Actions a = new Actions(driver);
	
	@Given("cancel login page")
	public void cancel_login_page() {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 WebElement loginbtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		 loginbtn.click();
	}

	@When("serach for the {string}")
	public void serach_for_the(String string) {
	 driver.findElement(By.name("q")).sendKeys("headbands for girl baby",Keys.ENTER);

	}

	@When("product should display")
	public void product_should_display() {
	 Actions prdct = a.moveToElement(driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]")));
	 prdct.click().click();
	}

	@Then("product should match for the selected product")
	public void product_should_match_for_the_selected_product() {
	 driver.switchTo().window("https://www.flipkart.com/homemates-multi-coloured-baby-girl-kids-headbands-elastic-6-pcs-gift-box-pink-head-band/p/itmabb8a40b55c30?pid=HACG4AHZ3Z2PTZ2Z&lid=LSTHACG4AHZ");
	 
	}



}
