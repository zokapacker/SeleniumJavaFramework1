package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.googleSearchPageObjects;

public class googleSearchTest3 {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearchTest();
		
	}
	
	public static void googleSearchTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		googleSearchPageObjects searchPageObj = new googleSearchPageObjects(driver);
		
		driver.get("https://www.google.com/");
		
		searchPageObj.setTextInSearchBox("abcd");
		searchPageObj.clickSearchButton();
		
		driver.close();
		
	}

}
