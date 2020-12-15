package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class LandingPageTest extends Base {
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(LandingPageTest.class.getName());

	@BeforeTest
	public void initalize() throws IOException {
		driver = initalizeDriver();
		log.info("Driver is initalized");
		driver.get(prop.getProperty("url"));
		log.info(" Landing Page opened successfully");
	}

	@Test
	public void basePageNavigation() throws IOException {

		LandingPage lp = new LandingPage(driver);
		Assert.assertEquals(lp.getFeaturedCourses().getText(), "FEATURED45 COURSES");
		log.info("Successfully validated text message");
		Assert.assertTrue(lp.navigation().isDisplayed());
		log.info("Navigattion bar is displayed");

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
