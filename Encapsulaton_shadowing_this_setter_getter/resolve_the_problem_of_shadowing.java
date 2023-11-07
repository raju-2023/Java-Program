//Program to resolve the problem of shadowing

/*
 ==> 	"this" keyword would always point to current object, 
 		and this variable would hold the address the active 
 		object present in the heap memory.
*/
package Encapsulaton_shadowing_this_setter_getter;

class student
{
	private String name;
	private Integer id;
	private String address;
	
	student(String name,Integer id,String address)
	{
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public void display()
	{
		System.out.println("Name is : "+name);
		System.out.println("ID is : "+id);
		System.out.println("Address is : "+address);
	}
}

public class resolve_the_problem_of_shadowing 
{
	public static void main(String[] args) 
	{
		student std1 = new student("Raju Kushwah",503,"Pawan Sut Colony");
		std1.display();
	}
}

/*
Output:

		Name is : Raju Kushwah
		ID is : 503
		Address is : Pawan Sut Colony
		
*/