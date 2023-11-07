package ExceptionHandling;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1 = 6;
		 int num2 = 2;
		 int result = 0;
		 int values [] = {4,7,2,9};
		 String name = null;
		 
		 try
		 {
			 result = num1 / name.length();
			 System.out.println(values[5]);
		 }
		 
		 catch(ArithmeticException e)
		 {
			 
			 System.out.println("Cannot divide by Zero....."+e);
		 }
		 
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 
			 System.out.println(values[values.length-1]);
			 System.out.println("Stay in your limits");
		 }
		 catch(Exception e)
		 {
			 System.out.println("Somthing went wrong........");
		 }
		 System.out.println(result);
		 System.out.println("Bye Bye");
	}

}
