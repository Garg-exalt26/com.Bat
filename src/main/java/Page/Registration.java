package Page;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {

	public static void main(String args[]) {
		
		// TODO Auto-generated method stub

		// WebDriverManager library used to download updated driver according to browser in the background
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--incognito"); 
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
		   username.sendKeys("standard_user");
		   
		   WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
		   password.sendKeys("secret_sauce");
		   
		   WebElement loginbtn= driver.findElement(By.xpath("//input[@id='login-button']"));
		   loginbtn.click();
		  
		   
		/*WebElement forgetbtn= driver.findElement(By.xpath("//span[@class='icon-root-XQD']"));
		  
		forgetbtn.click();*/
		   WebElement productheading=driver.findElement(By.xpath("//span[@class='title']"));
		  assertTrue(productheading.isDisplayed());
		 
	}

}
