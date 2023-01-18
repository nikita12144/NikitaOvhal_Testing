package Autoselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class bookmyshow{
	public static void main(String args[]) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();

options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://in.bookmyshow.com");
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[2]/ul/li[8]/div/div/img")).click();
		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[1]/div/div/div/div[2]/div[2]/div[1]")).click();	
		Thread.sleep(2000);
		driver.findElement(By.id("mobileNo")).sendKeys("9890751772");

		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div/div[2]/form/div[2]/button")).click();
Thread.sleep(3000);		
		driver.navigate().to("https://in.bookmyshow.com/pune/movies/ved/ET00343245");
		
		driver.findElement(By.xpath("//*[@id=\"page-cta-container\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"showDates\"]/div/div/li[2]/a/div[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Vishal Cinemaas: Pimpri")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"showEvents\"]/ul/li[2]/div[2]/div[11]/a/div[1]/div")).click();	
		
		driver.findElement(By.id("btnPopupAccept")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"proceed-Qty\"]")).click();
		Thread.sleep(2000);
       driver.findElement(By.id("A_1_03")).click();
      driver.findElement(By.id("A_1_04")).click();
     Thread.sleep(2000);

		driver.navigate().to("https://www.justdial.com/Pune/Movies");
         Thread.sleep(2000);
         driver.quit();
         }	
		
	}

