package polymorphism;

//Example of of Run Time Polymorphism.Using Overridding

class shape
{
	void draw()
	{
		System.out.println("Can't Say shape Type");	
	}
	
}
class square extends shape
{
	@Override
	void draw()
	{
		super.draw();
		System.out.println("Square shape");
	}
}

public class RT1 
{
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		shape r=new square();
		r.draw();

	}

}

//Output:
//		Can't Say shape Type
//		Square shape

