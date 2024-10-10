package Page1;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import LoginBase.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends Base {

	public void user_launch_site_url() {

		setup();
	}

	public void user_enter_correct_username_password_details(){
		
		WebElement uname= driver.findElement(By.xpath("//input[@id='user-name']"));
		mouseHover(uname);
		uname.sendKeys(prop.getProperty("username"));
		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
		mouseHover(password);
	    password.sendKeys(prop.getProperty("password"));
	    getScreenshot();
	}

	public void user_click_on_login_button() {
	 
		 WebElement loginbtn= driver.findElement(By.xpath("//input[@id='login-button']"));
		   loginbtn.click();
		   getScreenshot();
	}

	public void validate_user_login_navigate_to_home() {
	  
		 WebElement productheading=driver.findElement(By.xpath("//span[@class='title']"));
		  assertTrue(productheading.isDisplayed());
	}
	
}
