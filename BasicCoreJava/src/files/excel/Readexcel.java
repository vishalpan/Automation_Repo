package files.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Readexcel {

	public static void main(String[] args) throws IOException
	{
		// To read data from excel file
		
		FileInputStream file =new FileInputStream ("E:\\Automation_Repo\\Userlogin.xls");
		
				HSSFWorkbook wb=new HSSFWorkbook(file);
				
			/*HSSFSheet sheet =wb.getSheetAt(0);
			
			HSSFRow row=sheet.getRow(0);
			
			HSSFCell cell=row.getCell(0);
					
			 String str=cell.getStringCellValue();
			 
			 System.out.println(str);*/
			
			String val=	wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
			
			int rows=wb.getSheetAt(0).getLastRowNum();
			int colum=wb.getSheetAt(0).getRow(0).getLastCellNum();
			
			System.out.println("No. of Rows= "+rows+" No. of columns= "+colum+ "\n");
			
			for(int r=1; r<=rows; r++)
			{
				for (int c=0; c<colum; c++)
				{
					System.out.print(wb.getSheetAt(0).getRow(r).getCell(c).getStringCellValue()+" ");
				
				}System.out.println("\n");
			}

	}

	}
