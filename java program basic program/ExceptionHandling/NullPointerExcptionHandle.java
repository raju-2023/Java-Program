package ExceptionHandling;
public class NullPointerExcptionHandle 
{
	public static void main(String[] args) 
	{
		String str1 = "raju";
		String str2 = null;  
		try {
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toUpperCase());
		}
		catch(NullPointerException n)
		{
			System.out.println("Exception Handle");
		}
	}
}
