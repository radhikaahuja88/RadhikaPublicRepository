package pkg9;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.println("Program for Fibonacci series");
		System.out.println("Enter last number of Fibonacci series");
		Scanner s=new Scanner(System.in);
		int fib=s.nextInt();
		
		System.out.print(" " + a);
		System.out.print(" " + b);
		for (int i=0;i<=fib;i++)
		{
			int c=a+b;
			System.out.print(" " + c);
			a=b;
			b=c;
		}
	}

}
