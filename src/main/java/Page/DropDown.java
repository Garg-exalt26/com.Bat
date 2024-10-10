package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		/*driver.get("https://www.vuse.com/");
		
		//Automate Select tag drop-down
		
		WebElement dropdown= driver.findElement(By.xpath("//select[@style=\"width: 30%; min-width: 300px; background-color: white; opacity: 0.75; padding-left: 20px; height: 40px; color: black;\"]"));
		 dropdown.click();
		 Select s=new Select(dropdown);
		 
		 //s.selectByValue("/gb/en/");
		 s.selectByIndex(4);
		 */
		//Bootstraps Drop-down
		WebElement dropdown=driver.findElement(By.xpath("//button[@id=\"menu1\"]"));
		dropdown.click();
		
		List<WebElement> dropdownlist=driver.findElements(By.xpath("//ul[@class=\"dropdown-menu\"]/li"));
		
		for(WebElement ele:dropdownlist) {
			
			String value=ele.getText();
			
			if (value.equals("JavaScript")) {
				
				Thread.sleep(3000);
				ele.click();
				break;
			}
			
		}
		
	}

}
