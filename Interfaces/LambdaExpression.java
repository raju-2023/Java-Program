package Interfaces;
@FunctionalInterface
interface Bus
{
	void drive(int avg, int ts);
}
public class LambdaExpression 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Bus obj = (avg,ts)-> System.out.println("Driving...."+avg+" : "+ts);
					
				obj.drive(16,140);

	}

}
