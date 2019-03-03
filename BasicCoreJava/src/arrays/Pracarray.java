package arrays;

public class Pracarray {

		public static void main(String[] args)
		{
			int a[]=new int[10];
			a[0]=110;
			a[1]=210;
			a[2]=310;
			a[0]=410;
			a[4]=510;
			a[5]=610;
			
			System.out.println(a.length);
			
			for(int i=0; i<a.length; i++)
				
				System.out.println(a[i]);
	}

}
