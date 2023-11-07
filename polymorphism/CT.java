package polymorphism;
//compile time polymorphism will be achieved by method overloading(polymorphism means same object but different behavior)

class A
{
	void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	
	void add(int x,int y)
	{
		int c;
		c=x+y;
		System.out.println(c);
	}
	
	void add(int x,double y)
	{
		double c;
		c=x+y;
		System.out.println(c);
	}
}

public class CT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A r=new A();
		r.add();
		r.add(100,200);
		r.add(50,45.32);
		

	}

}

//Output:
//			30
//			300
//			95.32

