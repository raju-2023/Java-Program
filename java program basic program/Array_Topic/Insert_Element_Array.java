/*Insert item in an Array*/
//a[3] = 34 67 23
//loc 1  item=100
//a[3+1] = 34 100 67 23

package Array_Topic;
import java.util.*;
public class Insert_Element_Array 
{
	public static void main(String[] args) 
	{
		int size,idx,ElementStore_Here,i;
		Scanner r = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		size = r.nextInt();
		
		int a[] = new int [size+1];
		System.out.print("Enter elements in an array : ");
		for(i=0;i<size;i++)
		{
			a[i] = r.nextInt();
		}
		System.out.print("Enter the array index number where element to insert  : ");
		idx = r.nextInt();
		System.out.print("Enter new element in an array : ");
		ElementStore_Here = r.nextInt();
		
		for(i = size; i>idx;i--)
		{
			a[i] = a[i-1];
		}
		a[idx] = ElementStore_Here;
		size++;
		for(i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

/*
Output:
	
	Enter the size of an array : 4
	Enter elements in an array : 10 20 30 40
	Enter the array index : 1
	Enter new element in an array : 700
	10 700 20 30 40 
*/