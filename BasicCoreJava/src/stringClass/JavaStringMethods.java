package stringClass;

public class JavaStringMethods
{

	public static void main(String[] args) 
	{
		String s1="Vishal Pandey Weds Shilpa Sharma";
		
		// length
		
		int l=s1.length();
		System.out.println(l);
		
		// charAT(int index) , returns char value for the particular index

		String s2="Vishal Pandey Weds Shilpa Sharma";
		char ch=s2.charAt(7);
		System.out.println(ch);
		
		//substring(int beginIndex) , return substring for begin index
		
		String s3="Vishal Pandey Weds Shilpa Sharma";
		String sub=s3.substring(5);
		System.out.println(sub);
		
		//	split(String regex), returns a split string matching regex.
		
		String s4="Vishal Pandey Weds Shilpa Sharma";
		String [] vs=s4.split("Weds");
		
		for (String S:vs)
		{
			System.out.println(S);
		}
		
// substring (int beginindex), return string of given index
		
		
		String s5="Vishal Pandey Weds Shilpa Sharma";
		String sv= s5.substring(7);
		System.out.println(sv);
		
		
	}

}
