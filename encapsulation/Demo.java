package encapsulation;
class Student{
	private int age;
	private String name;
	
	public void setData()
	{
		age = 18;
		name = "Rahul";
	}
	
	public void show()
	{
		System.out.println(name+" "+age);
	}
}
public class Demo {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.setData();
		obj.show();
	}

}
