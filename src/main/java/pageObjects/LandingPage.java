package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

public WebDriver driver;


By login=By.xpath("//*[text()='Login']");
By text=By.cssSelector(".text-center");
By navigationBar=By.xpath("//*[@role='navigation']");

public LandingPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
this.driver=driver;
}


public LoginPage getLogin() {
	
	 driver.findElement(login).click();
	  LoginPage lp1=new LoginPage(driver);
return lp1;
}

public WebElement getFeaturedCourses() {
	
	return driver.findElement(text);
	}
public WebElement navigation() {
	
	return driver.findElement(navigationBar);
	}


}
