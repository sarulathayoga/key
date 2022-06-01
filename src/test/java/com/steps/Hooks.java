package com.steps;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.core.cli.Main;
public class Hooks {

@Given("first")
public void first() {
  System.out.println("saru");
}

@Given("second")
public void second() {
	System.out.println("latha");

}

	@Given("this is to display first")
	public void this_is_to_display_first() {
	System.out.println("1");
	}

	@When("this is to display second")
	public void this_is_to_display_second() {
	System.out.println("2");
	}

	@Then("this is to display third")
	public void this_is_to_display_third() {
	 System.out.println("3"); 
	}


}
