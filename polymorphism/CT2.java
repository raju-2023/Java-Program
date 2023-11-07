package polymorphism;

class B
{
	int add()   //return type different is possible
	{
		int a=10,b=20,c;
		c=a+b;
		return c;
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

public class CT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B r=new B();
		
		r.add(100,200);
		r.add(50,45.32);
		
		int add=r.add();
		System.out.println(add);
	}

}
