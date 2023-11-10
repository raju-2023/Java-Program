/*Nested for loop Example.....*/
package Looping;
public class Nested_For_Loop 
{
	public static void main(String[] args) 
	{
		int i,j;
		for(i=1;i<=5;i++) //row
		{
			for(j=1;j<=5;j++)//column
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

/*Output:
			* * * * * 
			* * * * * 
			* * * * * 
			* * * * * 
			* * * * * 
*/
