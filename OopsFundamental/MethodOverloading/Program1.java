package OopsFundamental.MethodOverloading;

public class Program1 {
	
	public void m1() {
		System.out.println("zero argument method");
	}
	
	public void m1(int i) {
		System.out.println("int argument method");
	}
	
	public void m1(double d) {
		System.out.println("double argument method");
	}
	
	public static void main(String[] args) {
		
		Program1 p = new Program1();
		p.m1();
		p.m1(20);
		p.m1(30.6);
	}
}
