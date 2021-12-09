package selenium_basics;
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Opening_Chrome {
	
	public static WebDriver driver;

	public static void main(String[] args) {
	
		//System.setProperty("WebDriver.chrome.driver", "C:\SELENIUM AUTOMATION\BROWSER DRIVERS\chromedriver.exe");)
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://rediff.com");
		
		driver.findElement(By.linkText("Create Account")).click();

		driver.findElement(By.name ("name9f6f842d")).sendKeys ("Harvir");

		driver.findElement(By.name ("login9f6f842d")).sendKeys ("hsingh1234");

		driver.findElement(By.name ("btnchkavail9f6f842d")).click();

		driver .findElement(By.name ("passwd9f6f842d")).sendKeys ("12374877428f");

		driver.findElement(By.name ("confirm_passwd9f6f842d")).sendKeys ("12374877428f"); driver.findElement(By.name ("altemail9f6f842d")).sendKeys ("hhhhhh@gmail.com");
		
		
		
		
		
		
		
		
		
	}

}
