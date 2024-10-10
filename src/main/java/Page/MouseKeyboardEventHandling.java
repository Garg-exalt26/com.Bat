package Page;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseKeyboardEventHandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--incognito"); 
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement Toys= driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
		Actions act= new Actions(driver);
		act.moveToElement(Toys);  
		//Framework is like a procedure to do things in a systematic way like extension or plug-in and those features can be integrated via libraries
		Thread.sleep(5000);
		WebElement searchbox=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		act.sendKeys(searchbox, "Textbook" + Keys.CONTROL).build().perform();
		
		
		
		
		
		
		
		
		
		
	}
}