package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base {
	
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(HomePage.class.getName());

	

	@BeforeTest
	public void driverinitalize() throws IOException {
		driver = initalizeDriver();
		log.info("Driver is initalized");
		driver.get(prop.getProperty("url"));
		 
	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String username, String password) throws IOException, InterruptedException {
		
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		LoginPage lp1=lp.getLogin();
		
		lp1.getEmail().sendKeys(username);
		lp1.getPassword().sendKeys(password);
		// System.out.println(text);
		lp1.LoginButton().sendKeys(Keys.ENTER);
		ForgotPassword fp=lp1.forgotPassword();
		fp.emailTextboxClick().sendKeys("sdlanla@youtube.com");
		fp.sendButtonClick().sendKeys(Keys.ENTER);
		
	}
	
	  
	  @AfterTest
	  public void tearDown() { 
		  
		  driver.close(); }
	  @DataProvider
		public Object[][] getData() {

			return new Object[][] { { "asdfadsf", "asdfadsf" }, { "wwow", "asdnfn" }, { "asdfn", "asdf" } };
		}
	 

}
