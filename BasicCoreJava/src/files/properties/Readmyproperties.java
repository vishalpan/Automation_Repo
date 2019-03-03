package files.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Readmyproperties {

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		//to read value from file we have a create a property object
		
		Properties myprop=new Properties();
		
		myprop.load(new FileInputStream("E:\\Automation_Repo\\BasicCoreJava\\src\\files\\properties\\Myproperties"));
		
		//myprop.load("E:\\Automation_Repo\\BasicCoreJava\\src\\files\\properties\\Myproperties");
		
		System.out.println(myprop.getProperty("url"));
		System.out.println(myprop.getProperty("username"));

	}

}
