package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	By email = By.id("user_email");
	By password = By.id("user_password");
	By Loginbutton = By.xpath("//*[@type='submit']");
	 By forgotpassword=By.cssSelector(".link-below-button");
  

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;

	}

	public WebElement getEmail() {

		return driver.findElement(email);
	}

	public WebElement getPassword() {

		return driver.findElement(password);
	}
	public WebElement LoginButton() {

		return driver.findElement(Loginbutton);
	}
	
	public ForgotPassword forgotPassword() {

		 driver.findElement(forgotpassword).click();
         return new ForgotPassword(driver);
	
	
	
	}

}
