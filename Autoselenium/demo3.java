package Autoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/OneDrive/Desktop/RestaurantManagementSystem_Nikita_Ovhal/Main.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Menu Card")).click();
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);

	driver.findElement(By.linkText("BOOK A TABLE")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Nikita Pande");
	Thread.sleep(1000);

	driver.findElement(By.xpath("//*[contains(@name,'mobile')]")).sendKeys("9657851165");
	Thread.sleep(1000);

	driver.findElement(By.name("email")).sendKeys("nikitaovha1297@gmail.com");
	Thread.sleep(1000);

	driver.findElement(By.name("date")).sendKeys("12/12/2022");
	Thread.sleep(1000);

	driver.findElement(By.name("time")).sendKeys("12:38PM");
	Thread.sleep(2000);
	driver.findElement(By.name("message")).sendKeys("Hello I am Nikita");

	Thread.sleep(2000);

    driver.findElement(By.xpath("//*[@type ='submit' or @className = 'subbutton']")).click();
	Thread.sleep(4000);
	driver.navigate().back();
	Thread.sleep(2000);

	driver.findElement(By.linkText("Home")).click();
	driver.quit();


     
	 



	

  
		

		
       

}
}
