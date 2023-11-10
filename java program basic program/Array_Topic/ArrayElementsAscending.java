/* Sort array elements in ascending order*/
//lets a[5]=14 10 20 30 40 ------------->10 14 20 30 40
package Array_Topic;
import java.util.Scanner;
public class ArrayElementsAscending 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Elements in Array : ");
		for(int i=0;i<5;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Array Elements in Ascending Order : ");
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

/*
	Output:
			Enter Elements in Array : 35 63 25 45 96
			Array Elements in Ascending Order : 25 35 45 63 96 
*/
