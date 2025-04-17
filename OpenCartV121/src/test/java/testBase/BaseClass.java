package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
public String randomString(){
		
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
  public String randomNumber(){
		
		String generatedString = RandomStringUtils.randomNumeric(10);
		return generatedString;
	}

  public String randomAlphanumeric(){
	
	String generatedString = RandomStringUtils.randomAlphanumeric(7);
	return generatedString;
}
	
	
	
}
