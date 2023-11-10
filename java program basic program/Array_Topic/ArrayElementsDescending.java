/* Sort array elements in Descending order*/
// Let's a[5] = 10 60 20 70 15---------------->70 60 20 15 10
package Array_Topic;
import java.util.Scanner;
public class ArrayElementsDescending 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Elements in an Array : ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Array Elements in Descending Order : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

/*
Output:
		Enter Elements in an Array :  56 48 39 67 26
		Array Elements in Descending Order : 67 56 48 39 26 
*/