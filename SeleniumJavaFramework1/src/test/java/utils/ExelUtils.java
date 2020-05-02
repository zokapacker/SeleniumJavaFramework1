package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelUtils {
	
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExelUtils(String exelPath, String sheetName) {
		try {
		projectPath = System.getProperty("user.dir");
		workbook = new XSSFWorkbook(exelPath); //Bile pre (projectPath+"\\exel\\data.xlsx")
		sheet = workbook.getSheet(sheetName); // Bile pre ("Sheet1")
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//getRowCount();
		getCellDataString(0,0);
		//getCellDataNumber(1,1);
	}
	
	public static int getRowCount() {
		int rowCount = 0;
		try {
		/*projectPath = System.getProperty("user.dir");
		workbook = new XSSFWorkbook(projectPath+"\\exel\\data.xlsx");
		sheet = workbook.getSheet("Sheet1");    ovo sad ne treba posto je ubaceno u konstruktor*/
		rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows : "+rowCount);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowCount;
		
	}
	
	public static int getColCount() {
		int colCount = 0;
		try {
		/*projectPath = System.getProperty("user.dir");
		workbook = new XSSFWorkbook(projectPath+"\\exel\\data.xlsx");
		sheet = workbook.getSheet("Sheet1");    ovo sad ne treba posto je ubaceno u konstruktor*/
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of columns : "+colCount);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return colCount;
		
	}
	
	public static String getCellDataString(int rowNum, int colNum) {
		String cellData = null;
		try {
		/*projectPath = System.getProperty("user.dir");
		workbook = new XSSFWorkbook(projectPath+"\\exel\\data.xlsx");
		sheet = workbook.getSheet("Sheet1");*/
		cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println(cellData);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	}
	public static void getCellDataNumber(int rowNum, int colNum) {
	
		try {
		/*projectPath = System.getProperty("user.dir");
		workbook = new XSSFWorkbook(projectPath+"\\exel\\data.xlsx");
		sheet = workbook.getSheet("Sheet1");*/
		double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(cellData);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

}
