package defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_class_heroku {
	 WebDriver driver;
	
	@Given("open the browser")
	public void open_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		

		driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/login");
	    driver.manage().window().maximize();
		

	}

	

	@When("enter the username")
	public void enter_the_username() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
	  
	}

	@When("enter the password")
	public void enter_the_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
	   
	}

	@Then("clcik on  login")
	public void clcik_on_login() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}
	
	

}
