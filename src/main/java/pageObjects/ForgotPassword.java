package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

	public WebDriver driver;

	By sendEmail= By.xpath("//*[@type='email']");
	
	By sendButton= By.xpath("//*[@name='commit']");
	
	public ForgotPassword(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement emailTextboxClick() {
		
		return driver.findElement(sendEmail);
		}

	
	public WebElement sendButtonClick() {
		
		return driver.findElement(sendButton);
		}
	
	
	
}
