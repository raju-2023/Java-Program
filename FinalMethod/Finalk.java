package FinalMethod;

//final class Animal1
//{
//	void sleep()
//	{
//		System.out.println("Animal is sleeping");
//	}
//}

class Animal1
{
	final int age=19;
	final void sleep()
	{
		//age=20;
		System.out.println("Animal is sleeping");
		}
}
class Tiger1 extends Animal1
{
//	void sleep()  // final method we cannot override in child class
//	{
//		
//	}
}

public class Finalk
{

	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		
		Tiger1 t=new Tiger1();
		t.sleep();

	}

}
