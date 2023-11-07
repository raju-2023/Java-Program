package Interfaces;

interface B
{
	void show();
}

interface X
{
	void abc();
}

class C implements B,X
{
	public void show()
	{
		System.out.println("In show");
	}
	
	public void abc()
	{
		System.out.println("In abc");
	}
}


public class Interfaces2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		B obj=new C();
		obj.show();
		
		
	}
}
