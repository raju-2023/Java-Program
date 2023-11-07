package OopsFundamental.MethodOverloading;

public class Case3 {
	public void method1(String s) {
		System.out.println("String argument method");
	}
	
	public void method1(StringBuffer d) {
		System.out.println("StringBuffer argument method");
	}
	public static void main(String[] args) {
		Case3 s = new Case3();
		s.method1("raju");//string argument method
		s.method1(new StringBuffer("Kushwah"));//StringBuffer argument method
//		s.method1(null);//CE

	}

}
