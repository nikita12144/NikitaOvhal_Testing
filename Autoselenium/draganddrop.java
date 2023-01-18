package Autoselenium;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.interactions.Actions;		
import org.testng.annotations.Test;		


public class draganddrop {
	
	    WebDriver driver;			

	    @Test		
	    public void DragnDrop() throws InterruptedException					
	    {		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
		
					
	         driver.get("https://demo.guru99.com/test/drag_drop.html");					
	         
	        	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
	        	Thread.sleep(4000);
	         
	            WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
	         		
	         Actions act=new Actions(driver);					

	         act.dragAndDrop(From, To).build().perform();		
		}		
	}
