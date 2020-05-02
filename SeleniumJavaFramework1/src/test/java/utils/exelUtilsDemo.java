package utils;

public class exelUtilsDemo {
	
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		ExelUtils excel = new ExelUtils(projectPath+"\\exel\\data.xlsx", "Sheet1");
		
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
	}

}
