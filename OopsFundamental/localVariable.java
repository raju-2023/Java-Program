package OopsFundamental;

public class localVariable {

	public static void main(String[] args) {
		
		
/*		int i=0;
		for(int j=0;j<=3;j++) {
			i=i+j;
		}
		System.out.println(j);//CE
*/

		
/*		int x;
		System.out.println("hello");//hello
*/

		
/*		
		int x;
		System.out.println(x);//CE
*/

/*
		int x;
		if(args.length>0) {
			x=10;
		}
		System.out.println(x);//CE
*/
		
		int x;
		if(args.length>0) {
			x=10;
		}
		else {
			x=20;
		}
		System.out.println(x);
	}

}
