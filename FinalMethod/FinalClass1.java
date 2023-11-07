/*package FinalMethod;
final class B
{
	void mNumber()
	{
		System.out.println("9685569893");
	}
	
	void atmPIN()
	{
		System.out.println("1234");
	}
}

class ghost extends B
{
	@Override
	void mNumber()
	{
		System.out.println("9685569893");
	}
	
	
}

public class FinalClass1 
{

	public static void main(String[] args)
	{
		
		ghost t=new ghost();
		t.mNumber();
		t.atmPIN();
		// TODO Auto-generated method stub

	}

}

//Output:
//			FinalClass1.java:15: error: cannot inherit from final B
//			class ghost extends B
                    ^
//			1 error      */
