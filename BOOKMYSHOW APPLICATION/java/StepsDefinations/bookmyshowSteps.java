package StepsDefinations;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class bookmyshowSteps {   
	WebDriver driver;
	@Given("user is on browser")
	public void user_is_on_browser(){
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
	       driver =new ChromeDriver(opt);
	       driver.manage().window().maximize();
	       }
 @When ("user get url")
	public void user_get_url(){
	       driver.get("https://in.bookmyshow.com");         
}
  @Then ("display home page of bookmyshow")
	public void display_home_page_of_bookmyshow() {
    driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[2]/ul/li[8]/div/div/img")).click();
    System.out.println("home page is displayed");
}
  @And("user signup")
        public void sigup() {
		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[1]/div/div/div/div[2]/div[2]/div[1]")).click();	
		driver.findElement(By.id("mobileNo")).sendKeys("9890751772");
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div/div[2]/form/div[2]/button")).click();

   }
   @Then("user navigate to url")
         public void navigate_to_url() {
		driver.navigate().to("https://in.bookmyshow.com/pune/movies/ved/ET00343245");

   }
  @When("user want to book tickets")
      public void book_tickets() {
	driver.findElement(By.xpath("//*[@id=\"page-cta-container\"]/button")).click();
}
   @Then("it should display booking page")
         public void display_booking_page() {
	 driver.findElement(By.xpath("//*[@id=\"showDates\"]/div/div/li[2]/a/div[2]")).click();

	 driver.findElement(By.linkText("Vishal Cinemaas: Pimpri")).click();
	 driver.findElement(By.xpath("//*[@id=\"showEvents\"]/ul/li[2]/div[2]/div[11]/a/div[1]/div")).click();	
	
	 driver.findElement(By.id("btnPopupAccept")).click();
   }
   
  @Then("user navigate to another url")
        public void navigate() {
	    driver.navigate().to("https://www.justdial.com/Pune/Movies");
	    driver.quit();
  }

}


