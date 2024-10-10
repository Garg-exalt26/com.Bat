package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--incognito"); 
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.vuse.com/gb/en/create-account");
		driver.manage().window().maximize();
		
		WebElement firstname=driver.findElement(By.xpath("//input[@id=\"customer.firstname\" ]"));
		 firstname.sendKeys("nishi");
		 
		WebElement lastname=driver.findElement(By.xpath("//input[@id=\"customer.lastname\"]"));
		lastname.sendKeys("garg");
		
        WebElement email=driver.findElement(By.xpath("//input[@id=\"customer.email\"]"));
        email.sendKeys("nishigarg2618@gmail.com");
        
      //WebElement loginbtn=driver.findElement(By.xpath("//div[@class=\'H6-NpN _3N4_BX\']"));
      		Actions act=new Actions(driver);
      		//act.moveToElement(loginbtn);
      		//Thread.sleep(5000);
      		//WebElement myprofileoptn=driver.findElement(By.xpath("//li[@class=\'AT0fUR\']"));
      		WebElement searchbar= driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
      		act.sendKeys(searchbar, "Test"+ Keys.ENTER);
      		WebElement Fashionmenu= driver.findElement(By.xpath("//div[@style='top: 75.2px; left: 396.138px; height: 126px; width: 122px;']"));
      		act.moveToElement(Fashionmenu).build().perform();
	
		
		
		
	}

}
