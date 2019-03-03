package functions;

public class Practiceoverloading {

	public static void main(String[] args) 
	{
int a=10;
int b=15;

double c=14.4;
double d=13.3;

int load=result(a,b);
System.out.println("the min value of method one= "+load);
double load1=result(c,d);
System.out.println("\n the min value of method two= "+load1);

	}

	//Method overloading: when a class has two or method of same name but different parameters called method overloading
	
	public static int result(int a, int b)
	{
		int min;
		if (a>b)
		{
			min = b;
		}
		else 
		{
			min=a;
		}
		return min;
	}
	public static double result(double c, double d)
	{
		double min;
		if (c>d)
		{
			min=d;
		}else
		{
			min=c;
		}
	return min;
	}
	
	
	
	
	
}
