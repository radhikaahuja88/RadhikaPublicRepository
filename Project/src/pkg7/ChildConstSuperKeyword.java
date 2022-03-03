package pkg7;

public class ChildConstSuperKeyword extends ParentConst {
	
	public ChildConstSuperKeyword()
	{ super(23);
		System.out.println("Child Default Constructor");
	}
	public ChildConstSuperKeyword(int a)
	{ this(6,8,9);
		System.out.println("Child 1 Parametrized Constructor");
	}
	public ChildConstSuperKeyword(int a, int b)
	{this(7);
		System.out.println("Child 2 Parametrized Constructor");
	}
	public ChildConstSuperKeyword(int a, int b, int c)
	{   this();
		System.out.println("Child 3 Parametrized Constructor");
	}

	public static void main(String[] args) 
	{
		System.out.println("Output should be in below format");
		ChildConstSuperKeyword obj = new ChildConstSuperKeyword(3,8);	
	}
}
