package Autoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesbyindex {
		public static void main(String args[]) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
		    driver.get("https://demo.guru99.com/test/guru99home/"); 
		        driver.manage().window().maximize();
			    int size = driver.findElements(By.tagName("iframe")).size();
		        System.out.println(size);
		        //located by index
		        driver.switchTo().frame(1); 
		       		     		

				
	     WebElement a =driver.findElement(By.xpath("/html/body/a/img"));
	     a.click();
	     		
	       
	 }
}		




