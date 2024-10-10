package Page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopUp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		/*
		
		WebElement JSalert=driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
		
		JSalert.click();*/
		WebElement JSalert=driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
		JSalert.click();
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
//alert.dismiss();
//alert.accept();
	String s=alert.getText();
	System.out.println(s);
	
	}

}
