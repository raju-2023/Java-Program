/* 
 ==>	As noticed in the this program, the variables name,id,address 
 		are local variables and these values should be assigned to 
 		instance variables of student class.
 ==>	Inside the method the jvm will always give preference only for 
		local variables, this problem is termed as “Shadowing”.
 ==>	To resolve this problem we need to use ,  “this” keyword.
*/
/*package Encapsulaton_shadowing_this_setter_getter;

class Student
{
	private String name;
	private Integer id;
	private String address;
	
	Student(String name,Integer id,String address)
	{
		name = name;
		id = id;
		address = address;
	}
	
	public void display()
	{
		System.out.println("Name is : "+name);
		System.out.println("ID is : "+id);
		System.out.println("Address is : "+address);
	}
}



public class shadowing_problem 
{
	public static void main(String[] args) 
	{
		Student std = new Student("sachin",10,"MI");
		std.display();

	}
}
*/
/*
Output:
		Name is : null
		ID is : null
		Address is : null
*/
