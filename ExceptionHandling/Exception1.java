package ExceptionHandling;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1 = 6;
		 int num2 = 0;
		 int result = 0;
		 
		 try
		 {
			 result = num1 / num2;
			 System.out.println("In try Block");
		 }
		 catch(Exception e)
		 {
			 System.out.println("Something went wrong....."+e);
		 }
		 System.out.println(result);
		 System.out.println("Bye Bye");
	}

}

