/*Mirror Matrix Using 2D Array */
package Array_Topic;
import java.util.Scanner;
public class Mirror_Matrix 
{
	public static void main(String[] args)
	{
		int a[][] = new int[2][2];
		Scanner r = new Scanner(System.in);
		System.out.print(" Enter Array Data : ");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				a[i][j]=r.nextInt();
			}
		}
		
		System.out.print(" Array Matrix :\n ");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n ");
		}
		
		System.out.print("Mirror Matrix :\n ");
		for(int i=0;i<=1;i++)
		{
			for(int j=1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n ");
		}
	}
}

/*
Output:
	
	 Enter Array Data : 10 20 30 40
	 Array Matrix :
	 10 20 
	 30 40 
	 Mirror Matrix :
	 20 10 
	 40 30 
*/	 
