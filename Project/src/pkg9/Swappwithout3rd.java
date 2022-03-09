package pkg9;

import java.util.Scanner;

public class Swappwithout3rd
{
	public void swaping(int a , int b)  //a=10;b=20
	{
		System.out.println("Before Swapping" +a +" "+b);
		a=a*b;//a=200 (10*20)    
		b=a/b;//b=10 (200/20)    
		a=a/b;//a=20 (200/10)  
	
	System.out.println("After Swapping "+ a +" " + b);

	
	}
	


public static void main(String[] args) {
	
	System.out.println("Enter first number");
	Scanner s=new Scanner(System.in);
	int first=s.nextInt();
	System.out.println("Enter second number");
	int second=s.nextInt();
	Swappwithout3rd object=new Swappwithout3rd();
	object.swaping(first, second);
	
}
}


