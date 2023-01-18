package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	WebDriver dr;
	@Given("navigate to facebook page")
	public void navigate(){
	       dr=new ChromeDriver();
	       dr.get("https://www.facebook.com/");         
	       }
	@When ("user logged in using username and password")
	public void login(){
		dr.findElement(By.id("email")).sendKeys("9657851165");
		dr.findElement(By.id("pass")).sendKeys("7767001963");
		dr.findElement(By.name("login")).click();
		

	       }
	@Then("home page should be displayed")
	public void verifySuccessful(){
		System.out.println("home page is displayed");
	}
	      
	}