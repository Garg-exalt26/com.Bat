package Page;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiWindowsHandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentid= driver.getWindowHandle(); //return string of parent id
		WebElement button= driver.findElement(By.xpath("//button[@id=\"newWindowBtn\"]"));
		button.click();
		System.out.println(parentid);
		Set<String> childid= driver.getWindowHandles(); //return set of string consist of parent&child id
		
		for(String s:childid) {
			
			if(!parentid.equals(s)) {
				
				driver.switchTo().window(s);
			}
		}
		
		WebElement firstname=driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
		firstname.sendKeys("Nishi Garg");
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentid);
		WebElement text= driver.findElement(By.xpath("//input[@id=\"name\"]"));
		text.sendKeys("Vikas");
		
		
		
	}

}
