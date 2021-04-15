package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	 WebDriver driver;
	@Given("I am able to navigate into login page")
	public void i_am_able_to_navigate_into_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOWMYAPRASAD\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	driver = new ChromeDriver();	
		// This is the URL you need to use
		driver.get("https://opensource-demo.orangehrmlive.com/");
		// To maximise the screen
		driver.manage().window().maximize();
		// If I want to wait for a while
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys(string);
	}
	@When("I enter the password as {string}")
	public void i_enter_the_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtPassword")).sendKeys(string);
	}
	@When("I click on the Login button")
	public void i_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	}
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String name = driver.findElement(By.id("welcome")).getText();
		String Actualdata = string;
		Assert.assertEquals(name, Actualdata);
		System.out.println("Login Successful");
	}
	
	@Then("I should see a error message as {string}")
	public void i_should_see_a_error_message_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  String actualerr = driver.findElement(By.id("spanMessage")).getText();
	  String Expectederr = "Invalid credentials";
	  Assert.assertEquals (Expectederr, actualerr);
	  driver.close();
	}	
}
