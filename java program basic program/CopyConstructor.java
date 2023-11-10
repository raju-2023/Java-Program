//Copy Constructor:-Whenever we pass object reference to the constructor then it is called copy constructor.

class A
{
	int a;
	String b;
	
	A()
	{
		a=10;
		b="Java Coding";
		System.out.println(a+" "+b);
	}
	A(A ref)
	{
		a = ref.a;
		b = ref.b;
		System.out.println(a+" "+b);
	}
}
public class CopyConstructor 
{
	public static void main(String[] args) 
	{
		A r1 = new A();
		A r2 = new A(r1);
	}
}

