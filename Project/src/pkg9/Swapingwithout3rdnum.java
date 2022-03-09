package pkg9;
import java.util.Scanner;
public class Swapingwithout3rdnum 
{
	
		
		public void swap(int a , int b)  //a=10;b=20
		{
			System.out.println("Before Swapping" +a +" "+b);
			a=a+b;//a=30 (10+20)    
			b=a-b;//b=10 (30-20)    
			a=a-b;//a=20 (30-10)
		System.out.println("After Swapping "+a+ " " +b);
		
		
		}
		


	public static void main(String[] args)
	{
		System.out.println("Enter first number");
		Scanner s=new Scanner(System.in);
		int first=s.nextInt();
		System.out.println("Enter second number");
		int second=s.nextInt();
		Swapingwithout3rdnum object=new Swapingwithout3rdnum();
		object.swap(first, second);
		
	}
	}


