							/*Sum of two Matrix*/
package Array_Topic;
import java.util.Scanner;
public class Addition_of_two_Matrix 
{
	public static void main(String[] args) 
	{
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		int c[][] = new int[2][2];
		Scanner r = new Scanner(System.in);
		System.out.print("Enter First Matrix Data : ");
		for(int i=0;i<2;i++)    // for rows
		{
			for(int j=0;j<2;j++)  //for columns
			{
				a[i][j] = r.nextInt();			
			}
		}		
		System.out.print("Enter Second Matrix Data : ");
		for(int i=0;i<2;i++)    // for rows
		{
			for(int j=0;j<2;j++)  //for columns
			{
				b[i][j] = r.nextInt();			
			}
		}
		System.out.print("First Matrix : \n");
		for(int i=0;i<2;i++)    // for rows
		{
			for(int j=0;j<2;j++)  //for columns
			{
				System.out.print(a[i][j]+" ");			
			}
			System.out.print("\n");
		}
		System.out.print("Second Matrix : \n");
		for(int i=0;i<2;i++)    // for rows
		{
			for(int j=0;j<2;j++)  //for columns
			{
				System.out.print(b[i][j]+" ");			
			}
			System.out.print("\n");
		}		
		System.out.print("Addition of Two Matrix : \n");
		for(int i=0;i<2;i++)    // for rows
		{
			for(int j=0;j<2;j++)  //for columns
			{
				c[i][j] = a[i][j]+b[i][j];	
				System.out.print(c[i][j]+" ");
			}
			System.out.print("\n");
		}		
	}
}


/*
Output:
	
	Enter First Matrix Data : 10 20 30 40
	Enter Second Matrix Data : 10 20 30 40
	First Matrix : 
	10 20 
	30 40 
	Second Matrix : 
	10 20 
	30 40 
	Addition of Two Matrix : 
	20 40 
	60 80 
*/
