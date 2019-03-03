package files.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Readmyexcel {

	public static void main(String[] args) throws IOException
	{
		// To read data from excel file
		
		FileInputStream file =new FileInputStream ("E:\\Automation_Repo\\Myexcel.xls");
		
				HSSFWorkbook wb=new HSSFWorkbook(file);
				
			/*HSSFSheet sheet =wb.getSheetAt(0);
			
			HSSFRow row=sheet.getRow(0);
			
			HSSFCell cell=row.getCell(0);
					
			 String str=cell.getStringCellValue();
			 
			 System.out.println(str);*/
			
			wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
			
			int row=wb.getSheetAt(0).getLastRowNum();
			int column=wb.getSheetAt(0).getRow(0).getLastCellNum();
			
			System.out.println("Rows "+row+" Columns="+column+"\n");
			
			for (int r=1; r<row; r++)
			{
				for (int c=0; c<column; c++)
				{
					System.out.println(wb.getSheetAt(0).getRow(r).getCell(c).getStringCellValue()+"\n");
				}
			}System.out.println("\n");
	}

	}
