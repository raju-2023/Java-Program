package ConsoleClass;
/*
import java.io.Console;
public class console_class {

	public static void main(String[] args) 
	{	
		String str;
		char ch[];
		Console obj = System.console();
		
		System.out.println("Enter Username : ");
		str = obj.readLine();
		
		
		System.out.println("Enter Password : ");
		ch = obj.readPassword();
		
		String a = String.valueOf(ch);
		System.out.println("Username : "+str);
		System.out.println("Password : "+a);
	}

}
*/

import java.util.Scanner;
public class console_class
{

	public static void main(String[] args) {
		String str;
		char[] ch;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Username : ");
		str = scanner.nextLine();

		System.out.println("Enter Password : ");
		ch = scanner.nextLine().toCharArray();

		String a = String.valueOf(ch);
		System.out.println("Username : " + str);
		System.out.println("Password : " + a);

		// Close the scanner when you're done with it (optional)
		scanner.close();
	}
}
