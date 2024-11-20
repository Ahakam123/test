package utilities;

import java.io.IOException;

public class DataProviderClass {
	
	@org.testng.annotations.DataProvider(name="CreateCustomer")
	public String[][] getData() throws IOException
	{
		String path="src\\main\\resources\\Add_Cust Data.xlsx";
		
		ExcelUtility xlutill=new ExcelUtility(path);
		
		int totalrows=xlutill.getRowCount("Sheet1");
		int totalcols=xlutill.getCellCount("Sheet1", 1);
		
		String createcust[][]= new String[totalrows][totalcols];
		
		for(int i=1; i<=totalrows; i++)
		{
			for(int j=0;j<totalcols;j++) 
			{
				createcust[1-i][j]=xlutill.getCellData("sheet1", i, j);
			}
		}
		return createcust;
		
	}

}
