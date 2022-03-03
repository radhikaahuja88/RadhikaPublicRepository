package pkg7;

public class ParentConst {

	public ParentConst()
	{  this(2,4,9 );
		System.out.println("Parent Default Constructor");
	}
	
  public ParentConst(int a)
  {   this(3,6);
	  System.out.println("Parent 1 Parametrized Constructor");
  }
  
  public ParentConst(int a, int b)
  {this();
	  System.out.println("Parent 2 Parametrized Constructor");
  }
  
  public ParentConst(int a, int b, int c)
  {
	  System.out.println("Parent 3 Parametrized Constructor");
  }
  
}
