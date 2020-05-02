package listeners;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class)//ova anotacija se moze ukloniti ako se u xml fajl doda listeners i navede ova klasa u klasama
public class TestNgListenerDemo {

	@Test
	public void test1() {
		System.out.println("I am inside test 1");
	}
	@Test
	public void test2() {
		System.out.println("I am inside test 2");
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");

		//driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name=\"abc\"]")).sendKeys("abcd");
		
		driver.close();


		//Assert.assertTrue(false);
	}
	@Test
	public void test3() {
		System.out.println("I am inside test 3");
		throw new SkipException("This test is skipped");
	}

}
