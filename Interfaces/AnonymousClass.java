package Interfaces;

interface Car
{
	void drive();
}

//class Wagonar implements Car
//{
//	public void drive()
//	{
//		System.out.println("Driving");
//	}
//}

public class AnonymousClass 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		Car obj = new Car()// Anonymous inner class
				{
					public void drive()
					{
						System.out.println("Driving....");
					}
				};
		obj.drive();
	}

}
