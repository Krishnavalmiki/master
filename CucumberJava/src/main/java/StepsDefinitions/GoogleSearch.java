package StepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObject.Google;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	
	WebDriver driver;
	
	Google objpom;
	
	@Given("browser is open")
	public void browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
	    
		String projectPath=System.getProperty("user.dir");
		System.out.println("Project path is " +projectPath);
	    
	    System.setProperty("webdriver.chrome.driver",projectPath + "/src/test/resources/drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.google.com/");
	}

	@When("user enter a text in search box")
	public void user_enter_a_text_in_search_box() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		objpom= new Google(driver);
		objpom.enterGoogletext("Selenium Practise");
	}

	@And("hits the enter button")
	public void hits_the_enter_button() {
	    // Write code here that turns the phrase above into concrete actions
		objpom= new Google(driver);
		objpom.enterSearchbuttont();
	
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	    
	}


}
