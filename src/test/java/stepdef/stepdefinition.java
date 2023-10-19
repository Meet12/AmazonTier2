package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import amazonsignup.Amazon_POM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class stepdefinition {
	
	WebDriver driver;
	Amazon_POM pom;
	Actions action;
	
	@Given("User is on the homepage of the amazon website {string}")
	public void user_is_on_the_homepage_of_the_amazon_website(String string) {
	    
System.setProperty("webdriver.chrome.driver", "chromedriver-win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		pom = new Amazon_POM(driver);
		
		driver.get(string);

	}

	@When("User tries to search for a printer in the search bar and clicks enter")
	public void user_tries_to_search_for_a_printer_in_the_search_bar_and_clicks_enter() {
	    
		driver.findElement(By.id("nav-search-bar-form")).sendKeys("Laser Printer");
	}

	@Then("relevant products should be displayed")
	public void relevant_products_should_be_displayed() {
		
		String actual = driver.getCurrentUrl();
		Assert.assertEquals("https://www.amazon.ca/s?k=", actual);
	}

		
	}