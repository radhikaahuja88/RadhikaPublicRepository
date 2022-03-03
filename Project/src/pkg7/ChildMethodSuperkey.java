package pkg7;

public class ChildMethodSuperkey extends ParentMethod 
{
	public void childmethod()
	{
    System.out.println("Child Default Method");
	}
	
	public void childmethod1(int a)
	{   
	    System.out.println("Child 1 Parametrized Method");
		}
	
	public void childmethod2(int a, int b)
	{   
		this.childmethod3(4,6,8);
		this.childmethod1(9);
	    System.out.println("Child 2 Parametrized Method");
	}
	
	public void childmethod3(int a, int b, int c)
	
	{   System.out.println("Output should be in below format");
		this.parentmethod1(6);
		super.parmethod();
		this.parentmethod2(4, 8);
		super.parentmethod1(8);
		this.childmethod();
	    System.out.println("Child 3 Parametrized Method");
		}
	
	public static void main(String[] args) {
		ChildMethodSuperkey object = new ChildMethodSuperkey();
		object.childmethod2(4,6);
	}
}
