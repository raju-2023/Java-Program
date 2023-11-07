package Interfaces;

//inner class three Types- member, stattic, anonymous
//Example of inner class
class H
{
	public void show()
	{
		System.out.println("in show");
	}
	
	static class I
	{
		public void display()
		{
			System.out.println("in display");
		}
	}
}

public class Interfaces5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H obj = new H();
		H.I obj1 = new H.I();
		obj.show();
		obj1.display();
	}

}
