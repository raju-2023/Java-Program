package OopsFundamental.MethodOverloading;

public class Case1_automaticPromotionInOverloading {
	
public void m1(int i) {
	System.out.println("int argument method");
}

public void m1(float f) {
	System.out.println("float argument method");
}
	public static void main(String[] args) {
		
		Case1_automaticPromotionInOverloading a = new Case1_automaticPromotionInOverloading();
		a.m1('a');
		a.m1(10l);
//		a.m1(10.5);//ce
	}

}
