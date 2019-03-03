package reflections;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import files.excel.Xls_Reader;

public class Executor {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException
	{
		Xls_Reader xl=new Xls_Reader("E:\\Automation_Repo\\Userlogin.xls");
		
		String tc_name =xl.getCellData ("Keywords", 2, "TC_Name");
		
		System.out.println(tc_name);

		String[] Keywords =xl.getCellData ("Keywords", 2, "Keywords").split(",");
		
		//System.out.println(Keywords);
		
		Class c=Class.forName("reflections."+tc_name);
		
		Object obj= c.newInstance();
		
		Method m= c.getDeclaredMethod(Keywords[1]);
		m.invoke(obj);

}}
