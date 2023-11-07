package Inheritance;

class StudentOne
{
	protected int roll,marks;
	String name;
	protected void input()
	{
		System.out.println("Enter roll,name,& marks:");
	}
}


class Student1 extends  StudentOne  
{
	void disp()
	{
		roll=10;
		name="raju";
		marks=500;
		System.out.println(roll+" "+name+" "+marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 r=new Student1();
		r.input();
		r.disp();
	}

}
