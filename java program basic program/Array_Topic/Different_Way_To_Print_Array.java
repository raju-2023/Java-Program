/* Different ways to print Arrays Elements*/
package Array_Topic;

public class Different_Way_To_Print_Array 
{

	public static void main(String[] args) 
	{
		int a[] = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		/*This is for loop used in java Array Topic*/
		/*
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]+" ");
		}
		*/
		
		/*In Java-:Array Toipic-: for each loop is better */
		for(int b : a)
		{
			System.out.println(b+" ");
		}

	}

}

/*
  Output:
			10 
			20 
			30 
 */
