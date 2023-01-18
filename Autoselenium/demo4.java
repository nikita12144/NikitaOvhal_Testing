package Autoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {
public static void main(String args[]) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/ADMIN/OneDrive/Desktop/software%20testing/form.html");
driver.findElement(By.id("fname")).sendKeys("Nikita");
driver.findElement(By.id("lname")).sendKeys("Ovhal");
driver.findElement(By.xpath("/html/body/div[2]/form/label[2]/input[2]")).sendKeys("12/09/0997");
WebElement radio1 = driver.findElement(By.name("female"));
radio1.click();
System.out.println("Female is selected");
driver.findElement(By.xpath("/html/body/div[2]/form/label[2]/select")).click();

driver.findElement(By.xpath("/html/body/div[2]/form/label[2]/select/option[4]")).click();

WebElement option1 = driver.findElement(By.name("cource1"));
option1.click();
if(option1.isSelected())
{
	System.out.println("Checkbox is toggled on");
}
else
{
	System.out.println("Checkbox is toggled off");
}
driver.findElement(By.id("phone")).sendKeys("9657851165");
driver.findElement(By.xpath("/html/body/div[2]/form/label[2]/textarea")).sendKeys("Pimpri pune");
driver.findElement(By.id("email")).sendKeys("nikitaovhal297@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Nikita@1214");
driver.findElement(By.id("repass")).sendKeys("Nikita@1214");

driver.findElement(By.className("registerbtn")).click();





}
}
