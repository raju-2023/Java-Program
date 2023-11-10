package Array_Topic;
import java.util.*;
public class Smallest_Element_Array 
{

	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int min;
		Scanner r = new Scanner(System.in);
		System.out.print("Enter elements in an Array : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = r.nextInt();
		}
		min = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		System.out.print("Minimum element in an array is : "+min);
	}
}
/*
Output:
		Enter elements in an Array : 75 49 67 98 55
		Minimum element in an array is : 49
*/