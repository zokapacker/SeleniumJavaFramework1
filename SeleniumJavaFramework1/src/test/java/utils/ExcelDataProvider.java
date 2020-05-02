package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class ExcelDataProvider {

	/*public static void main(String[] args) {
		String exelPath = "C:\\Users\\Korisnik\\eclipse-workspace\\SeleniumJavaFramework1\\exel\\data.xlsx";
		testData(exelPath, "Sheet1");

	}         nakon ubacivanja anotacije testng @DataProvider i funkcije vise nam nije potreban main method, 
	          moze se i izbaciti(izbacen) static jer je koriscen za main method */

	WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();


	}

	@Test(dataProvider="test1data")
	public void test1(String Username, String Password) throws Exception {
		System.out.println(Username+" | "+Password);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		Thread.sleep(2000);

	}

	@DataProvider(name = "test1data")
	public Object[][] getData() {
		String exelPath = "C:\\Users\\Korisnik\\eclipse-workspace\\SeleniumJavaFramework1\\exel\\data.xlsx";
		Object data[][] = testData(exelPath, "Sheet1"); 
		return data; // nakon sto je kreiran object obrisano je void iz funkcije i ubacen taj object

	}

	public Object[][] testData(String exelPath, String sheetName) {

		ExelUtils excel = new ExelUtils(exelPath, sheetName);

		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();

		Object data[][] = new Object[rowCount-1][colCount];

		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {

				String cellData = excel.getCellDataString(i, j);
				//System.out.print(cellData+" | ");
				data[i-1][j] = cellData;

			}
			System.out.println();
		}
		return data;

	}

}
