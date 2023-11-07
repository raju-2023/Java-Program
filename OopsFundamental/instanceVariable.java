package OopsFundamental;

public class instanceVariable {
	
	int i=10;
	
	public static void main(String[] args) {
		//System.out.println(i);//CE:non static vriable can't be referenced
		
		instanceVariable ins = new instanceVariable();
		System.out.println(ins.i);//valid
		ins.m1();
	}
	public void  m1() {
		
		System.out.println(i);//valid
	}

}
