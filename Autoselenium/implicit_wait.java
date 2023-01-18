package Autoselenium;


import org.openqa.selenium.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicit_wait {


	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
    	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
 



        WebDriver driver = new ChromeDriver(options);
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");
        
		driver.findElement(By.id("email")).sendKeys("9657851165");
		driver.findElement(By.id("pass")).sendKeys("7767001963");
		driver.findElement(By.name("login")).click();
		
     
		WebElement element = driver.findElement(By.cssSelector("div[aria-label='Not Now']:nth-child(2)"));
		element.click();
		
	
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	WebElement search =wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[aria-label='Search Facebook']")));
	search.sendKeys("nikita ovhal");
		 Thread.sleep(3000);
			driver.quit();

   }

}



