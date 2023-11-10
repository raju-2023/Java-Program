				/*if_else statement use here */

package Decision_Making_Statements;

import java.util.Scanner;

public class if_else_Statement_use 
{
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter any Number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
			if(n>=0)
			{
				System.out.println("Positive Number");
			}
			else
			{
				System.out.println("Negative Number");			
			}
		
	}
}

/*
Output:
		Enter any Number : 
		-5
		Negative Number
*/

/*
Output:
		Enter any Number : 
		5
		Positive Number
*/