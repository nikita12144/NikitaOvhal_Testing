package Autoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo2 {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjcxNjQxMTEwLCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");
		driver.findElement(By.name("firstname")).sendKeys("Nikita");
		driver.findElement(By.name("lastname")).sendKeys("Ovhal");
		driver.findElement(By.name("reg_email__")).sendKeys("nikitaovhal1297@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("nikitaovhal1297@gmail.com");

		driver.findElement(By.name("reg_passwd__")).sendKeys("Nikita@123");
        Select a = new Select(driver.findElement(By.id("day")));
        a.selectByValue("12");
        Select b = new Select(driver.findElement(By.id("month")));
        b.selectByVisibleText("Sep");
        Select c = new Select(driver.findElement(By.id("year")));
        c.selectByValue("1997");
       
        WebElement radio1 = driver.findElement(By.className("_8esa"));							
        radio1.click();			
		driver.findElement(By.name("websubmit")).click();
		driver.findElement(By.xpath("//*[@id=\"scrollview\"]/div/div/div/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div[1]/div/span/span")).click();
		
        
        		
	}
}


