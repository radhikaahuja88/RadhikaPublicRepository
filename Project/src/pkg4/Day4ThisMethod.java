package pkg4;

public class Day4ThisMethod
{
public void method()
{
	this.method3();
	System.out.println("Default Method");
	this.method1(3);
	this.method2();
	this.method4(4,5,8,7);
	this.method5(23,65,45,89,43);

	
}

public void method1(int a)
{
	System.out.println("1 Parametrized Method");
}

public void method2()
{
	System.out.println("2 Parametrized Method");
}

public void method3()
{
	System.out.println("3 Parametrized Method");
}

public void method4(int a , int b , int c, int d)
{
	System.out.println("4 Parametrized Method");
}

public void method5(int a , int b , int c, int d, int e)
{
	System.out.println("5 Parametrized Method");
}

public static void main(String[] args) 
{
	Day4ThisMethod ob = new Day4ThisMethod();
	System.out.println("Output should be in below format using this method");
	ob.method();
	}
}
