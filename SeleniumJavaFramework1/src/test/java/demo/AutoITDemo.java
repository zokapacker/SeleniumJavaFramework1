package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	
	public static void main(String[] args) throws Exception {
		test();
	}
	
	public static void test() throws Exception {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("http://tinyupload.com/");
		//driver.findElement(By.linkText("How it works?")).click();
		driver.findElement(By.name("MAX_FILE_SIZE")).click();// nije odradjeno, ne pronalazi taj element kao ni uploaded_file
		
		Runtime.getRuntime().exec("C:/Users/Korisnik/Desktop/TESTING/FileUploadScript.exe");
		
		Thread.sleep(3000);
		//driver.close();
		//driver.quit();
		
		
	}

}
