package Array_Topic;

import java.util.Scanner;

public class Find_Lenght_Of_Array 
{

	public static void main(String[] args) 
	{
		int a[] = new int[5];
		Scanner r = new Scanner(System.in);
		System.out.println("Enter elements in array \n");
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("Array elements ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("\nArray Length "+a.length);
	}
}
/*Output:
			Enter elements in array
			100 200 300 400 500
			Array elements 
			100 
			200 
			300 
			400 
			500 
			
			Array Length 5
*/
