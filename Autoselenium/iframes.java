package Autoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.get("http://demoqa.com/frames"); 
	        driver.manage().window().maximize();
		    int size = driver.findElements(By.tagName("iframe")).size();
	        System.out.println(size);
	        
	        //located frames by id
	        driver.switchTo().frame("frame1"); 

			
     	String a = 	driver.findElement(By.id("sampleHeading")).getText();
     	System.out.println(a);
     		
       
      }
}		
