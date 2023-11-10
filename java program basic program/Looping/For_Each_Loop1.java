package Looping;
public class For_Each_Loop1 
{
	public static void main(String[] args)
	{
		int a[] = {10,20,30,40,50};
		for(int b:a)//this is the way of for each loop
		{
			System.out.print(b+" ");
		}
		System.out.println();
// this is also a way of print array element by using for loop
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
}

//Output: 10 20 30 40 50
//        10 20 30 40 50 
