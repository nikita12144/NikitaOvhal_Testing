package Autoselenium;

import java.util.Set;
import java.util.Iterator;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();

      // WebElement text = driver.findElement(By.id("sampleHeading"));
  
       // System.out.println("Element found using text: " + text.getText());
        
        String mainWindowHandle = driver.getWindowHandle();
        
        Set<String> allWindowHandles = driver.getWindowHandles();
        
        Iterator<String> iterator = allWindowHandles.iterator();
        
     while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow); 
                WebElement text1 = driver.findElement(By.id("sampleHeading"));
                System.out.println("Heading of child window is " + text1.getText()); 
                driver.quit();
            }
        
     }
	}
}



