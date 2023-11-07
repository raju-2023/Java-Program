package Encapsulaton_shadowing_this_setter_getter;


class AdultMan
{
	private boolean married;
	
	public void setMarried(boolean married)
	{
		this.married = married;
	}
	public boolean isMarried()
	{
		return married;
	}
}
public class setterGetter 
{
	
	public static void main(String[] args) 
	{
		AdultMan m = new AdultMan();
		m.setMarried(true);
		
		System.out.println("Do you marry ? \n"+m.isMarried());
	}
}
