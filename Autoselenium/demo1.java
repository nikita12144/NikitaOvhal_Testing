package Autoselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("9657851165");
		driver.findElement(By.id("pass")).sendKeys("7767001963");
		driver.findElement(By.name("login")).click();
		
		 Alert alert = driver.switchTo().alert();		
 		
	        String alertMessage= driver.switchTo().alert().getText();		
	        		
	        System.out.println(alertMessage);	
	        Thread.sleep(5000);
	        		
	        alert.accept();		
	    }	
		
	}



