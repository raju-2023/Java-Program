package Encapsulaton_shadowing_this_setter_getter;

class student2
{
	private String name;
	private Integer id;
	private String address;
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void setId(Integer id) 
	{
		this.id = id;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public Integer getId() 
	{
		return id;
	}
	
	public String getAddress() 
	{
		return address;
	}
}

public class Setters_and_Getters_methods 
{
	public static void main(String[] args) 
	{
		student2 std3 = new student2();
		std3.setId(10);
		std3.setName("Raju Kushwah");
		std3.setAddress("Gwalior");
		
		System.out.println("ID is : "+std3.getId());
		System.out.println("Name is : "+std3.getName());
		System.out.println("Address is : "+std3.getAddress());
	}
}


/*
 
 Output:
		ID is : 10
		Name is : Raju Kushwah
		Address is : Gwalior
*/