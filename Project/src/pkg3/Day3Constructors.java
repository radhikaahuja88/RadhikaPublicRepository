package pkg3;

public class Day3Constructors {
	
public Day3Constructors() 
{
	this(2,5,3,4);
System.out.println("1 Parametrized Constructor");
}

public Day3Constructors(int a) 	
{
	this(2,3,4);              //calling 3 parametrized constructor
	System.out.println("Default Constructor");
}
public Day3Constructors(int a, int b) 	
{
	this(5);                  //calling 1 parameter constructor
	System.out.println("2 Parametrized constructor");
}
	
public Day3Constructors(int a, int b, int c) 	
{
	
	System.out.println("3 Parametrized constructor");
}

public Day3Constructors(int a, int b, int c, int d) 	
{
	this(2,3);               //calling 2 parametrized constructor
	System.out.println("4 Parametrized constructor");
}
public static void main(String[] args) {
	Day3Constructors abc=new Day3Constructors();
}

}
