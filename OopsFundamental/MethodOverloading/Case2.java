package OopsFundamental.MethodOverloading;

public class Case2 {
	public void m1(String s) {
		System.out.println("String argument method");
	}
	
	public void m1(Object d) {
		System.out.println("Object argument method");
	}
	public static void main(String[] args) {
		Case2 so = new Case2();
		so.m1("Raju");//String argument method
		so.m1(new Object());//Object argument method
		so.m1(null);//String argument method

	}

}
