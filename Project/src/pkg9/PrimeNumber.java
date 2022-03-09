package pkg9;

import java.util.Scanner;

public class PrimeNumber
{
	
	public void prime(int a)
	{int temp=0;
		
		
		if(a==0|a==1) 
			{
			System.out.println("Not a Prime number");
			}
		
		else
			{
			for(int i=2;i<=a/2;i++)
			  { 
				if (a%i==0)
				{
				temp=temp+1;
				}
			  	
			   }
			if(temp>0)
			{
				System.out.println( a + " is not a Prime Number");
			}
			
			else
				{
				System.out.println("This is a Prime Number");
			}
			}
		
		
		
			
	}
	



public static void main(String[] args) {
	System.out.println("Enter number to be checked for prime");
	Scanner s=new Scanner(System.in);
	int pr=s.nextInt();
	
	PrimeNumber obj=new PrimeNumber();
	obj.prime(pr);
}
}