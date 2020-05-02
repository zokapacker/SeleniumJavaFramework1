package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import pages.googleSearchPageObjects;

public class testng_Demo {
	
	private static WebDriver driver = null;
	public static String browserName = null;
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		
		//System.out.println("projectPath : "+projectPath);
		
		
	}

	
	@Test
	public static void googleSearchTest() {
		
		googleSearchPageObjects searchPageObj = new googleSearchPageObjects(driver);
		
		driver.get("https://www.google.com/");
		
		searchPageObj.setTextInSearchBox("abcd");
		searchPageObj.clickSearchButton();
		
	}
	@AfterTest
	public void tearDownTest() {
		
		driver.close();
		//driver.quit();
		System.out.println("Test completed successfully");
		PropertiesFile.setProperties();
	}

}
