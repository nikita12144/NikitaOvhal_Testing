package Autoselenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class alertpopup {
	
		
		public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	                    		
	        driver.get("https://nxtgenaiacademy.com/alertandpopup/");			
	                            		
	     	      	
	        driver.findElement(By.name("alertbox")).click();
	     
	        Alert alert = driver.switchTo().alert();		
	        		
	        String alertMessage= driver.switchTo().alert().getText();		
	        		
	        System.out.println(alertMessage);	
	        Thread.sleep(3000);

	        alert.accept();	
	        
		}

}	

	
			

