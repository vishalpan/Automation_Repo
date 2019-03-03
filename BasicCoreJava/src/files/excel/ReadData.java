package files.excel;

import java.io.IOException;

public class ReadData {

	public static void main(String[] args) throws IOException 
	{
		Xls_Reader xl=new Xls_Reader("E:\\Automation_Repo\\Userlogin.xls");
				
		String str =xl.getCellData ("Sheet1", 2, 2);
				System.out.println(str);

	}

}
