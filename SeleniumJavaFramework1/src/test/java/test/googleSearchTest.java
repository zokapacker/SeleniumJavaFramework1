package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.googleSearchPage;

public class googleSearchTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch();
		
	}
	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		googleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		
		googleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		//textBox.sendKeys("Automation step by step");
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Test complete successfully");
		
		
		
		
		
	}

}
