package FinalMethod;
 class A
{
	void mNumber()
	{
		System.out.println("9685569893");
	}
	
	final void atmPIN()
	{
		System.out.println("1234");
	}
}

class Thief extends A
{
	@Override
	void mNumber()
	{
		System.out.println("9685569893");
	}
	
	
}
public class fullFinal 
{
	public static void main(String[] args)
	{
		Thief t=new Thief();
		t.mNumber();
		t.atmPIN();
	}

}
