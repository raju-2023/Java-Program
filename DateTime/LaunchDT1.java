package DateTime;
//import java.util.Date;
//import java.util.ArrayList;
public class LaunchDT1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		java.util.Date dt=new java.util.Date();
		System.out.println(dt);
		
		long timeInMs=dt.getTime();		
		java.sql.Date dt1=new java.sql.Date(timeInMs);
		System.out.println(dt1);
		//java.util.ArrayList al=new java.util.ArrayList();
		
	}

}
