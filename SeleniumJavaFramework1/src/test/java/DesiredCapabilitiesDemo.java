import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

public class DesiredCapabilitiesDemo {
	
	static WebDriver driver = null;
	
	@BeforeTest   //moze i u @BeforeSuite..
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		//System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		//driver = new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver", projectPath+"\\drivers\\iedriver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(caps); //zastarelo-resiti
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		

	}

}
