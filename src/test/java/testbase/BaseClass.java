package testbase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	
	public Logger logger;
	
	@BeforeClass
	public void setup()
	{
		logger = LogManager.getLogger(this.getClass()); //Log4j
		
		logger.info("Starting browser");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        logger.info("Browser launched and opened");
        driver.get("https://staging-duola-seven.vercel.app/login");
        driver.manage().window().maximize();
	}
	
	@AfterClass
	public void teardown()
	{
		logger.info("Browser closed");
		driver.quit();
	}
	
	public String randomString()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
				return generatedString;
	}
	
	public String randomNumber()
	{
		String generatedString = RandomStringUtils.randomNumeric(10);
		return generatedString;
	}
	
   public String randomAlphaNumeric()
	{
		String str = RandomStringUtils.randomAlphabetic(6);
		String num = RandomStringUtils.randomNumeric(3);
		return(str+"@"+num);
	}

}
