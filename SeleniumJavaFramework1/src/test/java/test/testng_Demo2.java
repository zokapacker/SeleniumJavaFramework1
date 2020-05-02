package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.googleSearchPageObjects;

public class testng_Demo2 {
	
	private static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	
	@Test
	public static void googleSearchTest2() {
		
		googleSearchPageObjects searchPageObj = new googleSearchPageObjects(driver);
		
		driver.get("https://www.google.com/");
		
		searchPageObj.setTextInSearchBox("abcd");
		searchPageObj.clickSearchButton();
		
	}
	
	@Test
	public static void googleSearchTest3() {
		
		googleSearchPageObjects searchPageObj = new googleSearchPageObjects(driver);
		
		driver.get("https://www.google.com/");
		
		searchPageObj.setTextInSearchBox("abcd");
		searchPageObj.clickSearchButton();
		
	}
	
	@AfterTest
	public void tearDownTest() {
		
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}

}
