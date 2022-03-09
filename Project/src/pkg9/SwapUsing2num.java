package pkg9;

import java.util.Scanner;

public class SwapUsing2num 
{
	
	public void swap(int a , int b)
	{
	int c;
	c=a;
	a=b;
	b=c;
	System.out.println("Swapping using 3rd number is");
	System.out.println("First swapped number  "+a);
	System.out.println("Second swapped number "+b);
	
	}
	


public static void main(String[] args)
{
	System.out.println("Enter first number");
	Scanner s=new Scanner(System.in);
	int first=s.nextInt();
	System.out.println("Enter second number");
	int second=s.nextInt();
	SwapUsing2num object=new SwapUsing2num();
	object.swap(first, second);
	
}
}
