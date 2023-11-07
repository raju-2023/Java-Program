package encapsulation;
class Student1{
	private int age;
	private String name;
	
	public void setData1(int age)
	{
		age = age;	
	}
	public void setData(String n)
	{
		name = n;
	}
	
	public void show()
	{
		System.out.println(name+" "+age);
	}
}
public class demo1 {

	public static void main(String[] args) {
		Student1 obj = new Student1();
		Student1 obj1 = new Student1();
		obj.setData1(18);
		obj1.setData1(25);
		obj.show();
		obj1.show();

	}

}
