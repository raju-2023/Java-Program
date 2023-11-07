package OopsFundamental.MethodOverloading;

public class Case4 {

	public void m1(int i,float f) {
		System.out.println("int,float arg method");
	}
	
	public void m1(float f,int i) {
		System.out.println("float,int arg mehtod");
	}
	
	public static void main(String[] args) {
		Case4 fi = new Case4();
		fi.m1(10,10.5f);//int,float arg method
		fi.m1(10.5f,10);//float,int arg method
//		fi.m1(10,10);//CE
//		fi.m1(10.5f,10.5f);//CE
		

	}

}
