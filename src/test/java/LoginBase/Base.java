package LoginBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties prop; 
	static {
		
		try {
			FileInputStream file= new FileInputStream("TestData/login.properties");
			prop= new Properties();
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
}
	//git commands used
	public void setup()
	{
		String browsername= prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--incognito");
			driver=new ChromeDriver(options);
		}else if(browsername.equals("firefox"))
		{
		  WebDriverManager.firefoxdriver().setup();
		  FirefoxOptions options=new FirefoxOptions();
		  options.addArguments("--incognito");
		  driver=new FirefoxDriver(options);
	}else if(browsername.equals("edge")) {
		
		WebDriverManager.edgedriver().setup();
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--incognito");
		driver=new EdgeDriver();
	}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
   }
	public void mouseHover(WebElement ele) {
		
		Actions a= new Actions(driver);
		a.moveToElement(ele).build().perform();
	}
	public void doubleclick(WebElement ele1) {
		
		Actions a1=new Actions(driver);
		a1.doubleClick(ele1).build().perform();
	}
	public void getScreenshot() {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scr,new File("Screenshot/"+ System.currentTimeMillis()+ ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
}
	public void tearDown(Scenario s) {
		
		if(s.isFailed()) {
			getScreenshot();
		}
		driver.quit();
	}
}
