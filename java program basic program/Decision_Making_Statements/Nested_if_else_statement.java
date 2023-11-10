/* Nested if else statement in Java*/

package Decision_Making_Statements;
public class Nested_if_else_statement 
{
	public static void main(String[] args) 
	{
		int a=10,b=20,c=30;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greater value is: "+a);
			}
			else
			{
				System.out.println("C is greater value is: "+c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("B is greater value is: "+b);
			}
			else
			{
				System.out.println("C is greater value is: "+c);
			}
		}
	}
}

/*
	Output: 
			C is greater value is: 30
*/