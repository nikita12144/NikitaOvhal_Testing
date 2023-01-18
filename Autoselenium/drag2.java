package Autoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class drag2 {
	WebDriver driver;			

    @Test		
    public void DragnDrop()					
    {	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/ADMIN/OneDrive/Desktop/draganddrop.html");
		
		driver.manage().window().maximize();
		
		WebElement From = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
     
        WebElement To = driver.findElement(By.xpath("//*[@id=\"div1\"]"));					
     		
     Actions act = new Actions(driver);					

     act.dragAndDrop(From, To).build().perform();		
}
}
