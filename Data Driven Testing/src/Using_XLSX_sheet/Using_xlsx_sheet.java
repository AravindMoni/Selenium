package Using_XLSX_sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Using_xlsx_sheet
{

		/*public static void main(String[] args) throws Exception 
		{
		
			//	FileInputStream ip=new FileInputStream("C:\\Users\\HI\\Desktop\\ELF_BCA_BSc_TEAM3\\Selenium_Programs\\Data Driven Testing\\For_xlsx.xlsx");
				
				Workbook wb=WorkbookFactory.create(ip);
				
				Sheet sh = wb.getSheet("Sheet1");
				
				Row r = sh.getRow(1);
				
				Cell c = r.getCell(0);
				
				String data =c.getStringCellValue();
				
				System.out.println(data);		
		}	*/	
		
		
		// OR
				
				
/*				public static String excelData(String sheet,int row,int cell) throws Exception
				{
					FileInputStream ip=new FileInputStream("C:\\Users\\HI\\Desktop\\ELF_BCA_BSc_TEAM3\\Selenium_Programs\\Data Driven Testing\\For_xlsx.xlsx");
					
						Workbook wb=WorkbookFactory.create(ip);
						
						Sheet sh = wb.getSheet("Sheet1");
						
						Row r = sh.getRow(row);
						
						Cell c = r.getCell(cell);
						
						String data =c.toString();
						
					
						return data;
				}
		
		
		
		public static void main(String[] args) throws Throwable
		{
			System.out.println(excelData("sheet1", 1, 1));
		}		
													*/
		
		
	//OR
	
	
	
	public static String excelData(String sheet,int row,int cell) throws Exception
	{
		FileInputStream ip=new FileInputStream("C:\\Users\\HI\\Desktop\\ELF_BCA_BSc_TEAM3\\Selenium_Programs\\Data Driven Testing\\For_xlsx.xlsx");
		
			Workbook wb=WorkbookFactory.create(ip);
			
			Sheet sh = wb.getSheet("Sheet1");
			
			Row r = sh.getRow(row);
			
			Cell c = r.getCell(cell);
			
			String data =c.toString();
		
			
			return data;
	}
	
	
		
				
		
}
