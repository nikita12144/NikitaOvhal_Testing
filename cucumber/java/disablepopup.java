import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class disablepopup {
	
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("--disable-notifications"));
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.naukri.com/");
	}
}
