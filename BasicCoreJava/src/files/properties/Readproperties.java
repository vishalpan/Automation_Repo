package files.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readproperties
{

	public static void main(String[] args) throws IOException   
	{
		// creating property class object		
		Properties or=new Properties();
		
		or.load(new FileInputStream("E:\\Automation_Repo\\BasicCoreJava\\src\\files\\properties\\ObjectRepo.properties"));  
		
		
	//	 FileInputStream file= new FileInputStream("E:\\Automation_Repo\\BasicCoreJava\\src\\files\\properties\\ObjectRepo.properties");
			
		 // we have to load the file, so used.. or.load. it achieve by Fileinput stream
		
		System.out.println(or.getProperty("url"));
		System.out.println(or.getProperty("username"));
	}

}
