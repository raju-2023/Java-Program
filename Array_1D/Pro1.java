package Array_1D;

public class Pro1 
{
	public static void main(String[] args)
	{
//		int[] a = new int[]; //ce:: array dimension is missing
//		int[] a = new int[5];
//		int[] a = new int[0];
//		int[] a = new int[-5]; //NegativeArraySizeException
	
//		System.out.println(a.length);
		
//		int[] a = new int[5];
		
/*		byte b = 10;
		int[] a = new int[b];// valid
		System.out.println(b);
*/
		
/*
		short s = 25;
		int[] a = new int[s]; //valid
		System.out.println(s);
*/
		
/*
 		char c = 'A';
		int[] a = new int[c];//valid
		System.out.println(c);
*/
//		int[] a = new int[10L]; //CE
//		int[] a = new int[3.5f]; //CE
		
//		int[] a = new int[2147483647];//but valid::OutOfMemoyError
//		int[] a = new int[2147483648];//CE

/*
		int[] a = new int[5];
		System.out.println(a);//Output=[I@4516af24
		System.out.println(a[3]);// Output=0
*/
/*
		int[]  a = new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		System.out.println(a[3]);// Output=0
//		System.out.println(a[4]);// ArrayIndexOutOfBoundsException
//		System.out.println(a[-4]);//ArrayIndexOutOfBoundsException
 */
		
		
/*
		
		int[] a = {10,20,30,40};
		char[] b = {'a','e','i','o','u'};
		String[] c = {"sachin","ramesh","tendulkar","IND"};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		System.out.println();
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
		
			//Output:
		  	//			10 20 30 40 
			//			a e i o u 
			//			sachin ramesh tendulkar IND 
*/
		
/*
		
		int[] a = new int[10];
		a[0]=97;
		a[1]='a';
		byte b = 10;
		a[2] = b;
		short s = 25;
		a[3] =s;
		// a[4] = 10L;////CE: possible loss of precession
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		//Output:97 97 10 25 0 0 0 0 0 0 
*/
		
		
/*		
		Object[] obj = new Object[5];
		obj[0] = new Object();//valid
		obj[1] = new Integer(10);//valid
		obj[2] = new String("sachin");//valid
		
		for(int i=0;i<obj.length;i++)
		{
			System.out.print(obj[i]+"   ");
		}
		
		//Output:java.lang.Object@24d46ca6   10   sachin   null   null
*/
		
/*		
		Runnable[] r = new Runnable[5];
		r[0] = new Thread("sachin");
	//	r[1] = new String("dhoni");//CE
		for(int i=0;i<r.length;i++)
		{
			System.out.print(r[i]+"   ");
		}
		
		Output:Thread[#20,sachin,5,main]   null   null   null   null 
*/	

/*
		
		int[] a = {1,2,3};
		char[] c = {'a','b','c'};
		int[] b = a;
		//int[] a = c;//Invalid
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+"   ");
		}
		System.out.println();
		for(char i=0;i<c.length;i++)
		{
			System.out.print(c[i]+"   ");
		}
		//Output:	1   2   3   
		//			a   b   c   
*/
/*		
		String[] names = {"sachin","saurav","dhoni"};
		Object[] obj = names;
		for(int i=0;i<obj.length;i++)
		{
			System.out.print(obj[i]+"   ");
		}
*/

/*
		int[] a = {10,20,30,40};
		int[] b = {100,200};
		a=b;
		b=a;
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+"   ");
		}
*/
		
/*	
		int[][] a = {{10},{20},{30}};
		int[] b = {100,200,300};
		b=a;//CE:incompatible type
*/
		
		
	//	int[] a = {10,20,30};
	//	System.out.println(a);// Output:[I@24d46ca6
		
	//	float[] f = {10.0f,20.0f};
	//	System.out.println(f);// Output:[F@24d46ca6
		
	//	boolean[] b = {true,false};
	//	System.out.println(b);// Output:[Z@24d46ca6
		
	//	Integer[] i = {10,20,30};
	//	System.out.println(i);// Output:[Ljava.lang.Integer;@24d46ca6
		
	//	Float[] f = {10.0f,20.0f};
	//	System.out.println(f);// Output:[Ljava.lang.Float;@24d46ca6
	}
}
