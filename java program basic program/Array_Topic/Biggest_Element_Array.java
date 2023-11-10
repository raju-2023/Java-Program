		/*Find Biggest Element in Array*/
package Array_Topic;
import java.util.*;
public class Biggest_Element_Array 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int max;
		Scanner r = new Scanner(System.in);
		System.out.print("Enter elements in an array : ");
		for(int i=0;i<5;i++)
		{
			a[i] = r.nextInt();
		}
		max = a[0];
		for(int i=1;i<5;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.print("Maximum element in an array is : "+max);
	}
}


/*
Output:
			Enter elements in an array : 10 50 40 60 30
			Maximum element in an array is : 60
*/