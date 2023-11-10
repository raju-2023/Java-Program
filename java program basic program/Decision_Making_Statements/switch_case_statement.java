			/*switch case statement use here*/
package Decision_Making_Statements;

import java.util.Scanner;

public class switch_case_statement 
{
	public static void main(String[] args) 
	{	
		int a=30,b=20,ch;
		System.out.print("Enter User Choice: \n");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		switch(ch)
		{
		case 1:System.out.println("Sum : "+(a+b));
			break;
			
		case 2:System.out.println("Sub : "+(a-b));
			break;
			
		case 3:System.out.println("Mul : "+(a*b));
			break;
			
		case 4:System.out.println("Modulus : "+(a%b));
			break;
			
		default:System.out.println("Invalid Choice");
				
		}
		System.out.println("Out of Switch here.....");
	}
}


/*
Output:
		Enter User Choice: 
		1
		Sum : 50
		Out of Switch here.....
*/

/*
Output:
		Enter User Choice: 
		2
		Sub : 10
		Out of Switch here.....
*/

/*
Output:
		Enter User Choice: 
		3
		Mul : 600
		Out of Switch here.....				
*/

/*
Output:
		Enter User Choice: 
		4
		Div : 1
		Out of Switch here.....				
*/

/*
Output:
		Enter User Choice: 
		4
		Modulus : 10
		Out of Switch here.....			
*/

/*
Output:
		Enter User Choice: 
		5
		Invalid Choice
		Out of Switch here.....		
*/