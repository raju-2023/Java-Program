package Interfaces;

interface  F
{
	void show();
	default void config()
	{
		System.out.println("in config");
	}
	static void abc()
	{
		System.out.println("in abc");
	}
}

class G implements F
{
	public void show()
	{
		System.out.println("in show");
	}
}

public class interfaces4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F.abc();
		F obj = new G();
		obj.show();
		obj.config();
		
	}

}
